package net.kubiia.friendsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kubiia.friendsmod.FriendsMod;
import net.kubiia.friendsmod.item.ModItems;
import net.kubiia.friendsmod.potion.ModPotions;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import static net.minecraft.component.type.PotionContentsComponent.*;
import static net.minecraft.item.Items.POTION;

import net.minecraft.potion.Potion;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GEFILTE_FISH)
                .pattern("C")
                .pattern("F")
                .input('C',Items.CARROT)
                .input('F', Items.COOKED_SALMON)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, Identifier.of(FriendsMod.MOD_ID, "gefilte_fish_from_salmon"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GEFILTE_FISH)
                .pattern("C")
                .pattern("F")
                .input('C',Items.CARROT)
                .input('F', Items.COOKED_COD)
                .criterion(hasItem(Items.CARROT), conditionsFromItem(Items.CARROT))
                .offerTo(exporter, Identifier.of(FriendsMod.MOD_ID, "gefilte_fish_from_cod"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CO2)
                .pattern("C")
                .input('C', Items.COAL)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter, Identifier.of(FriendsMod.MOD_ID, "co2"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COUGH_SYRUP)
                .pattern("PW")
                .input('P', ModItems.PROMETHAZINE)
                .input('W', createStack(POTION, Potions.WATER).getItem())
                .criterion(hasItem(ModItems.PROMETHAZINE), conditionsFromItem(ModItems.PROMETHAZINE))
                .offerTo(exporter, Identifier.of(FriendsMod.MOD_ID, "cough_syrup"));
    }
}
