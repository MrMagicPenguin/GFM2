package rug.gfm.tileentity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBurger extends TileEntity{
	public static final List<Block> TOPPINGS = new ArrayList <Block>();
	
	private int toppingCount = 0;
	private int maxToppingCount = 14;
	
	public boolean addTopping() {
		// i = Item in Hand - Not sure how to do this...
		Object i = null;
		if(TOPPINGS.size() < maxToppingCount && TOPPINGS.contains(i)){
			
			//VALID TOPPING
			return true;
		}
		// INVALID TOPPING
			return false;
		
		
	}
	
	public boolean removeTopping() {
		if(toppingCount != 0) {
			
			// Remove topping
			return true;
		}
		// No toppings to remove
		return false;
		
	}
	
}


