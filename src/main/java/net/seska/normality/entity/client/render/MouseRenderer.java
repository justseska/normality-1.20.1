package net.seska.normality.entity.client.render;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.seska.normality.NormalityMod;
import net.seska.normality.entity.client.MouseModel;
import net.seska.normality.entity.custom.ChoirSpriteEntity;
import net.seska.normality.entity.custom.MouseEntity;
import net.seska.normality.entity.layer.ModModelLayers;
import net.seska.normality.entity.variant.ChoirSpriteVariant;
import net.seska.normality.entity.variant.MouseVariant;

import java.util.Map;

public class MouseRenderer extends MobEntityRenderer<MouseEntity, MouseModel<MouseEntity>> {
    private static final Map<MouseVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(MouseVariant.class), map -> {
                map.put(MouseVariant.MEADOW, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/meadow_mouse.png"));
                map.put(MouseVariant.HOUSE, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/house_mouse.png"));
                map.put(MouseVariant.SABLE, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/sable_mouse.png"));
                map.put(MouseVariant.ALBINO, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/albino_mouse.png"));
                map.put(MouseVariant.RUMPWHITE, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/rumpwhite_mouse.png"));
                map.put(MouseVariant.EVEN_MARKED, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/even_marked_mouse.png"));
                map.put(MouseVariant.BLACK_TAN, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/black_tan_mouse.png"));
                map.put(MouseVariant.DUTCH, new Identifier(NormalityMod.MOD_ID, "textures/entity/mouse/dutch_mouse.png"));

            });
    @Override
    public Identifier getTexture(MouseEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    public MouseRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MouseModel<>(ctx.getPart(ModModelLayers.MOUSE)), 0.2f);
    }

    @Override
    public void render(MouseEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
