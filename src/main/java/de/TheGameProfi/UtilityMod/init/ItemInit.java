package de.TheGameProfi.UtilityMod.init;

import java.util.ArrayList;
import java.util.List;

import de.TheGameProfi.UtilityMod.Main;
import de.TheGameProfi.UtilityMod.Reference;
import de.TheGameProfi.UtilityMod.items.ItemBase;
import de.TheGameProfi.UtilityMod.items.armour.ArmourModel;
import de.TheGameProfi.UtilityMod.items.tools.ToolAxeBase;
import de.TheGameProfi.UtilityMod.items.tools.ToolHoeBase;
import de.TheGameProfi.UtilityMod.items.tools.ToolPickaxeBase;
import de.TheGameProfi.UtilityMod.items.tools.ToolShovelBase;
import de.TheGameProfi.UtilityMod.items.tools.ToolSwordBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
			
	//Armour Materials
	public static final ArmorMaterial RUBY_MATERIAL = EnumHelper.addArmorMaterial("ruby", Reference.MODID + ":ruby", 50, new int[] {5, 8, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0f);
	public static final ArmorMaterial STEAL_MATERIAL = EnumHelper.addArmorMaterial("steal", Reference.MODID + ":steal", 25, new int[] {3, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0f);
	public static final ArmorMaterial RUSTY_MATERIAL = EnumHelper.addArmorMaterial("rusty", Reference.MODID + ":rusty", 20, new int[] {1, 3, 4, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial EMERALD_MATERIAL = EnumHelper.addArmorMaterial("emerald", Reference.MODID + ":emerald", 20, new int[] {4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0f);
	public static final ArmorMaterial GLASS_MATERIAL = EnumHelper.addArmorMaterial("glass", Reference.MODID + ":glass", 20, new int[] {1, 2, 3, 1}, 3, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f);

	//Tool Materials
	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 4, 1500, 10.0f, 5.0f, 20);
	public static final ToolMaterial STEAL_TOOL = EnumHelper.addToolMaterial("STEAL_TOOL", 3, 900, 6.0f, 3.0f, 10);
	public static final ToolMaterial RUSTY_TOOL = EnumHelper.addToolMaterial("rusty_tool", 0, 400, 4.0f, 1.0f, 10);
	public static final ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("emerald_tool", 3, 1000, 7.0f, 4.0f, 20);
	public static final ToolMaterial GLASS_TOOL = EnumHelper.addToolMaterial("glass_tool", 1, 100, 2.0f, 1.0f, 10);
	
	//Items
	public static final Item RUBY = new ItemBase("ruby", Main.UTILITYTAB);
	public static final Item STEAL = new ItemBase("steal", Main.UTILITYTAB);
	public static final Item RUSTY = new ItemBase("rusty_steal", Main.UTILITYTAB);
	
	//Armour
	public static final Item RUBY_HELMET = new ArmourModel("ruby_helmet", Main.UTILITYTAB, RUBY_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmourModel("ruby_chestplate", Main.UTILITYTAB, RUBY_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmourModel("ruby_leggings", Main.UTILITYTAB, RUBY_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmourModel("ruby_boots", Main.UTILITYTAB, RUBY_MATERIAL, EntityEquipmentSlot.FEET);
		
	public static final Item steal_HELMET = new ArmourModel("steal_helmet", Main.UTILITYTAB, STEAL_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item steal_CHESTPLATE = new ArmourModel("steal_chestplate", Main.UTILITYTAB, STEAL_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item steal_LEGGINGS = new ArmourModel("steal_leggings", Main.UTILITYTAB, STEAL_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item steal_BOOTS = new ArmourModel("steal_boots", Main.UTILITYTAB, STEAL_MATERIAL, EntityEquipmentSlot.FEET);
		
	public static final Item RUSTY_HELMET = new ArmourModel("rusty_helmet", Main.UTILITYTAB, RUSTY_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item RUSTY_CHESTPLATE = new ArmourModel("rusty_chestplate", Main.UTILITYTAB, RUSTY_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item RUSTY_LEGGINGS = new ArmourModel("rusty_leggings", Main.UTILITYTAB, RUSTY_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item RUSTY_BOOTS = new ArmourModel("rusty_boots", Main.UTILITYTAB, RUSTY_MATERIAL, EntityEquipmentSlot.FEET);
	
	public static final Item EMERALD_HELMET = new ArmourModel("emerald_helmet", Main.UTILITYTAB, EMERALD_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmourModel("emerald_chestplate", Main.UTILITYTAB, EMERALD_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmourModel("emerald_leggings", Main.UTILITYTAB, EMERALD_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmourModel("emerald_boots", Main.UTILITYTAB, EMERALD_MATERIAL, EntityEquipmentSlot.FEET);
	
	public static final Item GLASS_HELMET = new ArmourModel("glass_helmet", Main.UTILITYTAB, GLASS_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item GLASS_CHESTPLATE = new ArmourModel("glass_chestplate", Main.UTILITYTAB, GLASS_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item GLASS_LEGGINGS = new ArmourModel("glass_leggings", Main.UTILITYTAB, GLASS_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item GLASS_BOOTS = new ArmourModel("glass_boots", Main.UTILITYTAB, GLASS_MATERIAL, EntityEquipmentSlot.FEET);
	
	//Tools
	public static final Item RUBY_AXE = new ToolAxeBase("ruby_axe", RUBY_TOOL, Main.UTILITYTAB);
	public static final Item RUBY_HOE = new ToolHoeBase("ruby_hoe", RUBY_TOOL, Main.UTILITYTAB);
	public static final Item RUBY_PICKAXE = new ToolPickaxeBase("ruby_pickaxe", RUBY_TOOL, Main.UTILITYTAB);
	public static final Item RUBY_SHOVEL = new ToolShovelBase("ruby_shovel", RUBY_TOOL, Main.UTILITYTAB);
	public static final Item RUBY_SWORD = new ToolSwordBase("ruby_sword", RUBY_TOOL, Main.UTILITYTAB);
		
	public static final Item steal_AXE = new ToolAxeBase("steal_axe", STEAL_TOOL, Main.UTILITYTAB);
	public static final Item steal_HOE = new ToolHoeBase("steal_hoe", STEAL_TOOL, Main.UTILITYTAB);
	public static final Item steal_PICKAXE = new ToolPickaxeBase("steal_pickaxe", STEAL_TOOL, Main.UTILITYTAB);
	public static final Item steal_SHOVEL = new ToolShovelBase("steal_shovel", STEAL_TOOL, Main.UTILITYTAB);
	public static final Item steal_SWORD = new ToolSwordBase("steal_sword", STEAL_TOOL, Main.UTILITYTAB);
	
	public static final Item RUSTY_AXE = new ToolAxeBase("rusty_axe", RUSTY_TOOL, Main.UTILITYTAB);
	public static final Item RUSTY_HOE = new ToolHoeBase("rusty_hoe", RUSTY_TOOL, Main.UTILITYTAB);
	public static final Item RUSTY_PICKAXE = new ToolPickaxeBase("rusty_pickaxe", RUSTY_TOOL, Main.UTILITYTAB);
	public static final Item RUSTY_SHOVEL = new ToolShovelBase("rusty_shovel", RUSTY_TOOL, Main.UTILITYTAB);
	public static final Item RUSTY_SWORD = new ToolSwordBase("rusty_sword", RUSTY_TOOL, Main.UTILITYTAB);
	
	public static final Item EMERALD_AXE = new ToolAxeBase("emerald_axe", EMERALD_TOOL, Main.UTILITYTAB);
	public static final Item EMERALD_HOE = new ToolHoeBase("emerald_hoe", EMERALD_TOOL, Main.UTILITYTAB);
	public static final Item EMERALD_PICKAXE = new ToolPickaxeBase("emerald_pickaxe", EMERALD_TOOL, Main.UTILITYTAB);
	public static final Item EMERALD_SHOVEL = new ToolShovelBase("emerald_shovel", EMERALD_TOOL, Main.UTILITYTAB);
	public static final Item EMERALD_SWORD = new ToolSwordBase("emerald_sword", EMERALD_TOOL, Main.UTILITYTAB);
	
	public static final Item GLASS_AXE = new ToolAxeBase("glass_axe", GLASS_TOOL, Main.UTILITYTAB);
	public static final Item GLASS_HOE = new ToolHoeBase("glass_hoe", GLASS_TOOL, Main.UTILITYTAB);
	public static final Item GLASS_PICKAXE = new ToolPickaxeBase("glass_pickaxe", GLASS_TOOL, Main.UTILITYTAB);
	public static final Item GLASS_SHOVEL = new ToolShovelBase("glass_shovel", GLASS_TOOL, Main.UTILITYTAB);
	public static final Item GLASS_SWORD = new ToolSwordBase("glass_sword", GLASS_TOOL, Main.UTILITYTAB);

}
