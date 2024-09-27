package io.github.nebulamodding.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class TestScreen extends Screen {
    public TestScreen() {
        super(Component.literal("Et Ultra Test Screen"));
    }

    @Override

    protected void init() {
        super.init();
        // To Add a Button it is quite simple, First take the below code and fill it out with custom info. Next change the lambda to what needs to be done and BOOM you've done everything that needs to be done!!
        Button.Builder testButton = new Button.Builder(Component.literal("Test"), button -> {
            Minecraft.getInstance().player.connection.sendChat("This Is A Test For Et Ultra Screen Handling");
        } );
        testButton.bounds(10,10,50,20);
        this.addRenderableWidget(testButton.build());

        Button.Builder gooButton = new Button.Builder(Component.literal("GOO MOD"), button -> {
            Minecraft.getInstance().player.connection.sendCommand("summon slime ~ ~ ~ {Glowing:1b,CustomName:'\"Goo Man\"',attributes:[{id:\"minecraft:generic.scale\",base:16}]}");
        });

        gooButton.bounds(60,10,50,20);
        this.addRenderableWidget(gooButton.build());


    }


}
