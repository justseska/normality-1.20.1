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
    public static final Item BLACK_CANDY_CANE = registerItem("black_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_CANDY_CANE = registerItem("blue_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item BROWN_CANDY_CANE = registerItem("brown_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item CYAN_CANDY_CANE = registerItem("cyan_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item GRAY_CANDY_CANE = registerItem("gray_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item GREEN_CANDY_CANE = registerItem("green_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_CANDY_CANE = registerItem("light_gray_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_CANDY_CANE = registerItem("light_blue_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item LIME_CANDY_CANE = registerItem("lime_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item MAGENTA_CANDY_CANE = registerItem("magenta_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item ORANGE_CANDY_CANE = registerItem("orange_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item PINK_CANDY_CANE = registerItem("pink_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item PURPLE_CANDY_CANE = registerItem("purple_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item RED_CANDY_CANE = registerItem("red_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item WHITE_CANDY_CANE = registerItem("white_candy_cane",
            new Item(new FabricItemSettings()));
    public static final Item YELLOW_CANDY_CANE = registerItem("yellow_candy_cane",
            new Item(new FabricItemSettings()));
    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(CRYSTALLIZED_HONEY);
        entries.add(CONDENSED_AMETHYST);
        entries.add(RUBY);
        entries.add(WEB_LEAD);
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
