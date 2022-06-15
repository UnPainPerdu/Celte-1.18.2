package be.unpainperdu.celte.block.entity;

import be.unpainperdu.celte.Celte;
import be.unpainperdu.celte.block.ModBlocks;
import be.unpainperdu.celte.block.entity.custom.CopperSmithyBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Celte.MOD_ID);

    public static final RegistryObject<BlockEntityType<CopperSmithyBlockEntity>> COPPER_SMITHY_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("copper_smithy_block_entity", () ->
                    BlockEntityType.Builder.of(CopperSmithyBlockEntity::new,
                            ModBlocks.COPPER_SMITHY.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}