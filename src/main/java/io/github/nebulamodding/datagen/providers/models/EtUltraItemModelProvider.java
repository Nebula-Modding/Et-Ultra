package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EtUltraItemModelProvider extends ItemModelProvider {
    public EtUltraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "et_ultra", existingFileHelper);
    }

    List<Item> excludedItems = new ArrayList<>();
    List<Item> handheldItems = new ArrayList<>();


    @Override
    protected void registerModels() {
        // Automatically provide models to items
        EtUltraItems.ITEMS.getEntries()
                .stream().filter(i -> !(i.get() instanceof BlockItem))
                .forEach(entry ->
                    basicItem(entry.get()));

        handheldItems.add((AxeItem) EtUltraItems.DESH_AXE);
        handheldItems.add((SwordItem) EtUltraItems.DESH_SWORD);

    }
}