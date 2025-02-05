package io.w4t3rcs.dragonweapons.core.event;

import io.w4t3rcs.dragonweapons.DragonWeapons;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

@EventBusSubscriber(modid = DragonWeapons.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public final class LivingDropsEventListener {
    @SubscribeEvent
    public static void listenLivingDrops(LivingDeathEvent event) {
        if (event.getEntity() instanceof EnderDragon dragon) {
            System.out.println("Yo");
            Level level = dragon.level();
            RandomSource randomSource = level.random;
            for (int i = 0; i < randomSource.nextInt(8, 15); i++) {
                ItemStack dropItem = new ItemStack(DragonItems.DRAGON_SCALE.get(), randomSource.nextInt(1, 2));
                ItemEntity itemEntity = new ItemEntity(
                        level,
                        dragon.getX() + randomSource.nextInt(-7 - i/2, 7 + i/2),
                        dragon.getY(),
                        dragon.getZ() + randomSource.nextInt(-7 - i/2, 7 + i/2),
                        dropItem
                );

                level.addFreshEntity(itemEntity);
            }
        }
    }
}
