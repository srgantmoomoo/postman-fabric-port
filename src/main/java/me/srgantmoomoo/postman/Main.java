package me.srgantmoomoo.postman;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("postmn");

    @Override
    public void onInitialize() {
        LOGGER.info("hello world.");
    }

}
