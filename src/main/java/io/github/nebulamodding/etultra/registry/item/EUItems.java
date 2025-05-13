package io.github.nebulamodding.etultra.registry.item;

import io.github.nebulamodding.etultra.EtUltra;
import io.github.nebulamodding.etultra.registry.EUFoods;
import io.github.nebulamodding.etultra.registry.EUTiers;
import io.github.nebulamodding.etultra.registry.item.itemtypes.ObduriumHammerItem;
import martian.regolith.DeferredHolders;
import martian.regolith.RegolithItemUtil;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EUItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EtUltra.MOD_ID);

    //public static final DeferredItem<Item>
    //        BRUMA = ITEMS.register("bruma", () -> new Item(new Item.Properties())),
    //        BRUMA_LOAF = ITEMS.register("bruma_loaf", () -> new Item(new Item.Properties().food(EUFoods.BRUMA_LOAF)));
    //public static final DeferredItem<Item>
    //        AZURE_ROOT = ITEMS.register("azure_root", () -> new ItemNameBlockItem(EUBlocks.AZURE_ROOTS.get(), new Item.Properties().food(EUFoods.AZURE_ROOT)));

    public static final DeferredItem<Item>
            FLESH = ITEMS.register("flesh", () -> new Item(new Item.Properties().food(EUFoods.FLESH))),
            COOKED_FLESH = ITEMS.register("cooked_flesh", () -> new Item(new Item.Properties().food(EUFoods.COOKED_FLESH)));

    /*
    Metal Items
     */

    public static final DeferredHolders<Item, DeferredItem<? extends Item>> OBDURIUM_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            "raw_obdurium",
            "obdurium_nugget",
            "obdurium_ingot",
            "obdurium_plate",
            "obdurium_rod"
    );
    public static final DeferredHolders<Item, DeferredItem<? extends Item>> MALUNITE_ITEMS = RegolithItemUtil.registerItems(
            RegolithNeoForge.wrapItems(ITEMS),
            new Item.Properties(),
            "raw_malunite",
            "malunite_nugget",
            "malunite_ingot",
            "malunite_plate",
            "malunite_rod"
    );

    // Items
    public static final DeferredItem<Item> PENCIL = ITEMS.register("pencil", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DENSE_PENCIL = ITEMS.registerSimpleItem("dense_pencil", new Item.Properties().stacksTo(16));

    // Tools
    public static final DeferredItem<Item> OBDURIUM_HAMMER = ITEMS.register("obdurium_hammer", () -> new ObduriumHammerItem(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1).durability(10000).attributes(SwordItem.createAttributes(EUTiers.OBDURIUM, 3.0F, -3.2F))));

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
