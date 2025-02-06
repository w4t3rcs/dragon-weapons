package io.w4t3rcs.dragonweapons.common;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class DragonArmorItem extends ArmorItem {
    private static final float STRENGTH = 2f;
    private LivingEntity savedLastAttacker;
    private int tick;

    public DragonArmorItem(ArmorMaterial material, ArmorType armorType, Properties properties) {
        super(material, armorType, properties);
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int slotId, boolean isSelected) {
        if (entity instanceof Player player) {
            if (isFullArmorEquipped(player)) {
                if (!level.isClientSide()) {
                    if (this.savedLastAttacker != null || player.getLastAttacker() != null) {
                        if (++tick == 4) {
                            explode(level, player);
                            tick = 0;
                        }
                    }
                }
            }
        }
    }

    private boolean isFullArmorEquipped(@NotNull Player player) {
        return isArmorEquipped(player, ArmorType.HELMET)
                && isArmorEquipped(player, ArmorType.CHESTPLATE)
                && isArmorEquipped(player, ArmorType.LEGGINGS)
                && isArmorEquipped(player, ArmorType.BOOTS);
    }

    private boolean isArmorEquipped(@NotNull Player player, ArmorType armorType) {
        final Inventory inventory = player.getInventory();
        int slot = armorType.ordinal();
        ItemStack armor = inventory.getArmor(slot);
        return !armor.isEmpty() && armor.getItem() instanceof DragonArmorItem;
    }

    private void explode(Level level, Player player) {
        AreaEffectCloud areaeffectcloud = getAreaEffectCloud(level, player);
        level.addFreshEntity(areaeffectcloud);
    }

    private @NotNull AreaEffectCloud getAreaEffectCloud(Level level, Player player) {
        System.out.println("We are here");
        LivingEntity lastAttacker = getLastAttacker(player);
        AreaEffectCloud areaEffectCloud = new AreaEffectCloud(level, lastAttacker.getX(), lastAttacker.getY(), lastAttacker.getZ());
        areaEffectCloud.setOwner(player);
        areaEffectCloud.setParticle(ParticleTypes.END_ROD);
        areaEffectCloud.setRadius(STRENGTH - 1.2f);
        areaEffectCloud.setDuration((int) (STRENGTH * 100));
        areaEffectCloud.setRadiusPerTick((3F - areaEffectCloud.getRadius()) / (float)areaEffectCloud.getDuration());

        areaEffectCloud.addEffect(new MobEffectInstance(MobEffects.POISON, 2, 1, true, false));

        return areaEffectCloud;
    }

    private @NotNull LivingEntity getLastAttacker(Player player) {
        LivingEntity lastAttacker = player.getLastAttacker();
        if (lastAttacker != null || this.savedLastAttacker == null) {
            this.savedLastAttacker = lastAttacker;
        }
        return this.savedLastAttacker;
    }
}
