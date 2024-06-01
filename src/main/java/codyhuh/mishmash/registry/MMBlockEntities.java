package codyhuh.mishmash.registry;

import codyhuh.mishmash.MishMash;
import codyhuh.mishmash.common.blocks.entities.MashingPadBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MMBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MishMash.MOD_ID);

    public static final RegistryObject<BlockEntityType<MashingPadBlockEntity>> MASHING_PAD = BLOCK_ENTITIES.register("mashing_pad", () -> BlockEntityType.Builder.of(MashingPadBlockEntity::new, MMBlocks.MASHING_PAD.get()).build(null));

}
