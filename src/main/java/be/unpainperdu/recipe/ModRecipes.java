package be.unpainperdu.recipe;

import be.unpainperdu.celte.Celte;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Celte.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CopperSmithyRecipe>> COPPER_SMITHY_SERIALIZER =
            SERIALIZERS.register("copper_smithing", () -> CopperSmithyRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}