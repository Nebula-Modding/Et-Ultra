package io.github.nebulamodding.registry.blocks;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.items.EUItems;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithBlockUtil;
import martian.regolith.builder.RegolithBlockBuilder;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EUBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    // Moon
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MOON_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.DEEPSLATE)
    )
            .register(
                    "cobbled_moon_deepslate",
                    "chiseled_moon_deepslate",
                    "polished_moon_deepslate",
                    "moon_deepslate_bricks",
                    "cracked_moon_deepslate_bricks",
                    "moon_deepslate_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cobbled_moon_deepslate_slab",
                    "polished_moon_deepslate_slab",
                    "moon_deepslate_brick_slab",
                    "moon_deepslate_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("moon_deepslate_pillar")
            .done();

    // Mars
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MARS_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE)
    )
            .register(
                    "mars_deepslate",
                    "cobbled_mars_deepslate",
                    "chiseled_mars_deepslate",
                    "polished_mars_deepslate",
                    "mars_deepslate_bricks",
                    "cracked_mars_deepslate_bricks",
                    "mars_deepslate_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "mars_deepslate_slab",
                    "cobbled_mars_deepslate_slab",
                    "polished_mars_deepslate_slab",
                    "mars_deepslate_brick_slab",
                    "mars_deepslate_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("mars_deepslate_pillar")
            .done();

    // Venus

    // Mercury
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MERCURY_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.COLOR_PURPLE)
    )
            .register(
                    "mercury_deepslate",
                    "cobbled_mercury_deepslate",
                    "chiseled_mercury_deepslate",
                    "polished_mercury_deepslate",
                    "mercury_deepslate_bricks",
                    "cracked_mercury_deepslate_bricks",
                    "mercury_deepslate_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "mercury_deepslate_slab",
                    "cobbled_mercury_deepslate_slab",
                    "polished_mercury_deepslate_slab",
                    "mercury_deepslate_brick_slab",
                    "mercury_deepslate_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("mercury_deepslate_pillar")
            .done();

    // Water Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties()
    )
            .register(
                    "water_ice",
                    "cracked_water_ice",
                    "water_ice_bricks",
                    "cracked_water_ice_bricks"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "water_ice_slab",
                    "cracked_water_ice_slab",
                    "water_ice_brick_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("water_ice_pillar")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_SEMI_SATURATED_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_ORANGE)
    )
            .register(
                    "tholin_semi_saturated_water_ice"
                    //"cracked_tholin_semi_saturated_water_ice",
                    //"tholin_semi_saturated_water_ice_bricks",
                    //"cracked_tholin_semi_saturated_water_ice_bricks",
                    //"tholin_semi_saturated_water_ice_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_semi_saturated_water_ice_slab"
                    //"cracked_tholin_semi_saturated_water_ice_slab",
                    //"tholin_semi_saturated_water_ice_brick_slab",
                    //"tholin_semi_saturated_water_ice_tile_slab"
            )
            //.setBlockFunction(RotatedPillarBlock::new)
            //.register("tholin_semi_saturated_water_ice_pillar")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_SATURATED_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED)
    )
            .register(
                    "tholin_saturated_water_ice"
                    //"cracked_tholin_saturated_water_ice",
                    //"tholin_saturated_water_ice_bricks",
                    //"cracked_tholin_saturated_water_ice_bricks",
                    //"tholin_saturated_water_ice_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_saturated_water_ice_slab"
                    //"cracked_tholin_saturated_water_ice_slab",
                    //"tholin_saturated_water_ice_brick_slab",
                    //"tholin_saturated_water_ice_tile_slab"
            )
            //.setBlockFunction(RotatedPillarBlock::new)
            //.register("tholin_saturated_water_ice_pillar")
            .done();

    // Permafrost
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)
    )
            .register(
                    "permafrost",
                    "cracked_permafrost",
                    "chiseled_permafrost",
                    "polished_permafrost",
                    "permafrost_bricks",
                    "cracked_permafrost_bricks",
                    "permafrost_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "permafrost_slab",
                    "cracked_permafrost_slab",
                    "polished_permafrost_slab",
                    "permafrost_brick_slab",
                    "permafrost_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("permafrost_pillar")
            .done();

    // Frigus
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_STONE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)
    )
            .register(
                    "frigus_stone",
                    "frigus_cobblestone",
                    "chiseled_frigus_stone",
                    "polished_frigus_stone",
                    "frigus_stone_bricks",
                    "cracked_frigus_stone_bricks"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_stone_slab",
                    "frigus_cobblestone_slab",
                    "polished_frigus_stone_slab",
                    "frigus_stone_brick_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_stone_pillar")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_DEEPSLATE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.COLOR_BLUE)
    )
            .register(
                    "frigus_deepslate",
                    "cobbled_frigus_deepslate",
                    "chiseled_frigus_deepslate",
                    "polished_frigus_deepslate",
                    "frigus_deepslate_bricks",
                    "cracked_frigus_deepslate_bricks",
                    "frigus_deepslate_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_deepslate_slab",
                    "cobbled_frigus_deepslate_slab",
                    "polished_frigus_deepslate_slab",
                    "frigus_deepslate_brick_slab",
                    "frigus_deepslate_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_deepslate_pillar")
            .done();

    // Salt
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SALT_CRYSTAL_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            crystalProperties().mapColor(MapColor.SNOW),
            "salt_crystal_block",
            "polished_salt_crystal_block"
    );
    public static final DeferredBlock<Block> SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(
            new ColorRGBA(0xdfcddd),
            dustBlockProperties().mapColor(MapColor.SNOW)
    ));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SALT_PACKED_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            compressedDustProperties().mapColor(MapColor.SNOW)
    )
            .register(
                    "salt_block",
                    "chiseled_salt",
                    "polished_salt",
                    "salt_bricks",
                    "cracked_salt_bricks",
                    "salt_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "salt_slab",
                    "polished_salt_slab",
                    "salt_brick_slab",
                    "salt_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("salt_pillar")
            .done();

    // Salt
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_CRYSTAL_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            crystalProperties().mapColor(MapColor.COLOR_YELLOW),
            "sulfur_crystal_block",
            "polished_sulfur_crystal_block"
    );
    public static final DeferredBlock<Block> SULFUR_DUST_BLOCK = register("sulfur_dust_block", () -> new ColoredFallingBlock(
            new ColorRGBA(0xdfcddd),
            dustBlockProperties().mapColor(MapColor.COLOR_YELLOW)
    ));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_PACKED_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            compressedDustProperties().mapColor(MapColor.COLOR_YELLOW)
    )
            .register(
                    "sulfur_block",
                    "chiseled_sulfur",
                    "polished_sulfur",
                    "sulfur_bricks",
                    "cracked_sulfur_bricks",
                    "sulfur_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "sulfur_slab",
                    "polished_sulfur_slab",
                    "sulfur_brick_slab",
                    "sulfur_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_pillar")
            .done();

    // Graphite
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GRAPHITE_CRYSTAL_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)
    )
            .register(
                    "graphite_crystal_block",
                    "polished_graphite_crystal_block"
            )
            .done();
    public static final DeferredBlock<Block> GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(
            new ColorRGBA(0x2d261b),
            dustBlockProperties().mapColor(MapColor.TERRACOTTA_BLACK)
    ));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GRAPHITE_PACKED_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK)
    )
            .register(
                    "graphite_block",
                    "chiseled_graphite",
                    "polished_graphite",
                    "graphite_bricks",
                    "cracked_graphite_bricks",
                    "graphite_tiles"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "graphite_slab",
                    "polished_graphite_slab",
                    "graphite_brick_slab",
                    "graphite_tile_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("graphite_pillar")
            .done();

    // Flesh
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FLESH_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.HONEY_BLOCK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F, 0.4F)
    )
            .register(
                    "flesh_block"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "flesh_slab"
            )
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> ROTTEN_FLESH_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.HONEY_BLOCK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.3F, 0.3F)
    )
            .register(
                    "rotten_flesh_block"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "rotten_flesh_slab"
            )
            .done();

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MISCELLANEOUS_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK).lightLevel(state -> 15)
    )
            .register(
                    "erdragh_block"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "erdragh_slab"
            )
            .done();

    // Ores
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> ORE_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties(),
            "etrium_ore",
            "glacio_obdurium_ore",
            "frigus_obdurium_ore"
    );
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> DEEPSLATE_ORE_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties(),
            "frigus_deepslate_obdurium_ore"
    );

    // Metal Blocks

    // Iron
    // Blocks go here

    // Steel
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> STEEL_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            steelProperties()
    )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_steel_pillar")
            .done();

    // Etrium
    // Blocks go here

    // Desh
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> DESH_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deshProperties()
    )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_desh_pillar")
            .done();

    // Ostrum
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OSTRUM_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            ostrumProperties()
    )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_ostrum_pillar")
            .done();

    // Aerolyte
    //public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AEROLYTE = new RegolithBlockBuilder<>(
    //        RegolithNeoForge.wrapBlocks(BLOCKS),
    //        RegolithNeoForge.wrapItems(EUItems.ITEMS),
    //        aerolyteProperties()
    //)
    //        .register("aerolyte_block")
    //        .done();

    // Obdurium
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OBDURIUM_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            obduriumProperties()
    )
            .register(
                    "obdurium_factory_block",
                    "encased_obdurium_block",
                    "obdurium_plateblock",
                    "obdurium_panel",
                    "obdurium_block",
                    "obdurium_plating"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "obdurium_plating_slab"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register(
                    "obdurium_pillar",
                    "glowing_obdurium_pillar",
                    "marked_obdurium_pillar"
            )
            .done();

    // Common properties
    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.GLASS)
                .mapColor(MapColor.SNOW)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(1.5f, 1.5f)
                .friction(0.75F);
    }
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }
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
    private static BlockBehaviour.Properties aerolyteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 9)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties obduriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(8, 6000)
                .sound(SoundType.NETHERITE_BLOCK);
    }

    // Misc helpers
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        EUItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
    // Shorthand for registering simple blocks
    private static DeferredBlock<Block> register(String id, BlockBehaviour.Properties properties) {
        return register(id, () -> new Block(properties));
    }
}


