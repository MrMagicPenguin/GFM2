package rug.gfm.util;

public class RegistryName {
	public enum Item {
		
		ItemTomato("ItemTomato", "item_tomato");
		
		private String UnlocalizedName, RegistryName;
		
		Item(String unlocalizedName, String registryName) {
			this.UnlocalizedName = unlocalizedName;
			this.RegistryName = registryName;
			
		}
		
		public String getUnlocalizedName() {
			return UnlocalizedName;
			
		}
		
		public String getRegistryName() {
			
			return RegistryName;
		}
	}

}
