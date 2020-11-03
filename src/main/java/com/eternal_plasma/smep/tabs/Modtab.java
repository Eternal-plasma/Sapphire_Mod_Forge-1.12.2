package com.eternal_plasma.smep.tabs;

import com.eternal_plasma.smep.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Modtab extends CreativeTabs
{

	public Modtab(String label) 
	{
		super("modtab");
		this.setBackgroundImageName("modtab.png");
		
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.SAPPHIRE);
	}

}
