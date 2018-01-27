package rug.gfm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rug.gfm.proxy.CommonProxy;
import rug.gfm.tileentity.TileEntityBurger;
import rug.gfm.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		GameRegistry.registerTileEntity(TileEntityBurger.class, Reference.MODID + "TileEntityBurger");
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
