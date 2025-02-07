package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.metadata.annotation.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.Registry;
import com.temporal.api.core.engine.io.metadata.annotation.TranslationType;
import com.temporal.api.core.registry.factory.common.SoundEventFactory;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;

@Injected(false)
public class DragonSoundEvents {
    @Registry
    private static final SoundEventFactory SOUND_EVENT_FACTORY = new SoundEventFactory();
    @EnglishTranslation(type = TranslationType.OTHER, id = "sounds.dragonweapons.armor_equip_dragon", value = "Dragon armor clanks")
    public static final Holder<SoundEvent> ARMOR_EQUIP_DRAGON = SOUND_EVENT_FACTORY.create("armor_equip_dragon"); //todo
}
