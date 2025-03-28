package io.w4t3rcs.dragonweapons.data.trim;

import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.other.TrimPatternDescription;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.util.other.ResourceUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimPattern;

@Injected(false)
public class DragonTrimPatterns {
    @EnglishTranslation("Dragon Trim Pattern")
    @TrimPatternDescription(itemId = "dragon_armor_smithing_template")
    public static final ResourceKey<TrimPattern> DRAGON_TRIM_PATTERN = ResourceKey.create(Registries.TRIM_PATTERN, ResourceUtils.createResourceLocation("dragon_pattern"));
}
