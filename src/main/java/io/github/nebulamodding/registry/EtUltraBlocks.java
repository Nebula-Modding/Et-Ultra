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

//Blocks Go Here

public class EtUltraBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);
    public static final DeferredRegister.Blocks SLABS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    // Moon

    public static final DeferredBlock<Block> COBBLED_MOON_DEEPSLATE = BLOCKS.register(
            "cobbled_moon_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> CHISELED_MOON_DEEPSLATE = BLOCKS.register(
            "chiseled_moon_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> POLISHED_MOON_DEEPSLATE = BLOCKS.register(
            "polished_moon_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> MOON_DEEPSLATE_BRICKS = BLOCKS.register(
            "moon_deepslate_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> CRACKED_MOON_DEEPSLATE_BRICKS = BLOCKS.register(
            "cracked_moon_deepslate_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));
    public static final DeferredBlock<Block> MOON_DEEPSLATE_TILES = BLOCKS.register(
            "moon_deepslate_tiles",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.DEEPSLATE)
            ));

    // Mars

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

    public static final DeferredBlock<Block> CHISELED_MARS_DEEPSLATE = BLOCKS.register(
            "chiseled_mars_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> POLISHED_MARS_DEEPSLATE = BLOCKS.register(
            "polished_mars_deepslate",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> MARS_DEEPSLATE_BRICKS = BLOCKS.register(
            "mars_deepslate_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> CRACKED_MARS_DEEPSLATE_BRICKS = BLOCKS.register(
            "cracked_mars_deepslate_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    public static final DeferredBlock<Block> MARS_DEEPSLATE_TILES = BLOCKS.register(
            "mars_deepslate_tiles",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
            ));

    // Salt

    public static final DeferredBlock<Block> SALT_CRYSTAL_BLOCK = BLOCKS.register(
            "salt_crystal_block",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.AMETHYST)
            ));

    public static final DeferredBlock<Block> POLISHED_SALT_CRYSTAL_BLOCK = BLOCKS.register(
            "polished_salt_crystal_block",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
                    .sound(SoundType.AMETHYST)
            ));

    public static final DeferredBlock<Block> SALT_BLOCK = BLOCKS.register(
            "salt_block",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> SALT_DUST_BLOCK = BLOCKS.register(
            "salt_dust_block",
            () -> new ColoredFallingBlock(new ColorRGBA(0xdfcddd), dustBlockProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> CHISELED_SALT = BLOCKS.register(
            "chiseled_salt",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> POLISHED_SALT = BLOCKS.register(
            "polished_salt",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> SALT_BRICKS = BLOCKS.register(
            "salt_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> CRACKED_SALT_BRICKS = BLOCKS.register(
            "cracked_salt_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    public static final DeferredBlock<Block> SALT_TILES = BLOCKS.register(
            "salt_tiles",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.SNOW)
            ));

    // Graphite

    public static final DeferredBlock<Block> GRAPHITE_BLOCK = BLOCKS.register(
            "graphite_block",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));

    public static final DeferredBlock<Block> GRAPHITE_DUST_BLOCK = BLOCKS.register(
            "graphite_dust_block",
            () -> new ColoredFallingBlock(new ColorRGBA(0x48433b), dustBlockProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));

    public static final DeferredBlock<Block> CHISELED_GRAPHITE = BLOCKS.register(
            "chiseled_graphite",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));


    public static final DeferredBlock<Block> POLISHED_GRAPHITE = BLOCKS.register(
            "polished_graphite",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));


    public static final DeferredBlock<Block> GRAPHITE_BRICKS = BLOCKS.register(
            "graphite_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));


    public static final DeferredBlock<Block> CRACKED_GRAPHITE_BRICKS = BLOCKS.register(
            "cracked_graphite_bricks",
            () -> new Block(deepslateProperties()
                    .mapColor(MapColor.TERRACOTTA_BLACK)
            ));


    public static final DeferredBlock<Block> GRAPHITE_TILES = BLOCKS.register(
            "graphite_tiles",
            () -> new Block(deepslateProperties()
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
    private static BlockBehaviour.Properties dustBlockProperties() {
        return  BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }
}


