package net.seska.normality.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.util.math.MathHelper;
import net.seska.normality.entity.animations.ModAnimations;
import net.seska.normality.entity.custom.ChoirSpriteEntity;

public class ChoirSpriteModel<T extends ChoirSpriteEntity> extends SinglePartEntityModel<T> {
    private final ModelPart choir_sprite;
    private final ModelPart head;
    private float bodyPitch;
    public ChoirSpriteModel(ModelPart root) {
        this.choir_sprite = root.getChild("choir_sprite");
        this.head = choir_sprite.getChild("body");

    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData choir_sprite = modelPartData.addChild("choir_sprite", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 48.0F, 0.0F));

        ModelPartData body = choir_sprite.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 26).cuboid(-3.0F, -3.0F, -1.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F))
                .uv(20, 26).cuboid(-3.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -27.0F, 1.0F));

        ModelPartData wing = body.addChild("wing", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 27.0F, -1.0F));

        ModelPartData left_wing = wing.addChild("left_wing", ModelPartBuilder.create().uv(20, 0).cuboid(0.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -29.0F, 3.0F));

        ModelPartData right_wing = wing.addChild("right_wing", ModelPartBuilder.create().uv(20, 4).cuboid(-4.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -29.0F, 3.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void animateModel(T choirspriteEntity, float f, float g, float h) {
        super.animateModel(choirspriteEntity, f, g, h);
        this.bodyPitch = ((ChoirSpriteEntity)choirspriteEntity).getBodyPitch(h);
    }
    @Override
    public void setAngles(ChoirSpriteEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.animateMovement(ModAnimations.FLYING, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        choir_sprite.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return choir_sprite;
    }
}