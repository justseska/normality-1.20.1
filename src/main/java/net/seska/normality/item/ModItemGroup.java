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
                        entries.add(ModBlocks.HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
                        entries.add(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
                        entries.add(ModItems.CONDENSED_AMETHYST);
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModItems.WEB_LEAD);
                    }).build());
    public static void registerItemGroups() {

    }
}
