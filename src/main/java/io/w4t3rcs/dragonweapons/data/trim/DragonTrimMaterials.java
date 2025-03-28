package io.w4t3rcs.dragonweapons.data.trim;

import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.other.TrimMaterialDescription;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.util.other.ResourceUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

@Injected(false)
public class DragonTrimMaterials {
    @EnglishTranslation("Dragon Trim Material")
    @TrimMaterialDescription(itemId = "dragon_ingot", color = "#5E576F", itemModelIndex = 0.5F)
    public static final ResourceKey<TrimMaterial> DRAGON_TRIM_MATERIAL = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceUtils.createResourceLocation("dragon_material"));
}
