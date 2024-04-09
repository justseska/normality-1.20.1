package net.seska.normality.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;

public class ModSoundEvents {
    public static final SoundEvent MOUSE_HURT = registerSoundEvent("entity.mouse.hurt");
    public static final SoundEvent MOUSE_DEATH = registerSoundEvent("entity.mouse.death");
    public static final SoundEvent MOUSE_AMBIENT = registerSoundEvent("entity.mouse.ambient");
    public static final SoundEvent CHOIR_SPRITE_HURT = registerSoundEvent("entity.choir_sprite.hurt");
    public static final SoundEvent CHOIR_SPRITE_DEATH = registerSoundEvent("entity.choir_sprite.death");
    public static final SoundEvent CHOIR_SPRITE_AMBIENT = registerSoundEvent("entity.choir_sprite.ambient");




    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(NormalityMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
    public static void registerSounds() {NormalityMod.LOGGER.info("Registering Sounds for" + NormalityMod.MOD_ID);}
}
