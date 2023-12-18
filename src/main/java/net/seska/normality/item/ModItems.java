package net.seska.normality.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
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
import net.seska.normality.entity.ModBoats;
import net.seska.normality.item.custom.ModArmorItem;


public class ModItems {

    //INGREDIENTS
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey",
            new Item(new FabricItemSettings()));
    public static final Item CONDENSED_AMETHYST = registerItem("condensed_amethyst",
            new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    //TOOLS
    public static final Item WEB_LEAD = registerItem("web_lead",
            new LeadItem(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, -1.0f, new FabricItemSettings()));


    //ARMOR
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor",
            new HorseArmorItem(5, "ruby", new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new HorseArmorItem(15, "netherite", new FabricItemSettings().maxCount(1)));

    //FOOD
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
    public static final Item GINGER_ROOT = registerItem("ginger_root",
            new AliasedBlockItem(ModBlocks.GINGER_CROP, new FabricItemSettings()));
    public static final Item GINGERBREAD_COOKIE = registerItem("gingerbread_cookie",
            new Item(new FabricItemSettings()));
    public static final Item FROSTED_GINGERBREAD_COOKIE = registerItem("frosted_gingerbread_cookie",
            new Item(new FabricItemSettings()));
    public static final Item SUGAR_BOTTLE = registerItem("sugar_bottle",
            new Item(new FabricItemSettings()));
    public static final Item MOLASSES_BOTTLE = registerItem("molasses_bottle",
            new Item(new FabricItemSettings()));
    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie",
            new Item(new FabricItemSettings()));
    public static final Item HOLLY_BERRIES = registerItem("holly_berries",
            new Item(new FabricItemSettings()));
    public static final Item WROUGHT_IRON_INGOT = registerItem("wrought_iron_ingot",
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
    public static final Item HOLLY_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.HOLLY_BOAT_ID, ModBoats.HOLLY_BOAT_KEY, false);
    public static final Item HOLLY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.HOLLY_CHEST_BOAT_ID, ModBoats.HOLLY_BOAT_KEY, true);
    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WARPED_BOAT_ID, ModBoats.WARPED_BOAT_KEY, false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WARPED_CHEST_BOAT_ID, ModBoats.WARPED_BOAT_KEY, true);
    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CRIMSON_BOAT_ID, ModBoats.CRIMSON_BOAT_KEY, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CRIMSON_CHEST_BOAT_ID, ModBoats.CRIMSON_BOAT_KEY, true);
    public static final Item HOLLY_WOOD_SIGN = registerItem("holly_wood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.HOLLY_WOOD_SIGN, ModBlocks.HOLLY_WOOD_WALL_SIGN));
    public static final Item HOLLY_WOOD_HANGING_SIGN = registerItem("holly_wood_hanging_sign",
            new HangingSignItem(ModBlocks.HOLLY_WOOD_HANGING_SIGN, ModBlocks.HOLLY_WOOD_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NormalityMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        NormalityMod.LOGGER.info("Registering Mod Items for" + NormalityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
