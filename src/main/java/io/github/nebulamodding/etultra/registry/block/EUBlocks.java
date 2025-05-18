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
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static io.github.nebulamodding.etultra.registry.block.EUWoodTypes.MAYURA;

public class EUBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EtUltra.MOD_ID);

    /*
    Seeds
     */

    //public static final DeferredBlock<Block>
    //        BRUMA_SEEDS = register("bruma_seeds", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_BLUE).randomTicks().sound(SoundType.CROP))),
    //        AZURE_ROOTS = register("azure_roots", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().sound(SoundType.CROP)));

    /*
    Wood Blocks
     */

    //public static final TreeGrower MAYURA_TREE = new TreeGrower("mayura", Optional.empty(), Optional.of(EUConfiguredFeatures.TREE_MAYURA), Optional.empty());

    public static final DeferredBlock<Block>
            MAYURA_LOG = register("mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.COLOR_LIGHT_BLUE : MapColor.TERRACOTTA_CYAN))),
            MAYURA_WOOD = register("mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_CYAN))),
            STRIPPED_MAYURA_LOG = register("stripped_mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            STRIPPED_MAYURA_WOOD = register("stripped_mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_PLANKS = register("mayura_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_STAIRS = register("mayura_stairs", () -> new StairBlock(MAYURA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_SLAB = register("mayura_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_FENCE = register("mayura_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_FENCE_GATE = register("mayura_fence_gate", () -> new FenceGateBlock(MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_DOOR = register("mayura_door", () -> new DoorBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_TRAPDOOR = register("mayura_trapdoor", () -> new TrapDoorBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_PRESSURE_PLATE = register("mayura_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_BUTTON = register("mayura_button", () -> new ButtonBlock(EUBlockSetTypes.MAYURA, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            MAYURA_LEAVES = register("mayura_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            MAYURA_SAPLING = register("mayura_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.COLOR_LIGHT_BLUE)));

    /*
    Frigus Soil Blocks
     */

    public static final DeferredBlock<Block>
            FRIGUS_GRASS_BLOCK = register("frigus_grass_block", () -> new FrigusGrassBlock(grassProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_DIRT = register("frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_DIRT_PATH = register("frigus_dirt_path", () -> new FrigusDirtPathBlock(pathProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            COARSE_FRIGUS_DIRT = register("coarse_frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_FARMLAND = register("frigus_farmland", () -> new FrigusFarmlandBlock(farmlandProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_MUD = register("frigus_mud", () -> new MudBlock(mudProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            PACKED_FRIGUS_MUD = register("packed_frigus_mud", () -> new Block(packedMudProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_MUD_BRICKS = register("frigus_mud_bricks", () -> new Block(mudBrickProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_MUD_BRICK_STAIRS = register("frigus_mud_brick_stairs", () -> new StairBlock(FRIGUS_MUD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_MUD_BRICKS.get()))),
            FRIGUS_MUD_BRICK_SLAB = register("frigus_mud_brick_slab", () -> new SlabBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_MUD_BRICK_WALL = register("frigus_mud_brick_wall", () -> new WallBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_CYAN))),
            FRIGUS_SHORT_GRASS = register("frigus_short_grass", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.COLOR_LIGHT_BLUE)));

    /*
    Frigus Plants
     */

    public static final DeferredBlock<Block>
            VIVIAN = register("vivian", () -> new FlowerBlock(MobEffects.INVISIBILITY, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            WICKUL = register("wickul", () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            ICEFLOWER = register("iceflower", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5.0F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ)));

    /*
    Frigus Stone Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_STONE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .register(
                    "frigus_stone",
                    "frigus_cobblestone",
                    "chiseled_frigus_stone",
                    "polished_frigus_stone",
                    "frigus_stone_bricks",
                    "cracked_frigus_stone_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("frigus_stone_pillar")
            .done();
    public static final DeferredBlock<Block>
            FRIGUS_STONE_STAIRS = register("frigus_stone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            FRIGUS_COBBLESTONE_STAIRS = register("frigus_cobblestone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            POLISHED_FRIGUS_STONE_STAIRS = register("polished_frigus_stone_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            FRIGUS_STONE_BRICK_STAIRS = register("frigus_stone_brick_stairs", () -> new StairBlock(FRIGUS_STONE_BLOCKS.get("frigus_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_STONE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "frigus_stone_slab",
                    "frigus_cobblestone_slab",
                    "polished_frigus_stone_slab",
                    "frigus_stone_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "frigus_stone_wall",
                    "frigus_cobblestone_wall",
                    "polished_frigus_stone_wall",
                    "frigus_stone_brick_wall")
            .done();
    public static final DeferredBlock<Block>
            FRIGUS_STONE_PRESSURE_PLATE = register("frigus_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get()))),
            FRIGUS_STONE_BUTTON = register("frigus_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.FRIGUS_STONE_BLOCKS.get("frigus_stone").get())));

    /*
    Frigus Deepslate Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> FRIGUS_DEEPSLATE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            deepslateProperties().mapColor(MapColor.COLOR_BLUE))
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
            deepslateProperties().mapColor(MapColor.COLOR_BLUE))
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
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
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
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
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
    Ore Blocks
     */

    public static final DeferredBlock<Block>
            FRIGUS_COAL_ORE = register("frigus_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_IRON_ORE = register("frigus_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_COPPER_ORE = register("frigus_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_GOLD_ORE = register("frigus_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_REDSTONE_ORE = register("frigus_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_EMERALD_ORE = register("frigus_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_LAPIS_ORE = register("frigus_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_DIAMOND_ORE = register("frigus_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_OBDURIUM_ORE = register("frigus_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_MALUNITE_ORE = register("frigus_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            FRIGUS_LUTRUM_ORE = register("frigus_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),

            FRIGUS_DEEPSLATE_COAL_ORE = register("frigus_deepslate_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_IRON_ORE = register("frigus_deepslate_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_COPPER_ORE = register("frigus_deepslate_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_GOLD_ORE = register("frigus_deepslate_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_REDSTONE_ORE = register("frigus_deepslate_redstone_ore", () -> new RedStoneOreBlock(deepslateRedstoneOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_EMERALD_ORE = register("frigus_deepslate_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_LAPIS_ORE = register("frigus_deepslate_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_DIAMOND_ORE = register("frigus_deepslate_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_OBDURIUM_ORE = register("frigus_deepslate_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_MALUNITE_ORE = register("frigus_deepslate_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),
            FRIGUS_DEEPSLATE_LUTRUM_ORE = register("frigus_deepslate_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.COLOR_BLUE))),

            WATER_ICE_COAL_ORE = register("water_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_IRON_ORE = register("water_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_COPPER_ORE = register("water_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_GOLD_ORE = register("water_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_REDSTONE_ORE = register("water_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3f, 1f).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.ICE))),
            WATER_ICE_EMERALD_ORE = register("water_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_LAPIS_ORE = register("water_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_DIAMOND_ORE = register("water_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_OBDURIUM_ORE = register("water_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_MALUNITE_ORE = register("water_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),
            WATER_ICE_LUTRUM_ORE = register("water_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.ICE))),

            NITROGEN_ICE_COAL_ORE = register("nitrogen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_IRON_ORE = register("nitrogen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_COPPER_ORE = register("nitrogen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_GOLD_ORE = register("nitrogen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_REDSTONE_ORE = register("nitrogen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3f, 1f).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_EMERALD_ORE = register("nitrogen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LAPIS_ORE = register("nitrogen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_DIAMOND_ORE = register("nitrogen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_OBDURIUM_ORE = register("nitrogen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_MALUNITE_ORE = register("nitrogen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LUTRUM_ORE = register("nitrogen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.SNOW))),

            OXYGEN_ICE_COAL_ORE = register("oxygen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_IRON_ORE = register("oxygen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_COPPER_ORE = register("oxygen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_GOLD_ORE = register("oxygen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_REDSTONE_ORE = register("oxygen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3f, 1f).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_EMERALD_ORE = register("oxygen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_LAPIS_ORE = register("oxygen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_DIAMOND_ORE = register("oxygen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_OBDURIUM_ORE = register("oxygen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_MALUNITE_ORE = register("oxygen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE))),
            OXYGEN_ICE_LUTRUM_ORE = register("oxygen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3f, 1f).mapColor(MapColor.COLOR_LIGHT_BLUE)));

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
            iceProperties().mapColor(MapColor.COLOR_BLACK))
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
            iceProperties().mapColor(MapColor.COLOR_BLACK))
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
            iceProperties())
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
            iceProperties())
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
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
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
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
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
            iceProperties().mapColor(MapColor.COLOR_RED))
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
            iceProperties().mapColor(MapColor.COLOR_RED))
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
            iceProperties().mapColor(MapColor.COLOR_RED))
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
            iceProperties().mapColor(MapColor.COLOR_RED))
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
            iceProperties().mapColor(MapColor.COLOR_YELLOW))
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
            iceProperties().mapColor(MapColor.COLOR_YELLOW))
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
            iceProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
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
            iceProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
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
            SALT_CRYSTAL_BLOCK = register("salt_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.COLOR_YELLOW))),
            SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0xDFCDDD), dustProperties().mapColor(MapColor.COLOR_YELLOW)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SALT_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
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
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
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

    // Graphite
    public static final DeferredBlock<Block>
            GRAPHITE_CRYSTAL_BLOCK = register("graphite_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.COLOR_BLACK))),
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

    /*
    Flesh
     */

    public static final DeferredBlock<Block>
            FLESH_BLOCK = register("flesh_block", () -> new MudBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).sound(SoundType.HONEY_BLOCK).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F, 0.4F))),
            BRAINROCK = register("brainrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.HONEY_BLOCK)));

    /*
    Raw Material Blocks
     */

    public static final DeferredBlock<Block>
            BRUMA_BLOCK = register("bruma_block", () -> new HayBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.MOSS))),
            RAW_OBDURIUM_BLOCK = register("raw_obdurium_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_PURPLE))),
            RAW_MALUNITE_BLOCK = register("raw_malunite_block", () -> new Block(rawBlockProperties().mapColor(MapColor.COLOR_GREEN))),
            AMALGAMATED_ALLOY_BLOCK = register("amalgamated_alloy_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.TERRACOTTA_CYAN))),
            RAW_LUTRUM_BLOCK = register("raw_lutrum_block", () -> new Block(rawBlockProperties().mapColor(MapColor.TERRACOTTA_CYAN)));

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
    // Blocks go here

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
            .setBlockFunction(RotatedPillarBlock::new)
            .register(
                    "obdurium_pillar",
                    "glowing_obdurium_pillar",
                    "marked_obdurium_pillar"
            )
            .done();
    public static final DeferredBlock<Block>
            OBDURIUM_PLATING_STAIRS = register("obdurium_plating_stairs", () -> new StairBlock(OBDURIUM_BLOCKS.get("obdurium_plating").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_plating").get()))),
            OBDURIUM_PLATING_SLAB = register("obdurium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_plating").get()))),
            OBDURIUM_PLATING_PRESSURE_PLATE = register("obdurium_plating_pressure_plate", () -> new PressurePlateBlock(EUBlockSetTypes.OBDURIUM, BlockBehaviour.Properties.ofFullCopy(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_plating").get()))),
            OBDURIUM_PLATING_BUTTON = register("obdurium_plating_button", () -> new ButtonBlock(EUBlockSetTypes.OBDURIUM, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.OBDURIUM_BLOCKS.get("obdurium_plating").get())));

    // Malunite
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> MALUNITE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            maluniteProperties()
    )
            .register(
                    "malunite_factory_block",
                    "encased_malunite_block",
                    "malunite_plateblock",
                    "malunite_panel",
                    "malunite_block",
                    "malunite_plating"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register(
                    "malunite_pillar",
                    "glowing_malunite_pillar",
                    "marked_malunite_pillar"
            )
            .done();
    public static final DeferredBlock<Block>
            MALUNITE_PLATING_STAIRS = register("malunite_plating_stairs", () -> new StairBlock(MALUNITE_BLOCKS.get("malunite_plating").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating").get()))),
            MALUNITE_PLATING_SLAB = register("malunite_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating").get()))),
            MALUNITE_PLATING_PRESSURE_PLATE = register("malunite_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating").get()))),
            MALUNITE_PLATING_BUTTON = register("malunite_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.MALUNITE_BLOCKS.get("malunite_plating").get())));

    // Lutrum
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> LUTRUM_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(EUItems.ITEMS),
            lutrumProperties()
    )
            .register(
                    "lutrum_factory_block",
                    "encased_lutrum_block",
                    "lutrum_plateblock",
                    "lutrum_panel",
                    "lutrum_block",
                    "lutrum_plating"
            )
            .setBlockFunction(RotatedPillarBlock::new)
            .register(
                    "lutrum_pillar",
                    "glowing_lutrum_pillar",
                    "marked_lutrum_pillar"
            )
            .done();
    public static final DeferredBlock<Block>
            CHISELED_LUTRUM = register("chiseled_lutrum", () -> new Block(lutrumProperties())),
            LUTRUM_GRATE = register("lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            LUTRUM_PLATING_STAIRS = register("lutrum_plating_stairs", () -> new StairBlock(LUTRUM_BLOCKS.get("lutrum_plating").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(EUBlocks.LUTRUM_BLOCKS.get("lutrum_plating").get()))),
            LUTRUM_PLATING_SLAB = register("lutrum_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(EUBlocks.LUTRUM_BLOCKS.get("lutrum_plating").get()))),
            LUTRUM_PLATING_PRESSURE_PLATE = register("lutrum_plating_pressure_plate", () -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(EUBlocks.LUTRUM_BLOCKS.get("lutrum_plating").get()))),
            LUTRUM_PLATING_BUTTON = register("lutrum_plating_button", () -> new ButtonBlock(BlockSetType.COPPER, 20, BlockBehaviour.Properties.ofFullCopy(EUBlocks.LUTRUM_BLOCKS.get("lutrum_plating").get()))),
            LUTRUM_DOOR = register("lutrum_door", () -> new DoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER_DOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            LUTRUM_TRAPDOOR = register("lutrum_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            LUTRUM_BULB = register("lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER_BULB).mapColor(MapColor.TERRACOTTA_CYAN)));

    /*
    Potted Plants
     */

    public static final DeferredBlock<Block>
            POTTED_MAYURA_SAPLING = BLOCKS.register("potted_mayura_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAYURA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_VIVIAN = BLOCKS.register("potted_vivian", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, VIVIAN, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_WICKUL = BLOCKS.register("potted_wickul", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WICKUL, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_ICEFLOWER = BLOCKS.register("potted_iceflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ICEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)));

    /*
    Common Properties
     */

    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.ICE)
                .strength(1.5f, 1.5f)
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
    private static BlockBehaviour.Properties rawBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK);
    }
    private static BlockBehaviour.Properties steelProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GRAY)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 12)
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
                .sound(SoundType.NETHERITE_BLOCK);
    }
    private static BlockBehaviour.Properties maluniteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GREEN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(6, 3)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties lutrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_CYAN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(6, 3)
                .sound(SoundType.COPPER);
    }
    // Automatically Register Block Items
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        EUItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
}