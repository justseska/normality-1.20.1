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
    public static final Identifier WARPED_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "warped_boat");
    public static final Identifier WARPED_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "warped_chest_boat");
    public static final RegistryKey<TerraformBoatType> WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WARPED_BOAT_ID);
    public static final Identifier CRIMSON_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "crimson_boat");
    public static final Identifier CRIMSON_CHEST_BOAT_ID = new Identifier(NormalityMod.MOD_ID, "crimson_chest_boat");
    public static final RegistryKey<TerraformBoatType> CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CRIMSON_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType hollyBoat = new TerraformBoatType.Builder()
                .item(ModItems.HOLLY_BOAT)
                .chestItem(ModItems.HOLLY_CHEST_BOAT)
                .planks(ModBlocks.HOLLY_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, HOLLY_BOAT_KEY, hollyBoat);

        TerraformBoatType warpedBoat = new TerraformBoatType.Builder()
                .item(ModItems.WARPED_BOAT)
                .chestItem(ModItems.WARPED_CHEST_BOAT)
                .planks(Blocks.WARPED_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WARPED_BOAT_KEY, warpedBoat);

        TerraformBoatType crimsonBoat = new TerraformBoatType.Builder()
                .item(ModItems.CRIMSON_BOAT)
                .chestItem(ModItems.CRIMSON_CHEST_BOAT)
                .planks(Blocks.CRIMSON_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CRIMSON_BOAT_KEY, crimsonBoat);
        }
        }
