package io.w4t3rcs.dragonweapons.core.event;

import com.temporal.api.core.event.tab.SimpleTabDirector;
import io.w4t3rcs.dragonweapons.DragonWeapons;
import io.w4t3rcs.dragonweapons.core.registry.DragonBlocks;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber(modid = DragonWeapons.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class CreativeModeTabEventListener {
    @SubscribeEvent
    public static void listenDataEvent(BuildCreativeModeTabContentsEvent event) {
        SimpleTabDirector.create(event)
                .direct(CreativeModeTabs.INGREDIENTS,
                        DragonItems.DRAGON_SCALE, DragonItems.DRAGON_INGOT, DragonItems.DRAGON_SMITHING_TEMPLATE)
                .direct(CreativeModeTabs.COMBAT,
                        DragonItems.DRAGON_SWORD, DragonItems.DRAGON_AXE,
                        DragonItems.DRAGON_HELMET, DragonItems.DRAGON_CHESTPLATE, DragonItems.DRAGON_LEGGINGS, DragonItems.DRAGON_BOOTS)
                .direct(CreativeModeTabs.TOOLS_AND_UTILITIES,
                        DragonItems.DRAGON_SHOVEL, DragonItems.DRAGON_PICKAXE, DragonItems.DRAGON_AXE, DragonItems.DRAGON_HOE)
                .direct(CreativeModeTabs.BUILDING_BLOCKS,
                        DragonBlocks.DRAGON_BLOCK);
    }
}
