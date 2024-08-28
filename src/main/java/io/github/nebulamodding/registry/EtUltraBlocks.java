package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.concurrent.BlockingQueue;

//Blocks Go Here

public class EtUltraBlocks {


    //Block Declarations Should Be Seperated By Three Lines of Whitespace
    //No, screw you.

    // Block Name Goes Here
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MODID);


    public static final DeferredBlock<Block> MARS_DEEPSLATE = BLOCKS.register(
            "mars_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> COBBLED_MARS_DEEPSLATE = BLOCKS.register(
            "cobbled_mars_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> GRAPHITE_BLOCK = BLOCKS.register(
            "graphite_block",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.COLOR_BLACK)
            ));

    public static final DeferredBlock<Block> GRAPHITE_DUST = BLOCKS.register(
            "graphite_dust",
            () -> new Block(dustProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));

    // Common properties (meant to be at the bottom)
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(3, 6);
    }
    private static BlockBehaviour.Properties dustProperties() {
        return  BlockBehaviour.Properties.of()
                .sound(SoundType.SAND)
                .instrument(NoteBlockInstrument.BANJO)
                .friction(100)

                .strength(3,2);



    }
}


