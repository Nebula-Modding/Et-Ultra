package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
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
            20,
            // Determines the repair ingredient of the tier. Use a supplier for lazy initializing.
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER)
    );

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.register("pencil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.register("dense_pencil", () -> new Item(new Item.Properties()
            .stacksTo(16)
    ));

    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));

    // Metals
    public static final DeferredItem<Item> RAW_ETRIUM = ITEMS.register("raw_etrium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item>
            RAW_OBDURIUM = ITEMS.register("raw_obdurium", () -> new Item(new Item.Properties())),
            OBDURIUM_NUGGET = ITEMS.register("obdurium_nugget", () -> new Item(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_INGOT = ITEMS.register("obdurium_ingot", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_PLATE = ITEMS.register("obdurium_plate", () -> new Item(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)))
            ;

    public static final DeferredItem<Item> IMPURE_STEEL = ITEMS.register("impure_steel", () -> new Item(new Item.Properties()));

    // Tools
    public static final DeferredItem<ShovelItem> DESH_SHOVEL = registerShovelItem("desh_shovel", DESH_TIER, 1, -3);
    public static final DeferredItem<PickaxeItem> DESH_PICKAXE = registerPickaxeItem("desh_pickaxe", DESH_TIER, 1.5f, -2.8f);
    public static final DeferredItem<AxeItem> DESH_AXE = registerAxeItem("desh_axe", DESH_TIER, 6, -3.1f);
    public static final DeferredItem<HoeItem> DESH_HOE = registerHoeItem("desh_hoe", DESH_TIER, -2, -1);
    public static final DeferredItem<SwordItem> DESH_SWORD = registerSwordItem("desh_sword", DESH_TIER, 3, -2.4f);

    // Helper methods
    private static DeferredItem<ShovelItem> registerShovelItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<PickaxeItem> registerPickaxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<AxeItem> registerAxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<HoeItem> registerHoeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
    private static DeferredItem<SwordItem> registerSwordItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }
}
