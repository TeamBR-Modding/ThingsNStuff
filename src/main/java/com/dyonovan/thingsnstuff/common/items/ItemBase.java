package com.dyonovan.thingsnstuff.common.items;

import com.dyonovan.thingsnstuff.ThingsNStuff;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBase extends Item {
    private String itemDescription;

    public ItemBase(String unlocalizedName) {
        this(unlocalizedName, "");
    }

    public ItemBase(String unlocalizedName, String description) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ThingsNStuff.tabThingsNStuff);
        this.itemDescription = description;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(StatCollector.translateToLocal(itemDescription));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("thingsnstuff:" + (this.getUnlocalizedName().substring(5)));
    }
}
