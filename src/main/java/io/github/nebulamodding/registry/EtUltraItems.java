package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithItemUtil;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EtUltraItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);

    public static final DeferredHolders<Item, DeferredItem<? extends Item>> ETRIUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties().rarity(Rarity.RARE),
            "raw_etrium"
    );
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> OBDURIUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties().rarity(Rarity.EPIC),
            "raw_obdurium",
            "obdurium_nugget"
    );

    public static final DeferredItem<Item> OBDURIUM_INGOT = ITEMS.register("obdurium_ingot", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_PLATE = ITEMS.register("obdurium_plate", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC))),
            OBDURIUM_ROD = ITEMS.register("obdurium_rod", () -> new MaceItem(new Item.Properties().rarity(Rarity.EPIC)));

    // Simple items
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> SIMPLE_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            // Gems
            "diamond_shard"
    );

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.registerSimpleItem("pencil", new Item.Properties());
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.registerSimpleItem("dense_pencil", new Item.Properties().stacksTo(16));

    // Tools
    public static final DeferredItem<ShovelItem> DESH_SHOVEL = registerShovelItem("desh_shovel", EtUltraTiers.DESH, 1, -3);
    public static final DeferredItem<PickaxeItem> DESH_PICKAXE = registerPickaxeItem("desh_pickaxe", EtUltraTiers.DESH, 1.5f, -2.8f);
    public static final DeferredItem<AxeItem> DESH_AXE = registerAxeItem("desh_axe", EtUltraTiers.DESH, 6, -3.1f);
    public static final DeferredItem<HoeItem> DESH_HOE = registerHoeItem("desh_hoe", EtUltraTiers.DESH, -2, -1);
    public static final DeferredItem<SwordItem> DESH_SWORD = registerSwordItem("desh_sword", EtUltraTiers.DESH, 3, -2.4f);

    public static final DeferredItem<ShovelItem> OSTRUM_SHOVEL = registerShovelItem("ostrum_shovel", EtUltraTiers.OSTRUM, 1, -3);
    public static final DeferredItem<PickaxeItem> OSTRUM_PICKAXE = registerPickaxeItem("ostrum_pickaxe", EtUltraTiers.OSTRUM, 1.5f, -2.8f);
    public static final DeferredItem<AxeItem> OSTRUM_AXE = registerAxeItem("ostrum_axe", EtUltraTiers.OSTRUM, 6, -3.1f);
    public static final DeferredItem<HoeItem> OSTRUM_HOE = registerHoeItem("ostrum_hoe", EtUltraTiers.OSTRUM, -2, -1);
    public static final DeferredItem<SwordItem> OSTRUM_SWORD = registerSwordItem("ostrum_sword", EtUltraTiers.OSTRUM, 3, -2.4f);

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
