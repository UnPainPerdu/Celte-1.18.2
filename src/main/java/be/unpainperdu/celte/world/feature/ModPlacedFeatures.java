package be.unpainperdu.celte.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> OLD_OAK_PLACED = PlacementUtils.register("old_oak_placed",
            ModConfiguredFeatures.OLD_OAK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.05f, 1)));
}