/*
This file is a mess

If you try to shorten it or make it more consise please increment the following counter
This will serve as a warning to future maintainers

hours_wasted_here = 2

 */
package io.github.nebulamodding;

import io.github.nebulamodding.client.EUEventHandler;
import io.github.nebulamodding.datagen.builders.EULootTables;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUCreativeTab;
import io.github.nebulamodding.registry.EUDataGeneration;
import io.github.nebulamodding.registry.EUItems;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(EtUltra.MOD_ID)
public class EtUltra {
    public static final String MOD_ID = "et_ultra";
    public static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    public EtUltra(IEventBus modBus) {

        // Registers Various Files,
        // Please Keep This One Line
        EUBlocks.BLOCKS.register(modBus);EUItems.ITEMS.register(modBus);EUCreativeTab.CREATIVE_MODE_TABS.register(modBus);

        // This adds a modbus listener for EU datagen
        modBus.addListener(EUDataGeneration::gatherData);
        NeoForge.EVENT_BUS.register(EUEventHandler.class);

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("help,  let me out of the dungeon");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
