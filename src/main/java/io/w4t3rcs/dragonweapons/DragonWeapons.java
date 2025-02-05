package io.w4t3rcs.dragonweapons;

import com.mojang.logging.LogUtils;
import com.temporal.api.core.engine.TemporalEngine;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(DragonWeapons.MOD_ID)
public class DragonWeapons {
    public static final String MOD_ID = "dragonweapons";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DragonWeapons(IEventBus modEventBus, ModContainer modContainer) {
        TemporalEngine.run(DragonWeapons.class, modEventBus, modContainer);
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }
}
