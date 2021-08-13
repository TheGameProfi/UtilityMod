package de.TheGameProfi.UtilityMod.items.tools;

import de.TheGameProfi.UtilityMod.Main;
import de.TheGameProfi.UtilityMod.init.ItemInit;
import de.TheGameProfi.UtilityMod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoeBase extends ItemHoe implements IHasModel 
{
	public ToolHoeBase(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
