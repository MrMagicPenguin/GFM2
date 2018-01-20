package rug.gfm.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockTomato extends Block{

<<<<<<< HEAD
	//public static final AxisAlignedBB BLOCK_TOMATO_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	public BlockTomato(String name) {
		super(Material.GOURD);
=======
	public static final AxisAlignedBB BLOCK_TOMATO_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	public BlockTomato(String name, Material gourd) {
		super(name, Material.GOURD);
>>>>>>> 352996ba11167d931e2a94fe7edb047e073716d1
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
<<<<<<< HEAD
    }

	
	//@Override
	//public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		//return BLOCK_TOMATO_AABB;
		
	//}
=======
		
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BLOCK_TOMATO_AABB;
		
	}
>>>>>>> 352996ba11167d931e2a94fe7edb047e073716d1
	
}
