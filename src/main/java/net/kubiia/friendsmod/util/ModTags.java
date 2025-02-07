package net.kubiia.friendsmod.util;

import net.kubiia.friendsmod.FriendsMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> PAXEL_MINEABLE = createTag("paxel_mineable");

            private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FriendsMod.MOD_ID, name));
            }

}
