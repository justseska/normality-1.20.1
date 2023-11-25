package net.seska.normality.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.ModBlocks;
import java.util.List;
import net.minecraft.block.BlockState;
import net.minecraft.entity.decoration.LeashKnotEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;


public class ModItems {

    //INGREDIENTS
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey",
            new Item(new FabricItemSettings()));
    public static final Item CONDENSED_AMETHYST = registerItem("condensed_amethyst",
            new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item WEB_LEAD = registerItem("web_lead",
            new LeadItem(new FabricItemSettings()));
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(CRYSTALLIZED_HONEY);
        entries.add(CONDENSED_AMETHYST);
        entries.add(RUBY);
        entries.add(WEB_LEAD);

        entries.add(ModBlocks.HONEYCOMB_BRICKS);
        entries.add(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
        entries.add(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
        entries.add(ModBlocks.RUBY_ORE);
        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
        entries.add(ModBlocks.RUBY_BLOCK);
    }
    //WEAPONS
    //TOOLS
    //STONES
    //WOODS
    //FOODS
    //MISC BLOCKS

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NormalityMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        NormalityMod.LOGGER.info("Registering Mod Items for" + NormalityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
