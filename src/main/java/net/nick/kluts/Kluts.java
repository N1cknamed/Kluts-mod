package net.nick.kluts;

import net.fabricmc.api.ModInitializer;

import net.nick.kluts.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kluts implements ModInitializer {
	public static final String MOD_ID = "kluts";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}