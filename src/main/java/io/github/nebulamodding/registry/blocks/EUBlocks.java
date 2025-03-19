package io.github.nebulamodding.registry.blocks;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.items.EUItems;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithBlockUtil;
import martian.regolith.builder.RegolithBlockBuilder;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EUBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    // Frigus
    public static final DeferredBlock<Block>
            FRIGUS_GRASS_BLOCK = register("frigus_grass_block", () -> new GrassBlock(grassProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_DIRT = register("frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_DIRT_PATH = register("frigus_dirt_path", () -> new DirtPathBlock(pathProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_COARSE_DIRT = register("frigus_coarse_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_FARMLAND = register("frigus_farmland", () -> new FarmBlock(farmlandProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_SHORT_GRASS = register("frigus_short_grass", () -> new TallGrassBlock(shortGrassProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            VIVIAN = register("vivian", () -> new FlowerBlock(
                    MobEffects.INVISIBILITY,
                    3.5F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_BLUE)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))),
            WICKUL = register("wickul", () -> new FlowerBlock(
                    MobEffects.MOVEMENT_SPEED,
                    3.5F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_BLUE)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            )),
            ICEFLOWER = register("iceflower", () -> new FlowerBlock(
                    MobEffects.MOVEMENT_SLOWDOWN,
                    5.0F,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_LIGHT_BLUE)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY)
            ));
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
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_stone_pillar")
            .done();
    public static final DeferredBlock<Block>
            FRIGUS_STONE_STAIRS = register("frigus_stone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            FRIGUS_COBBLESTONE_STAIRS = register("frigus_cobblestone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            POLISHED_FRIGUS_STONE_STAIRS = register("polished_frigus_stone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            FRIGUS_STONE_BRICK_STAIRS = register("frigus_stone_brick_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_STONE_BLOCKS_CONT = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)
    )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_stone_slab",
                    "frigus_cobblestone_slab",
                    "polished_frigus_stone_slab",
                    "frigus_stone_brick_slab"
            )
            .setBlockFunction(WallBlock::new)
            .register(
                    "frigus_stone_wall",
                    "frigus_cobblestone_wall",
                    "polished_frigus_stone_wall"
                    //"frigus_stone_brick_wall"
            )
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
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_deepslate_pillar")
            .done();
    public static final DeferredBlock<Block>
            FRIGUS_DEEPSLATE_STAIRS = register("frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get()))),
            COBBLED_FRIGUS_DEEPSLATE_STAIRS = register("cobbled_frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()))),
            POLISHED_FRIGUS_DEEPSLATE_STAIRS = register("polished_frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get()))),
            FRIGUS_DEEPSLATE_BRICK_STAIRS = register("frigus_deepslate_brick_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get()))),
            FRIGUS_DEEPSLATE_TILE_STAIRS = register("frigus_deepslate_tile_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_DEEPSLATE_BLOCKS_CONT = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.COLOR_BLUE)
    )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_deepslate_slab",
                    "cobbled_frigus_deepslate_slab",
                    "polished_frigus_deepslate_slab",
                    "frigus_deepslate_brick_slab",
                    "frigus_deepslate_tile_slab"
            )
            .done();
    // Permafrost
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)
    )
            .register(
                    "permafrost",
                    "chiseled_permafrost",
                    "polished_permafrost",
                    "permafrost_bricks",
                    "cracked_permafrost_bricks",
                    "permafrost_tiles"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("permafrost_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "permafrost_slab",
                    "polished_permafrost_slab",
                    "permafrost_brick_slab",
                    "permafrost_tile_slab"
            )
            .done();

    // Ores
    public static final DeferredBlock<Block>
            FRIGUS_COAL_ORE = register("frigus_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_IRON_ORE = register("frigus_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_COPPER_ORE = register("frigus_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_GOLD_ORE = register("frigus_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_REDSTONE_ORE = register("frigus_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_EMERALD_ORE = register("frigus_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_LAPIS_ORE = register("frigus_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_DIAMOND_ORE = register("frigus_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),

            FRIGUS_DEEPSLATE_COAL_ORE = register("frigus_deepslate_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_IRON_ORE = register("frigus_deepslate_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_COPPER_ORE = register("frigus_deepslate_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_GOLD_ORE = register("frigus_deepslate_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_REDSTONE_ORE = register("frigus_deepslate_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE).mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_EMERALD_ORE = register("frigus_deepslate_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_LAPIS_ORE = register("frigus_deepslate_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_DIAMOND_ORE = register("frigus_deepslate_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_BLUE)));











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
            .setBlockFunction(RotatedPillarBlock::new)
            .register("moon_deepslate_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cobbled_moon_deepslate_slab",
                    "polished_moon_deepslate_slab",
                    "moon_deepslate_brick_slab",
                    "moon_deepslate_tile_slab"
            )
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
            .setBlockFunction(RotatedPillarBlock::new)
            .register("mars_deepslate_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "mars_deepslate_slab",
                    "cobbled_mars_deepslate_slab",
                    "polished_mars_deepslate_slab",
                    "mars_deepslate_brick_slab",
                    "mars_deepslate_tile_slab"
            )
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
            .setBlockFunction(RotatedPillarBlock::new)
            .register("mercury_deepslate_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "mercury_deepslate_slab",
                    "cobbled_mercury_deepslate_slab",
                    "polished_mercury_deepslate_slab",
                    "mercury_deepslate_brick_slab",
                    "mercury_deepslate_tile_slab"
            )
            .done();

    // Water Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW)
    )
            .register(
                    "water_ice",
                    "cracked_water_ice",
                    "water_ice_bricks",
                    "cracked_water_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("water_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "water_ice_slab",
                    "cracked_water_ice_slab",
                    "water_ice_brick_slab"
            )
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_ORANGE)
    )
            .register(
                    "tholin_poor_water_ice",
                    "cracked_tholin_poor_water_ice",
                    "tholin_poor_water_ice_bricks",
                    "cracked_tholin_poor_water_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_water_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_water_ice_slab",
                    "cracked_tholin_poor_water_ice_slab",
                    "tholin_poor_water_ice_brick_slab"
            )
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED)
    )
            .register(
                    "tholin_rich_water_ice",
                    "cracked_tholin_rich_water_ice",
                    "tholin_rich_water_ice_bricks",
                    "cracked_tholin_rich_water_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_water_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_water_ice_slab",
                    "cracked_tholin_rich_water_ice_slab",
                    "tholin_rich_water_ice_brick_slab"
            )
            .done();

    // Carbon Dioxide Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_YELLOW)
    )
            .register(
                    "carbon_dioxide_ice",
                    "cracked_carbon_dioxide_ice",
                    "carbon_dioxide_ice_bricks",
                    "cracked_carbon_dioxide_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("carbon_dioxide_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "carbon_dioxide_ice_slab",
                    "cracked_carbon_dioxide_ice_slab",
                    "carbon_dioxide_ice_brick_slab"
            )
            .done();

    // Nitrogen Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW)
    )
            .register(
                    "nitrogen_ice",
                    "cracked_nitrogen_ice",
                    "nitrogen_ice_bricks",
                    "cracked_nitrogen_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("nitrogen_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "nitrogen_ice_slab",
                    "cracked_nitrogen_ice_slab",
                    "nitrogen_ice_brick_slab"
            )
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_ORANGE)
    )
            .register(
                    "tholin_poor_nitrogen_ice",
                    "cracked_tholin_poor_nitrogen_ice",
                    "tholin_poor_nitrogen_ice_bricks",
                    "cracked_tholin_poor_nitrogen_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_nitrogen_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_nitrogen_ice_slab",
                    "cracked_tholin_poor_nitrogen_ice_slab",
                    "tholin_poor_nitrogen_ice_brick_slab"
            )
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED)
    )
            .register(
                    "tholin_rich_nitrogen_ice",
                    "cracked_tholin_rich_nitrogen_ice",
                    "tholin_rich_nitrogen_ice_bricks",
                    "cracked_tholin_rich_nitrogen_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_nitrogen_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_nitrogen_ice_slab",
                    "cracked_tholin_rich_nitrogen_ice_slab",
                    "tholin_rich_nitrogen_ice_brick_slab"
            )
            .done();

    // Sulfur Dioxide Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_YELLOW)
    )
            .register(
                    "sulfur_dioxide_ice",
                    "cracked_sulfur_dioxide_ice",
                    "sulfur_dioxide_ice_bricks",
                    "cracked_sulfur_dioxide_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_dioxide_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "sulfur_dioxide_ice_slab",
                    "cracked_sulfur_dioxide_ice_slab",
                    "sulfur_dioxide_ice_brick_slab"
            )
            .done();

    // Ammonia Ice
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AMMONIA_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_YELLOW)
    )
            .register(
                    "ammonia_ice",
                    "cracked_ammonia_ice",
                    "ammonia_ice_bricks",
                    "cracked_ammonia_ice_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("ammonia_ice_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "ammonia_ice_slab",
                    "cracked_ammonia_ice_slab",
                    "ammonia_ice_brick_slab"
            )
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
            dustProperties().mapColor(MapColor.SNOW)
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
                    "cracked_salt_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("salt_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "salt_slab",
                    "polished_salt_slab",
                    "salt_brick_slab"
            )
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
            dustProperties().mapColor(MapColor.COLOR_YELLOW)
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
                    "cracked_sulfur_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "sulfur_slab",
                    "polished_sulfur_slab",
                    "sulfur_brick_slab"
            )
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
            dustProperties().mapColor(MapColor.TERRACOTTA_BLACK)
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
                    "cracked_graphite_bricks"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register("graphite_pillar")
            .setBlockFunction(SlabBlock::new)
            .register(
                    "graphite_slab",
                    "polished_graphite_slab",
                    "graphite_brick_slab"
            )
            .done();
    // Flesh
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FLESH_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.HONEY_BLOCK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F, 0.4F)
    )
            .setBlockFunction(MudBlock::new)
            .register(
                    "flesh_block"
            )
            .setBlockFunction(Block::new)
            .register(
                    "flesh_bricks"
            )
            .setBlockFunction(SlabBlock::new)
            .register(
                    "flesh_slab",
                    "flesh_brick_slab"
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
    private static BlockBehaviour.Properties shortGrassProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS);
    }
    private static BlockBehaviour.Properties grassProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK);
    }
    private static BlockBehaviour.Properties dirtProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT);
    }
    private static BlockBehaviour.Properties pathProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT_PATH);
    }
    private static BlockBehaviour.Properties farmlandProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND);
    }
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE);
    }
    private static BlockBehaviour.Properties stoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE);
    }
    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE);
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
    private static BlockBehaviour.Properties dustProperties() {
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
}


