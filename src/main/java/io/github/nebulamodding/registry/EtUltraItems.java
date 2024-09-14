package io.github.nebulamodding.registry;

// Items Go Here

import io.github.nebulamodding.EtUltra;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);

    // Tool Tiers

    public static final Tier DESH_TIER = new SimpleTier(
            // The tag that determines what blocks this tool cannot break. See below for more information.
            Tags.Blocks.NEEDS_WOOD_TOOL,
            // Durability
            500,
            // Mining Speed
            6,
            // Determines the attack damage bonus. Different tools use this differently. For example, swords do (getAttackDamageBonus() + 4) damage.
            // Stone uses 1, iron uses 2, corresponding to 5 and 6 attack damage for swords, respectively; our sword does 5.5 damage now.
            2,
            // Enchantability
            22,
            // Determines the repair ingredient of the tier. Use a supplier for lazy initializing.
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER)
    );


    // Block Items
    // Moon
    public static final Supplier<BlockItem> COBBLED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> CHISELED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> POLISHED_MOON_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_MOON_DEEPSLATE);
    public static final Supplier<BlockItem> MOON_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MOON_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> CRACKED_MOON_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_MOON_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> MOON_DEEPSLATE_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MOON_DEEPSLATE_TILES);
    // Mars
    public static final Supplier<BlockItem> MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE);
    public static final Supplier<BlockItem> COBBLED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.COBBLED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> CHISELED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> POLISHED_MARS_DEEPSLATE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_MARS_DEEPSLATE);
    public static final Supplier<BlockItem> MARS_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> CRACKED_MARS_DEEPSLATE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_MARS_DEEPSLATE_BRICKS);
    public static final Supplier<BlockItem> MARS_DEEPSLATE_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.MARS_DEEPSLATE_TILES);
    // Salt
    public static final Supplier<BlockItem> SALT_CRYSTAL_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.SALT_CRYSTAL_BLOCK);
    public static final Supplier<BlockItem> POLISHED_SALT_CRYSTAL_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_SALT_CRYSTAL_BLOCK);
    public static final Supplier<BlockItem> SALT_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.SALT_BLOCK);
    public static final Supplier<BlockItem> SALT_DUST_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.SALT_DUST_BLOCK);
    public static final Supplier<BlockItem> CHISELED_SALT = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_SALT);
    public static final Supplier<BlockItem> POLISHED_SALT = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_SALT);
    public static final Supplier<BlockItem> SALT_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.SALT_BRICKS);
    public static final Supplier<BlockItem> CRACKED_SALT_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_SALT_BRICKS);
    public static final Supplier<BlockItem> SALT_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.SALT_TILES);
    // Graphite
    public static final Supplier<BlockItem> GRAPHITE_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_BLOCK);
    public static final Supplier<BlockItem> GRAPHITE_DUST_BLOCK = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_DUST_BLOCK);
    public static final Supplier<BlockItem> CHISELED_GRAPHITE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CHISELED_GRAPHITE);
    public static final Supplier<BlockItem> POLISHED_GRAPHITE = ITEMS.registerSimpleBlockItem(EtUltraBlocks.POLISHED_GRAPHITE);
    public static final Supplier<BlockItem> GRAPHITE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_BRICKS);
    public static final Supplier<BlockItem> CRACKED_GRAPHITE_BRICKS = ITEMS.registerSimpleBlockItem(EtUltraBlocks.CRACKED_GRAPHITE_BRICKS);
    public static final Supplier<BlockItem> GRAPHITE_TILES = ITEMS.registerSimpleBlockItem(EtUltraBlocks.GRAPHITE_TILES);

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.register("pencil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.register("dense_pencil", () -> new Item(new Item.Properties()
            .stacksTo(16)
    ));

    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));

    // Metals

    public static final DeferredItem<Item> RAW_ETRIUM = ITEMS.register("raw_etrium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_OBDURIUM = ITEMS.register("raw_obdurium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBDURIUM_NUGGET = ITEMS.register("obdurium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBDURIUM_INGOT = ITEMS.register("obdurium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBDURIUM_PLATE = ITEMS.register("obdurium_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new Item(new Item.Properties()));

    // Tools

    public static final Supplier<SwordItem> DESH_SWORD = ITEMS.register("desh_sword", () -> new SwordItem(
            DESH_TIER,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(
                            DESH_TIER,
                            // Attack Damage
                            3,
                            // Attack Speed
                            -2.4f
                    )
            )
    ));
    public static final Supplier<AxeItem> DESH_AXE = ITEMS.register("desh_axe", () -> new AxeItem(
            DESH_TIER,
            new Item.Properties().attributes(
                    AxeItem.createAttributes(
                            DESH_TIER,
                            // Attack Damage
                            6,
                            // Attack Speed
                            -3.1f
                    )
            )
    ));

    //public static final Supplier<PickaxeItem> DESH_PICKAXE = ITEMS.register("desh_pickaxe", () -> new PickaxeItem());
    //public static final Supplier<ShovelItem> DESH_SHOVEL = ITEMS.register("desh_shovel", () -> new ShovelItem());
    //public static final Supplier<HoeItem> DESH_HOE = ITEMS.register("desh_hoe", () -> new HoeItem());

}
