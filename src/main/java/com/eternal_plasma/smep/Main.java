package com.eternal_plasma.smep;

import com.eternal_plasma.smep.proxy.CommonProxy;
import com.eternal_plasma.smep.tabs.Modtab;
import com.eternal_plasma.smep.util.Reference;
import com.eternal_plasma.smep.world.gen.WorldGenOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME,version = Reference.VERSION)

public class Main
{
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static final CreativeTabs MODTAB = new Modtab("modtab.png");
    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
    	
    }
    @Mod.EventHandler
    public static void Postinit(FMLPostInitializationEvent event)
    {

    }

}
