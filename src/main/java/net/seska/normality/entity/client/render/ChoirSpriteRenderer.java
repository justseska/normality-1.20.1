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
import net.seska.normality.entity.client.ChoirSpriteModel;
import net.seska.normality.entity.custom.ChoirSpriteEntity;
import net.seska.normality.entity.layer.ModModelLayers;
import net.seska.normality.entity.variant.ChoirSpriteVariant;

import java.util.Map;

public class ChoirSpriteRenderer extends MobEntityRenderer<ChoirSpriteEntity, ChoirSpriteModel<ChoirSpriteEntity>> {

    private static final Map<ChoirSpriteVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ChoirSpriteVariant.class), map -> {
                map.put(ChoirSpriteVariant.ROSE, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/rose_choir_sprite.png"));
                map.put(ChoirSpriteVariant.ULTRAMARINE, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/ultramarine_choir_sprite.png"));
                map.put(ChoirSpriteVariant.CHARTREUSE, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/chartreuse_choir_sprite.png"));
                map.put(ChoirSpriteVariant.SPRING_GREEN, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/spring_green_choir_sprite.png"));
                map.put(ChoirSpriteVariant.VIOLET, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/violet_choir_sprite.png"));
                map.put(ChoirSpriteVariant.CAPRI, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/capri_choir_sprite.png"));
                map.put(ChoirSpriteVariant.PRIMROSE, new Identifier(NormalityMod.MOD_ID, "textures/entity/choir_sprite/primrose_choir_sprite.png"));
            });
    public ChoirSpriteRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ChoirSpriteModel<>(ctx.getPart(ModModelLayers.CHOIR_SPRITE)), 0.2f);
    }

    @Override
    public Identifier getTexture(ChoirSpriteEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(ChoirSpriteEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
