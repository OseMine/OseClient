package de.osemine.oseclient;

import de.osemine.oseclient.client.OseClientConfigScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OseClient implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "oseclient";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		// Andere Initialisierungslogik hier...

		// Registriere den Einstellungsbildschirm
	}

	@Override
	public void onInitializeClient() {

	}
}
