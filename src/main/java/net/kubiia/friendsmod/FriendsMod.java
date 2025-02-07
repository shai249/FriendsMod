package net.kubiia.friendsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;

import static net.kubiia.friendsmod.potion.ModPotions.*;
import static net.minecraft.potion.Potions.*;
import static net.kubiia.friendsmod.sound.ModSounds.*;
import static net.kubiia.friendsmod.item.ModItems.*;
import static net.kubiia.friendsmod.item.ModItemGroups.*;
import static net.kubiia.friendsmod.effect.ModEffects.*;
import static net.kubiia.friendsmod.block.ModBlocks.*;
import static net.minecraft.registry.Registries.*;

public class FriendsMod implements ModInitializer {
	public static final String MOD_ID = "friendsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		registerItemGroups();
		registerModBlocks();
		registerModItems();
		registerEffects();
		registerPotions();
		registerSounds();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
                // Input potion.
                WATER,
                // Ingredient
                KINDER,
                // Output potion.
                POTION.getEntry(ILAY_POTION.value())
        ));

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
                // Input potion.
                WATER,
                // Ingredient
                GEFILTE_FISH,
                // Output potion.
                POTION.getEntry(URI_POTION.value())
        ));

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
                // Input potion.
                WATER,
                // Ingredient
                SESAME,
                // Output potion.
                POTION.getEntry(DADON_POTION.value())
        ));

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
                // Input potion.
                WATER,
				// Ingredient
                CUCUMBER,
                // Output potion.
                POTION.getEntry(RON_POTION.value())
        ));

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
				// Input potion.
				MUNDANE,
				// Ingredient
				CO2,
				// Output potion.
				POTION.getEntry(SPRITE.value())
		));

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> builder.registerPotionRecipe(
				// Input potion.
				 SPRITE,
				// Ingredient
				COUGH_SYRUP,
				// Output potion.
				POTION.getEntry(LEAN.value())
		));
	}
}