package io.w4t3rcs.dragonweapons.core.registry;

import com.mojang.serialization.MapCodec;
import com.temporal.api.common.loot.AddItemModifier;
import com.temporal.api.common.loot.AddSuspiciousSandItemModifier;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.registry.factory.common.LootModifierSerializerFactory;
import net.minecraft.core.Holder;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;

@Injected(false)
public final class DragonGlobalLootModifierSerializers {
    @Registry
    public static final LootModifierSerializerFactory LOOT_MODIFIER_SERIALIZER_FACTORY = InjectionContext.getFromInstance(LootModifierSerializerFactory.class);
    public static final Holder<MapCodec<? extends IGlobalLootModifier>> ADD_LOOT_MODIFIER_SERIALIZER = LOOT_MODIFIER_SERIALIZER_FACTORY.create("add_item_modifier_serializer", AddItemModifier.CODEC::get);
    public static final Holder<MapCodec<? extends IGlobalLootModifier>> ADD_SUSPICIOUS_SAND_LOOT_MODIFIER_SERIALIZER = LOOT_MODIFIER_SERIALIZER_FACTORY.create("add_suspicious_sand_item_modifier_serializer", AddSuspiciousSandItemModifier.CODEC::get);
}
