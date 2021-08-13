package de.TheGameProfi.UtilityMod.blocks;

import de.TheGameProfi.UtilityMod.Main;
import de.TheGameProfi.UtilityMod.init.BlockInit;
import de.TheGameProfi.UtilityMod.init.ItemInit;
import de.TheGameProfi.UtilityMod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreBase extends Block implements IHasModel
{
	public OreBase(String name, Material material, CreativeTabs tab) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setSoundType(blockSoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}

}
