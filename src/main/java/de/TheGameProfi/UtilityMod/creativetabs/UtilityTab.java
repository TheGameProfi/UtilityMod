package de.TheGameProfi.UtilityMod.creativetabs;

import de.TheGameProfi.UtilityMod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UtilityTab extends CreativeTabs
{
	public UtilityTab() 
	{
		super("utility");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.RUBY);//ItemInit.COPPER_INGOT);
	}
}
