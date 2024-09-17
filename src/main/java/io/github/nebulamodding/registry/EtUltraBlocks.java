package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    // Moon
    public static final DeferredBlock<Block>
            COBBLED_MOON_DEEPSLATE = register("cobbled_moon_deepslate", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            CHISELED_MOON_DEEPSLATE = register("chiseled_moon_deepslate", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            POLISHED_MOON_DEEPSLATE = register("polished_moon_deepslate", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            MOON_DEEPSLATE_BRICKS = register("moon_deepslate_bricks", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            CRACKED_MOON_DEEPSLATE_BRICKS = register("cracked_moon_deepslate_bricks", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            MOON_DEEPSLATE_TILES = register("moon_deepslate_tiles", deepslateProperties().mapColor(MapColor.DEEPSLATE))
    ;

    // Mars
    public static final DeferredBlock<Block>
            MARS_DEEPSLATE = register("mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            COBBLED_MARS_DEEPSLATE = register("cobbled_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            CHISELED_MARS_DEEPSLATE = register("chiseled_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            POLISHED_MARS_DEEPSLATE = register("polished_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            MARS_DEEPSLATE_BRICKS = register("mars_deepslate_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            CRACKED_MARS_DEEPSLATE_BRICKS = register("cracked_mars_deepslate_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            MARS_DEEPSLATE_TILES = register("mars_deepslate_tiles", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE))
    ;

    // Salt
    public static final DeferredBlock<Block>
            SALT_CRYSTAL_BLOCK = register("salt_crystal_block", crystalProperties().mapColor(MapColor.SNOW)),
            POLISHED_SALT_CRYSTAL_BLOCK = register("polished_salt_crystal_block", crystalProperties().mapColor(MapColor.SNOW)),
            SALT_BLOCK = register("salt_block", deepslateProperties().mapColor(MapColor.SNOW)),
            SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(
                    new ColorRGBA(0xdfcddd),
                    deepslateProperties().mapColor(MapColor.SNOW)
            )),
            CHISELED_SALT = register("chiseled_salt", deepslateProperties().mapColor(MapColor.SNOW)),
            POLISHED_SALT = register("polished_salt", deepslateProperties().mapColor(MapColor.SNOW)),
            SALT_BRICKS = register("salt_bricks", deepslateProperties().mapColor(MapColor.SNOW)),
            CRACKED_SALT_BRICKS = register("cracked_salt_bricks", deepslateProperties().mapColor(MapColor.SNOW)),
            SALT_TILES = register("salt_tiles", deepslateProperties().mapColor(MapColor.SNOW))
    ;

    // Graphite
    public static final DeferredBlock<Block>
            GRAPHITE_BLOCK = register("graphite_block", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(
                    new ColorRGBA(0x48433b),
                    dustBlockProperties().mapColor(MapColor.TERRACOTTA_BLACK)
            )),
            CHISELED_GRAPHITE = register("chiseled_graphite", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            POLISHED_GRAPHITE = register("polished_graphite", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_BRICKS = register("graphite_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            CRACKED_GRAPHITE_BRICKS = register("cracked_graphite_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_TILES = register("graphite_tiles", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK))
    ;

    // Common properties (meant to be at the bottom)
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(3, 6);
    }
    private static BlockBehaviour.Properties crystalProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.AMETHYST)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(3, 6);
    }
    private static BlockBehaviour.Properties dustBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }

    // Misc helpers
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        EtUltraItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
    // Shorthand for registering simple blocks
    private static DeferredBlock<Block> register(String id, BlockBehaviour.Properties properties) {
        return register(id, () -> new Block(properties));
    }
}


