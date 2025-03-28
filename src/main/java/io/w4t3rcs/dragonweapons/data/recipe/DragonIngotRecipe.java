package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.ShapelessRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

@DefinedRecipe
@Injected(false)
public class DragonIngotRecipe implements ShapelessRecipeHolder {
    @Override
    public Map<ItemLike, Integer> getItemAndCountMap() {
        return Map.of(
                DragonItems.DRAGON_SCALE, 4,
                Items.PHANTOM_MEMBRANE, 4
        );
    }

    @Override
    public RecipeCategory getRecipeCategory() {
        return RecipeCategory.MISC;
    }

    @Override
    public ItemLike getResult() {
        return DragonItems.DRAGON_INGOT;
    }
}
