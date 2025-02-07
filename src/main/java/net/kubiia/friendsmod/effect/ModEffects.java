package net.kubiia.friendsmod.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

import static net.minecraft.entity.effect.StatusEffectCategory.*;
import static net.kubiia.friendsmod.FriendsMod.*;
import static net.minecraft.entity.attribute.EntityAttributes.*;
import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.*;
import static net.minecraft.util.Identifier.*;


public class ModEffects {
    public static final RegistryEntry<StatusEffect> FREEZE = registerStatusEffect("freeze",
            new EffectClass(HARMFUL, 161850780)
                    .addAttributeModifier(GENERIC_MOVEMENT_SPEED,
                           of(MOD_ID, "freeze"), -10f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> NO_JUMP = registerStatusEffect("no_jump",
            new EffectClass(HARMFUL, 161850780)
                    .addAttributeModifier(GENERIC_JUMP_STRENGTH,
                            of(MOD_ID, "no_jump"), -10f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON = registerStatusEffect("dadon",
            new EffectClass(HARMFUL, 1)
                    .addAttributeModifier(GENERIC_SCALE,
                            of(MOD_ID, "dadon"), -0.5f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON_HEALTH = registerStatusEffect("dadon_health",
            new EffectClass(HARMFUL, 1)
                    .addAttributeModifier(GENERIC_MAX_HEALTH,
                            of(MOD_ID, "dadon_health"), -0.8f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> NADI_STRENGTH = registerStatusEffect("nadi_strength",
            new EffectClass(HARMFUL, 31)
                    .addAttributeModifier(GENERIC_ATTACK_DAMAGE,
                            of(MOD_ID, "nadi_strentgh"), 4f,
                            ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(GENERIC_ATTACK_SPEED,
                            of(MOD_ID, "nadi_strentgh"), 4f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> NADI_SPEED = registerStatusEffect("nadi_speed",
            new EffectClass(HARMFUL, 25)
                    .addAttributeModifier(GENERIC_MOVEMENT_SPEED,
                            of(MOD_ID, "nadi_speed"), 0.2f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON_WEAKNESS = registerStatusEffect( "dadon_weakness",
            new EffectClass(HARMFUL, 1)
                    .addAttributeModifier(GENERIC_MAX_HEALTH,
                            of(MOD_ID, "dadon_weakness"), -1f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> ILAY_HEIGHT = registerStatusEffect("ilay_height",
            new EffectClass(HARMFUL, 1)
                    .addAttributeModifier(GENERIC_SCALE,
                            of(MOD_ID, "dadon"), 0.5f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> TZADIK = registerStatusEffect("tzadik",
            new EffectClass(BENEFICIAL, 1)
                    .addAttributeModifier(PLAYER_BLOCK_INTERACTION_RANGE,
                            of(MOD_ID, "tzadik"), 500f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> TZADIK2 = registerStatusEffect("tzadik2",
            new EffectClass(BENEFICIAL, 1)
                    .addAttributeModifier(PLAYER_ENTITY_INTERACTION_RANGE,
                            of(MOD_ID, "tzadik2"), 500f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> URI_HEIGHT = registerStatusEffect("uri_height",
            new EffectClass(HARMFUL, 1)
                    .addAttributeModifier(GENERIC_SCALE,
                            of(MOD_ID, "uri_height"), 0.5f,
                            ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> RON_HEIGHT =registerStatusEffect("ron_height",
            new EffectClass(HARMFUL, 32768)
                    .addAttributeModifier(GENERIC_SCALE,
                            of(MOD_ID, "ron_height"), 0.5f,
                            ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, of(MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        LOGGER.info("Registering Mod Effects For" + MOD_ID);
    }
}
