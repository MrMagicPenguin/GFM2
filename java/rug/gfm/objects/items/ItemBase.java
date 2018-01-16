package rug.gfm.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rug.gfm.Main;
import rug.gfm.init.ItemInit;
import rug.gfm.proxy.ClientProxy;
import rug.gfm.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		//Gets ArrayList ITEMS from ItemInit
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
