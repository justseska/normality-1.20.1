package net.seska.normality.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;

public class BlockSet {
    private final Block planks;
    private final Block slab;
    private final Block stairs;
    private final Block fence;
    private final Block fence_gate;
    private final Block pressure_plate;
    private final Block door;
    private final Block trapdoor;
    private final Block button;
    public final DyeColor color;
    public final Wood wood;
    public BlockSet(Wood wood, DyeColor color) {
        this.color = color;
        this.wood= wood;
        this.planks = register("_planks", new Block(AbstractBlock.Settings.create()));
        this.slab = register("_slab", new SlabBlock(AbstractBlock.Settings.create()));
        this.stairs = register("_stairs", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create()));
        this.fence = register("_fence", new FenceBlock(AbstractBlock.Settings.create()));
        this.fence_gate = register("_fence_gate", new FenceGateBlock(AbstractBlock.Settings.create(), WoodType.OAK));
        this.pressure_plate = register("_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create(), BlockSetType.OAK));
        this.door = register("_door", new DoorBlock(AbstractBlock.Settings.create(), BlockSetType.OAK));
        this.trapdoor = register("_trapdoor", new TrapdoorBlock(AbstractBlock.Settings.create(), BlockSetType.OAK));
        this.button = register("_button", new ButtonBlock(AbstractBlock.Settings.create(), BlockSetType.OAK, 10, true));
    }
    public Block register(String string, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier("normality", color.asString() + wood.getName() + string), block);
    }
}
