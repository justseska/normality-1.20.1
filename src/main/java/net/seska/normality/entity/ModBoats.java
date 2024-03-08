package net.seska.normality.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.ModBlocks;
import net.seska.normality.item.ModItems;

import java.util.IdentityHashMap;

public class ModBoats {
    public static final Identifier HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "holly_boat");
    public static final Identifier HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(HOLLY_BOAT_ID);
    public static final Identifier CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "chanterelle_boat");
    public static final Identifier CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CHANTERELLE_BOAT_ID);
    public static final Identifier ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "enoki_boat");
    public static final Identifier ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ENOKI_BOAT_ID);
    public static final Identifier WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "warped_boat");
    public static final Identifier WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WARPED_BOAT_ID);
    public static final Identifier CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "crimson_boat");
    public static final Identifier CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CRIMSON_BOAT_ID);
    //DYED BIRCH
    public static final Identifier BLACK_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_birch_boat");
    public static final Identifier BLACK_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_BIRCH_BOAT_ID);
    //BLUE BIRCH
    public static final Identifier BLUE_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_birch_boat");
    public static final Identifier BLUE_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_BIRCH_BOAT_ID);
    //BROWN BIRCH
    public static final Identifier BROWN_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_birch_boat");
    public static final Identifier BROWN_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_BIRCH_BOAT_ID);
    //CYAN BIRCH
    public static final Identifier CYAN_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_birch_boat");
    public static final Identifier CYAN_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_BIRCH_BOAT_ID);
    //GRAY BIRCH
    public static final Identifier GRAY_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_birch_boat");
    public static final Identifier GRAY_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_BIRCH_BOAT_ID);
    //GREEN BIRCH
    public static final Identifier GREEN_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_birch_boat");
    public static final Identifier GREEN_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_BIRCH_BOAT_ID);
    //LIGHT BLUE BIRCH
    public static final Identifier LIGHT_BLUE_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_birch_boat");
    public static final Identifier LIGHT_BLUE_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_BIRCH_BOAT_ID);
    //LIGHT GRAY BIRCH
    public static final Identifier LIGHT_GRAY_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_birch_boat");
    public static final Identifier LIGHT_GRAY_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_BIRCH_BOAT_ID);
    //LIME BIRCH
    public static final Identifier LIME_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_birch_boat");
    public static final Identifier LIME_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_BIRCH_BOAT_ID);
    //MAGENTA BIRCH
    public static final Identifier MAGENTA_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_birch_boat");
    public static final Identifier MAGENTA_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_BIRCH_BOAT_ID);
    //ORANGE BIRCH
    public static final Identifier ORANGE_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_birch_boat");
    public static final Identifier ORANGE_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_BIRCH_BOAT_ID);
    //PINK BIRCH
    public static final Identifier PINK_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_birch_boat");
    public static final Identifier PINK_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_BIRCH_BOAT_ID);
    //PURPLE BIRCH
    public static final Identifier PURPLE_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_birch_boat");
    public static final Identifier PURPLE_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_BIRCH_BOAT_ID);
    //RED BIRCH
    public static final Identifier RED_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_birch_boat");
    public static final Identifier RED_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_BIRCH_BOAT_ID);
    //WHITE BIRCH
    public static final Identifier WHITE_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_birch_boat");
    public static final Identifier WHITE_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_BIRCH_BOAT_ID);
    //YELLOW BIRCH
    public static final Identifier YELLOW_BIRCH_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_birch_boat");
    public static final Identifier YELLOW_BIRCH_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_birch_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_BIRCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_BIRCH_BOAT_ID);
    //DYED OAK
    public static final Identifier BLACK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_oak_boat");
    public static final Identifier BLACK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_OAK_BOAT_ID);
    //BLUE OAK
    public static final Identifier BLUE_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_oak_boat");
    public static final Identifier BLUE_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_OAK_BOAT_ID);
    //BROWN OAK
    public static final Identifier BROWN_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_oak_boat");
    public static final Identifier BROWN_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_OAK_BOAT_ID);
    //CYAN OAK
    public static final Identifier CYAN_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_oak_boat");
    public static final Identifier CYAN_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_OAK_BOAT_ID);
    //GRAY OAK
    public static final Identifier GRAY_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_oak_boat");
    public static final Identifier GRAY_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_OAK_BOAT_ID);
    //GREEN OAK
    public static final Identifier GREEN_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_oak_boat");
    public static final Identifier GREEN_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_OAK_BOAT_ID);
    //LIGHT BLUE OAK
    public static final Identifier LIGHT_BLUE_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_oak_boat");
    public static final Identifier LIGHT_BLUE_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_OAK_BOAT_ID);
    //LIGHT GRAY OAK
    public static final Identifier LIGHT_GRAY_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_oak_boat");
    public static final Identifier LIGHT_GRAY_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_OAK_BOAT_ID);
    //LIME OAK
    public static final Identifier LIME_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_oak_boat");
    public static final Identifier LIME_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_OAK_BOAT_ID);
    //MAGENTA OAK
    public static final Identifier MAGENTA_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_oak_boat");
    public static final Identifier MAGENTA_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_OAK_BOAT_ID);
    //ORANGE OAK
    public static final Identifier ORANGE_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_oak_boat");
    public static final Identifier ORANGE_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_OAK_BOAT_ID);
    //PINK OAK
    public static final Identifier PINK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_oak_boat");
    public static final Identifier PINK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_OAK_BOAT_ID);
    //PURPLE OAK
    public static final Identifier PURPLE_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_oak_boat");
    public static final Identifier PURPLE_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_OAK_BOAT_ID);
    //RED OAK
    public static final Identifier RED_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_oak_boat");
    public static final Identifier RED_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_OAK_BOAT_ID);
    //WHITE OAK
    public static final Identifier WHITE_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_oak_boat");
    public static final Identifier WHITE_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_OAK_BOAT_ID);
    //YELLOW OAK
    public static final Identifier YELLOW_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_oak_boat");
    public static final Identifier YELLOW_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_OAK_BOAT_ID);
    //DYED ACACIA
    public static final Identifier BLACK_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_acacia_boat");
    public static final Identifier BLACK_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_ACACIA_BOAT_ID);
    //BLUE ACACIA
    public static final Identifier BLUE_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_acacia_boat");
    public static final Identifier BLUE_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_ACACIA_BOAT_ID);
    //BROWN ACACIA
    public static final Identifier BROWN_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_acacia_boat");
    public static final Identifier BROWN_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_ACACIA_BOAT_ID);
    //CYAN ACACIA
    public static final Identifier CYAN_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_acacia_boat");
    public static final Identifier CYAN_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_ACACIA_BOAT_ID);
    //GRAY ACACIA
    public static final Identifier GRAY_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_acacia_boat");
    public static final Identifier GRAY_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_ACACIA_BOAT_ID);
    //GREEN ACACIA
    public static final Identifier GREEN_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_acacia_boat");
    public static final Identifier GREEN_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_ACACIA_BOAT_ID);
    //LIGHT BLUE ACACIA
    public static final Identifier LIGHT_BLUE_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_acacia_boat");
    public static final Identifier LIGHT_BLUE_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_ACACIA_BOAT_ID);
    //LIGHT GRAY ACACIA
    public static final Identifier LIGHT_GRAY_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_acacia_boat");
    public static final Identifier LIGHT_GRAY_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_ACACIA_BOAT_ID);
    //LIME ACACIA
    public static final Identifier LIME_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_acacia_boat");
    public static final Identifier LIME_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_ACACIA_BOAT_ID);
    //MAGENTA ACACIA
    public static final Identifier MAGENTA_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_acacia_boat");
    public static final Identifier MAGENTA_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_ACACIA_BOAT_ID);
    //ORANGE ACACIA
    public static final Identifier ORANGE_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_acacia_boat");
    public static final Identifier ORANGE_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_ACACIA_BOAT_ID);
    //PINK ACACIA
    public static final Identifier PINK_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_acacia_boat");
    public static final Identifier PINK_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_ACACIA_BOAT_ID);
    //PURPLE ACACIA
    public static final Identifier PURPLE_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_acacia_boat");
    public static final Identifier PURPLE_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_ACACIA_BOAT_ID);
    //RED ACACIA
    public static final Identifier RED_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_acacia_boat");
    public static final Identifier RED_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_ACACIA_BOAT_ID);
    //WHITE ACACIA
    public static final Identifier WHITE_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_acacia_boat");
    public static final Identifier WHITE_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_ACACIA_BOAT_ID);
    //YELLOW ACACIA
    public static final Identifier YELLOW_ACACIA_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_acacia_boat");
    public static final Identifier YELLOW_ACACIA_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_acacia_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_ACACIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_ACACIA_BOAT_ID);
    //DYED DARK_OAK
    public static final Identifier BLACK_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_dark_oak_boat");
    public static final Identifier BLACK_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_DARK_OAK_BOAT_ID);
    //BLUE DARK_OAK
    public static final Identifier BLUE_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_dark_oak_boat");
    public static final Identifier BLUE_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_DARK_OAK_BOAT_ID);
    //BROWN DARK_OAK
    public static final Identifier BROWN_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_dark_oak_boat");
    public static final Identifier BROWN_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_DARK_OAK_BOAT_ID);
    //CYAN DARK_OAK
    public static final Identifier CYAN_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_dark_oak_boat");
    public static final Identifier CYAN_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_DARK_OAK_BOAT_ID);
    //GRAY DARK_OAK
    public static final Identifier GRAY_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_dark_oak_boat");
    public static final Identifier GRAY_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_DARK_OAK_BOAT_ID);
    //GREEN DARK_OAK
    public static final Identifier GREEN_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_dark_oak_boat");
    public static final Identifier GREEN_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_DARK_OAK_BOAT_ID);
    //LIGHT BLUE DARK_OAK
    public static final Identifier LIGHT_BLUE_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_dark_oak_boat");
    public static final Identifier LIGHT_BLUE_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_DARK_OAK_BOAT_ID);
    //LIGHT GRAY DARK_OAK
    public static final Identifier LIGHT_GRAY_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_dark_oak_boat");
    public static final Identifier LIGHT_GRAY_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_DARK_OAK_BOAT_ID);
    //LIME DARK_OAK
    public static final Identifier LIME_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_dark_oak_boat");
    public static final Identifier LIME_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_DARK_OAK_BOAT_ID);
    //MAGENTA DARK_OAK
    public static final Identifier MAGENTA_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_dark_oak_boat");
    public static final Identifier MAGENTA_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_DARK_OAK_BOAT_ID);
    //ORANGE DARK_OAK
    public static final Identifier ORANGE_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_dark_oak_boat");
    public static final Identifier ORANGE_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_DARK_OAK_BOAT_ID);
    //PINK DARK_OAK
    public static final Identifier PINK_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_dark_oak_boat");
    public static final Identifier PINK_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_DARK_OAK_BOAT_ID);
    //PURPLE DARK_OAK
    public static final Identifier PURPLE_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_dark_oak_boat");
    public static final Identifier PURPLE_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_DARK_OAK_BOAT_ID);
    //RED DARK_OAK
    public static final Identifier RED_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_dark_oak_boat");
    public static final Identifier RED_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_DARK_OAK_BOAT_ID);
    //WHITE DARK_OAK
    public static final Identifier WHITE_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_dark_oak_boat");
    public static final Identifier WHITE_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_DARK_OAK_BOAT_ID);
    //YELLOW DARK_OAK
    public static final Identifier YELLOW_DARK_OAK_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_dark_oak_boat");
    public static final Identifier YELLOW_DARK_OAK_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_dark_oak_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_DARK_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_DARK_OAK_BOAT_ID);
    //DYED SPRUCE
    public static final Identifier BLACK_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_spruce_boat");
    public static final Identifier BLACK_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_SPRUCE_BOAT_ID);
    //BLUE SPRUCE
    public static final Identifier BLUE_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_spruce_boat");
    public static final Identifier BLUE_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_SPRUCE_BOAT_ID);
    //BROWN SPRUCE
    public static final Identifier BROWN_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_spruce_boat");
    public static final Identifier BROWN_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_SPRUCE_BOAT_ID);
    //CYAN SPRUCE
    public static final Identifier CYAN_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_spruce_boat");
    public static final Identifier CYAN_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_SPRUCE_BOAT_ID);
    //GRAY SPRUCE
    public static final Identifier GRAY_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_spruce_boat");
    public static final Identifier GRAY_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_SPRUCE_BOAT_ID);
    //GREEN SPRUCE
    public static final Identifier GREEN_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_spruce_boat");
    public static final Identifier GREEN_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_SPRUCE_BOAT_ID);
    //LIGHT BLUE SPRUCE
    public static final Identifier LIGHT_BLUE_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_spruce_boat");
    public static final Identifier LIGHT_BLUE_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_SPRUCE_BOAT_ID);
    //LIGHT GRAY SPRUCE
    public static final Identifier LIGHT_GRAY_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_spruce_boat");
    public static final Identifier LIGHT_GRAY_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_SPRUCE_BOAT_ID);
    //LIME SPRUCE
    public static final Identifier LIME_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_spruce_boat");
    public static final Identifier LIME_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_SPRUCE_BOAT_ID);
    //MAGENTA SPRUCE
    public static final Identifier MAGENTA_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_spruce_boat");
    public static final Identifier MAGENTA_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_SPRUCE_BOAT_ID);
    //ORANGE SPRUCE
    public static final Identifier ORANGE_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_spruce_boat");
    public static final Identifier ORANGE_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_SPRUCE_BOAT_ID);
    //PINK SPRUCE
    public static final Identifier PINK_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_spruce_boat");
    public static final Identifier PINK_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_SPRUCE_BOAT_ID);
    //PURPLE SPRUCE
    public static final Identifier PURPLE_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_spruce_boat");
    public static final Identifier PURPLE_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_SPRUCE_BOAT_ID);
    //RED SPRUCE
    public static final Identifier RED_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_spruce_boat");
    public static final Identifier RED_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_SPRUCE_BOAT_ID);
    //WHITE SPRUCE
    public static final Identifier WHITE_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_spruce_boat");
    public static final Identifier WHITE_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_SPRUCE_BOAT_ID);
    //YELLOW SPRUCE
    public static final Identifier YELLOW_SPRUCE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_spruce_boat");
    public static final Identifier YELLOW_SPRUCE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_spruce_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_SPRUCE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_SPRUCE_BOAT_ID);
    //BLACK BAMBOO
    public static final Identifier BLACK_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "black_bamboo_raft");
    public static final Identifier BLACK_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "black_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> BLACK_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_BAMBOO_RAFT_ID);
    //BLUE BAMBOO
    public static final Identifier BLUE_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "blue_bamboo_raft");
    public static final Identifier BLUE_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "blue_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> BLUE_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_BAMBOO_RAFT_ID);
    //BROWN BAMBOO
    public static final Identifier BROWN_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "brown_bamboo_raft");
    public static final Identifier BROWN_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "brown_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> BROWN_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_BAMBOO_RAFT_ID);
    //CYAN BAMBOO
    public static final Identifier CYAN_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_bamboo_raft");
    public static final Identifier CYAN_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> CYAN_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_BAMBOO_RAFT_ID);
    //GRAY BAMBOO
    public static final Identifier GRAY_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "gray_bamboo_raft");
    public static final Identifier GRAY_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "gray_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> GRAY_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_BAMBOO_RAFT_ID);
    //GREEN BAMBOO
    public static final Identifier GREEN_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "green_bamboo_raft");
    public static final Identifier GREEN_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "green_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> GREEN_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_BAMBOO_RAFT_ID);
    //LIGHT_BLUE BAMBOO
    public static final Identifier LIGHT_BLUE_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_bamboo_raft");
    public static final Identifier LIGHT_BLUE_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_BAMBOO_RAFT_ID);
    //LIGHT_GRAY BAMBOO
    public static final Identifier LIGHT_GRAY_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_bamboo_raft");
    public static final Identifier LIGHT_GRAY_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_BAMBOO_RAFT_ID);
    //LIME BAMBOO
    public static final Identifier LIME_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "lime_bamboo_raft");
    public static final Identifier LIME_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "lime_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> LIME_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(LIME_BAMBOO_RAFT_ID);
    //MAGENTA BAMBOO
    public static final Identifier MAGENTA_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_bamboo_raft");
    public static final Identifier MAGENTA_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> MAGENTA_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_BAMBOO_RAFT_ID);
    //ORANGE BAMBOO
    public static final Identifier ORANGE_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "orange_bamboo_raft");
    public static final Identifier ORANGE_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "orange_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> ORANGE_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_BAMBOO_RAFT_ID);
    //PINK BAMBOO
    public static final Identifier PINK_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "pink_bamboo_raft");
    public static final Identifier PINK_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "pink_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> PINK_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(PINK_BAMBOO_RAFT_ID);
    //PURPLE BAMBOO
    public static final Identifier PURPLE_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "purple_bamboo_raft");
    public static final Identifier PURPLE_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "purple_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> PURPLE_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_BAMBOO_RAFT_ID);
    //RED BAMBOO
    public static final Identifier RED_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "red_bamboo_raft");
    public static final Identifier RED_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "red_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> RED_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(RED_BAMBOO_RAFT_ID);
    //WHITE BAMBOO
    public static final Identifier WHITE_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "white_bamboo_raft");
    public static final Identifier WHITE_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "white_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> WHITE_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_BAMBOO_RAFT_ID);
    //YELLOW BAMBOO
    public static final Identifier YELLOW_BAMBOO_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_bamboo_raft");
    public static final Identifier YELLOW_BAMBOO_CHEST_RAFT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_bamboo_chest_raft");
    public static final RegistryKey<TerraformBoatType> YELLOW_BAMBOO_RAFT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_BAMBOO_RAFT_ID);
    //DYED HOLLY
    public static final Identifier BLACK_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_holly_boat");
    public static final Identifier BLACK_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_HOLLY_BOAT_ID);
    //BLUE HOLLY
    public static final Identifier BLUE_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_holly_boat");
    public static final Identifier BLUE_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_HOLLY_BOAT_ID);
    //BROWN HOLLY
    public static final Identifier BROWN_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_holly_boat");
    public static final Identifier BROWN_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_HOLLY_BOAT_ID);
    //CYAN HOLLY
    public static final Identifier CYAN_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_holly_boat");
    public static final Identifier CYAN_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_HOLLY_BOAT_ID);
    //GRAY HOLLY
    public static final Identifier GRAY_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_holly_boat");
    public static final Identifier GRAY_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_HOLLY_BOAT_ID);
    //GREEN HOLLY
    public static final Identifier GREEN_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_holly_boat");
    public static final Identifier GREEN_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_HOLLY_BOAT_ID);
    //LIGHT BLUE HOLLY
    public static final Identifier LIGHT_BLUE_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_holly_boat");
    public static final Identifier LIGHT_BLUE_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_HOLLY_BOAT_ID);
    //LIGHT GRAY HOLLY
    public static final Identifier LIGHT_GRAY_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_holly_boat");
    public static final Identifier LIGHT_GRAY_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_HOLLY_BOAT_ID);
    //LIME HOLLY
    public static final Identifier LIME_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_holly_boat");
    public static final Identifier LIME_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_HOLLY_BOAT_ID);
    //MAGENTA HOLLY
    public static final Identifier MAGENTA_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_holly_boat");
    public static final Identifier MAGENTA_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_HOLLY_BOAT_ID);
    //ORANGE HOLLY
    public static final Identifier ORANGE_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_holly_boat");
    public static final Identifier ORANGE_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_HOLLY_BOAT_ID);
    //PINK HOLLY
    public static final Identifier PINK_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_holly_boat");
    public static final Identifier PINK_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_HOLLY_BOAT_ID);
    //PURPLE HOLLY
    public static final Identifier PURPLE_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_holly_boat");
    public static final Identifier PURPLE_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_HOLLY_BOAT_ID);
    //RED HOLLY
    public static final Identifier RED_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_holly_boat");
    public static final Identifier RED_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_HOLLY_BOAT_ID);
    //WHITE HOLLY
    public static final Identifier WHITE_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_holly_boat");
    public static final Identifier WHITE_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_HOLLY_BOAT_ID);
    //YELLOW HOLLY
    public static final Identifier YELLOW_HOLLY_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_holly_boat");
    public static final Identifier YELLOW_HOLLY_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_holly_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_HOLLY_BOAT_ID);
    //DYED CHANTERELLE
    public static final Identifier BLACK_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_chanterelle_boat");
    public static final Identifier BLACK_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_CHANTERELLE_BOAT_ID);
    //BLUE CHANTERELLE
    public static final Identifier BLUE_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_chanterelle_boat");
    public static final Identifier BLUE_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_CHANTERELLE_BOAT_ID);
    //BROWN CHANTERELLE
    public static final Identifier BROWN_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_chanterelle_boat");
    public static final Identifier BROWN_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_CHANTERELLE_BOAT_ID);
    //CYAN CHANTERELLE
    public static final Identifier CYAN_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_chanterelle_boat");
    public static final Identifier CYAN_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_CHANTERELLE_BOAT_ID);
    //GRAY CHANTERELLE
    public static final Identifier GRAY_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_chanterelle_boat");
    public static final Identifier GRAY_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_CHANTERELLE_BOAT_ID);
    //GREEN CHANTERELLE
    public static final Identifier GREEN_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_chanterelle_boat");
    public static final Identifier GREEN_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_CHANTERELLE_BOAT_ID);
    //LIGHT BLUE CHANTERELLE
    public static final Identifier LIGHT_BLUE_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_chanterelle_boat");
    public static final Identifier LIGHT_BLUE_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_CHANTERELLE_BOAT_ID);
    //LIGHT GRAY CHANTERELLE
    public static final Identifier LIGHT_GRAY_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_chanterelle_boat");
    public static final Identifier LIGHT_GRAY_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_CHANTERELLE_BOAT_ID);
    //LIME CHANTERELLE
    public static final Identifier LIME_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_chanterelle_boat");
    public static final Identifier LIME_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_CHANTERELLE_BOAT_ID);
    //MAGENTA CHANTERELLE
    public static final Identifier MAGENTA_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_chanterelle_boat");
    public static final Identifier MAGENTA_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_CHANTERELLE_BOAT_ID);
    //ORANGE CHANTERELLE
    public static final Identifier ORANGE_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_chanterelle_boat");
    public static final Identifier ORANGE_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_CHANTERELLE_BOAT_ID);
    //PINK CHANTERELLE
    public static final Identifier PINK_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_chanterelle_boat");
    public static final Identifier PINK_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_CHANTERELLE_BOAT_ID);
    //PURPLE CHANTERELLE
    public static final Identifier PURPLE_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_chanterelle_boat");
    public static final Identifier PURPLE_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_CHANTERELLE_BOAT_ID);
    //RED CHANTERELLE
    public static final Identifier RED_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_chanterelle_boat");
    public static final Identifier RED_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_CHANTERELLE_BOAT_ID);
    //WHITE CHANTERELLE
    public static final Identifier WHITE_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_chanterelle_boat");
    public static final Identifier WHITE_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_CHANTERELLE_BOAT_ID);
    //YELLOW CHANTERELLE
    public static final Identifier YELLOW_CHANTERELLE_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_chanterelle_boat");
    public static final Identifier YELLOW_CHANTERELLE_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_chanterelle_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_CHANTERELLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_CHANTERELLE_BOAT_ID);
    //DYED ENOKI
    public static final Identifier BLACK_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_enoki_boat");
    public static final Identifier BLACK_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_ENOKI_BOAT_ID);
    //BLUE ENOKI
    public static final Identifier BLUE_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_enoki_boat");
    public static final Identifier BLUE_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_ENOKI_BOAT_ID);
    //BROWN ENOKI
    public static final Identifier BROWN_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_enoki_boat");
    public static final Identifier BROWN_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_ENOKI_BOAT_ID);
    //CYAN ENOKI
    public static final Identifier CYAN_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_enoki_boat");
    public static final Identifier CYAN_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_ENOKI_BOAT_ID);
    //GRAY ENOKI
    public static final Identifier GRAY_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_enoki_boat");
    public static final Identifier GRAY_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_ENOKI_BOAT_ID);
    //GREEN ENOKI
    public static final Identifier GREEN_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_enoki_boat");
    public static final Identifier GREEN_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_ENOKI_BOAT_ID);
    //LIGHT BLUE ENOKI
    public static final Identifier LIGHT_BLUE_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_enoki_boat");
    public static final Identifier LIGHT_BLUE_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_ENOKI_BOAT_ID);
    //LIGHT GRAY ENOKI
    public static final Identifier LIGHT_GRAY_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_enoki_boat");
    public static final Identifier LIGHT_GRAY_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_ENOKI_BOAT_ID);
    //LIME ENOKI
    public static final Identifier LIME_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_enoki_boat");
    public static final Identifier LIME_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_ENOKI_BOAT_ID);
    //MAGENTA ENOKI
    public static final Identifier MAGENTA_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_enoki_boat");
    public static final Identifier MAGENTA_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_ENOKI_BOAT_ID);
    //ORANGE ENOKI
    public static final Identifier ORANGE_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_enoki_boat");
    public static final Identifier ORANGE_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_ENOKI_BOAT_ID);
    //PINK ENOKI
    public static final Identifier PINK_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_enoki_boat");
    public static final Identifier PINK_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_ENOKI_BOAT_ID);
    //PURPLE ENOKI
    public static final Identifier PURPLE_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_enoki_boat");
    public static final Identifier PURPLE_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_ENOKI_BOAT_ID);
    //RED ENOKI
    public static final Identifier RED_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_enoki_boat");
    public static final Identifier RED_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_ENOKI_BOAT_ID);
    //WHITE ENOKI
    public static final Identifier WHITE_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_enoki_boat");
    public static final Identifier WHITE_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_ENOKI_BOAT_ID);
    //YELLOW ENOKI
    public static final Identifier YELLOW_ENOKI_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_enoki_boat");
    public static final Identifier YELLOW_ENOKI_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_enoki_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_ENOKI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_ENOKI_BOAT_ID);
    //DYED WARPED
    public static final Identifier BLACK_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_warped_boat");
    public static final Identifier BLACK_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_WARPED_BOAT_ID);
    //BLUE WARPED
    public static final Identifier BLUE_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_warped_boat");
    public static final Identifier BLUE_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_WARPED_BOAT_ID);
    //BROWN WARPED
    public static final Identifier BROWN_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_warped_boat");
    public static final Identifier BROWN_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_WARPED_BOAT_ID);
    //CYAN WARPED
    public static final Identifier CYAN_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_warped_boat");
    public static final Identifier CYAN_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_WARPED_BOAT_ID);
    //GRAY WARPED
    public static final Identifier GRAY_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_warped_boat");
    public static final Identifier GRAY_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_WARPED_BOAT_ID);
    //GREEN WARPED
    public static final Identifier GREEN_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_warped_boat");
    public static final Identifier GREEN_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_WARPED_BOAT_ID);
    //LIGHT BLUE WARPED
    public static final Identifier LIGHT_BLUE_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_warped_boat");
    public static final Identifier LIGHT_BLUE_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_WARPED_BOAT_ID);
    //LIGHT GRAY WARPED
    public static final Identifier LIGHT_GRAY_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_warped_boat");
    public static final Identifier LIGHT_GRAY_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_WARPED_BOAT_ID);
    //LIME WARPED
    public static final Identifier LIME_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_warped_boat");
    public static final Identifier LIME_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_WARPED_BOAT_ID);
    //MAGENTA WARPED
    public static final Identifier MAGENTA_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_warped_boat");
    public static final Identifier MAGENTA_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_WARPED_BOAT_ID);
    //ORANGE WARPED
    public static final Identifier ORANGE_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_warped_boat");
    public static final Identifier ORANGE_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_WARPED_BOAT_ID);
    //PINK WARPED
    public static final Identifier PINK_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_warped_boat");
    public static final Identifier PINK_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_WARPED_BOAT_ID);
    //PURPLE WARPED
    public static final Identifier PURPLE_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_warped_boat");
    public static final Identifier PURPLE_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_WARPED_BOAT_ID);
    //RED WARPED
    public static final Identifier RED_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_warped_boat");
    public static final Identifier RED_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_WARPED_BOAT_ID);
    //WHITE WARPED
    public static final Identifier WHITE_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_warped_boat");
    public static final Identifier WHITE_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_WARPED_BOAT_ID);
    //YELLOW WARPED
    public static final Identifier YELLOW_WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_warped_boat");
    public static final Identifier YELLOW_WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_WARPED_BOAT_ID);
    //DYED CRIMSON
    public static final Identifier BLACK_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_crimson_boat");
    public static final Identifier BLACK_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "black_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLACK_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLACK_CRIMSON_BOAT_ID);
    //BLUE CRIMSON
    public static final Identifier BLUE_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_crimson_boat");
    public static final Identifier BLUE_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "blue_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> BLUE_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_CRIMSON_BOAT_ID);
    //BROWN CRIMSON
    public static final Identifier BROWN_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_crimson_boat");
    public static final Identifier BROWN_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "brown_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> BROWN_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BROWN_CRIMSON_BOAT_ID);
    //CYAN CRIMSON
    public static final Identifier CYAN_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_crimson_boat");
    public static final Identifier CYAN_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "cyan_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> CYAN_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CYAN_CRIMSON_BOAT_ID);
    //GRAY CRIMSON
    public static final Identifier GRAY_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_crimson_boat");
    public static final Identifier GRAY_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "gray_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> GRAY_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_CRIMSON_BOAT_ID);
    //GREEN CRIMSON
    public static final Identifier GREEN_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_crimson_boat");
    public static final Identifier GREEN_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "green_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> GREEN_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GREEN_CRIMSON_BOAT_ID);
    //LIGHT BLUE CRIMSON
    public static final Identifier LIGHT_BLUE_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_crimson_boat");
    public static final Identifier LIGHT_BLUE_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_blue_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_BLUE_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_BLUE_CRIMSON_BOAT_ID);
    //LIGHT GRAY CRIMSON
    public static final Identifier LIGHT_GRAY_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_crimson_boat");
    public static final Identifier LIGHT_GRAY_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "light_gray_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIGHT_GRAY_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIGHT_GRAY_CRIMSON_BOAT_ID);
    //LIME CRIMSON
    public static final Identifier LIME_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_crimson_boat");
    public static final Identifier LIME_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "lime_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> LIME_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LIME_CRIMSON_BOAT_ID);
    //MAGENTA CRIMSON
    public static final Identifier MAGENTA_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_crimson_boat");
    public static final Identifier MAGENTA_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "magenta_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> MAGENTA_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAGENTA_CRIMSON_BOAT_ID);
    //ORANGE CRIMSON
    public static final Identifier ORANGE_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_crimson_boat");
    public static final Identifier ORANGE_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "orange_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> ORANGE_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ORANGE_CRIMSON_BOAT_ID);
    //PINK CRIMSON
    public static final Identifier PINK_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_crimson_boat");
    public static final Identifier PINK_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "pink_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> PINK_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINK_CRIMSON_BOAT_ID);
    //PURPLE CRIMSON
    public static final Identifier PURPLE_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_crimson_boat");
    public static final Identifier PURPLE_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "purple_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> PURPLE_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PURPLE_CRIMSON_BOAT_ID);
    //RED CRIMSON
    public static final Identifier RED_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_crimson_boat");
    public static final Identifier RED_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "red_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> RED_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_CRIMSON_BOAT_ID);
    //WHITE CRIMSON
    public static final Identifier WHITE_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_crimson_boat");
    public static final Identifier WHITE_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "white_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> WHITE_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WHITE_CRIMSON_BOAT_ID);
    //YELLOW CRIMSON
    public static final Identifier YELLOW_CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_crimson_boat");
    public static final Identifier YELLOW_CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "yellow_crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> YELLOW_CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOW_CRIMSON_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType hollyBoat = new TerraformBoatType.Builder()    .item(ModItems.HOLLY_BOAT)    .chestItem(ModItems.HOLLY_CHEST_BOAT)    .planks(ModBlocks.HOLLY_PLANKS.asItem())    .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, HOLLY_BOAT_KEY, hollyBoat);

        TerraformBoatType chanterelleBoat = new TerraformBoatType.Builder()    .item(ModItems.CHANTERELLE_BOAT)    .chestItem(ModItems.CHANTERELLE_CHEST_BOAT)    .planks(ModBlocks.CHANTERELLE_PLANKS.asItem())    .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CHANTERELLE_BOAT_KEY, chanterelleBoat);
        TerraformBoatType enokiBoat = new TerraformBoatType.Builder()    .item(ModItems.ENOKI_BOAT)    .chestItem(ModItems.ENOKI_CHEST_BOAT)    .planks(ModBlocks.ENOKI_PLANKS.asItem())    .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ENOKI_BOAT_KEY, enokiBoat);

        TerraformBoatType warpedBoat = new TerraformBoatType.Builder()    .item(ModItems.WARPED_BOAT)    .chestItem(ModItems.WARPED_CHEST_BOAT)    .planks(Blocks.WARPED_PLANKS.asItem())    .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WARPED_BOAT_KEY, warpedBoat);

        TerraformBoatType crimsonBoat = new TerraformBoatType.Builder()    .item(ModItems.CRIMSON_BOAT)    .chestItem(ModItems.CRIMSON_CHEST_BOAT)    .planks(Blocks.CRIMSON_PLANKS.asItem())    .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CRIMSON_BOAT_KEY, crimsonBoat);


        }
        }
