package io.github.nebulamodding;

import io.github.nebulamodding.registry.EtUltraCreativeTab;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraDatagen;
import io.github.nebulamodding.registry.EtUltraItems;
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

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EtUltra.MOD_ID)
public class EtUltra
{
    // Define mod id in a common place for everything to reference

    public static final String MOD_ID = "et_ultra";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // Item / Block Registrars
    /*
        Dear Dyl

        Do you see that etultra modbus down there?
        whenever you add items/blocks in a new file
        you have to add it formatted like so
        ClassClassClass.BLOCKS/ITEMS.register(modBus);
     */

    /*
        Dear Areth

        No.
     */


    public EtUltra(IEventBus modBus) {
        EtUltraBlocks.BLOCKS.register(modBus);
        EtUltraItems.ITEMS.register(modBus);
        EtUltraCreativeTab.CREATIVE_MODE_TABS.register(modBus);

        modBus.addListener(EtUltraDatagen::gatherData);
    }





    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
