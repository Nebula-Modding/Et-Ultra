package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithItemUtil;
import martian.regolith.neoforge.RegolithNeoForge;
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
            OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC)));

    // Simple items
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> SIMPLE_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            // Gems
            "diamond_shard",
            // Metals
            "raw_etrium",
            "impure_steel"
    );

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.registerSimpleItem("pencil", new Item.Properties());
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.registerSimpleItem("dense_pencil", new Item.Properties().stacksTo(16));

    // Tools
    public static final DeferredItem<ShovelItem> DESH_SHOVEL = registerShovelItem("desh_shovel", EUTiers.DESH, 1.0F, -3.0F);
    public static final DeferredItem<PickaxeItem> DESH_PICKAXE = registerPickaxeItem("desh_pickaxe", EUTiers.DESH, 1.5F, -2.8F);
    public static final DeferredItem<AxeItem> DESH_AXE = registerAxeItem("desh_axe", EUTiers.DESH, 6.0F, -3.1F);
    public static final DeferredItem<HoeItem> DESH_HOE = registerHoeItem("desh_hoe", EUTiers.DESH, -2.0F, -1.0F);
    public static final DeferredItem<SwordItem> DESH_SWORD = registerSwordItem("desh_sword", EUTiers.DESH, 3.0F, -2.4F);

    public static final Supplier<ShovelItem> THERMALYTE_SHOVEL = ITEMS.register("thermalyte_shovel", () -> new ShovelItem(EUTiers.THERMALYTE, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(EUTiers.THERMALYTE, 1.0F, -3.0F))));
    public static final Supplier<PickaxeItem> THERMALYTE_PICKAXE = ITEMS.register("thermalyte_pickaxe", () -> new PickaxeItem(EUTiers.THERMALYTE, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(EUTiers.THERMALYTE, 1.5F, -2.8F))));
    public static final Supplier<AxeItem> THERMALYTE_AXE = ITEMS.register("thermalyte_axe", () -> new AxeItem(EUTiers.THERMALYTE, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(EUTiers.THERMALYTE, 6.0F, -3.4F))));
    public static final Supplier<HoeItem> THERMALYTE_HOE = ITEMS.register("thermalyte_hoe", () -> new HoeItem(EUTiers.THERMALYTE, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(EUTiers.THERMALYTE, 0.0F, -1.0F))));
    public static final Supplier<SwordItem> THERMALYTE_SWORD = ITEMS.register("thermalyte_sword", () -> new SwordItem(EUTiers.THERMALYTE, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(EUTiers.THERMALYTE, 3.0F, -2.8F))));

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
