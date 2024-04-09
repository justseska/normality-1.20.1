package net.seska.normality.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.seska.normality.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {

        Advancement rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.JADE),
                        Text.literal("Don't Be Jaded!"), Text.literal("Collect a Jade"),
                        new Identifier(NormalityMod.MOD_ID, "textures/block/deepslate_jade_ore.png"), AdvancementFrame.TASK, true, true, false))
                .criterion("has_jade", InventoryChangedCriterion.Conditions.items(ModItems.JADE))
                .build(consumer, NormalityMod.MOD_ID + ":normality");
        Advancement jadeBlades = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.JADE_DAGGER),
                        Text.literal("Only One Can Remain"), Text.literal("Collect a Jade Blade"),
                        new Identifier(NormalityMod.MOD_ID, "textures/block/deepslate_jade_ore.png"), AdvancementFrame.TASK, true, true, false))
                .criterion("has_jade_blade", InventoryChangedCriterion.Conditions.items(ModItems.JADE_HAWKBRAND, ModItems.JADE_BEGINNING, ModItems.JADE_DAGGER, ModItems.JADE_SWIFT, ModItems.JADE_KATANA))
                .parent(rootAdvancement)
                .build(consumer, NormalityMod.MOD_ID + ":jade_blade");
        Advancement jadeLeggings = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.JADE_LEGGINGS),
                        Text.literal("It's Designer"), Text.literal("Craft Jade Leggings"),
                        new Identifier(NormalityMod.MOD_ID, "textures/block/deepslate_jade_ore.png"), AdvancementFrame.TASK, true, true, false))
                .criterion("has_jade_leggings", InventoryChangedCriterion.Conditions.items(ModItems.JADE_LEGGINGS))
                .parent(rootAdvancement)
                .build(consumer, NormalityMod.MOD_ID + ":jade_leggings");
        Advancement cheeseItem = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.CHEESE),
                        Text.literal("Cheesy!"), Text.literal("Craft Cheese"),
                        new Identifier(NormalityMod.MOD_ID, "textures/block/deepslate_jade_ore.png"), AdvancementFrame.TASK, true, true, false))
                .criterion("has_cheese", InventoryChangedCriterion.Conditions.items(ModItems.CHEESE))
                .parent(rootAdvancement)
                .build(consumer, NormalityMod.MOD_ID + ":cheese");

    }
}
