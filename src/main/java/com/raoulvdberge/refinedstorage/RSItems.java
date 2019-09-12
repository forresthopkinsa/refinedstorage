package com.raoulvdberge.refinedstorage;

import com.raoulvdberge.refinedstorage.item.*;
import net.minecraftforge.registries.ObjectHolder;

public final class RSItems {
    public static final ItemStorageDisk STORAGE_DISK = new ItemStorageDisk();
    public static final ItemWirelessGrid WIRELESS_GRID = new ItemWirelessGrid();
    public static final ItemWirelessFluidGrid WIRELESS_FLUID_GRID = new ItemWirelessFluidGrid();
    public static final ItemWirelessCraftingMonitor WIRELESS_CRAFTING_MONITOR = new ItemWirelessCraftingMonitor();
    @ObjectHolder(RS.ID + ":quartz_enriched_iron")
    public static final ItemQuartzEnrichedIron QUARTZ_ENRICHED_IRON = null;
    @ObjectHolder(RS.ID + ":core")
    public static final ItemCore CORE = null;
    public static final ItemSilicon SILICON = new ItemSilicon();
    public static final ItemProcessor PROCESSOR = new ItemProcessor();
    public static final ItemStoragePart STORAGE_PART = new ItemStoragePart();
    public static final ItemPattern PATTERN = new ItemPattern();
    public static final ItemUpgrade UPGRADE = new ItemUpgrade();
    public static final ItemStorageHousing STORAGE_HOUSING = new ItemStorageHousing();
    public static final ItemFilter FILTER = new ItemFilter();
    public static final ItemNetworkCard NETWORK_CARD = new ItemNetworkCard();
    public static final ItemFluidStorageDisk FLUID_STORAGE_DISK = new ItemFluidStorageDisk();
    public static final ItemFluidStoragePart FLUID_STORAGE_PART = new ItemFluidStoragePart();
    public static final ItemSecurityCard SECURITY_CARD = new ItemSecurityCard();
    public static final ItemCuttingTool CUTTING_TOOL = new ItemCuttingTool();
    public static final ItemCover COVER = new ItemCover();
    public static final ItemHollowCover HOLLOW_COVER = new ItemHollowCover();
    public static final ItemWrench WRENCH = new ItemWrench();
    @ObjectHolder(RS.ID + ":processor_binding")
    public static final ItemProcessorBinding PROCESSOR_BINDING = null;
}
