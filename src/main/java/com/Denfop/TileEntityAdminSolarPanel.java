package com.Denfop;

import com.Denfop.SuperSolarPanels;
import com.Denfop.tiles.base.TileEntitySolarPanel;

import net.minecraft.util.AxisAlignedBB;


public class TileEntityAdminSolarPanel extends TileEntitySolarPanel 
{
    public TileEntityAdminSolarPanel() {
        super("Blockadmin.name",11, 0, 999999999,999999999, 999999999,999999999);
    }
    
    @Override
    public String getInvName() {
        return "Manasteel Solar Panel";
    }
    
}