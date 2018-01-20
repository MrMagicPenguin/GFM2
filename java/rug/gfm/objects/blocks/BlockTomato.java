package rug.gfm.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockTomato extends Block{

	//public static final AxisAlignedBB BLOCK_TOMATO_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	public BlockTomato(String name) {
		super(Material.GOURD);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
        return false;
    }
	
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

	
	//@Override
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		//return BLOCK_TOMATO_AABB;
		
	//}
	
}
