package io.github.nebulamodding.client;

import io.github.nebulamodding.client.gui.TestScreen;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import org.lwjgl.glfw.GLFW;

public class EUEventHandler {
    // DON'T QUESTION THIS PLEASE, I HAVE NO IDEA IF THIS WILL WORK, ALSO THIS IS FOR TESTING PURPOSES ONLY



    public static final KeyMapping TestScreenKey = new KeyMapping("key.open_testscreen", GLFW.GLFW_KEY_DELETE,"keys.categories.custom");

    @SubscribeEvent

    public static void onKeyInput(InputEvent.Key Event) {
        if (TestScreenKey.isDown()) {
            Minecraft.getInstance().setScreen(new TestScreen());
        }
    }










}
