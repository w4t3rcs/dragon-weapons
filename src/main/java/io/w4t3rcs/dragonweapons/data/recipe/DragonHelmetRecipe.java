package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.data.recipe.holder.HelmetShapedRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.level.ItemLike;

@DefinedRecipe
@Injected(false)
public class DragonHelmetRecipe implements HelmetShapedRecipeHolder {
    @Override
    public ItemLike getSimplePatternTranslation() {
        return DragonItems.DRAGON_INGOT;
    }

    @Override
    public ItemLike getResult() {
        return DragonItems.DRAGON_HELMET;
    }
}
