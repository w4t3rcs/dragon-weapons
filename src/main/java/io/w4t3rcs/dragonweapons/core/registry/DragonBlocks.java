package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.*;
import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.util.properties.BlockPropertiesFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;

@Injected(false)
public class DragonBlocks {
    @Registry
    private static final BlockFactory BLOCK_FACTORY = InjectionContext.getFromInstance(BlockFactory.class);
    @BlockModel
    @BlockLootTable
    @EnglishTranslation(type = TranslationType.BLOCK, value = "Dragon Block")
    public static DeferredBlock<?> DRAGON_BLOCK = BLOCK_FACTORY.create("dragon_block", BlockPropertiesFactory.copy(Blocks.NETHERITE_BLOCK), new Item.Properties().rarity(Rarity.EPIC));
}
