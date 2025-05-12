package io.github.nebulamodding.etultra.registry.item.custom;

import net.minecraft.client.sounds.SoundEngineExecutor;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MaceItem;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.effects.PlaySoundEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PatchedHammerItem extends MaceItem {
    public PatchedHammerItem(Properties properties) {
        super(properties);
    }

    //Pardon Our Spaghetti


    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
        assert context.getPlayer() != null;

            if (clickedBlock == Blocks.DAMAGED_ANVIL) {

                    level.setBlock(context.getClickedPos(), Blocks.CHIPPED_ANVIL.defaultBlockState(), 1);
                    level.playSound(context.getPlayer(),
                            context.getClickedPos(),
                            SoundEvents.ANVIL_USE,
                            SoundSource.BLOCKS);
                    context.getPlayer().getOffhandItem().setCount(0);
                    context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue()+100);

            } else if (clickedBlock == Blocks.CHIPPED_ANVIL) {

                    level.setBlock(context.getClickedPos(), Blocks.ANVIL.defaultBlockState(), 1);
                    level.playSound(context.getPlayer(),
                            context.getClickedPos(),
                            SoundEvents.ANVIL_USE,
                            SoundSource.BLOCKS);
                    context.getPlayer().getOffhandItem().setCount(0);
                    context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue()+100);


            } else if (clickedBlock == Blocks.ANVIL) {

                    level.setBlock(context.getClickedPos(), Blocks.IRON_BLOCK.defaultBlockState(), 1);
                    level.playSound(context.getPlayer(),
                            context.getClickedPos(),
                            SoundEvents.ANVIL_USE,
                            SoundSource.BLOCKS);
                    context.getPlayer().getOffhandItem().setCount(0);
                    context.getItemInHand().setDamageValue(context.getItemInHand().getDamageValue()+100);
            }



        return InteractionResult.SUCCESS;
    }
}
