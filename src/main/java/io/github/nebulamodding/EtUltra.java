package io.github.nebulamodding;

import io.github.nebulamodding.client.EUEventHandler;
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
        EUBlocks.BLOCKS.register(modBus);
        EUItems.ITEMS.register(modBus);
        EUCreativeTab.CREATIVE_MODE_TABS.register(modBus);


        modBus.addListener(EUDataGeneration::gatherData);
        NeoForge.EVENT_BUS.register(EUEventHandler.class);

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
