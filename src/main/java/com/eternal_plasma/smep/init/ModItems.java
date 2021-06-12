package com.eternal_plasma.smep.init;

import java.util.ArrayList;
import java.util.List;

import com.eternal_plasma.smep.armor.ArmorBase;
import com.eternal_plasma.smep.items.ItemBase;
import com.eternal_plasma.smep.tools.ToolAxe;
import com.eternal_plasma.smep.tools.ToolHoe;
import com.eternal_plasma.smep.tools.ToolPickaxe;
import com.eternal_plasma.smep.tools.ToolShovel;
import com.eternal_plasma.smep.tools.ToolSword;
import com.eternal_plasma.smep.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Items
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item SAPPHIRE_SHARD = new ItemBase("sapphire_shard");
	public static final Item SAPPHIRE_RING = new ItemBase("sapphire_ring");
	//Materials
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire",3,1570,10.0F,4.0F,22);
	public static final ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial("armor_sapphire", Reference.MOD_ID + ":sapphire", 1500, new int []{4,7,9,5}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	//Tools
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final Item SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final Item SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
	public static final Item SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final Item SAPPHIRE_SHOVEL = new ToolShovel("sapphire_shovel", MATERIAL_SAPPHIRE);
	
	//Armor 
	
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGS = new ArmorBase("sapphire_legs", SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.FEET);
}
