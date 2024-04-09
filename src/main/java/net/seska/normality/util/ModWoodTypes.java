package net.seska.normality.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;

public class ModWoodTypes {
    public static final WoodType HOLLY_WOOD = WoodTypeRegistry.register(new Identifier(NormalityMod.MOD_ID, "holly_wood"), BlockSetType.OAK);
    public static final WoodType CHANTERELLE = WoodTypeRegistry.register(new Identifier(NormalityMod.MOD_ID, "chanterelle"), BlockSetType.OAK);
    public static final WoodType ENOKI = WoodTypeRegistry.register(new Identifier(NormalityMod.MOD_ID, "enoki"), BlockSetType.OAK);

}
