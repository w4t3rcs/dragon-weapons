package io.w4t3rcs.dragonweapons.core.event;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.event.data.ApiDataGenerator;
import com.temporal.api.core.event.data.DataGatherer;
import io.w4t3rcs.dragonweapons.DragonWeapons;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = DragonWeapons.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class DataEventListener {
    @SubscribeEvent
    public static void listenDataEvent(GatherDataEvent.Client event) {
        DataGatherer dataGenerator = InjectionContext.getFromInstance(ApiDataGenerator.class);
        dataGenerator.gatherData(event);
    }
}
