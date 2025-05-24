package io.github.nebulamodding.etultra.registry.block;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.block.blocktypes.FrigusDirtPathBlock;
import io.github.nebulamodding.etultra.registry.block.blocktypes.FrigusFarmlandBlock;
import io.github.nebulamodding.etultra.registry.block.blocktypes.FrigusGrassBlock;
import io.github.nebulamodding.etultra.registry.item.EUItems;
import martian.regolith.DeferredHolders;
import martian.regolith.builder.RegolithBlockBuilder;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.core.Direction;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.github.nebulamodding.etultra.registry.block.EUWoodTypes.GRIMWOOD;
import static io.github.nebulamodding.etultra.registry.block.EUWoodTypes.MAYURA;

public class EUBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    /*
    Seeds
     */

    public static final DeferredBlock<Block>
    TEMPBLOCKTEST = register("tempblocktest", () -> new Block(stoneProperties().mapColor(MapColor.PLANT)));
    //        BRUMA_SEEDS = register("bruma_seeds", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_BLUE).randomTicks().sound(SoundType.CROP))),
    //        AZURE_ROOTS = register("azure_roots", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().sound(SoundType.CROP)));

    /*
    Wood Blocks
     */

    public static final DeferredBlock<Block>
            MAYURA_LOG = register("mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.GLOW_LICHEN : MapColor.TERRACOTTA_LIGHT_BLUE))),
            MAYURA_WOOD = register("mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            STRIPPED_MAYURA_LOG = register("stripped_mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.GLOW_LICHEN))),
            STRIPPED_MAYURA_WOOD = register("stripped_mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PLANKS = register("mayura_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_STAIRS = register("mayura_stairs", () -> new StairBlock(MAYURA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SLAB = register("mayura_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE = register("mayura_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE_GATE = register("mayura_fence_gate", () -> new FenceGateBlock(MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_DOOR = register("mayura_door", () -> new DoorBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_TRAPDOOR = register("mayura_trapdoor", () -> new TrapDoorBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PRESSURE_PLATE = register("mayura_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_BUTTON = register("mayura_button", () -> new ButtonBlock(EUBlockSetTypes.MAYURA, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            MAYURA_LEAVES = register("mayura_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SAPLING = register("mayura_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.GLOW_LICHEN)));

    public static final DeferredBlock<Block>
            GRIMWOOD_LOG = register("grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_CYAN : MapColor.TERRACOTTA_BLACK))),
            GRIMWOOD_WOOD = register("grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_BLACK))),
            STRIPPED_GRIMWOOD_LOG = register("stripped_grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.TERRACOTTA_CYAN))),
            STRIPPED_GRIMWOOD_WOOD = register("stripped_grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PLANKS = register("grimwood_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_STAIRS = register("grimwood_stairs", () -> new StairBlock(GRIMWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_SLAB = register("grimwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE = register("grimwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE_GATE = register("grimwood_fence_gate", () -> new FenceGateBlock(GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_DOOR = register("grimwood_door", () -> new DoorBlock(EUBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_TRAPDOOR = register("grimwood_trapdoor", () -> new TrapDoorBlock(EUBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PRESSURE_PLATE = register("grimwood_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_BUTTON = register("grimwood_button", () -> new ButtonBlock(EUBlockSetTypes.GRIMWOOD, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            GRIMWOOD_LEAVES = register("grimwood_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.SNOW))),
            GRIMWOOD_SAPLING = register("grimwood_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.TERRACOTTA_CYAN)));

    /*
    Frigus
     */

    public static final DeferredBlock<Block>
            FRIGUS_GRASS_BLOCK = register("frigus_grass_block", () -> new FrigusGrassBlock(grassProperties().mapColor(MapColor.GLOW_LICHEN))),
            FRIGUS_DIRT = register("frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DIRT_PATH = register("frigus_dirt_path", () -> new FrigusDirtPathBlock(pathProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            COARSE_FRIGUS_DIRT = register("coarse_frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_FARMLAND = register("frigus_farmland", () -> new FrigusFarmlandBlock(farmlandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD = register("frigus_mud", () -> new MudBlock(mudProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            PACKED_FRIGUS_MUD = register("packed_frigus_mud", () -> new Block(packedMudProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICKS = register("frigus_mud_bricks", () -> new Block(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICK_STAIRS = register("frigus_mud_brick_stairs", () -> new StairBlock(FRIGUS_MUD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_MUD_BRICKS.get()))),
            FRIGUS_MUD_BRICK_SLAB = register("frigus_mud_brick_slab", () -> new SlabBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICK_WALL = register("frigus_mud_brick_wall", () -> new WallBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_SHORT_GRASS = register("frigus_short_grass", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.GLOW_LICHEN)));
    public static final DeferredBlock<Block>
            VIVIAN = register("vivian", () -> new FlowerBlock(MobEffects.INVISIBILITY, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            WICKUL = register("wickul", () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            ICEFLOWER = register("iceflower", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5.0F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUESCHIST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.ICE))
            .register(
                    "blueschist",
                    "cobbled_blueschist",
                    "chiseled_blueschist",
                    "polished_blueschist",
                    "blueschist_bricks",
                    "cracked_blueschist_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("blueschist_pillar")
            .done();
    public static final DeferredBlock<Block>
            BLUESCHIST_STAIRS = register("blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get()))),
            FRIGUS_COBBLESTONE_STAIRS = register("cobbled_blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get()))),
            POLISHED_BLUESCHIST_STAIRS = register("polished_blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("polished_blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("polished_blueschist").get()))),
            BLUESCHIST_BRICK_STAIRS = register("blueschist_brick_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("blueschist_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUESCHIST_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.ICE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "blueschist_slab",
                    "cobbled_blueschist_slab",
                    "polished_blueschist_slab",
                    "blueschist_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "blueschist_wall",
                    "cobbled_blueschist_wall",
                    "polished_blueschist_wall",
                    "blueschist_brick_wall")
            .done();
    public static final DeferredBlock<Block>
            BLUESCHIST_PRESSURE_PLATE = register("blueschist_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.BLUESCHIST, BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get()))),
            BLUESCHIST_BUTTON = register("blueschist_button", () -> new ButtonBlock(EUBlockSetTypes.BLUESCHIST, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())));

    /*
    Frigus Deepslate Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_DEEPSLATE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))
            .register(
                    "frigus_deepslate",
                    "cobbled_frigus_deepslate",
                    "chiseled_frigus_deepslate",
                    "polished_frigus_deepslate",
                    "frigus_deepslate_bricks",
                    "cracked_frigus_deepslate_bricks",
                    "frigus_deepslate_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_deepslate_pillar")
            .done();
    public static final DeferredBlock<Block>
            FRIGUS_DEEPSLATE_STAIRS = register("frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate").get()))),
            COBBLED_FRIGUS_DEEPSLATE_STAIRS = register("cobbled_frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("cobbled_frigus_deepslate").get()))),
            POLISHED_FRIGUS_DEEPSLATE_STAIRS = register("polished_frigus_deepslate_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("polished_frigus_deepslate").get()))),
            FRIGUS_DEEPSLATE_BRICK_STAIRS = register("frigus_deepslate_brick_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_bricks").get()))),
            FRIGUS_DEEPSLATE_TILE_STAIRS = register("frigus_deepslate_tile_stairs", () -> new StairBlock(FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_DEEPSLATE_BLOCKS.get("frigus_deepslate_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_DEEPSLATE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_deepslate_slab",
                    "cobbled_frigus_deepslate_slab",
                    "polished_frigus_deepslate_slab",
                    "frigus_deepslate_brick_slab",
                    "frigus_deepslate_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "frigus_deepslate_wall",
                    "cobbled_frigus_deepslate_wall",
                    "polished_frigus_deepslate_wall",
                    "frigus_deepslate_brick_wall",
                    "frigus_deepslate_tile_wall")
            .done();

    /*
    Permafrost Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "permafrost",
                    "chiseled_permafrost",
                    "polished_permafrost",
                    "permafrost_bricks",
                    "cracked_permafrost_bricks",
                    "permafrost_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("permafrost_pillar")
            .done();
    public static final DeferredBlock<Block>
            PERMAFROST_STAIRS = register("permafrost_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.PERMAFROST_BLOCKS.get("permafrost").get()))),
            POLISHED_PERMAFROST_STAIRS = register("polished_permafrost_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("polished_permafrost").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.PERMAFROST_BLOCKS.get("polished_permafrost").get()))),
            PERMAFROST_BRICK_STAIRS = register("permafrost_brick_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks").get()))),
            PERMAFROST_TILE_STAIRS = register("permafrost_tile_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "permafrost_slab",
                    "polished_permafrost_slab",
                    "permafrost_brick_slab",
                    "permafrost_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "permafrost_wall",
                    "polished_permafrost_wall",
                    "permafrost_brick_wall",
                    "permafrost_tile_wall")
            .done();

    /*
    Karcass Stone
     */
    
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> KARCASS_STONE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .register(
                    "karcass_stone",
                    "karcass_cobblestone",
                    "chiseled_karcass_stone",
                    "polished_karcass_stone",
                    "karcass_stone_bricks",
                    "cracked_karcass_stone_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("karcass_stone_pillar")
            .done();
    public static final DeferredBlock<Block>
            KARCASS_STONE_STAIRS = register("karcass_stone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            KARCASS_COBBLESTONE_STAIRS = register("karcass_cobblestone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            POLISHED_KARCASS_STONE_STAIRS = register("polished_karcass_stone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            KARCASS_STONE_BRICK_STAIRS = register("karcass_stone_brick_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> KARCASS_STONE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "karcass_stone_slab",
                    "karcass_cobblestone_slab",
                    "polished_karcass_stone_slab",
                    "karcass_stone_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "karcass_stone_wall",
                    "karcass_cobblestone_wall",
                    "polished_karcass_stone_wall",
                    "karcass_stone_brick_wall")
            .done();
    public static final DeferredBlock<Block>
            KARCASS_STONE_PRESSURE_PLATE = register("karcass_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            KARCASS_STONE_BUTTON = register("karcass_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get())));

    /*
    Ore Blocks
     */

    public static final DeferredBlock<Block>
            BLUESCHIST_COAL_ORE = register("blueschist_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_IRON_ORE = register("blueschist_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_COPPER_ORE = register("blueschist_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_GOLD_ORE = register("blueschist_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_REDSTONE_ORE = register("blueschist_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_EMERALD_ORE = register("blueschist_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LAPIS_ORE = register("blueschist_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_DIAMOND_ORE = register("blueschist_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_OBDURIUM_ORE = register("blueschist_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_MALUNITE_ORE = register("blueschist_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LUTRUM_ORE = register("blueschist_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),

            FRIGUS_DEEPSLATE_COAL_ORE = register("frigus_deepslate_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_IRON_ORE = register("frigus_deepslate_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_COPPER_ORE = register("frigus_deepslate_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_GOLD_ORE = register("frigus_deepslate_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_REDSTONE_ORE = register("frigus_deepslate_redstone_ore", () -> new RedStoneOreBlock(deepslateRedstoneOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_EMERALD_ORE = register("frigus_deepslate_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_LAPIS_ORE = register("frigus_deepslate_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_DIAMOND_ORE = register("frigus_deepslate_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_OBDURIUM_ORE = register("frigus_deepslate_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_MALUNITE_ORE = register("frigus_deepslate_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DEEPSLATE_LUTRUM_ORE = register("frigus_deepslate_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),

            WATER_ICE_COAL_ORE = register("water_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_IRON_ORE = register("water_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_COPPER_ORE = register("water_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_GOLD_ORE = register("water_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_REDSTONE_ORE = register("water_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            WATER_ICE_EMERALD_ORE = register("water_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LAPIS_ORE = register("water_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_DIAMOND_ORE = register("water_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_OBDURIUM_ORE = register("water_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_MALUNITE_ORE = register("water_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LUTRUM_ORE = register("water_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),

            NITROGEN_ICE_COAL_ORE = register("nitrogen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_IRON_ORE = register("nitrogen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_COPPER_ORE = register("nitrogen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_GOLD_ORE = register("nitrogen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_REDSTONE_ORE = register("nitrogen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_EMERALD_ORE = register("nitrogen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LAPIS_ORE = register("nitrogen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_DIAMOND_ORE = register("nitrogen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_OBDURIUM_ORE = register("nitrogen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_MALUNITE_ORE = register("nitrogen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LUTRUM_ORE = register("nitrogen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),

            OXYGEN_ICE_COAL_ORE = register("oxygen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_IRON_ORE = register("oxygen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_COPPER_ORE = register("oxygen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_GOLD_ORE = register("oxygen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_REDSTONE_ORE = register("oxygen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            OXYGEN_ICE_EMERALD_ORE = register("oxygen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LAPIS_ORE = register("oxygen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_DIAMOND_ORE = register("oxygen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_OBDURIUM_ORE = register("oxygen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_MALUNITE_ORE = register("oxygen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LUTRUM_ORE = register("oxygen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F)));

    /*
    Ice Blocks
     */

    // Water
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .register(
                    "water_ice",
                    "cobbled_water_ice",
                    "water_ice_bricks",
                    "cracked_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            WATER_ICE_STAIRS = register("water_ice_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.WATER_ICE_BLOCKS.get("water_ice").get()))),
            COBBLED_WATER_ICE_STAIRS = register("cobbled_water_ice_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("cobbled_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice").get()))),
            WATER_ICE_BRICK_STAIRS = register("water_ice_brick_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "water_ice_slab",
                    "cobbled_water_ice_slab",
                    "water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "water_ice_wall",
                    "cobbled_water_ice_wall",
                    "water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_water_ice",
                    "cobbled_tholin_poor_water_ice",
                    "tholin_poor_water_ice_bricks",
                    "cracked_tholin_poor_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_WATER_ICE_STAIRS = register("tholin_poor_water_ice_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get()))),
            COBBLED_THOLIN_POOR_WATER_ICE_STAIRS = register("cobbled_tholin_poor_water_ice_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("cobbled_tholin_poor_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("cobbled_tholin_poor_water_ice").get()))),
            THOLIN_POOR_WATER_ICE_BRICK_STAIRS = register("tholin_poor_water_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_water_ice_slab",
                    "cobbled_tholin_poor_water_ice_slab",
                    "tholin_poor_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_water_ice_wall",
                    "cobbled_tholin_poor_water_ice_wall",
                    "tholin_poor_water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_PINK))
            .register(
                    "tholin_rich_water_ice",
                    "cobbled_tholin_rich_water_ice",
                    "tholin_rich_water_ice_bricks",
                    "cracked_tholin_rich_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_WATER_ICE_STAIRS = register("tholin_rich_water_ice_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get()))),
            COBBLED_THOLIN_RICH_WATER_ICE_STAIRS = register("cobbled_tholin_rich_water_ice_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("cobbled_tholin_rich_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("cobbled_tholin_rich_water_ice").get()))),
            THOLIN_RICH_WATER_ICE_BRICK_STAIRS = register("tholin_rich_water_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_PINK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_water_ice_slab",
                    "cobbled_tholin_rich_water_ice_slab",
                    "tholin_rich_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_water_ice_wall",
                    "cobbled_tholin_rich_water_ice_wall",
                    "tholin_rich_water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLACK_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_BLACK))
            .register(
                    "black_water_ice",
                    "cobbled_black_water_ice",
                    "black_water_ice_bricks",
                    "cracked_black_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("black_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            BLACK_WATER_ICE_STAIRS = register("black_water_ice_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get()))),
            COBBLED_BLACK_WATER_ICE_STAIRS = register("cobbled_black_water_ice_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get()))),
            BLACK_WATER_ICE_BRICK_STAIRS = register("black_water_ice_brick_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLACK_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_BLACK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "black_water_ice_slab",
                    "cobbled_black_water_ice_slab",
                    "black_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "black_water_ice_wall",
                    "cobbled_black_water_ice_wall",
                    "black_water_ice_brick_wall")
            .done();

    // Methane
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .register(
                    "methane_ice",
                    "cobbled_methane_ice",
                    "methane_ice_bricks",
                    "cracked_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            METHANE_ICE_STAIRS = register("methane_ice_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice").get()))),
            COBBLED_METHANE_ICE_STAIRS = register("cobbled_methane_ice_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get()))),
            METHANE_ICE_BRICK_STAIRS = register("methane_ice_brick_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "methane_ice_slab",
                    "cobbled_methane_ice_slab",
                    "methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "methane_ice_wall",
                    "cobbled_methane_ice_wall",
                    "methane_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_methane_ice",
                    "cobbled_tholin_poor_methane_ice",
                    "tholin_poor_methane_ice_bricks",
                    "cracked_tholin_poor_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_METHANE_ICE_STAIRS = register("tholin_poor_methane_ice_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get()))),
            COBBLED_THOLIN_POOR_METHANE_ICE_STAIRS = register("cobbled_tholin_poor_methane_ice_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("cobbled_tholin_poor_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("cobbled_tholin_poor_methane_ice").get()))),
            THOLIN_POOR_METHANE_ICE_BRICK_STAIRS = register("tholin_poor_methane_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_methane_ice_slab",
                    "cobbled_tholin_poor_methane_ice_slab",
                    "tholin_poor_methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_methane_ice_wall",
                    "cobbled_tholin_poor_methane_ice_wall",
                    "tholin_poor_methane_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED))
            .register(
                    "tholin_rich_methane_ice",
                    "cobbled_tholin_rich_methane_ice",
                    "tholin_rich_methane_ice_bricks",
                    "cracked_tholin_rich_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_METHANE_ICE_STAIRS = register("tholin_rich_methane_ice_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get()))),
            COBBLED_THOLIN_RICH_METHANE_ICE_STAIRS = register("cobbled_tholin_rich_methane_ice_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("cobbled_tholin_rich_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("cobbled_tholin_rich_methane_ice").get()))),
            THOLIN_RICH_METHANE_ICE_BRICK_STAIRS = register("tholin_rich_methane_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_methane_ice_slab",
                    "cobbled_tholin_rich_methane_ice_slab",
                    "tholin_rich_methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_methane_ice_wall",
                    "cobbled_tholin_rich_methane_ice_wall",
                    "tholin_rich_methane_ice_brick_wall")
            .done();

    // Carbon Dioxide
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "carbon_dioxide_ice",
                    "cobbled_carbon_dioxide_ice",
                    "carbon_dioxide_ice_bricks",
                    "cracked_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            CARBON_DIOXIDE_ICE_STAIRS = register("carbon_dioxide_ice_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get()))),
            COBBLED_CARBON_DIOXIDE_ICE_STAIRS = register("cobbled_carbon_dioxide_ice_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get()))),
            CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("carbon_dioxide_ice_brick_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "carbon_dioxide_ice_slab",
                    "cobbled_carbon_dioxide_ice_slab",
                    "carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "carbon_dioxide_ice_wall",
                    "cobbled_carbon_dioxide_ice_wall",
                    "carbon_dioxide_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.METAL))
            .register(
                    "tholin_poor_carbon_dioxide_ice",
                    "cobbled_tholin_poor_carbon_dioxide_ice",
                    "tholin_poor_carbon_dioxide_ice_bricks",
                    "cracked_tholin_poor_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_poor_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get()))),
            COBBLED_THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS = register("cobbled_tholin_poor_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_poor_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_poor_carbon_dioxide_ice").get()))),
            THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("tholin_poor_carbon_dioxide_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.METAL))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_carbon_dioxide_ice_slab",
                    "cobbled_tholin_poor_carbon_dioxide_ice_slab",
                    "tholin_poor_carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_carbon_dioxide_ice_wall",
                    "cobbled_tholin_poor_carbon_dioxide_ice_wall",
                    "tholin_poor_carbon_dioxide_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.STONE))
            .register(
                    "tholin_rich_carbon_dioxide_ice",
                    "cobbled_tholin_rich_carbon_dioxide_ice",
                    "tholin_rich_carbon_dioxide_ice_bricks",
                    "cracked_tholin_rich_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_rich_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get()))),
            COBBLED_THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS = register("cobbled_tholin_rich_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_rich_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_tholin_rich_carbon_dioxide_ice").get()))),
            THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("tholin_rich_carbon_dioxide_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.STONE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_carbon_dioxide_ice_slab",
                    "cobbled_tholin_rich_carbon_dioxide_ice_slab",
                    "tholin_rich_carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_carbon_dioxide_ice_wall",
                    "cobbled_tholin_rich_carbon_dioxide_ice_wall",
                    "tholin_rich_carbon_dioxide_ice_brick_wall")
            .done();

    // Ammonia
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AMMONIA_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .register(
                    "ammonia_ice",
                    "cobbled_ammonia_ice",
                    "ammonia_ice_bricks",
                    "cracked_ammonia_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("ammonia_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            AMMONIA_ICE_STAIRS = register("ammonia_ice_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("ammonia_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice").get()))),
            COBBLED_AMMONIA_ICE_STAIRS = register("cobbled_ammonia_ice_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get()))),
            AMMONIA_ICE_BRICK_STAIRS = register("ammonia_ice_brick_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AMMONIA_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "ammonia_ice_slab",
                    "cobbled_ammonia_ice_slab",
                    "ammonia_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "ammonia_ice_wall",
                    "cobbled_ammonia_ice_wall",
                    "ammonia_ice_brick_wall")
            .done();

    // Nitrogen
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW))
            .register(
                    "nitrogen_ice",
                    "cobbled_nitrogen_ice",
                    "nitrogen_ice_bricks",
                    "cracked_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            NITROGEN_ICE_STAIRS = register("nitrogen_ice_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get()))),
            COBBLED_NITROGEN_ICE_STAIRS = register("cobbled_nitrogen_ice_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get()))),
            NITROGEN_ICE_BRICK_STAIRS = register("nitrogen_ice_brick_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "nitrogen_ice_slab",
                    "cobbled_nitrogen_ice_slab",
                    "nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "nitrogen_ice_wall",
                    "cobbled_nitrogen_ice_wall",
                    "nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_nitrogen_ice",
                    "cobbled_tholin_poor_nitrogen_ice",
                    "tholin_poor_nitrogen_ice_bricks",
                    "cracked_tholin_poor_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_NITROGEN_ICE_STAIRS = register("tholin_poor_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get()))),
            COBBLED_THOLIN_POOR_NITROGEN_ICE_STAIRS = register("cobbled_tholin_poor_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_poor_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_poor_nitrogen_ice").get()))),
            THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS = register("tholin_poor_nitrogen_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_nitrogen_ice_slab",
                    "cobbled_tholin_poor_nitrogen_ice_slab",
                    "tholin_poor_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_nitrogen_ice_wall",
                    "cobbled_tholin_poor_nitrogen_ice_wall",
                    "tholin_poor_nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_RED))
            .register(
                    "tholin_rich_nitrogen_ice",
                    "cobbled_tholin_rich_nitrogen_ice",
                    "tholin_rich_nitrogen_ice_bricks",
                    "cracked_tholin_rich_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_NITROGEN_ICE_STAIRS = register("tholin_rich_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get()))),
            COBBLED_THOLIN_RICH_NITROGEN_ICE_STAIRS = register("cobbled_tholin_rich_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_rich_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("cobbled_tholin_rich_nitrogen_ice").get()))),
            THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS = register("tholin_rich_nitrogen_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_RED))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_nitrogen_ice_slab",
                    "cobbled_tholin_rich_nitrogen_ice_slab",
                    "tholin_rich_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_nitrogen_ice_wall",
                    "cobbled_tholin_rich_nitrogen_ice_wall",
                    "tholin_rich_nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> RED_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.FIRE))
            .register(
                    "red_nitrogen_ice",
                    "cobbled_red_nitrogen_ice",
                    "red_nitrogen_ice_bricks",
                    "cracked_red_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("red_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            RED_NITROGEN_ICE_STAIRS = register("red_nitrogen_ice_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get()))),
            COBBLED_RED_NITROGEN_ICE_STAIRS = register("cobbled_red_nitrogen_ice_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get()))),
            RED_NITROGEN_ICE_BRICK_STAIRS = register("red_nitrogen_ice_brick_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> RED_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.FIRE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "red_nitrogen_ice_slab",
                    "cobbled_red_nitrogen_ice_slab",
                    "red_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "red_nitrogen_ice_wall",
                    "cobbled_red_nitrogen_ice_wall",
                    "red_nitrogen_ice_brick_wall")
            .done();

    // Sulfur Dioxide
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SAND))
            .register(
                    "sulfur_dioxide_ice",
                    "cobbled_sulfur_dioxide_ice",
                    "sulfur_dioxide_ice_bricks",
                    "cracked_sulfur_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            SULFUR_DIOXIDE_ICE_STAIRS = register("sulfur_dioxide_ice_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get()))),
            COBBLED_SULFUR_DIOXIDE_ICE_STAIRS = register("cobbled_sulfur_dioxide_ice_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get()))),
            SULFUR_DIOXIDE_ICE_BRICK_STAIRS = register("sulfur_dioxide_ice_brick_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties().mapColor(MapColor.SAND))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "sulfur_dioxide_ice_slab",
                    "cobbled_sulfur_dioxide_ice_slab",
                    "sulfur_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "sulfur_dioxide_ice_wall",
                    "cobbled_sulfur_dioxide_ice_wall",
                    "sulfur_dioxide_ice_brick_wall")
            .done();

    // Oxygen
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OXYGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .register(
                    "oxygen_ice",
                    "cobbled_oxygen_ice",
                    "oxygen_ice_bricks",
                    "cracked_oxygen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("oxygen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            OXYGEN_ICE_STAIRS = register("oxygen_ice_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("oxygen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get()))),
            COBBLED_OXYGEN_ICE_STAIRS = register("cobbled_oxygen_ice_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get()))),
            OXYGEN_ICE_BRICK_STAIRS = register("oxygen_ice_brick_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OXYGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "oxygen_ice_slab",
                    "cobbled_oxygen_ice_slab",
                    "oxygen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "oxygen_ice_wall",
                    "cobbled_oxygen_ice_wall",
                    "oxygen_ice_brick_wall")
            .done();

    // Salt
    public static final DeferredBlock<Block>
            SALT_CRYSTAL_BLOCK = register("salt_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.QUARTZ))),
            SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0xDFCDDD), dustProperties().mapColor(MapColor.QUARTZ)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SALT_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "cut_salt",
                    "chiseled_salt",
                    "polished_cut_salt",
                    "cut_salt_bricks",
                    "cracked_cut_salt_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("salt_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_SALT_STAIRS = register("cut_salt_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt").get()))),
            POLISHED_CUT_SALT_STAIRS = register("polished_cut_salt_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt").get()))),
            CUT_SALT_BRICK_STAIRS = register("cut_salt_brick_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SALT_BLOCKS.get("cut_salt").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SALT_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_salt_slab",
                    "polished_cut_salt_slab",
                    "cut_salt_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_salt_wall",
                    "polished_cut_salt_wall",
                    "cut_salt_brick_wall")
            .done();

    // Graphite
    public static final DeferredBlock<Block>
            GRAPHITE_CLUSTER = register("graphite_cluster", () -> new AmethystClusterBlock(7.0F, 3.0F, deepslateProperties().mapColor(MapColor.COLOR_BLACK))),
            GRAPHITE_CRYSTAL_BLOCK = register("graphite_crystal_block", () -> new Block(deepslateProperties().mapColor(MapColor.COLOR_BLACK))),
            GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0x2D261B), dustProperties().mapColor(MapColor.COLOR_BLACK)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_GRAPHITE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_BLACK))
            .register(
                    "cut_graphite",
                    "chiseled_graphite",
                    "polished_cut_graphite",
                    "cut_graphite_bricks",
                    "cracked_cut_graphite_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("graphite_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_GRAPHITE_STAIRS = register("cut_graphite_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get()))),
            POLISHED_CUT_GRAPHITE_STAIRS = register("polished_cut_graphite_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get()))),
            CUT_GRAPHITE_BRICK_STAIRS = register("cut_graphite_brick_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_GRAPHITE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_BLACK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_graphite_slab",
                    "polished_cut_graphite_slab",
                    "cut_graphite_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_graphite_wall",
                    "polished_cut_graphite_wall",
                    "cut_graphite_brick_wall")
            .done();

    // Sulfur
    public static final DeferredBlock<Block>
            SULFUR_CRYSTAL_BLOCK = register("sulfur_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.COLOR_YELLOW))),
            SULFUR_DUST_BLOCK = register("sulfur_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0xDFCDDD), dustProperties().mapColor(MapColor.COLOR_YELLOW)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SULFUR_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
            .register(
                    "cut_sulfur",
                    "chiseled_sulfur",
                    "polished_cut_sulfur",
                    "cut_sulfur_bricks",
                    "cracked_cut_sulfur_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_SULFUR_STAIRS = register("cut_sulfur_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get()))),
            POLISHED_CUT_SULFUR_STAIRS = register("polished_cut_sulfur_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get()))),
            CUT_SULFUR_BRICK_STAIRS = register("cut_sulfur_brick_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SULFUR_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_sulfur_slab",
                    "polished_cut_sulfur_slab",
                    "cut_sulfur_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_sulfur_wall",
                    "polished_cut_sulfur_wall",
                    "cut_sulfur_brick_wall")
            .done();

    /*
    Karnis
     */

    public static final DeferredBlock<Block>
            TUMOR = register("tumor", () -> new AmethystClusterBlock(7.0F, 3.0F, BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).forceSolidOn().noOcclusion().sound(SoundType.HONEY_BLOCK).strength(0.2F, 0.2F).pushReaction(PushReaction.DESTROY).noCollission())),
            FLESH_BLOCK = register("flesh_block", () -> new MudBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F))),
            GRISTLED_FLESH = register("gristled_flesh", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS).strength(0.4F, 0.4F))),
            GRISTLE_BLOCK = register("gristle_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS).strength(0.1F, 0.1F))),
            SHORT_GRISTLES = register("short_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            TALL_GRISTLES = register("tall_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            BRAINROCK = register("brainrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).mapColor(MapColor.RAW_IRON).sound(SoundType.HONEY_BLOCK))),
            BLOOD_VESSEL = register("blood_vessel", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_NYLIUM).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GORESLATE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().sound(SoundType.CORAL_BLOCK).mapColor(MapColor.CRIMSON_HYPHAE))
            .register(
                    "goreslate",
                    "chiseled_goreslate",
                    "polished_goreslate",
                    "goreslate_bricks",
                    "goreslate_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("goreslate_pillar")
            .done();
    public static final DeferredBlock<Block>
            GORESLATE_STAIRS = register("goreslate_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.GORESLATE_BLOCKS.get("goreslate").get()))),
            POLISHED_GORESLATE_STAIRS = register("polished_goreslate_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("polished_goreslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.GORESLATE_BLOCKS.get("polished_goreslate").get()))),
            GORESLATE_BRICK_STAIRS = register("goreslate_brick_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.GORESLATE_BLOCKS.get("goreslate_bricks").get()))),
            GORESLATE_TILE_STAIRS = register("goreslate_tile_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.GORESLATE_BLOCKS.get("goreslate_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GORESLATE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().sound(SoundType.CORAL_BLOCK).mapColor(MapColor.CRIMSON_HYPHAE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "goreslate_slab",
                    "polished_goreslate_slab",
                    "goreslate_brick_slab",
                    "goreslate_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "goreslate_wall",
                    "polished_goreslate_wall",
                    "goreslate_brick_wall",
                    "goreslate_tile_wall")
            .done();
    
    /*
    Raw Material Blocks
     */

    public static final DeferredBlock<Block>
            BRUMA_BLOCK = register("bruma_block", () -> new HayBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.MOSS))),
            RAW_OBDURIUM_BLOCK = register("raw_obdurium_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_PURPLE))),
            RAW_MALUNITE_BLOCK = register("raw_malunite_block", () -> new Block(rawBlockProperties().mapColor(MapColor.COLOR_GREEN))),
            LUTRUM_AMALGAMATE_BLOCK = register("lutrum_amalgamate_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_GRAY))),
            RAW_LUTRUM_BLOCK = register("raw_lutrum_block", () -> new Block(rawBlockProperties().mapColor(MapColor.CLAY)));

    // Iron
    // Blocks go here

    // Steel
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> STEEL_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            steelProperties())
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_steel_pillar")
            .done();

    // Etrium
    // Blocks go here

    // Desh
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> DESH_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deshProperties())
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_desh_pillar")
            .done();

    // Ostrum
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OSTRUM_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            ostrumProperties())
            .setBlockFunction(RotatedPillarBlock::new)
            .register("marked_ostrum_pillar")
            .done();

    // Aerolyte
    // Blocks go here

    // Obdurium
    public static final DeferredBlock<Block>
            OBDURIUM_FACTORY_BLOCK = register("obdurium_factory_block", () -> new Block(obduriumProperties())),
            ENCASED_OBDURIUM_BLOCK = register("encased_obdurium_block", () -> new Block(obduriumProperties())),
            OBDURIUM_PLATEBLOCK = register("obdurium_plateblock", () -> new Block(obduriumProperties())),
            OBDURIUM_PANEL = register("obdurium_panel", () -> new Block(obduriumProperties())),
            OBDURIUM_BLOCK = register("obdurium_block", () -> new Block(obduriumProperties())),
            OBDURIUM_PLATING = register("obdurium_plating", () -> new Block(obduriumProperties())),
            OBDURIUM_PILLAR = register("obdurium_pillar", () -> new RotatedPillarBlock(obduriumProperties())),
            GLOWING_OBDURIUM_PILLAR = register("glowing_obdurium_pillar", () -> new RotatedPillarBlock(obduriumProperties().lightLevel(state -> 15))),
            MARKED_OBDURIUM_PILLAR = register("marked_obdurium_pillar", () -> new RotatedPillarBlock(obduriumProperties())),
            OBDURIUM_PLATING_STAIRS = register("obdurium_plating_stairs", () -> new StairBlock(OBDURIUM_PLATING.get().defaultBlockState(), obduriumProperties())),
            OBDURIUM_PLATING_SLAB = register("obdurium_plating_slab", () -> new SlabBlock(obduriumProperties())),
            OBDURIUM_PLATING_PRESSURE_PLATE = register("obdurium_plating_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.OBDURIUM, obduriumProperties())),
            OBDURIUM_PLATING_BUTTON = register("obdurium_plating_button", () -> new ButtonBlock(EUBlockSetTypes.OBDURIUM, 40, obduriumProperties()));

    // Malunite
    public static final DeferredBlock<Block>
            MALUNITE_FACTORY_BLOCK = register("malunite_factory_block", () -> new Block(maluniteProperties())),
            ENCASED_MALUNITE_BLOCK = register("encased_malunite_block", () -> new Block(maluniteProperties())),
            MALUNITE_PLATEBLOCK = register("malunite_plateblock", () -> new Block(maluniteProperties())),
            MALUNITE_PANEL = register("malunite_panel", () -> new Block(maluniteProperties())),
            MALUNITE_BLOCK = register("malunite_block", () -> new Block(maluniteProperties())),
            MALUNITE_PLATING = register("malunite_plating", () -> new Block(maluniteProperties())),
            MALUNITE_PILLAR = register("malunite_pillar", () -> new RotatedPillarBlock(maluniteProperties())),
            GLOWING_MALUNITE_PILLAR = register("glowing_malunite_pillar", () -> new RotatedPillarBlock(maluniteProperties().lightLevel(state -> 15))),
            MARKED_MALUNITE_PILLAR = register("marked_malunite_pillar", () -> new RotatedPillarBlock(maluniteProperties())),
            MALUNITE_PLATING_STAIRS = register("malunite_plating_stairs", () -> new StairBlock(MALUNITE_PLATING.get().defaultBlockState(), maluniteProperties())),
            MALUNITE_PLATING_SLAB = register("malunite_plating_slab", () -> new SlabBlock(maluniteProperties())),
            MALUNITE_PLATING_PRESSURE_PLATE = register("malunite_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, maluniteProperties())),
            MALUNITE_PLATING_BUTTON = register("malunite_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, maluniteProperties()));

    // Lutrum
    public static final DeferredBlock<Block>
            LUTRUM_FACTORY_BLOCK = register("lutrum_factory_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            ENCASED_LUTRUM_BLOCK = register("encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATEBLOCK = register("lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PANEL = register("lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_BLOCK = register("lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING = register("lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PILLAR = register("lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            GLOWING_LUTRUM_PILLAR = register("glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 15).mapColor(MapColor.CLAY))),
            MARKED_LUTRUM_PILLAR = register("marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            CHISELED_LUTRUM = register("chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_GRATE = register("lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_STAIRS = register("lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_SLAB = register("lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_PRESSURE_PLATE = register("lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_BUTTON = register("lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_DOOR = register("lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            LUTRUM_TRAPDOOR = register("lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            LUTRUM_BULB = register("lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            EXPOSED_LUTRUM_FACTORY_BLOCK = register("exposed_lutrum_factory_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_ENCASED_LUTRUM_BLOCK = register("exposed_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATEBLOCK = register("exposed_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PANEL = register("exposed_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BLOCK = register("exposed_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING = register("exposed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PILLAR = register("exposed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_GLOWING_LUTRUM_PILLAR = register("exposed_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 15).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_MARKED_LUTRUM_PILLAR = register("exposed_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_CHISELED_LUTRUM = register("exposed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_GRATE = register("exposed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_STAIRS = register("exposed_lutrum_plating_stairs", () -> new StairBlock(EXPOSED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_SLAB = register("exposed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("exposed_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_BUTTON = register("exposed_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_DOOR = register("exposed_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_TRAPDOOR = register("exposed_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BULB = register("exposed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WEATHERED_LUTRUM_FACTORY_BLOCK = register("weathered_lutrum_factory_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_ENCASED_LUTRUM_BLOCK = register("weathered_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATEBLOCK = register("weathered_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PANEL = register("weathered_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BLOCK = register("weathered_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING = register("weathered_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PILLAR = register("weathered_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_GLOWING_LUTRUM_PILLAR = register("weathered_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 12).mapColor(MapColor.STONE))),
            WEATHERED_MARKED_LUTRUM_PILLAR = register("weathered_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_CHISELED_LUTRUM = register("weathered_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_GRATE = register("weathered_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_STAIRS = register("weathered_lutrum_plating_stairs", () -> new StairBlock(WEATHERED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_SLAB = register("weathered_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("weathered_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_BUTTON = register("weathered_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_DOOR = register("weathered_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_TRAPDOOR = register("weathered_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BULB = register("weathered_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_BULB).mapColor(MapColor.STONE))),
            OXIDIZED_LUTRUM_FACTORY_BLOCK = register("oxidized_lutrum_factory_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_ENCASED_LUTRUM_BLOCK = register("oxidized_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATEBLOCK = register("oxidized_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PANEL = register("oxidized_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BLOCK = register("oxidized_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING = register("oxidized_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PILLAR = register("oxidized_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_GLOWING_LUTRUM_PILLAR = register("oxidized_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 12).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_MARKED_LUTRUM_PILLAR = register("oxidized_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_CHISELED_LUTRUM = register("oxidized_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_GRATE = register("oxidized_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_STAIRS = register("oxidized_lutrum_plating_stairs", () -> new StairBlock(OXIDIZED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_SLAB = register("oxidized_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("oxidized_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_BUTTON = register("oxidized_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_DOOR = register("oxidized_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_TRAPDOOR = register("oxidized_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BULB = register("oxidized_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_BULB).mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredBlock<Block>
            WAXED_LUTRUM_FACTORY_BLOCK = register("waxed_lutrum_factory_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_ENCASED_LUTRUM_BLOCK = register("waxed_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATEBLOCK = register("waxed_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PANEL = register("waxed_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BLOCK = register("waxed_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING = register("waxed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PILLAR = register("waxed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_GLOWING_LUTRUM_PILLAR = register("waxed_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 15).mapColor(MapColor.CLAY))),
            WAXED_MARKED_LUTRUM_PILLAR = register("waxed_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_CHISELED_LUTRUM = register("waxed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_GRATE = register("waxed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_STAIRS = register("waxed_lutrum_plating_stairs", () -> new StairBlock(WAXED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_SLAB = register("waxed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_BUTTON = register("waxed_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_DOOR = register("waxed_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_TRAPDOOR = register("waxed_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BULB = register("waxed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            WAXED_EXPOSED_LUTRUM_FACTORY_BLOCK = register("waxed_exposed_lutrum_factory_block", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_ENCASED_LUTRUM_BLOCK = register("waxed_exposed_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATEBLOCK = register("waxed_exposed_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PANEL = register("waxed_exposed_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BLOCK = register("waxed_exposed_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING = register("waxed_exposed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PILLAR = register("waxed_exposed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_GLOWING_LUTRUM_PILLAR = register("waxed_exposed_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 15).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_MARKED_LUTRUM_PILLAR = register("waxed_exposed_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_CHISELED_LUTRUM = register("waxed_exposed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_GRATE = register("waxed_exposed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_STAIRS = register("waxed_exposed_lutrum_plating_stairs", () -> new StairBlock(WAXED_EXPOSED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_SLAB = register("waxed_exposed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_exposed_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_BUTTON = register("waxed_exposed_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_DOOR = register("waxed_exposed_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_TRAPDOOR = register("waxed_exposed_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BULB = register("waxed_exposed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_WEATHERED_LUTRUM_FACTORY_BLOCK = register("waxed_weathered_lutrum_factory_block", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_ENCASED_LUTRUM_BLOCK = register("waxed_weathered_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATEBLOCK = register("waxed_weathered_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PANEL = register("waxed_weathered_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BLOCK = register("waxed_weathered_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING = register("waxed_weathered_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PILLAR = register("waxed_weathered_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_GLOWING_LUTRUM_PILLAR = register("waxed_weathered_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 12).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_MARKED_LUTRUM_PILLAR = register("waxed_weathered_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_CHISELED_LUTRUM = register("waxed_weathered_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_GRATE = register("waxed_weathered_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_STAIRS = register("waxed_weathered_lutrum_plating_stairs", () -> new StairBlock(WAXED_WEATHERED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_SLAB = register("waxed_weathered_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_weathered_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_BUTTON = register("waxed_weathered_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_DOOR = register("waxed_weathered_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_TRAPDOOR = register("waxed_weathered_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BULB = register("waxed_weathered_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_BULB).mapColor(MapColor.STONE))),
            WAXED_OXIDIZED_LUTRUM_FACTORY_BLOCK = register("waxed_oxidized_lutrum_factory_block", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_ENCASED_LUTRUM_BLOCK = register("waxed_oxidized_encased_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATEBLOCK = register("waxed_oxidized_lutrum_plateblock", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PANEL = register("waxed_oxidized_lutrum_panel", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BLOCK = register("waxed_oxidized_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING = register("waxed_oxidized_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PILLAR = register("waxed_oxidized_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_GLOWING_LUTRUM_PILLAR = register("waxed_oxidized_glowing_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().lightLevel(state -> 12).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_MARKED_LUTRUM_PILLAR = register("waxed_oxidized_marked_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_CHISELED_LUTRUM = register("waxed_oxidized_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_GRATE = register("waxed_oxidized_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS = register("waxed_oxidized_lutrum_plating_stairs", () -> new StairBlock(WAXED_OXIDIZED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_SLAB = register("waxed_oxidized_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_oxidized_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON = register("waxed_oxidized_lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_DOOR = register("waxed_oxidized_lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, lutrumProperties().noOcclusion().requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_TRAPDOOR = register("waxed_oxidized_lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BULB = register("waxed_oxidized_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_BULB).mapColor(MapColor.COLOR_GRAY)));
    
    /*
    Potted Plants
     */

    public static final DeferredBlock<Block>
            POTTED_MAYURA_SAPLING = BLOCKS.register("potted_mayura_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAYURA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_GRIMWOOD_SAPLING = BLOCKS.register("potted_grimwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRIMWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_VIVIAN = BLOCKS.register("potted_vivian", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, VIVIAN, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_WICKUL = BLOCKS.register("potted_wickul", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WICKUL, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_ICEFLOWER = BLOCKS.register("potted_iceflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ICEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)));

    /*
    Common Properties
     */

    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE)
                .strength(1.5F, 1.5F)
                .requiresCorrectToolForDrops()
                .friction(0.85F);
    }
    private static BlockBehaviour.Properties plantProperties() {
        return BlockBehaviour.Properties.of()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .pushReaction(PushReaction.DESTROY);
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
    private static BlockBehaviour.Properties mudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD);
    }
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }
    private static BlockBehaviour.Properties packedMudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD);
    }
    private static BlockBehaviour.Properties mudBrickProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS);
    }
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE);
    }
    private static BlockBehaviour.Properties stoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE);
    }
    private static BlockBehaviour.Properties stoneRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE);
    }
    private static BlockBehaviour.Properties deepslateRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties crystalProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.AMETHYST)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 1.5F);
    }
    private static BlockBehaviour.Properties compressedDustProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 2.0F);
    }
    private static BlockBehaviour.Properties dustProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }
    private static BlockBehaviour.Properties rawBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK);
    }
    private static BlockBehaviour.Properties steelProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GRAY)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 12.0F)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties deshProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 9.0F)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties ostrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 16.0F)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties obduriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(8.0F, 6000.0F)
                .sound(SoundType.NETHERITE_BLOCK);
    }
    private static BlockBehaviour.Properties maluniteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GREEN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(4.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties lutrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_CYAN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    // Automatically Register Block Items
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        EUItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
}