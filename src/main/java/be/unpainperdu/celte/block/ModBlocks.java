package be.unpainperdu.celte.block;

import be.unpainperdu.celte.Celte;
import be.unpainperdu.celte.block.custom.ModFlammableRotatedPillarBlock;
import be.unpainperdu.celte.item.ModCreativeModeTab;
import be.unpainperdu.celte.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Celte.MOD_ID);
    // création du bloc
    public static final RegistryObject<Block> TIN_ORE = registryBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registryBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK))
                   , ModCreativeModeTab.CELTE_TAB);


    public static final RegistryObject<Block> TIN_BLOCK = registryBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK))
                  , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> BRONZE_BLOCK = registryBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
                  , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> OLD_OAK_LOG = registryBlock("old_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> OLD_OAK_WOOD = registryBlock("old_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> STRIPPED_OLD_OAK_LOG = registryBlock("stripped_old_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> STRIPPED_OLD_OAK_WOOD = registryBlock("stripped_old_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD))
                   , ModCreativeModeTab.CELTE_TAB);







    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
