package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithBlockUtil;
import martian.regolith.neoforge.RegolithNeoForge;
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

public class EUBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    // Moon
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MOON_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.DEEPSLATE),
            "cobbled_moon_deepslate",
            "chiseled_moon_deepslate",
            "polished_moon_deepslate",
            "moon_deepslate_bricks",
            "cracked_moon_deepslate_bricks",
            "moon_deepslate_tiles",
            "moon_deepslate_pillar"
    );

    // Mars
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MARS_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_ORANGE),
            "mars_deepslate",
            "cobbled_mars_deepslate",
            "chiseled_mars_deepslate",
            "polished_mars_deepslate",
            "mars_deepslate_bricks",
            "cracked_mars_deepslate_bricks",
            "mars_deepslate_tiles",
            "mars_deepslate_pillar"
    );

    // Venus
    //public static final DeferredHolders<Block, DeferredBlock<? extends Block>> VENUS_BLOCKS = RegolithBlockUtil.registerBlocks(
    //        RegolithNeoForge.wrapBlocks(BLOCKS),
    //        RegolithNeoForge.wrapItems(EtUltraItems.ITEMS),
    //        deepslateProperties().mapColor(MapColor.COLOR_ORANGE),
    //        "venus_deepslate",
    //        "cobbled_venus_deepslate",
    //        "chiseled_venus_deepslate",
    //        "polished_venus_deepslate",
    //        "venus_deepslate_bricks",
    //        "cracked_venus_deepslate_bricks",
    //        "venus_deepslate_tiles",
    //        "venus_deepslate_pillar"
    //);

    // Mercury
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MERCURY_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.COLOR_PURPLE),
            "mercury_deepslate",
            "cobbled_mercury_deepslate",
            "chiseled_mercury_deepslate",
            "polished_mercury_deepslate",
            "mercury_deepslate_bricks",
            "cracked_mercury_deepslate_bricks",
            "mercury_deepslate_tiles",
            "mercury_deepslate_pillar"
    );


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
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SALT_COMPRESSED_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            compressedDustProperties().mapColor(MapColor.SNOW),
            "salt_block",
            "chiseled_salt",
            "polished_salt",
            "salt_bricks",
            "cracked_salt_bricks",
            "salt_tiles",
            "salt_pillar"
    );

    // Graphite
    public static final DeferredBlock<Block> GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(
            new ColorRGBA(0x2d261b),
            dustBlockProperties().mapColor(MapColor.TERRACOTTA_BLACK)
    ));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GRAPHITE_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_BLACK),
            "graphite_block",
            "chiseled_graphite",
            "polished_graphite",
            "graphite_bricks",
            "cracked_graphite_bricks",
            "graphite_tiles",
            "graphite_pillar"
    );

    // Metal Blocks

    // Iron
    // Blocks go here

    // Steel
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> STEEL_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            steelProperties(),
            "marked_steel_pillar"
    );

    // Etrium
    // Blocks go here

    // Desh
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> DESH_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deshProperties(),
            "marked_desh_pillar"
    );

    // Ostrum
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OSTRUM_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            ostrumProperties(),
            "marked_ostrum_pillar"
    );

    // Aerolyte
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AEROLYTE = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            aerolyteProperties(),
            "aerolyte_block"
    );

    // Obdurium
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OBDURIUM_BLOCKS = RegolithBlockUtil.registerBlocks(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            obduriumProperties(),
            "obdurium_factory_block",
            //"encased_obdurium_block",
            "obdurium_plateblock",
            "obdurium_panel",
            "obdurium_block",
            "obdurium_plating",
            "obdurium_pillar",
            //"glowing_obdurium_pillar",
            "marked_obdurium_pillar"
    );

    // Planet Blocks (Joke)
    //public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PLANET_BLOCKS = RegolithBlockUtil.registerBlocks(
    //        RegolithNeoForge.wrapBlocks(BLOCKS),
    //        RegolithNeoForge.wrapItems(EtUltraItems.ITEMS),
    //        deepslateProperties().mapColor(MapColor.COLOR_GRAY),
    //        "ganymede_block"
    //);

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

