package com.miner.backpack;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashSet;
import java.util.Set;

public class ModItems {
    public static final Set<Item> STACKABLE_ITEMS = new HashSet<>();

    static {
        // 铁矿相关
        STACKABLE_ITEMS.add(Items.IRON_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_IRON_ORE);
        STACKABLE_ITEMS.add(Items.RAW_IRON);
        STACKABLE_ITEMS.add(Items.IRON_INGOT);

        // 铜矿相关
        STACKABLE_ITEMS.add(Items.COPPER_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_COPPER_ORE);
        STACKABLE_ITEMS.add(Items.RAW_COPPER);
        STACKABLE_ITEMS.add(Items.COPPER_INGOT);

        // 金矿相关
        STACKABLE_ITEMS.add(Items.GOLD_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_GOLD_ORE);
        STACKABLE_ITEMS.add(Items.RAW_GOLD);
        STACKABLE_ITEMS.add(Items.GOLD_INGOT);
        STACKABLE_ITEMS.add(Items.NETHER_GOLD_ORE);

        // 下界合金相关
        STACKABLE_ITEMS.add(Items.ANCIENT_DEBRIS);
        STACKABLE_ITEMS.add(Items.NETHERITE_SCRAP);

        // 钻石相关
        STACKABLE_ITEMS.add(Items.DIAMOND_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_DIAMOND_ORE);
        STACKABLE_ITEMS.add(Items.DIAMOND);

        // 青金石相关
        STACKABLE_ITEMS.add(Items.LAPIS_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_LAPIS_ORE);
        STACKABLE_ITEMS.add(Items.LAPIS_LAZULI);

        // 红石相关
        STACKABLE_ITEMS.add(Items.REDSTONE_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_REDSTONE_ORE);
        STACKABLE_ITEMS.add(Items.REDSTONE);

        // 煤矿相关
        STACKABLE_ITEMS.add(Items.COAL_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_COAL_ORE);
        STACKABLE_ITEMS.add(Items.COAL);

        // 绿宝石相关
        STACKABLE_ITEMS.add(Items.EMERALD_ORE);
        STACKABLE_ITEMS.add(Items.DEEPSLATE_EMERALD_ORE);
        STACKABLE_ITEMS.add(Items.EMERALD);

        // 下界石英相关
        STACKABLE_ITEMS.add(Items.NETHER_QUARTZ_ORE);
        STACKABLE_ITEMS.add(Items.QUARTZ);
    }

    public static boolean isStackableItem(Item item) {
        return STACKABLE_ITEMS.contains(item);
    }

    public static final int MAX_STACK_SIZE = 9999;
}
