package be.unpainperdu.celte.block;

import be.unpainperdu.celte.Celte;
import be.unpainperdu.celte.block.custom.*;
import be.unpainperdu.celte.item.ModCreativeModeTab;
import be.unpainperdu.celte.item.ModItems;
import be.unpainperdu.celte.world.feature.tree.OldOakTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Celte.MOD_ID);
    // création du bloc
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK))
                   , ModCreativeModeTab.CELTE_TAB);


    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK))
                  , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK))
                  , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> THATCH_BLOCK_A = registerBlock("thatch_block_a",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> THATCH_BLOCK_B = registerBlock("thatch_block_b",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> TWIG_BLOCK = registerBlock("twig_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> TWIG_STAIRS = registerBlock("twig_stairs",
            () -> new StairBlock(() -> ModBlocks.TWIG_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> TWIG_SLAB = registerBlock("twig_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> TWIG_WALL = registerBlock("twig_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> OLD_OAK_LOG = registerBlock("old_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> OLD_OAK_WOOD = registerBlock("old_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> STRIPPED_OLD_OAK_LOG = registerBlock("stripped_old_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> STRIPPED_OLD_OAK_WOOD = registerBlock("stripped_old_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD))
                   , ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> OLD_OAK_LEAVES = registerBlock("old_oak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.CELTE_TAB);


    public static final RegistryObject<Block> OLD_OAK_SAPLING = registerBlock("old_oak_sapling",
            () -> new SaplingBlock(new OldOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> FUNERAL_STATUE = registerBlock("funeral_statue",
            () -> new FuneralStatue(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> BRONZE_JAR = registerBlock("bronze_jar",
            () -> new BronzeJar(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> STONE_JAR = registerBlock("stone_jar",
            () -> new StoneJar(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.CELTE_TAB);

    public static final RegistryObject<Block> COPPER_SMITHY = registerBlock("copper_smithy",
            () -> new CopperSmithy(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops()), ModCreativeModeTab.CELTE_TAB);







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
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
