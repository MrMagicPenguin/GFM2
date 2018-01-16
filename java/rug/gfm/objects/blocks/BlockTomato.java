package rug.gfm.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTomato extends BlockBase{

	public static final AxisAlignedBB BLOCK_TOMATO_AABB = new AxisAlignedBB(0.25D, 0.25D, 0.25D, 0.25D, 0.25D, .5D);
	
	public BlockTomato(String name) {
		super(name, Material.GOURD);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
        return false;
    }
	
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
	
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BLOCK_TOMATO_AABB;
		
	}
}
