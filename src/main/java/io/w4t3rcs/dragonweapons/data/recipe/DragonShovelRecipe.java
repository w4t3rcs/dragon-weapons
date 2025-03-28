package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.ShovelShapedRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

@DefinedRecipe
@Injected(false)
public class DragonShovelRecipe implements ShovelShapedRecipeHolder {
    @Override
    public Map<Character, ItemLike> getPatternTranslation() {
        return Map.of(
                'X', DragonItems.DRAGON_INGOT,
                'S', Items.STICK
        );
    }

    @Override
    public ItemLike getResult() {
        return DragonItems.DRAGON_SHOVEL;
    }
}
