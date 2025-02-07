package net.kubiia.friendsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubiia.friendsmod.item.custom.FalafelCannonItem;
import net.kubiia.friendsmod.item.custom.FalafelItem;
import net.kubiia.friendsmod.item.custom.SeferToraItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.kubiia.friendsmod.item.ModToolMaterials.*;
import static net.kubiia.friendsmod.sound.ModSounds.*;
import static net.kubiia.friendsmod.FriendsMod.*;

public class ModItems {
    public static final Item FALAFEL_BALL = registerItem("falafel_ball", new Item(new Item.Settings().food(ModFoodComponents.FALAFEL)));
    public static final Item KINDER = registerItem("kinder", new Item(new Item.Settings().food(ModFoodComponents.KINDER)));
    public static final Item GEFILTE_FISH = registerItem("gefilte_fish", new Item(new Item.Settings().food(ModFoodComponents.GEFILTE_FISH)));
    public static final Item PROTEIN_SNACK = registerItem("protein_snack", new Item(new Item.Settings().food(ModFoodComponents.PROTEIN_SNACK)));
    public static final Item SESAME = registerItem("sesame", new Item(new Item.Settings().food(ModFoodComponents.SUMSUM)));
    public static final Item CO2 = registerItem("co2", new Item(new Item.Settings()));
    public static final Item COUGH_SYRUP = registerItem("cough_syrup", new Item(new Item.Settings().food(ModFoodComponents.COUGH_SYRUP)));
    public static final Item PROMETHAZINE = registerItem("promethazine", new Item(new Item.Settings()));
    public static final Item CUCUMBER = registerItem("cucumber", new Item(new Item.Settings().food(ModFoodComponents.CUCUMBER)));
    public static final Item METAL_FALAFEL_BALL = registerItem("metal_falafel_ball", new FalafelItem(new Item.Settings()));
    public static final Item SEFER_TORA = registerItem("sefer_tora", new SeferToraItem(KADOSH,
           new Item.Settings().attributeModifiers(SeferToraItem.createAttributeModifiers(KADOSH,
                   0, -2.4f)).maxCount(1)));
    public static final Item FALAFEL_CANNON = registerItem("falafel_cannon", new FalafelCannonItem(new Item.Settings().maxDamage(1000000000)));
    public static final Item ILAY_MUSIC_DISC = registerItem("ilay_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(AH_SHELI_MITHATEN_KEY)
                    .maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void customFoodAndDrink(FabricItemGroupEntries entries) {
        entries.add(FALAFEL_BALL);
        entries.add(KINDER);
        entries.add(GEFILTE_FISH);
        entries.add(PROTEIN_SNACK);
        entries.add(CUCUMBER);
    }

    public static void registerModItems() {
        LOGGER.info("Registering Mod Items For" + MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::customFoodAndDrink);
    }
}
