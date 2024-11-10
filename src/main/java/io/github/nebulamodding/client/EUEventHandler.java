package io.github.nebulamodding.client;

import io.github.nebulamodding.client.gui.TestScreen;
import io.github.nebulamodding.registry.items.EUItems;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import org.lwjgl.glfw.GLFW;

public class EUEventHandler {
    // DON'T QUESTION THIS PLEASE, I HAVE NO IDEA IF THIS WILL WORK, ALSO THIS IS FOR TESTING PURPOSES ONLY
    // This may be a bad idea
    // What Could Go Wrong
    // god it just gets worse




    public static final KeyMapping TestScreenKey = new KeyMapping("key.open_testscreen", GLFW.GLFW_KEY_DELETE,"keys.categories.custom");public static final KeyMapping BonkKey = new KeyMapping("key.bonk", GLFW.GLFW_KEY_CAPS_LOCK, "keys.categories.custom");
    @SubscribeEvent

    public static void onKeyInput(InputEvent.Key Event) {
        if (TestScreenKey.isDown())  {
            
            Minecraft.getInstance().setScreen(new TestScreen());

        }

        else if (BonkKey.isDown()) {
            Minecraft.getInstance().player.addItem(new ItemStack((ItemLike) EUItems.OBDURIUM_HAMMER));
            
        }
    }










}
