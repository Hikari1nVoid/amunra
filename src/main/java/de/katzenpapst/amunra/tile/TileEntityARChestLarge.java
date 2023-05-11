package de.katzenpapst.amunra.tile;

import net.minecraft.item.ItemStack;

public class TileEntityARChestLarge extends TileEntityARChest {

    public TileEntityARChestLarge() {
        this.chestContents = new ItemStack[this.getSizeInventory()];
    }

    @Override
    public int getSizeInventory() {
        return 54;
    }

    @Override
    protected boolean canDoublechest() {
        return false;
    }
}
