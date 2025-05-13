package io.github.nebulamodding.etultra.registry.item.itemtypes;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ObduriumHammerItem extends MaceItem {
    public ObduriumHammerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
        assert context.getPlayer() != null;
        if (clickedBlock == Blocks.DAMAGED_ANVIL) {
            if (context.getPlayer().getOffhandItem().getItem() == Items.IRON_INGOT) {
                level.setBlock(context.getClickedPos(), Blocks.CHIPPED_ANVIL.defaultBlockState(), 1);
                level.playSound(context.getPlayer(),
                        context.getClickedPos(),
                        SoundEvents.ANVIL_USE,
                        SoundSource.BLOCKS);
                context.getPlayer().getOffhandItem().setCount(context.getPlayer().getOffhandItem().getCount() - 1);
                context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue() + 100);
            } else {
                level.setBlock(context.getClickedPos(), Blocks.AIR.defaultBlockState(), 1);
                level.playSound(context.getPlayer(),
                        context.getClickedPos(),
                        SoundEvents.ANVIL_DESTROY,
                        SoundSource.BLOCKS);
                context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue() + 100);
            }
        } else if (clickedBlock == Blocks.CHIPPED_ANVIL) {
            if (context.getPlayer().getOffhandItem().getItem() == Items.IRON_INGOT) {
                level.setBlock(context.getClickedPos(), Blocks.ANVIL.defaultBlockState(), 1);
                level.playSound(context.getPlayer(),
                        context.getClickedPos(),
                        SoundEvents.ANVIL_USE,
                        SoundSource.BLOCKS);
                context.getPlayer().getOffhandItem().setCount(context.getPlayer().getOffhandItem().getCount() - 1);
                context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue() + 100);
            } else {
                level.setBlock(context.getClickedPos(), Blocks.DAMAGED_ANVIL.defaultBlockState(), 1);
                level.playSound(context.getPlayer(),
                        context.getClickedPos(),
                        SoundEvents.ANVIL_DESTROY,
                        SoundSource.BLOCKS);
                context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue() + 100);
            }
        } else if (clickedBlock == Blocks.ANVIL) {
            if (context.getPlayer().getOffhandItem().getItem() != Items.IRON_INGOT) {
                level.setBlock(context.getClickedPos(), Blocks.CHIPPED_ANVIL.defaultBlockState(), 1);
                level.playSound(context.getPlayer(),
                        context.getClickedPos(),
                        SoundEvents.ANVIL_DESTROY,
                        SoundSource.BLOCKS);
                context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue() + 100);
            }
        }
        return InteractionResult.SUCCESS;
    }
}