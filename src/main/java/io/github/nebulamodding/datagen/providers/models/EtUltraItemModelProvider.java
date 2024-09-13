package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraItemModelProvider extends ItemModelProvider {
    public EtUltraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "et_ultra", existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Need to set up auto providing

        // Automatically provide models to items

        EtUltraItems.ITEMS.getEntries()
                .stream().filter(i -> !(i.get() instanceof BlockItem))
                .forEach(entry ->
                    basicItem(entry.get()));

        //basicItem(EtUltraItems.PENCIL.get());


    }
}