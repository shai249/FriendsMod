package net.kubiia.friendsmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubiia.friendsmod.item.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.kubiia.friendsmod.FriendsMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block FALAFEL_BLOCK = registerBlock("falafel_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.CALCITE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FriendsMod.MOD_ID,name), block);
    }
        public static void registerModBlocks() {
            FriendsMod.LOGGER.info("Registering Mod Blocks For" + FriendsMod.MOD_ID);
        }

    private static void registerBlockItem(String name, Block block) {
            Registry.register(Registries.ITEM, Identifier.of(FriendsMod.MOD_ID, name),
                    new BlockItem(block, new Item.Settings()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
                entries.add(ModBlocks.FALAFEL_BLOCK);
        });
    }
}
