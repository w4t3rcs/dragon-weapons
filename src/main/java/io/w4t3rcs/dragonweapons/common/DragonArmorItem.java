package io.w4t3rcs.dragonweapons.common;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class DragonArmorItem extends ArmorItem {
    private static final Map<ArmorType, Float> STRENGTHS = ImmutableMap.of(
            ArmorType.HELMET, 0.5F,
            ArmorType.CHESTPLATE, 1.5F,
            ArmorType.LEGGINGS, 1F,
            ArmorType.BOOTS, 0.5F
    );
    private float currentStrength;
    private float previousHealth;
    private int tick;

    public DragonArmorItem(ArmorMaterial material, ArmorType armorType, Properties properties) {
        super(material, armorType, properties);
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof Player player) {
            float playerHealth = player.getHealth();
            boolean playerHurt = playerHealth < previousHealth;
            if (!level.isClientSide()) {
                calculateStrength(player);
                if (playerHurt) {
                    if (++tick == 4) {
                        explode(level, player);
                        tick = 0;
                    }
                }

                previousHealth = playerHealth;
            }
        }

        currentStrength = 0;
    }

    private void calculateStrength(@NotNull Player player) {
        calculateStrength(player, ArmorType.HELMET);
        calculateStrength(player, ArmorType.CHESTPLATE);
        calculateStrength(player, ArmorType.LEGGINGS);
        calculateStrength(player, ArmorType.BOOTS);
        currentStrength -= 1;
    }

    private void calculateStrength(@NotNull Player player, ArmorType armorType) {
        final Inventory inventory = player.getInventory();
        int slot = armorType.ordinal();
        if (!inventory.getArmor(slot).isEmpty() && inventory.getArmor(slot).getItem() instanceof DragonArmorItem) {
            currentStrength += STRENGTHS.get(armorType);
        }
    }

    private void explode(Level level, Player player) {
        level.explode(player, null, null, player.getX(), player.getY() + 1, player.getZ(), currentStrength, false, Level.ExplosionInteraction.MOB, ParticleTypes.EXPLOSION, ParticleTypes.EXPLOSION_EMITTER, Holder.direct(SoundEvents.DRAGON_FIREBALL_EXPLODE));
        AreaEffectCloud areaeffectcloud = getAreaEffectCloud(level, player);
        areaeffectcloud.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 1));
        level.levelEvent(2006, player.blockPosition(), player.isSilent() ? -1 : 1);
        level.addFreshEntity(areaeffectcloud);
        areaeffectcloud.discard();
    }

    private @NotNull AreaEffectCloud getAreaEffectCloud(Level level, Player player) {
        AreaEffectCloud areaEffectCloud = new AreaEffectCloud(level, player.getX(), player.getY(), player.getZ());
        areaEffectCloud.setOwner(player);
        areaEffectCloud.setParticle(ParticleTypes.DRAGON_BREATH);
        areaEffectCloud.setRadius(currentStrength);
        areaEffectCloud.setDuration((int) (currentStrength * 150));
        areaEffectCloud.setRadiusPerTick((7.0F - areaEffectCloud.getRadius()) / (float)areaEffectCloud.getDuration());
        areaEffectCloud.setOnGround(true);
        return areaEffectCloud;
    }
}
