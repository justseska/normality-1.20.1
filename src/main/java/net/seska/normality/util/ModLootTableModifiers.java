package net.seska.normality.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;
import net.seska.normality.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier SUSPICIOUS_SAND_ID
            = new Identifier("minecraft", "archaeology/desert_pyramid");

    public static void modifyLootTable() {
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if(SUSPICIOUS_SAND_ID.equals(id)) {
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModItems.JADE_HAWKBRAND_BLADE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_HAWKBRAND_HANDLE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_BEGINNING_BLADE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_BEGINNING_HANDLE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_KATANA_BLADE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_KATANA_HANDLE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_SWIFT_BLADE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_SWIFT_HANDLE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_DAGGER_BLADE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_DAGGER_HANDLE).build());
                entries.add(ItemEntry.builder(ModItems.JADE_EMBLEM).build());
                entries.add(ItemEntry.builder(ModItems.JADE_ROD).build());
                entries.add(ItemEntry.builder(ModItems.JADE).build());
                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            return null;
        });
    }
}
