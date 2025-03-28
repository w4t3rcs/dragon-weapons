package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.ShapelessRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonBlocks;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

@DefinedRecipe
@Injected(false)
public class DragonIngotFromBlockRecipe implements ShapelessRecipeHolder {
    @Override
    public Map<ItemLike, Integer> getItemAndCountMap() {
        return Map.of(
                DragonBlocks.DRAGON_BLOCK, 1
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

    @Override
    public String getName() {
        return "dragon_ingot_from_block";
    }

    @Override
    public int getCount() {
        return 9;
    }
}
