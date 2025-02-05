package io.w4t3rcs.dragonweapons.data.recipe;

import com.temporal.api.core.engine.io.metadata.annotation.DefinedRecipe;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.data.recipe.holder.PickaxeShapedRecipeHolder;
import io.w4t3rcs.dragonweapons.core.registry.DragonItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.Map;

@DefinedRecipe
@Injected(false)
public class DragonPickaxeRecipe implements PickaxeShapedRecipeHolder {
    @Override
    public Map<Character, ItemLike> getPatternTranslation() {
        return Map.of(
                'X', DragonItems.DRAGON_INGOT,
                'S', Items.STICK
        );
    }

    @Override
    public ItemLike getResult() {
        return DragonItems.DRAGON_PICKAXE;
    }
}
