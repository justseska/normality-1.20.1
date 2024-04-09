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
import net.seska.normality.entity.ModBoats;
import net.seska.normality.entity.ModEntities;
import net.seska.normality.item.custom.ModArmorItem;
import net.seska.normality.item.custom.SapphireFishingRodItem;
import net.seska.normality.item.custom.WebLeadItem;


public class ModItems {

    //INGREDIENTS
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey",new Item(new FabricItemSettings()));
    public static final Item CONDENSED_AMETHYST = registerItem("condensed_amethyst",new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire",new Item(new FabricItemSettings()));
    public static final Item CHOIR_SPRITE_WING = registerItem("choir_sprite_wing",new Item(new FabricItemSettings()));
    public static final Item ROSE_FUZZ = registerItem("rose_fuzz",new Item(new FabricItemSettings()));
    public static final Item ULTRAMARINE_FUZZ = registerItem("ultramarine_fuzz",new Item(new FabricItemSettings()));
    public static final Item CHARTREUSE_FUZZ = registerItem("chartreuse_fuzz",new Item(new FabricItemSettings()));
    public static final Item SPRING_GREEN_FUZZ = registerItem("spring_green_fuzz",new Item(new FabricItemSettings()));
    public static final Item VIOLET_FUZZ = registerItem("violet_fuzz",new Item(new FabricItemSettings()));
    public static final Item CAPRI_FUZZ = registerItem("capri_fuzz",new Item(new FabricItemSettings()));
    public static final Item PRIMROSE_FUZZ = registerItem("primrose_fuzz",new Item(new FabricItemSettings()));
    public static final Item CURDLED_MILK = registerItem("curdled_milk", new MilkBucketItem(new FabricItemSettings()));
    public static final Item CHEESE_CLOTH = registerItem("cheese_cloth", new Item(new FabricItemSettings()));
    public static final Item CHEESE_CURDS = registerItem("cheese_curds", new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings()));
    //TOOLS
    public static final Item WEB_LEAD = registerItem("web_lead",new WebLeadItem(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",new PickaxeItem(ModToolMaterial.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",new AxeItem(ModToolMaterial.RUBY, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",new HoeItem(ModToolMaterial.RUBY, 0, -1.0f, new FabricItemSettings()));
    public static final Item CHOIR_SPRITE_SPAWN_EGG = registerItem("choir_sprite_spawn_egg",new SpawnEggItem(ModEntities.CHOIR_SPRITE, 16635361, 7516657, new FabricItemSettings()));
    public static final Item MOUSE_SPAWN_EGG = registerItem("mouse_spawn_egg",new SpawnEggItem(ModEntities.MOUSE, 11435562, 7100230, new FabricItemSettings()));
    //KNIVES
    //KATANA
    //RAPIER
    //SABER
    //SCYTHE



    //ARMOR
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUBY_HORSE_ARMOR = registerItem("ruby_horse_armor",new HorseArmorItem(5, "ruby", new FabricItemSettings().maxCount(1)));
    public static final Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",new HorseArmorItem(15, "netherite", new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_TURTLE_SHELL = registerItem("sapphire_turtle_shell",new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_FISHING_ROD = registerItem("sapphire_fishing_rod", new SapphireFishingRodItem(new Item.Settings().maxDamage(256)));
    public static final Item SAPPHIRE_BOW = registerItem("sapphire_bow",new BowItem(new FabricItemSettings().maxDamage(512)));
    //JADE
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item FROSTED_JADE = registerItem("frosted_jade", new Item(new FabricItemSettings()));
    public static final Item JADE_EMBLEM = registerItem("jade_emblem", new Item(new FabricItemSettings()));
    public static final Item JADE_ROD = registerItem("jade_rod", new Item(new FabricItemSettings()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",new ModArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item JADE_HAWKBRAND_BLADE = registerItem("jade_hawkbrand_blade", new Item(new FabricItemSettings()));
    public static final Item JADE_KATANA_BLADE = registerItem("jade_katana_blade", new Item(new FabricItemSettings()));
    public static final Item JADE_SWIFT_BLADE = registerItem("jade_swift_blade", new Item(new FabricItemSettings()));
    public static final Item JADE_BEGINNING_BLADE = registerItem("jade_beginning_blade", new Item(new FabricItemSettings()));
    public static final Item JADE_DAGGER_BLADE = registerItem("jade_dagger_blade", new Item(new FabricItemSettings()));
    public static final Item JADE_HAWKBRAND_HANDLE = registerItem("jade_hawkbrand_handle", new Item(new FabricItemSettings()));
    public static final Item JADE_KATANA_HANDLE = registerItem("jade_katana_handle", new Item(new FabricItemSettings()));
    public static final Item JADE_SWIFT_HANDLE = registerItem("jade_swift_handle", new Item(new FabricItemSettings()));
    public static final Item JADE_BEGINNING_HANDLE = registerItem("jade_beginning_handle", new Item(new FabricItemSettings()));
    public static final Item JADE_DAGGER_HANDLE = registerItem("jade_dagger_handle", new Item(new FabricItemSettings()));
    public static final Item JADE_HAWKBRAND = registerItem("jade_hawkbrand",new SwordItem(ModToolMaterial.JADE, 4, -2.4f, new FabricItemSettings()));
    public static final Item JADE_KATANA = registerItem("jade_katana",new SwordItem(ModToolMaterial.JADE, 4, -2.4f, new FabricItemSettings()));
    public static final Item JADE_SWIFT = registerItem("jade_swift",new SwordItem(ModToolMaterial.JADE, 4, -2.4f, new FabricItemSettings()));
    public static final Item JADE_BEGINNING = registerItem("jade_beginning",new SwordItem(ModToolMaterial.JADE, 4, -2.4f, new FabricItemSettings()));
    public static final Item JADE_DAGGER = registerItem("jade_dagger",new SwordItem(ModToolMaterial.JADE, 4, -2.4f, new FabricItemSettings()));

    //FOOD
    public static final Item BLACK_CANDY_CANE = registerItem("black_candy_cane",new Item(new FabricItemSettings()));
    public static final Item BLUE_CANDY_CANE = registerItem("blue_candy_cane",new Item(new FabricItemSettings()));
    public static final Item BROWN_CANDY_CANE = registerItem("brown_candy_cane",new Item(new FabricItemSettings()));
    public static final Item CYAN_CANDY_CANE = registerItem("cyan_candy_cane",new Item(new FabricItemSettings()));
    public static final Item GRAY_CANDY_CANE = registerItem("gray_candy_cane",new Item(new FabricItemSettings()));
    public static final Item GREEN_CANDY_CANE = registerItem("green_candy_cane",new Item(new FabricItemSettings()));
    public static final Item LIGHT_GRAY_CANDY_CANE = registerItem("light_gray_candy_cane",new Item(new FabricItemSettings()));
    public static final Item LIGHT_BLUE_CANDY_CANE = registerItem("light_blue_candy_cane",new Item(new FabricItemSettings()));
    public static final Item LIME_CANDY_CANE = registerItem("lime_candy_cane",new Item(new FabricItemSettings()));
    public static final Item MAGENTA_CANDY_CANE = registerItem("magenta_candy_cane",new Item(new FabricItemSettings()));
    public static final Item ORANGE_CANDY_CANE = registerItem("orange_candy_cane",new Item(new FabricItemSettings()));
    public static final Item PINK_CANDY_CANE = registerItem("pink_candy_cane",new Item(new FabricItemSettings()));
    public static final Item PURPLE_CANDY_CANE = registerItem("purple_candy_cane",new Item(new FabricItemSettings()));
    public static final Item RED_CANDY_CANE = registerItem("red_candy_cane",new Item(new FabricItemSettings()));
    public static final Item WHITE_CANDY_CANE = registerItem("white_candy_cane",new Item(new FabricItemSettings()));
    public static final Item YELLOW_CANDY_CANE = registerItem("yellow_candy_cane",new Item(new FabricItemSettings()));
    public static final Item GINGER_ROOT = registerItem("ginger_root",new AliasedBlockItem(ModBlocks.GINGER_CROP, new FabricItemSettings()));
    public static final Item GINGERBREAD_COOKIE = registerItem("gingerbread_cookie",new Item(new FabricItemSettings()));
    public static final Item FROSTED_GINGERBREAD_COOKIE = registerItem("frosted_gingerbread_cookie",new Item(new FabricItemSettings()));
    public static final Item SUGAR_BOTTLE = registerItem("sugar_bottle",new Item(new FabricItemSettings()));
    public static final Item MOLASSES_BOTTLE = registerItem("molasses_bottle",new Item(new FabricItemSettings()));
    public static final Item SUGAR_COOKIE = registerItem("sugar_cookie",new Item(new FabricItemSettings()));
    public static final Item HOLLY_BERRIES = registerItem("holly_berries",new Item(new FabricItemSettings()));
    public static final Item FOUR_LEAF_CLOVER = registerItem("four_leaf_clover",new Item(new FabricItemSettings()));
    public static final Item WROUGHT_IRON_INGOT = registerItem("wrought_iron_ingot",new Item(new FabricItemSettings()));
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
    public static final Item CHANTERELLE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHANTERELLE_BOAT_ID, ModBoats.CHANTERELLE_BOAT_KEY, false);
    public static final Item CHANTERELLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHANTERELLE_CHEST_BOAT_ID, ModBoats.CHANTERELLE_BOAT_KEY, true);
    public static final Item ENOKI_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.ENOKI_BOAT_ID, ModBoats.ENOKI_BOAT_KEY, false);
    public static final Item ENOKI_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.ENOKI_CHEST_BOAT_ID, ModBoats.ENOKI_BOAT_KEY, true);
    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WARPED_BOAT_ID, ModBoats.WARPED_BOAT_KEY, false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WARPED_CHEST_BOAT_ID, ModBoats.WARPED_BOAT_KEY, true);
    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CRIMSON_BOAT_ID, ModBoats.CRIMSON_BOAT_KEY, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CRIMSON_CHEST_BOAT_ID, ModBoats.CRIMSON_BOAT_KEY, true);
    public static final Item HOLLY_WOOD_SIGN = registerItem("holly_wood_sign",new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.HOLLY_WOOD_SIGN, ModBlocks.HOLLY_WOOD_WALL_SIGN));
    public static final Item HOLLY_WOOD_HANGING_SIGN = registerItem("holly_wood_hanging_sign",new HangingSignItem(ModBlocks.HOLLY_WOOD_HANGING_SIGN, ModBlocks.HOLLY_WOOD_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CHANTERELLE_SIGN = registerItem("chanterelle_sign",new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.CHANTERELLE_SIGN, ModBlocks.CHANTERELLE_WALL_SIGN));
    public static final Item CHANTERELLE_HANGING_SIGN = registerItem("chanterelle_hanging_sign",new HangingSignItem(ModBlocks.CHANTERELLE_HANGING_SIGN, ModBlocks.CHANTERELLE_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ENOKI_SIGN = registerItem("enoki_sign",new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.ENOKI_SIGN, ModBlocks.ENOKI_WALL_SIGN));
    public static final Item ENOKI_HANGING_SIGN = registerItem("enoki_hanging_sign",new HangingSignItem(ModBlocks.ENOKI_HANGING_SIGN, ModBlocks.ENOKI_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));
    //BEDS


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NormalityMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        NormalityMod.LOGGER.info("Registering Mod Items for" + NormalityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
