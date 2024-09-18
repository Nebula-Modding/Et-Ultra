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
            MOON_DEEPSLATE_TILES = register("moon_deepslate_tiles", deepslateProperties().mapColor(MapColor.DEEPSLATE)),
            MOON_DEEPSLATE_PILLAR = register("moon_deepslate_pillar", deepslateProperties().mapColor(MapColor.DEEPSLATE))
    ;

    // Mars
    public static final DeferredBlock<Block>
            MARS_DEEPSLATE = register("mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            COBBLED_MARS_DEEPSLATE = register("cobbled_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            CHISELED_MARS_DEEPSLATE = register("chiseled_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            POLISHED_MARS_DEEPSLATE = register("polished_mars_deepslate", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            MARS_DEEPSLATE_BRICKS = register("mars_deepslate_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            CRACKED_MARS_DEEPSLATE_BRICKS = register("cracked_mars_deepslate_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            MARS_DEEPSLATE_TILES = register("mars_deepslate_tiles", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)),
            MARS_DEEPSLATE_PILLAR = register("mars_deepslate_pillar", deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE))
    ;

    // Salt
    public static final DeferredBlock<Block>
            SALT_CRYSTAL_BLOCK = register("salt_crystal_block", crystalProperties().mapColor(MapColor.SNOW)),
            POLISHED_SALT_CRYSTAL_BLOCK = register("polished_salt_crystal_block", crystalProperties().mapColor(MapColor.SNOW)),
            SALT_BLOCK = register("salt_block", compressedDustProperties().mapColor(MapColor.SNOW)),
            SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(
                    new ColorRGBA(0xdfcddd),
                    dustBlockProperties().mapColor(MapColor.SNOW)
            )),
            CHISELED_SALT = register("chiseled_salt", compressedDustProperties().mapColor(MapColor.SNOW)),
            POLISHED_SALT = register("polished_salt", compressedDustProperties().mapColor(MapColor.SNOW)),
            SALT_BRICKS = register("salt_bricks", compressedDustProperties().mapColor(MapColor.SNOW)),
            CRACKED_SALT_BRICKS = register("cracked_salt_bricks", compressedDustProperties().mapColor(MapColor.SNOW)),
            SALT_TILES = register("salt_tiles", compressedDustProperties().mapColor(MapColor.SNOW)),
            SALT_PILLAR = register("salt_pillar", compressedDustProperties().mapColor(MapColor.SNOW))
    ;

    // Graphite
    public static final DeferredBlock<Block>
            GRAPHITE_BLOCK = register("graphite_block", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(
                    new ColorRGBA(0x2d261b),
                    dustBlockProperties().mapColor(MapColor.TERRACOTTA_BLACK)
            )),
            CHISELED_GRAPHITE = register("chiseled_graphite", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            POLISHED_GRAPHITE = register("polished_graphite", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_BRICKS = register("graphite_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            CRACKED_GRAPHITE_BRICKS = register("cracked_graphite_bricks", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_TILES = register("graphite_tiles", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)),
            GRAPHITE_PILLAR = register("graphite_pillar", deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK))
    ;

    // Metal Blocks

    // Iron
    // Blocks go here

    // Steel
    public static final DeferredBlock<Block>
            MARKED_STEEL_PILLAR = register("marked_steel_pillar", steelProperties())
    ;

    // Etrium
    // Blocks go here

    // Desh
    public static final DeferredBlock<Block>
            MARKED_DESH_PILLAR = register("marked_desh_pillar", deshProperties())
    ;

    // Ostrum
    public static final DeferredBlock<Block>
            MARKED_OSTRUM_PILLAR = register("marked_ostrum_pillar", ostrumProperties())
    ;

    // Aerolyte
    // Blocks go here

    // Obdurium
    // Obdurium blocks go here

    // Common properties
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
                .strength(1.5f, 1.5f);
    }
    private static BlockBehaviour.Properties compressedDustProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(2, 2);
    }
    private static BlockBehaviour.Properties dustBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }

    // Metal Properties

    private static BlockBehaviour.Properties steelProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GRAY)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 12)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties etriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLUE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 5)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties deshProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 9)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties ostrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 16)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties obduriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(8, 6000)
                .sound(SoundType.COPPER);
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


