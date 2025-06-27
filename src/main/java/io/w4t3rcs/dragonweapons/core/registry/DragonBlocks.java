package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.model.BlockModel;
import com.temporal.api.core.engine.io.metadata.annotation.data.other.BlockLootTable;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.registry.factory.other.BlockPropertiesFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;

@Injected(false)
public final class DragonBlocks {
    @Registry
    private static final BlockFactory BLOCK_FACTORY = InjectionContext.getFromInstance(BlockFactory.class);

    @BlockModel
    @BlockLootTable
    @EnglishTranslation("Dragon Block")
    public static DeferredBlock<?> DRAGON_BLOCK = BLOCK_FACTORY.create("dragon_block", BlockPropertiesFactory.copy(Blocks.NETHERITE_BLOCK), new Item.Properties().rarity(Rarity.EPIC));
}
