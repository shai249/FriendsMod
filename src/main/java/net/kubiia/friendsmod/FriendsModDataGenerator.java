package net.kubiia.friendsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.kubiia.friendsmod.datagen.ModBlockTagProvider;
import net.kubiia.friendsmod.datagen.ModItemTagProvider;
import net.kubiia.friendsmod.datagen.ModRecipeProvider;

public class FriendsModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
	}
}
