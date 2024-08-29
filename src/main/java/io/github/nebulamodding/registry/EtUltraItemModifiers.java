package io.github.nebulamodding.registry;

import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class EtUltraItemModifiers extends LootModifier {

    public static Supplier<MapCodec<EtUltraItemModifiers>> CODEC_SUPPLIER = Suppliers.memoize(() -> RecordCodecBuilder
            .mapCodec(instance -> EtUltraItemModifiers.codecStart(instance)
                    .and(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item")
                            .forGetter(addItemModifierInstance -> addItemModifierInstance.item))
                    .apply(instance, EtUltraItemModifiers::new)));

    private final Item item;

    public EtUltraItemModifiers(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }

        generatedLoot.add(new ItemStack(this.item));
        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC_SUPPLIER.get();
    }
}