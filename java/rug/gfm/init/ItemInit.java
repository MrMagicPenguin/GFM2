package rug.gfm.init;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.item.Item;
import rug.gfm.objects.items.ItemBase;
import rug.gfm.util.RegistryName;

public class ItemInit {
	// List
	public static final List<Item> ITEMS = new ArrayList <Item>();
	
	//Items
	public static final Item TOMATO = new ItemBase(RegistryName.Item.ItemTomato.getUnlocalizedName(), RegistryName.Item.ItemTomato.getRegistryName());
}
