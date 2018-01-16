package rug.gfm.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rug.gfm.init.BlockInit;
import rug.gfm.init.ItemInit;
import rug.gfm.util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent	
	// Register Items (names)
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		//Register all items within ItemInit array ITEMS
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent	
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		// For each item in ItemInit.ITEMS (ArrayList)
		for(Item item : ItemInit.ITEMS)
		{
			// If it is an instance of IHasModel
			if(item instanceof IHasModel)
			{
				//Register the model
				((IHasModel)item).registerModels();
			}
			
		}
		// For each item in BlockInit.Blocks (ArrayList)
		for (Block block : BlockInit.BLOCKS) {
			// If it is an instance of IHasModel
			if(block instanceof IHasModel) {
				//Register the model
				((IHasModel)block).registerModels();
				
				
			}
				
		}
			
	}
}
