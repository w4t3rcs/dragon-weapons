package io.w4t3rcs.dragonweapons.data.modifier;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedGlobalLootModifier;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.modifier.ChestModifierDescription;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.item.Item;

@DefinedGlobalLootModifier
@Injected(false)
public class DragonSmithingTemplateEndChestGlobalLootModifier implements ChestModifierDescription {
    @Override
    public String getModifierName() {
        return "dragon_smithing_template_end_chest_modifier";
    }

    @Override
    public Item getItem() {
        return DragonItems.DRAGON_SMITHING_TEMPLATE.get();
    }

    @Override
    public String getChestId() {
        return "chests/end_city_treasure";
    }

    @Override
    public float getChance() {
        return 0.15f;
    }
}
