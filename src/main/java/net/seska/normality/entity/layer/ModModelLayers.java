package net.seska.normality.entity.layer;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;

public class ModModelLayers {
    public static final EntityModelLayer CHOIR_SPRITE =
            new EntityModelLayer(new Identifier(NormalityMod.MOD_ID, "choir_sprite"), "main");
    public static final EntityModelLayer MOUSE =
            new EntityModelLayer(new Identifier(NormalityMod.MOD_ID, "mouse"), "main");
}
