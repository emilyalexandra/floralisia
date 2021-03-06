package dev.emi.floralisia.mixin.monocle;

import java.util.List;

import com.google.common.collect.ImmutableList;

import org.spongepowered.asm.mixin.Mixin;

import dev.emi.floralisia.block.AmethystMonocleProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.DaylightDetectorBlock;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(DaylightDetectorBlock.class)
public class DaylightDetectorBlockMixin implements AmethystMonocleProvider {

	@Override
	public List<Text> getMonocleText(World world, BlockPos pos, BlockState state) {
		return ImmutableList.of(new TranslatableText("tooltip.floralisia.monocle.strength", state.get(DaylightDetectorBlock.POWER)));
	}
}
