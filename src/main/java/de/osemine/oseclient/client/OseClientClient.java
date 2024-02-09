package de.osemine.oseclient.client;

import net.fabricmc.api.ClientModInitializer;

public class OseClientClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Client initialized");

    }
}
