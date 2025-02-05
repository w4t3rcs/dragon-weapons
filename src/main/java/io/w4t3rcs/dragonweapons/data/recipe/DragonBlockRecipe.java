package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.data.recipe.holder.NineShapedRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonBlocks;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.level.ItemLike;

@DefinedRecipe
@Injected(false)
public class DragonBlockRecipe implements NineShapedRecipeHolder {
    @Override
    public ItemLike getSimplePatternTranslation() {
        return DragonItems.DRAGON_INGOT;
    }

    @Override
    public RecipeCategory getRecipeCategory() {
        return RecipeCategory.BUILDING_BLOCKS;
    }

    @Override
    public ItemLike getResult() {
        return DragonBlocks.DRAGON_BLOCK;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
