package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.BootsShapedRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.level.ItemLike;

@DefinedRecipe
@Injected(false)
public class DragonBootsRecipe implements BootsShapedRecipeHolder {
    @Override
    public ItemLike getSimplePatternTranslation() {
        return DragonItems.DRAGON_INGOT;
    }

    @Override
    public ItemLike getResult() {
        return DragonItems.DRAGON_BOOTS;
    }
}
