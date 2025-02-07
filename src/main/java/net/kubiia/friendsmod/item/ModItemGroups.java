package net.kubiia.friendsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.kubiia.friendsmod.item.ModItems.*;
import static net.kubiia.friendsmod.block.ModBlocks.*;
import static net.kubiia.friendsmod.potion.ModPotions.*;
import static net.minecraft.item.Items.*;
import static net.minecraft.component.type.PotionContentsComponent.*;
import static net.kubiia.friendsmod.FriendsMod.*;

public class ModItemGroups {

    public static final ItemGroup FRIENDSMOD_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "friendsmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.friendsmod"))
                    .icon(() -> new ItemStack(SEFER_TORA)).entries((displayContext, entries) -> {
                        entries.add(FALAFEL_BALL);
                        entries.add(METAL_FALAFEL_BALL);
                        entries.add(FALAFEL_BLOCK);
                        entries.add(FALAFEL_CANNON);
                        entries.add(KINDER);
                        entries.add(ILAY_MUSIC_DISC);
                        entries.add(SESAME);
                        entries.add(SEFER_TORA);
                        entries.add(GEFILTE_FISH);
                        entries.add(PROTEIN_SNACK);
                        entries.add(CUCUMBER);
                        entries.add(COUGH_SYRUP);
                        entries.add(createStack(POTION, ILAY_POTION));
                        entries.add(createStack(POTION, DADON_POTION));
                        entries.add(createStack(POTION, URI_POTION));
                        entries.add(createStack(POTION, NADI_POTION));
                        entries.add(createStack(POTION, RON_POTION));
                        entries.add(createStack(POTION, LEAN));
                        entries.add(createStack(POTION,SPRITE));
                        entries.add(createStack(SPLASH_POTION, ILAY_POTION));
                        entries.add(createStack(SPLASH_POTION, DADON_POTION));
                        entries.add(createStack(SPLASH_POTION, URI_POTION));
                        entries.add(createStack(SPLASH_POTION, NADI_POTION));
                        entries.add(createStack(SPLASH_POTION, RON_POTION));
                        entries.add(createStack(SPLASH_POTION, LEAN));
                        entries.add(createStack(LINGERING_POTION, ILAY_POTION));
                        entries.add(createStack(LINGERING_POTION, DADON_POTION));
                        entries.add(createStack(LINGERING_POTION, URI_POTION));
                        entries.add(createStack(LINGERING_POTION, NADI_POTION));
                        entries.add(createStack(LINGERING_POTION, RON_POTION));
                        entries.add(createStack(LINGERING_POTION, LEAN));
                        entries.add(createStack(TIPPED_ARROW, ILAY_POTION));
                        entries.add(createStack(TIPPED_ARROW, DADON_POTION));
                        entries.add(createStack(TIPPED_ARROW, URI_POTION));
                        entries.add(createStack(TIPPED_ARROW, NADI_POTION));
                        entries.add(createStack(TIPPED_ARROW, RON_POTION));
                        entries.add(createStack(TIPPED_ARROW, LEAN));
                    }).build());

    public static void registerItemGroups() {
        LOGGER.info("Registring Item Groups For" + MOD_ID);
    }
}
