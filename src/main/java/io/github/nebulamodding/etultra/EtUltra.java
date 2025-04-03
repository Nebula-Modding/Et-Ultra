package io.github.nebulamodding.etultra;

import io.github.nebulamodding.etultra.datagen.EUDataGeneration;
import io.github.nebulamodding.etultra.registry.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUCreativeTab;
import io.github.nebulamodding.etultra.registry.EUItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(EtUltra.MOD_ID)
public class EtUltra {
    public static final String MOD_ID = "et_ultra";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EtUltra(IEventBus modEventBus, ModContainer modContainer) {
        EUBlocks.BLOCKS.register(modEventBus);
        EUItems.ITEMS.register(modEventBus);
        EUCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(EUDataGeneration::gatherData);

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Et Ultra common setup message");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Et Ultra server starting message");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Et Ultra client setup message");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
