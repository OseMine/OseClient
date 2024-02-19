package de.osemine.oseclient.client;

import de.osemine.oseclient.OseClient;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;



public class OseClientClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Client initialized");
        OseClient.LOGGER.info("Initialized");

    }
}
