package io.github.electricpoultry.andonium;

import io.github.electricpoultry.andonium.block.ModBlocks;
import io.github.electricpoultry.andonium.item.ModItemGroups;
import io.github.electricpoultry.andonium.item.ModItems;
import io.github.electricpoultry.andonium.world.ModPlacedFeatures;
import io.github.electricpoultry.andonium.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Andonium implements ModInitializer {
	public static final String MOD_ID = "andonium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModItems.registerModItems();

		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}