package de.TheGameProfi.UtilityMod.init;

import java.util.ArrayList;
import java.util.List;

import de.TheGameProfi.UtilityMod.Main;
import de.TheGameProfi.UtilityMod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Copper
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, Main.UTILITYTAB);
	public static final Block STEAL_BLOCK = new BlockBase("steal_block", Material.IRON, Main.UTILITYTAB);
	public static final Block RUSTY_BLOCK = new BlockBase("rusty_block", Material.IRON, Main.UTILITYTAB);
	
	public static final Block STEAL_ORE = new BlockBase("steal_ore", Material.ROCK, Main.UTILITYTAB);
	public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK, Main.UTILITYTAB);
	public static final Block RUSTY_ORE = new BlockBase("rusty_ore", Material.ROCK, Main.UTILITYTAB);
	
}
