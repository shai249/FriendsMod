package net.kubiia.friendsmod.sound;

import net.kubiia.friendsmod.FriendsMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    private static SoundEvent registerSoundEvent(String name) {
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(FriendsMod.MOD_ID, name),
                SoundEvent.of(Identifier.of(FriendsMod.MOD_ID, name)));
    }
    public static final SoundEvent AH_SHELI_MITHATEN = registerSoundEvent("ah_sheli_mithaten");
    public static final RegistryKey<JukeboxSong> AH_SHELI_MITHATEN_KEY = of("ah_sheli_mithaten");



    private static RegistryKey<JukeboxSong> of(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(FriendsMod.MOD_ID, name));
    }

      public static void registerSounds() {
        FriendsMod.LOGGER.info("Registering Mod Sounds For " + FriendsMod.MOD_ID);
      }
}
