package io.github.nebulamodding.etultra.registry.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

import static net.minecraft.world.level.block.state.properties.BlockSetType.register;

public class EUBlockSetTypes {
    public static final BlockSetType MAYURA = register(new BlockSetType("mayura"));
    public static final BlockSetType OBDURIUM = register(
            new BlockSetType(
                    "obdurium",
                    true,
                    false,
                    false,
                    BlockSetType.PressurePlateSensitivity.EVERYTHING,
                    SoundType.NETHERITE_BLOCK,
                    SoundEvents.COPPER_DOOR_CLOSE,
                    SoundEvents.COPPER_DOOR_OPEN,
                    SoundEvents.COPPER_TRAPDOOR_CLOSE,
                    SoundEvents.COPPER_TRAPDOOR_OPEN,
                    SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
                    SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON,
                    SoundEvents.STONE_BUTTON_CLICK_OFF,
                    SoundEvents.STONE_BUTTON_CLICK_ON
            )
    );
}
