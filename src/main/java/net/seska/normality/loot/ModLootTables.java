package net.seska.normality.loot;

import com.google.common.collect.Sets;
import net.minecraft.loot.LootTables;
import net.minecraft.util.Identifier;

import java.util.Collections;
import java.util.Set;

public class ModLootTables {
    private static final Set<Identifier> MOD_LOOT_TABLES = Sets.newHashSet();
    private static final Set<Identifier> MOD_LOOT_TABLES_READ_ONLY = Collections.unmodifiableSet(MOD_LOOT_TABLES);
    public static final Identifier ROSE_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/rose");
    public static final Identifier ULTRAMARINE_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/ultramarine");
    public static final Identifier CHARTREUSE_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/chartreuse");
    public static final Identifier SPRING_GREEN_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/spring_green");
    public static final Identifier VIOLET_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/violet");
    public static final Identifier CAPRI_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/capri");
    public static final Identifier PRIMROSE_CHOIR_SPRITE_ENTITY = ModLootTables.register("entities/choir_sprite/primrose");
    private static Identifier register(String id) {
        return ModLootTables.registerLootTable(new Identifier(id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (MOD_LOOT_TABLES.add(id)) {
            return id;
        }
        throw new IllegalArgumentException(id + " is already a registered built-in loot table");
    }

    public static Set<Identifier> getAll() {
        return MOD_LOOT_TABLES_READ_ONLY;
    }
}
