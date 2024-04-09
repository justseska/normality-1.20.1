package net.seska.normality.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.CamelEntity;
import net.minecraft.util.math.MathHelper;
import net.seska.normality.entity.animations.ModAnimations;
import net.seska.normality.entity.custom.ChoirSpriteEntity;
import net.seska.normality.entity.custom.MouseEntity;

public class MouseModel <T extends MouseEntity> extends SinglePartEntityModel<T> {
    private float bodyPitch;
    private final ModelPart mouse;
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart left_back_leg;
    private final ModelPart right_back_leg;
    private final ModelPart right_leg;
    private final ModelPart left_leg;

    public MouseModel(ModelPart root) {
        this.mouse = root.getChild("mouse");
        this.head = mouse.getChild("head");
        this.body = mouse.getChild("body");
        this.tail = mouse.getChild("tail");
        this.left_back_leg = body.getChild("left_back_leg");
        this.right_back_leg = body.getChild("right_back_leg");
        this.left_leg = body.getChild("left_leg");
        this.right_leg = body.getChild("right_leg");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData mouse = modelPartData.addChild("mouse", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData tail = mouse.addChild("tail", ModelPartBuilder.create().uv(0, 7).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 2.0F));

        ModelPartData body = mouse.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, 0.0F));
        ModelPartData left_back_leg = body.addChild("left_back_leg", ModelPartBuilder.create().uv(14, 15).cuboid(0.25F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_back_leg = body.addChild("right_back_leg", ModelPartBuilder.create().uv(14, 15).cuboid(-1.25F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_leg = body.addChild("right_leg", ModelPartBuilder.create().uv(14, 15).cuboid(-1.25F, 1.25F, -1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_leg = body.addChild("left_leg", ModelPartBuilder.create().uv(14, 15).cuboid(0.25F, 1.25F, -1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData head = mouse.addChild("head", ModelPartBuilder.create().uv(6, 7).cuboid(-1.5F, -1.375F, -2.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-0.5F, -0.375F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 11).cuboid(0.5F, -3.375F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 13).cuboid(0.5F, -3.375F, -0.49F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(10, 0).cuboid(-3.5F, -3.375F, -0.5F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 13).cuboid(-3.5F, -3.375F, -0.49F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.625F, -2.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }
    @Override
    public void animateModel(T mouseEntity, float f, float g, float h) {
        super.animateModel(mouseEntity, f, g, h);
        this.bodyPitch = ((MouseEntity)mouseEntity).getBodyPitch(h);
    }
    @Override
    public void setAngles(MouseEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);

        this.animateMovement(ModAnimations.MOUSE_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.MOUSE_IDLE, ageInTicks, 1f);
        this.updateAnimation(entity.sitAnimationState, ModAnimations.MOUSE_SIT, ageInTicks, 1f);
    }

    private void setHeadAngles(MouseEntity entity, float headYaw, float headPitch, float animationProgress) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

        this.head.yaw = headYaw * ((float)Math.PI / 180);
        this.head.pitch = headPitch * ((float)Math.PI / 180);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        mouse.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return mouse;
    }
}
