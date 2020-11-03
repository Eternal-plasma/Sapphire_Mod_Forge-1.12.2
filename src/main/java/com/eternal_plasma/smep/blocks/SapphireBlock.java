package com.eternal_plasma.smep.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SapphireBlock extends BlockBase
{

	public SapphireBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(6.0f);
		setHarvestLevel("pickaxe",2);
	}

}
