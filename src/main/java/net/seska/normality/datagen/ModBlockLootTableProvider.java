package net.seska.normality.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.seska.normality.block.ModBlocks;
import net.seska.normality.item.ModItems;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.POLISHED_AMETHYST_BLOCK);
        addDrop(ModBlocks.AMETHYST_BRICKS);
        addDrop(ModBlocks.CRACKED_AMETHYST_BRICKS);
        addDrop(ModBlocks.HONEYCOMB_BRICKS);
        addDrop(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
        addDrop(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
        addDrop(ModBlocks.CRYSTALLIZED_HONEY_BLOCK);
    }
}
