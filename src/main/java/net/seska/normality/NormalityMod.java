package net.seska.normality;

import net.fabricmc.api.ModInitializer;

import net.seska.normality.block.ModBlocks;
import net.seska.normality.item.ModItemGroup;
import net.seska.normality.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NormalityMod implements ModInitializer {
	public static final String MOD_ID = "normality";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}