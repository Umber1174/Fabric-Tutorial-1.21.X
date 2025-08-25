package net.umber4307.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.umber4307.tutorialmod.block.ModBlocks;
import net.umber4307.tutorialmod.item.ModItemGroups;
import net.umber4307.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}