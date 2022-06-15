package be.unpainperdu.celte;

import be.unpainperdu.celte.block.ModBlocks;
import be.unpainperdu.celte.block.entity.ModBlockEntities;
import be.unpainperdu.celte.item.ModItems;
import be.unpainperdu.recipe.ModRecipes;
import be.unpainperdu.screen.CopperSmithyScreen;
import be.unpainperdu.screen.ModMenuTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod(Celte.MOD_ID)
public class Celte {
    public static final String MOD_ID = "celte04200303";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Celte() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        ModRecipes.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLD_OAK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLD_OAK_SAPLING.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FUNERAL_STATUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRONZE_JAR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STONE_JAR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COPPER_SMITHY.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.COPPER_SMITHY_MENU.get(), CopperSmithyScreen::new);





    }
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}