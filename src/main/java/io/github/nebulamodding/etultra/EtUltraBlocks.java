package io.github.nebulamodding.etultra;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import io.github.nebulamodding.etultra.EtUltra.*;

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

    // Common properties (meant to be at the bottom)
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(3, 6);
    }
}


