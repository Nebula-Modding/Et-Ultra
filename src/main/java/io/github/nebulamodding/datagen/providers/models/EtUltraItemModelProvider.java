package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class    EtUltraItemModelProvider extends ItemModelProvider {
    public EtUltraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(EtUltraItems.PENCIL.get());
    }

    private void item(Item item) {
        String name = getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }

    private @NotNull String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(EtUltra.MOD_ID + ":", "");
    }
}