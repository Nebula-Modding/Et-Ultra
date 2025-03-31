package io.github.nebulamodding.datagen.assets;

import io.github.nebulamodding.EtUltra;
import io.github.nebulamodding.registry.EUBlocks;
import io.github.nebulamodding.registry.EUItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.ArrayList;
import java.util.List;

public class EUItemModelProvider extends ItemModelProvider {
    public EUItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EtUltra.MOD_ID, existingFileHelper);
    }

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));

    @Override
    protected void registerModels() {
        final List<DeferredHolder<Item, ? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a model automatically provided
        excludedItems.add(EUItems.OBDURIUM_HAMMER);

        /*
        Manual Item Models
         */

        itemModel(EUItems.OBDURIUM_HAMMER, HANDHELD);

        /*
        Manual Block Models
         */

        itemModel(EUBlocks.MAYURA_DOOR, GENERATED);
        blockModel(EUBlocks.MAYURA_TRAPDOOR, "bottom");
        blockItemModel(EUBlocks.MAYURA_SAPLING, EUBlocks.MAYURA_SAPLING, GENERATED);

        blockModel(EUBlocks.FRIGUS_GRASS_BLOCK);
        blockModel(EUBlocks.FRIGUS_DIRT_PATH);
        blockModel(EUBlocks.FRIGUS_FARMLAND);

        blockItemModel(EUBlocks.FRIGUS_SHORT_GRASS, EUBlocks.FRIGUS_SHORT_GRASS, GENERATED);
        blockItemModel(EUBlocks.VIVIAN, EUBlocks.VIVIAN, GENERATED);
        blockItemModel(EUBlocks.WICKUL, EUBlocks.WICKUL, GENERATED);
        blockItemModel(EUBlocks.ICEFLOWER, EUBlocks.ICEFLOWER, GENERATED);

        /*
        Automated Item Models
         */

        EUItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> basicItem(entry.get()));
    }
    public void blockModel(DeferredBlock<?> block) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath()));
    }
    public void blockModel(DeferredBlock<?> block, String suffix) {
        withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_" + suffix));
    }
    public void blockItemModel(DeferredBlock<?> block, DeferredBlock<?> textureBlock, ModelFile modelFile) {
        getBuilder(block.getId().getPath()).parent(modelFile).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    public ItemModelBuilder itemModel(DeferredHolder<?, ?> item, ModelFile modelFile) {
        return getBuilder(item.getId().getPath()).parent(modelFile).texture("layer0", "item/" + item.getId().getPath());
    }
    public void itemModelWithSuffix(DeferredItem<?> item, ModelFile modelFile, String suffix) {
        getBuilder(item.getId().getPath() + "_" + suffix).parent(modelFile).texture("layer0", "item/" + item.getId().getPath() + "_" + suffix);
    }
    private void spawnEggModel(DeferredItem<Item> item) {
        withExistingParent(item.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
    private ModelFile.ExistingModelFile getModel(DeferredItem<?> item, String suffix) {
        return new ModelFile.ExistingModelFile(modLoc("item/" + item.getId().getPath() + "_" + suffix), existingFileHelper);
    }
}