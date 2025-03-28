package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.data.defined.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.event.data.recipe.holder.TemplateSmithingTrimRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.level.ItemLike;

@Injected
@DefinedRecipe
public class TrimTemplatesRecipe implements TemplateSmithingTrimRecipeHolder {
    @Override
    public ItemLike[] getTemplates() {
        return new ItemLike[]{DragonItems.DRAGON_SMITHING_TEMPLATE};
    }

    @Override
    public String getName() {
        return "trim_templates_recipe";
    }
}
