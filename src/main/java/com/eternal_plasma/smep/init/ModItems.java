package com.eternal_plasma.smep.init;

import java.util.ArrayList;
import java.util.List;

import com.eternal_plasma.smep.items.ItemBase;
import com.eternal_plasma.smep.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item SAPPHIRE_SHARD = new ItemBase("sapphire_shard");
	public static final Item SAPPHIRE_RING = new ItemBase("sapphire_ring");
	
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire",3,1570,10.0F,4.0F,22);
	
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	
}
