package io.github.nebulamodding.registry;

import io.github.nebulamodding.EtUltra;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Map;

public class EUTrimMaterials {

    // I AM NOT TOUCHING THIS EVER AGAIN


    //public static final ResourceKey<TrimMaterial> OBDURIUM = registryKey("obdurium");
    ////public static final ResourceKey<TrimMaterial> MALUNITE = registryKey("malunite");

    //public static void bootstrap(BootstrapContext<TrimMaterial> pContext) {
    //    register(pContext, OBDURIUM, EUItems.OBDURIUM_INGOT, Style.EMPTY.withColor(10105016), 1.0F);
    //    //register(pContext, MALUNITE, EUItems.OBDURIUM_INGOT, Style.EMPTY.withColor(10116294), 1.0F);
    //}

    //private static void register(
    //        BootstrapContext<TrimMaterial> pContext, ResourceKey<TrimMaterial> pMaterialKey, EUItems pIngredient, Style pStyle, float pItemModelIndex
    //) {
    //    register(pContext, pMaterialKey, pIngredient, pStyle, pItemModelIndex, Map.of());
    //}

    //private static void register(
    //        BootstrapContext<TrimMaterial> pContext,
    //        ResourceKey<TrimMaterial> pMaterialKey,
    //        EUItems pIngredient,
    //        Style pStyle,
    //        float pItemModelIndex,
    //        Map<Holder<ArmorMaterial>, String> pOverrideArmorMaterials
    //) {
    //    TrimMaterial trimmaterial = TrimMaterial.create(
    //            pMaterialKey.location().getPath(),
    //            pIngredient,
    //            pItemModelIndex,
    //            Component.translatable(Util.makeDescriptionId("trim_material", pMaterialKey.location())).withStyle(pStyle),
    //            pOverrideArmorMaterials
    //    );
    //    pContext.register(pMaterialKey, trimmaterial);
    //}

    //private static ResourceKey<TrimMaterial> registryKey(String pKey) {
    //    return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.withDefaultNamespace(pKey));
    //}
}