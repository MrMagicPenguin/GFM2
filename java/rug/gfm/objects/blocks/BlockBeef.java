package rug.gfm.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBeef extends BlockBase{

	public BlockBeef(String name, Material material) {
		super(name, Material.SPONGE);
	}
	public boolean isValidTopping = true;
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	

}
