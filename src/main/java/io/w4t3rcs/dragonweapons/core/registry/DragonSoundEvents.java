package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.other.SoundDescription;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.registry.factory.common.SoundEventFactory;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;

@Injected(false)
public class DragonSoundEvents {
    @Registry
    private static final SoundEventFactory SOUND_EVENT_FACTORY = new SoundEventFactory();

    @EnglishTranslation("Dragon armor clanks")
    @SoundDescription({
            @SoundDescription.Sound(fileName = "armor_equip_dragon_1.ogg"),
            @SoundDescription.Sound(fileName = "armor_equip_dragon_2.ogg"),
            @SoundDescription.Sound(fileName = "armor_equip_dragon_3.ogg")
    })
    public static final Holder<SoundEvent> ARMOR_EQUIP_DRAGON = SOUND_EVENT_FACTORY.create("armor_equip_dragon");
}
