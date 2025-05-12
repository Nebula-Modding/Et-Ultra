package io.github.nebulamodding.etultra;

import io.github.nebulamodding.etultra.datagen.EUDataGeneration;
import io.github.nebulamodding.etultra.registry.block.EUBlocks;
import io.github.nebulamodding.etultra.registry.EUCreativeTab;
import io.github.nebulamodding.etultra.registry.item.EUItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
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

    public EtUltra(IEventBus eventBus, ModContainer modContainer) {
        EUBlocks.BLOCKS.register(eventBus);
        EUItems.ITEMS.register(eventBus);
        EUCreativeTab.CREATIVE_MODE_TABS.register(eventBus);

        eventBus.addListener(EUCreativeTab::buildCreativeTab);
        eventBus.addListener(EUDataGeneration::gatherData);

        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Et Ultra common setup message");
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EUBlocks.MAYURA_SAPLING.getId(), EUBlocks.POTTED_MAYURA_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EUBlocks.VIVIAN.getId(), EUBlocks.POTTED_VIVIAN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EUBlocks.WICKUL.getId(), EUBlocks.POTTED_WICKUL);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(EUBlocks.ICEFLOWER.getId(), EUBlocks.POTTED_ICEFLOWER);
        });
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
