package io.github.nebulamodding.registry.items;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.blocks.EUBlocks;
import io.github.nebulamodding.registry.registers.EUTiers;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithItemUtil;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EUItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);

    public static final DeferredHolders<Item, DeferredItem<? extends Item>> OBDURIUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties().rarity(Rarity.EPIC),
            "raw_obdurium",
            "obdurium_nugget"
    );

    public static final DeferredItem<Item>
            OBDURIUM_INGOT = ITEMS.register("obdurium_ingot", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_PLATE = ITEMS.register("obdurium_plate", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            FLESH = ITEMS.register("flesh", () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.5f).build())));

    // Simple items
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> SIMPLE_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            // Gems
            //"diamond_shard",
            // Metals
            "raw_etrium",
            "impure_steel"
    );

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.registerSimpleItem("pencil", new Item.Properties());
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.registerSimpleItem("dense_pencil", new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> OBDURIUM_HAMMER_HANDLE = ITEMS.registerSimpleItem("obdurium_hammer_handle", new Item.Properties().stacksTo(1));

    public static final DeferredItem<Item> CICOSPROUT_SEEDS = ITEMS.registerSimpleItem("cicosprout_seeds", new Item.Properties());

    // Tools
    public static final DeferredItem<Item> OBDURIUM_HAMMER = ITEMS.register("obdurium_hammer", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).durability(10000).attributes(SwordItem.createAttributes(EUTiers.OBDURIUM, 3.0F, -3.2F))));

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
