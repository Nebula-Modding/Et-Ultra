package io.github.nebulamodding.client.gui;

import io.github.nebulamodding.registry.EUItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.portal.DimensionTransition;

public class TestScreen extends Screen {
    public TestScreen() {
        super(Component.literal("DEV MENU"));
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

        Button.Builder dimSwap = new Button.Builder(Component.literal("Nether"), button ->{
            Minecraft.getInstance().player.connection.sendUnsignedCommand("execute as @s in minecraft:the_nether run tp @a ~ ~ ~");
        });
        Button.Builder dimSwapOverWorld = new Button.Builder(Component.literal("Overworld"), button -> {
            Minecraft.getInstance().player.connection.sendUnsignedCommand("execute as @s in minecraft:overworld run tp @a ~ ~ ~");
        });
        Button.Builder getItems_Obdurium = new Button.Builder(Component.literal("Obdurium"), button ->{
            Minecraft.getInstance().player.connection.sendUnsignedCommand("give @s et_ultra:obdurium_hammer");
        });

        getItems_Obdurium.bounds(210,10,50,20);
        this.addRenderableWidget(getItems_Obdurium.build());
        dimSwapOverWorld.bounds(160, 10, 50, 20);
        this.addRenderableWidget(dimSwapOverWorld.build());
        dimSwap.bounds(110,10,50,20);
        this.addRenderableWidget(dimSwap.build());
        gooButton.bounds(60,10,50,20);
        this.addRenderableWidget(gooButton.build());


    }


}
