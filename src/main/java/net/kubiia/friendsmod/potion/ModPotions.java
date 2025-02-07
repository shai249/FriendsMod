package net.kubiia.friendsmod.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

import static net.kubiia.friendsmod.effect.ModEffects.*;
import static net.minecraft.entity.effect.StatusEffects.*;
import static net.kubiia.friendsmod.FriendsMod.*;
import static net.minecraft.util.Identifier.*;


public class ModPotions {
    public static final RegistryEntry<Potion> ILAY_POTION = registerPotion("ilay_potion",
                new Potion(new StatusEffectInstance(NO_JUMP, 200, 0),
                        new StatusEffectInstance(FREEZE, 200, 0),
                        new StatusEffectInstance(ILAY_HEIGHT, 200, 0)));

    public static final RegistryEntry<Potion> DADON_POTION = registerPotion("dadon_potion",
            new Potion(new StatusEffectInstance(DADON, 200, 0),
            new StatusEffectInstance(DADON_WEAKNESS, 200, 0),
            new StatusEffectInstance(DADON_HEALTH, 200, 0)));

    public static final RegistryEntry<Potion> URI_POTION = registerPotion("uri_potion",
            new Potion(new StatusEffectInstance(GLOWING, 200, 10),
            new StatusEffectInstance(URI_HEIGHT, 200, 10)));

    public static final RegistryEntry<Potion> NADI_POTION = registerPotion("nadi_potion",
            new Potion(new StatusEffectInstance(NADI_STRENGTH, 200, 5),
            new StatusEffectInstance(NADI_SPEED, 200, 5)));

    public static final RegistryEntry<Potion> RON_POTION = registerPotion("ron_potion",
            new Potion(new StatusEffectInstance(RON_HEIGHT, 200, 5)));

    public static final RegistryEntry<Potion> LEAN = registerPotion("lean",
            new Potion(new StatusEffectInstance(NAUSEA, 800, 4)));

    public static final RegistryEntry<Potion> SPRITE = registerPotion("sprite",
            new Potion(new StatusEffectInstance[0]));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, of(MOD_ID, name), potion);
    }

    public static void registerPotions() {
        LOGGER.info("Registering Potions For" + MOD_ID);
    }
}
