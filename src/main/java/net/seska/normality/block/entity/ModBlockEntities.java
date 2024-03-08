package net.seska.normality.block.entity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.seska.normality.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<ModSignBlockEntity> MOD_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier(NormalityMod.MOD_ID, "mod_sign_entity"),FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new,
            ModBlocks.HOLLY_WOOD_SIGN, ModBlocks.HOLLY_WOOD_WALL_SIGN, ModBlocks.CHANTERELLE_SIGN, ModBlocks.CHANTERELLE_WALL_SIGN, ModBlocks.ENOKI_SIGN, ModBlocks.ENOKI_WALL_SIGN).build());
    public static final BlockEntityType<ModHangingSignBlockEntity> MOD_HANGING_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier(NormalityMod.MOD_ID, "mod_hanging_sign_entity"),FabricBlockEntityTypeBuilder.create(ModHangingSignBlockEntity::new,
            ModBlocks.HOLLY_WOOD_HANGING_SIGN, ModBlocks.HOLLY_WOOD_HANGING_WALL_SIGN, ModBlocks.CHANTERELLE_HANGING_SIGN, ModBlocks.CHANTERELLE_HANGING_WALL_SIGN, ModBlocks.ENOKI_HANGING_SIGN, ModBlocks.ENOKI_HANGING_WALL_SIGN).build(null));

    public static void registerBlockEntities() {
        NormalityMod.LOGGER.info("Registering Block Entities for " + NormalityMod.MOD_ID);
}
}
