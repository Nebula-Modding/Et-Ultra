package io.github.nebulamodding.datagen.providers.models;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EtUltraBlocks;
import io.github.nebulamodding.registry.EtUltraItems;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EtUltraItemModelProvider extends ItemModelProvider {
    public EtUltraItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        final List<DeferredHolder<Item, ? extends Item>> excludedItems = new ArrayList<>();
        excludedItems.add(EtUltraItems.OBDURIUM_HAMMER);

        // Automatically provide models to items
        EtUltraItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> {
                    Item item = entry.get();
                    // If the entry is a tool, it is probably going to use a handheld model
                    if (item instanceof DiggerItem || item instanceof SwordItem) {
                        handheld(item);
                    }
                    // Otherwise we will just make a basic item model for it
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