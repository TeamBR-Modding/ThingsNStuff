package com.dyonovan.thingsnstuff.client.gui;

import com.dyonovan.thingsnstuff.common.container.ContainerTrashBag;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;

public class GuiTrashBag extends GuiBase<ContainerTrashBag> {
    public GuiTrashBag(InventoryPlayer inventoryPlayer, ItemStack bag) {
        super(new ContainerTrashBag(inventoryPlayer, bag), 175, 165, "inventory.trashBag.title");
    }

    @Override
    public void addComponents() {}
}
