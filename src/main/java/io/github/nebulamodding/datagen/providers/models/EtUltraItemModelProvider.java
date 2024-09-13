package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.registry.EtUltraItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EtUltraItemModelProvider extends ItemModelProvider {
    public EtUltraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "et_ultra", existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Need to set up auto providing

        basicItem(EtUltraItems.PENCIL.get());


    }
}