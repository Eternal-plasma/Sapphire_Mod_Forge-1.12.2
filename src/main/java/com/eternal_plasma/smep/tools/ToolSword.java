package com.eternal_plasma.smep.tools;

import com.eternal_plasma.smep.Main;
import com.eternal_plasma.smep.init.ModItems;
import com.eternal_plasma.smep.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.MODTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}
	

}
