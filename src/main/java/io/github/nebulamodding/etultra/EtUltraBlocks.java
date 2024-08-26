package io.github.nebulamodding.etultra;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import io.github.nebulamodding.etultra.EtUltra.*;

//Blocks Go Here

public class EtUltraBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MODID);

    //Block Declarations Should Be Seperated By Three Lines of Whitespace
    //No, screw you.

    // Block Name Goes Here
    public static final DeferredBlock<Block> MY_BETTER_BLOCK = BLOCKS.register(
            "my_better_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.STONE)
                    .lightLevel(state -> 7)
            ));

    public static void ModRegisterBlocks() {
        EtUltra.LOGGER.info("Registering Et Ultra Blocks");
    }


}

