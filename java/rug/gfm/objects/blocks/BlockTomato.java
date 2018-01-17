package rug.gfm.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockTomato extends BlockBase{

	public static final AxisAlignedBB BLOCK_TOMATO_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	public BlockTomato(String name, Material gourd) {
		super(name, Material.GOURD);
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
