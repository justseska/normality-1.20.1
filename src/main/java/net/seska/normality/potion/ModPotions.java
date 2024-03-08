package net.seska.normality.potion;

import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;

public class ModPotions {

    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(NormalityMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        NormalityMod.LOGGER.info("Registering Potions for " + NormalityMod.MOD_ID);
    }
}
