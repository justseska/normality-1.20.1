package net.seska.normality.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup HONEYCOMB_BRICKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NormalityMod.MOD_ID, "honeycomb_bricks_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.honeycomb_bricks_group"))
                    .icon(() -> new ItemStack(ModItems.CRYSTALLIZED_HONEY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRYSTALLIZED_HONEY);
                        entries.add(ModBlocks.CRYSTALLIZED_HONEY_BLOCK);
                        entries.add(ModBlocks.HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
                        entries.add(ModItems.CONDENSED_AMETHYST);
                        entries.add(ModBlocks.POLISHED_AMETHYST_BLOCK);
                        entries.add(ModBlocks.AMETHYST_BRICKS);
                        entries.add(ModBlocks.CRACKED_AMETHYST_BRICKS);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.WEB_LEAD);
                        entries.add(ModItems.BLACK_CANDY_CANE);
                        entries.add(ModItems.BLUE_CANDY_CANE);
                        entries.add(ModItems.BROWN_CANDY_CANE);
                        entries.add(ModItems.CYAN_CANDY_CANE);
                        entries.add(ModItems.GRAY_CANDY_CANE);
                        entries.add(ModItems.GREEN_CANDY_CANE);
                        entries.add(ModItems.LIGHT_GRAY_CANDY_CANE);
                        entries.add(ModItems.LIGHT_BLUE_CANDY_CANE);
                        entries.add(ModItems.LIME_CANDY_CANE);
                        entries.add(ModItems.MAGENTA_CANDY_CANE);
                        entries.add(ModItems.ORANGE_CANDY_CANE);
                        entries.add(ModItems.PINK_CANDY_CANE);
                        entries.add(ModItems.PURPLE_CANDY_CANE);
                        entries.add(ModItems.RED_CANDY_CANE);
                        entries.add(ModItems.WHITE_CANDY_CANE);
                        entries.add(ModItems.YELLOW_CANDY_CANE);
                    }).build());
    public static void registerItemGroups() {

    }
}
