package com.eternal_plasma.smep.blocks;

import java.util.Random;

import com.eternal_plasma.smep.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SapphireOre extends BlockBase{


		public SapphireOre(String name, Material material) 
		{
			super(name, material);
			
			setSoundType(SoundType.METAL);
			setHardness(5.0f);
			setResistance(6.0f);
			setHarvestLevel("pickaxe",2);
		}
		
		@Override
		   public Item getItemDropped(IBlockState state, Random rand, int fortune) 
		   {
			return ModItems.SAPPHIRE;
		   }
		@Override
		   public int quantityDropped(Random rand) 
		   {
			 return 1;  
		   }
}
