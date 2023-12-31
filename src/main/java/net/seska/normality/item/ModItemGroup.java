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
                        entries.add(ModBlocks.POLISHED_CALCITE);
                        entries.add(ModBlocks.POLISHED_CALCITE_STAIRS);
                        entries.add(ModBlocks.POLISHED_CALCITE_SLAB);
                        entries.add(ModBlocks.POLISHED_CALCITE_WALL);
                        entries.add(ModBlocks.CALCITE_BRICKS);
                        entries.add(ModBlocks.CALCITE_BRICK_STAIRS);
                        entries.add(ModBlocks.CALCITE_BRICK_SLAB);
                        entries.add(ModBlocks.CALCITE_BRICK_WALL);
                        entries.add(ModBlocks.CHISELED_CALCITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);
                        entries.add(ModBlocks.CHISELED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.DIORITE_BRICK_WALL);
                        entries.add(ModBlocks.CHISELED_DIORITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.GRANITE_BRICK_WALL);
                        entries.add(ModBlocks.CHISELED_GRANITE_BRICKS);
                        entries.add(ModItems.CRIMSON_BOAT);
                        entries.add(ModItems.CRIMSON_CHEST_BOAT);
                        entries.add(ModItems.WARPED_BOAT);
                        entries.add(ModItems.WARPED_CHEST_BOAT);
                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);
                        entries.add(ModItems.GINGER_ROOT);
                        entries.add(ModItems.GINGERBREAD_COOKIE);
                        entries.add(ModItems.FROSTED_GINGERBREAD_COOKIE);
                        entries.add(ModBlocks.GINGERBREAD_BLOCK);
                        entries.add(ModBlocks.GINGERBREAD_STAIRS);
                        entries.add(ModBlocks.GINGERBREAD_SLAB);
                        entries.add(ModBlocks.SMOOTH_GINGERBREAD_BLOCK);
                        entries.add(ModBlocks.SMOOTH_GINGERBREAD_STAIRS);
                        entries.add(ModBlocks.SMOOTH_GINGERBREAD_SLAB);
                        entries.add(ModBlocks.FROSTED_GINGERBREAD_BLOCK);
                        entries.add(ModBlocks.FROSTED_SMOOTH_GINGERBREAD_BLOCK);
                        entries.add(ModBlocks.GINGERBREAD_DOOR);
                        entries.add(ModBlocks.GINGERBREAD_TRAPDOOR);
                        entries.add(ModItems.SUGAR_COOKIE);
                        entries.add(ModItems.SUGAR_BOTTLE);
                        entries.add(ModItems.MOLASSES_BOTTLE);
                        entries.add(ModItems.CRYSTALLIZED_HONEY);
                        entries.add(ModBlocks.CRYSTALLIZED_HONEY_BLOCK);
                        entries.add(ModBlocks.HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.HONEYCOMB_BRICK_STAIRS);
                        entries.add(ModBlocks.HONEYCOMB_BRICK_SLAB);
                        entries.add(ModBlocks.HONEYCOMB_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
                        entries.add(ModItems.CONDENSED_AMETHYST);
                        entries.add(ModBlocks.POLISHED_AMETHYST_BLOCK);
                        entries.add(ModBlocks.AMETHYST_BRICKS);
                        entries.add(ModBlocks.AMETHYST_BRICK_STAIRS);
                        entries.add(ModBlocks.AMETHYST_BRICK_SLAB);
                        entries.add(ModBlocks.AMETHYST_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_AMETHYST_BRICKS);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.RUBY_HORSE_ARMOR);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.WROUGHT_IRON_INGOT);
                        entries.add(ModBlocks.WROUGHT_IRON_BLOCK);
                        entries.add(ModBlocks.WROUGHT_IRON_WALL);
                        entries.add(ModBlocks.WROUGHT_IRON_STAIRS);
                        entries.add(ModBlocks.WROUGHT_IRON_SLAB);
                        entries.add(ModBlocks.WROUGHT_IRON_BUTTON);
                        entries.add(ModBlocks.WROUGHT_IRON_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_BLOCK);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_WALL);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_STAIRS);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_SLAB);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_BUTTON);
                        entries.add(ModBlocks.SMOOTH_WROUGHT_IRON_PRESSURE_PLATE);
                        entries.add(ModBlocks.WROUGHT_IRON_BARS);
                        entries.add(ModBlocks.WROUGHT_IRON_DOOR);
                        entries.add(ModBlocks.WROUGHT_IRON_TRAPDOOR);
                        entries.add(ModBlocks.HOLLY_SAPLING);
                        entries.add(ModBlocks.HOLLY_LEAVES);
                        entries.add(ModBlocks.HOLLY_BERRY_LEAVES);
                        entries.add(ModItems.HOLLY_BERRIES);
                        entries.add(ModBlocks.HOLLY_LOG);
                        entries.add(ModBlocks.HOLLY_WOOD);
                        entries.add(ModBlocks.STRIPPED_HOLLY_LOG);
                        entries.add(ModBlocks.STRIPPED_HOLLY_WOOD);
                        entries.add(ModBlocks.HOLLY_PLANKS);
                        entries.add(ModBlocks.HOLLY_STAIRS);
                        entries.add(ModBlocks.HOLLY_SLAB);
                        entries.add(ModBlocks.HOLLY_FENCE);
                        entries.add(ModBlocks.HOLLY_FENCE_GATE);
                        entries.add(ModBlocks.HOLLY_BUTTON);
                        entries.add(ModBlocks.HOLLY_PRESSURE_PLATE);
                        entries.add(ModBlocks.HOLLY_DOOR);
                        entries.add(ModBlocks.HOLLY_TRAPDOOR);
                        entries.add(ModItems.HOLLY_WOOD_SIGN);
                        entries.add(ModItems.HOLLY_WOOD_HANGING_SIGN);
                        entries.add(ModItems.HOLLY_BOAT);
                        entries.add(ModItems.HOLLY_CHEST_BOAT);
                        entries.add(ModBlocks.YELLOW_PLUMERIA);
                        entries.add(ModBlocks.RED_PLUMERIA);
                        entries.add(ModBlocks.BLUE_PLUMERIA);
                        entries.add(ModBlocks.WHITE_PLUMERIA);
                        entries.add(ModBlocks.ROSE);
                        entries.add(ModBlocks.CYAN_ROSE);
                        entries.add(ModItems.BLACK_CANDY_CANE);
                        entries.add(ModBlocks.BLACK_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.BLACK_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.BLACK_CANDY_CANE_SLAB);
                        entries.add(ModItems.BLUE_CANDY_CANE);
                        entries.add(ModBlocks.BLUE_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.BLUE_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.BLUE_CANDY_CANE_SLAB);
                        entries.add(ModItems.BROWN_CANDY_CANE);
                        entries.add(ModBlocks.BROWN_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.BROWN_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.BROWN_CANDY_CANE_SLAB);
                        entries.add(ModItems.CYAN_CANDY_CANE);
                        entries.add(ModBlocks.CYAN_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.CYAN_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.CYAN_CANDY_CANE_SLAB);
                        entries.add(ModItems.GRAY_CANDY_CANE);
                        entries.add(ModBlocks.GRAY_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.GRAY_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.GRAY_CANDY_CANE_SLAB);
                        entries.add(ModItems.GREEN_CANDY_CANE);
                        entries.add(ModBlocks.GREEN_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.GREEN_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.GREEN_CANDY_CANE_SLAB);
                        entries.add(ModItems.LIGHT_GRAY_CANDY_CANE);
                        entries.add(ModBlocks.LIGHT_GRAY_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.LIGHT_GRAY_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CANDY_CANE_SLAB);
                        entries.add(ModItems.LIGHT_BLUE_CANDY_CANE);
                        entries.add(ModBlocks.LIGHT_BLUE_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CANDY_CANE_SLAB);
                        entries.add(ModItems.LIME_CANDY_CANE);
                        entries.add(ModBlocks.LIME_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.LIME_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.LIME_CANDY_CANE_SLAB);
                        entries.add(ModItems.MAGENTA_CANDY_CANE);
                        entries.add(ModBlocks.MAGENTA_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.MAGENTA_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CANDY_CANE_SLAB);
                        entries.add(ModItems.ORANGE_CANDY_CANE);
                        entries.add(ModBlocks.ORANGE_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.ORANGE_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CANDY_CANE_SLAB);
                        entries.add(ModItems.PINK_CANDY_CANE);
                        entries.add(ModBlocks.PINK_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.PINK_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.PINK_CANDY_CANE_SLAB);
                        entries.add(ModItems.PURPLE_CANDY_CANE);
                        entries.add(ModBlocks.PURPLE_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.PURPLE_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CANDY_CANE_SLAB);
                        entries.add(ModItems.RED_CANDY_CANE);
                        entries.add(ModBlocks.RED_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.RED_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.RED_CANDY_CANE_SLAB);
                        entries.add(ModItems.WHITE_CANDY_CANE);
                        entries.add(ModBlocks.WHITE_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.WHITE_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.WHITE_CANDY_CANE_SLAB);
                        entries.add(ModItems.YELLOW_CANDY_CANE);
                        entries.add(ModBlocks.YELLOW_CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.YELLOW_CANDY_CANE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CANDY_CANE_SLAB);
                        entries.add(ModBlocks.RED_LIGHTS);
                        entries.add(ModBlocks.BLUE_LIGHTS);
                        entries.add(ModBlocks.GREEN_LIGHTS);
                        entries.add(ModBlocks.ORANGE_LIGHTS);

                    }).build());
    public static void registerItemGroups() {

    }
}
