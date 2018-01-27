package rug.gfm.objects.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import rug.gfm.tileentity.TileEntityBurger;


public class BlockBottomBun extends BlockBase implements ITileEntityProvider{

	public BlockBottomBun(String name, Material material) {
		super(name, Material.CAKE);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return new TileEntityBurger();
	}
	
	
}