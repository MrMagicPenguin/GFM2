package rug.gfm.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class BlockBottomBun extends BlockBase{

	public BlockBottomBun(String name, Material material) {
		super(name, Material.CAKE);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	
}