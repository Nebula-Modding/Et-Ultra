package io.github.nebulamodding.datagen.assets;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;

public class EUItemModelProvider extends ItemModelProvider {
    public EUItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        final List<DeferredHolder<Item, ? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a model automatically provided
        //excludedItems.add(EUItems.EXAMPLE_ITEM);

        /*
        Automated Item Models
         */

        EUItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> {
                    Item item = entry.get();
                    // Automatically provide tool models
                    if (item instanceof DiggerItem || item instanceof SwordItem || item instanceof MaceItem) {
                        handheld(item);
                    }
                    else {
                        basicItem(entry.get());
                    }
                });
    }
    private static final ModelFile HANDHELD_MODEL =
            new ModelFile.UncheckedModelFile("minecraft:item/handheld");
    private void handheld(Item item) {
        this.basicItem(item).parent(HANDHELD_MODEL);
    }
}