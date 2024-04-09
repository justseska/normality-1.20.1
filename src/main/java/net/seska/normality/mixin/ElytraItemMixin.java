package net.seska.normality.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.seska.normality.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ElytraItem.class)
abstract class ElytraItemMixin extends Item implements Equipment {
    @Shadow public abstract boolean canRepair(ItemStack stack, ItemStack ingredient);

    public ElytraItemMixin(Settings settings) {
        super(settings);
    }
    @ModifyReturnValue(method = "canRepair", at = @At("TAIL"))
    public boolean modifycanRepair(boolean original, ItemStack stack, ItemStack ingredient) {
        return original || ingredient.isOf(ModItems.CHOIR_SPRITE_WING);
    }
}
