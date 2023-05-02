package de.katzenpapst.amunra.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import de.katzenpapst.amunra.tile.TileEntityHydroponics;
import micdoodle8.mods.galacticraft.core.energy.item.ItemElectricBase;
import micdoodle8.mods.galacticraft.core.inventory.SlotSpecific;

public class ContainerHydroponics extends ContainerWithPlayerInventory {

    public ContainerHydroponics(final InventoryPlayer player, final TileEntityHydroponics tile) {
        super(tile);

        this.addSlotToContainer(new SlotSpecific(tile, 0, 32, 27, ItemElectricBase.class));

        final SlotSpecific secondarySlot = new SlotSpecific(
                tile,
                1,
                32,
                90,
                new ItemStack(Items.wheat_seeds),
                new ItemStack(Items.dye, 1, 15));
        secondarySlot.setMetadataSensitive();
        this.addSlotToContainer(secondarySlot);

        this.initPlayerInventorySlots(player, 5);
    }

    @Override
    public boolean canInteractWith(final EntityPlayer player) {
        return ((TileEntityHydroponics) this.tileEntity).isUseableByPlayer(player);
    }

}
