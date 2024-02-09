package de.osemine.oseclient;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OseClient implements ModInitializer {
	public static final String MOD_ID = "oseclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		System.out.println("Mod initialized");
		LOGGER.info("Hello Fabric world!");
	}
}