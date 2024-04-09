package net.seska.normality.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.seska.normality.block.ModBlocks;
import net.seska.normality.entity.ModEntities;
import net.seska.normality.entity.custom.ChoirSpriteEntity;
import net.seska.normality.entity.custom.MouseEntity;
import net.seska.normality.item.ModItems;
import net.seska.normality.mixin.BrewingRecipeRegistryMixin;

public class ModRegistries {


    public static void registerModStuffs() {
        registerStrippables();
        registerFlammables();
        registerCustomTrades();
        registerPotionRecipes();
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.CHOIR_SPRITE, ChoirSpriteEntity.createChoirSpriteAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.MOUSE, MouseEntity.createMouseAttributes());
    }
    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.HOLLY_LOG, ModBlocks.STRIPPED_HOLLY_LOG);
        StrippableBlockRegistry.register(ModBlocks.HOLLY_WOOD, ModBlocks.STRIPPED_HOLLY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.CHANTERELLE_STEM, ModBlocks.STRIPPED_CHANTERELLE_STEM);
        StrippableBlockRegistry.register(ModBlocks.ENOKI_STEM, ModBlocks.STRIPPED_ENOKI_STEM);
    }
    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLY_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HOLLY_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_SLAB, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_STAIRS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_LEAVES, 20, 30);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HOLLY_BERRY_LEAVES, 20, 30);

    }
    private static void registerCustomTrades () {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,    factories -> {factories.add((entity, random) -> new TradeOffer(        new ItemStack(Items.EMERALD, 2),        new ItemStack(ModItems.GINGER_ROOT, 3), 12, 2, 0.02f));    });
    }
    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.FOUR_LEAF_CLOVER, Potions.LUCK);
    }
}
