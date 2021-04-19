package dev.emi.floralisia.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

@Mixin(Item.class)
public interface ItemAccessor {
	
	@Invoker("raycast")
	public static BlockHitResult invokeRaycast(World world, PlayerEntity player, RaycastContext.FluidHandling fluidHandling) {
		return null;
	}
}
