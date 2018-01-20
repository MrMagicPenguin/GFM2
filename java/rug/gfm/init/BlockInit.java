package rug.gfm.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rug.gfm.objects.blocks.BlockBase;
import rug.gfm.objects.blocks.BlockTomato;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_TOMATO = new BlockTomato("block_tomato", Material.GOURD);

}
