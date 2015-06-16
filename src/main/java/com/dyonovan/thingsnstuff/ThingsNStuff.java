package com.dyonovan.thingsnstuff;

import com.dyonovan.thingsnstuff.handlers.BlockHandler;
import com.dyonovan.thingsnstuff.lib.Constants;
import com.dyonovan.thingsnstuff.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(name = Constants.MODNAME, modid = Constants.MODID, version = Constants.VERSION)

public class ThingsNStuff {

    @Instance(Constants.MODID)
    public static ThingsNStuff instance;

    @SidedProxy (clientSide = "com.dyonovan.thingsnstuff.proxy.ClientProxy", serverSide = "com.dyonovan.thingsnstuff.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabThingsNStuff = new CreativeTabs("tabThingsNStuff") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.carrot_on_a_stick;
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        BlockHandler.init();

        proxy.registerRenderer();
    }

    @EventHandler
    public void preInit(FMLInitializationEvent event) {

    }

    @EventHandler
    public void preInit(FMLPostInitializationEvent event) {

    }
}