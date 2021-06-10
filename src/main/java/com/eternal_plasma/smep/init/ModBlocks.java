package com.eternal_plasma.smep.init;

import java.util.ArrayList;
import java.util.List;

import com.eternal_plasma.smep.blocks.SapphireBlock;
import com.eternal_plasma.smep.blocks.SapphireOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	
}
