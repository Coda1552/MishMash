package codyhuh.mishmash.registry;

import codyhuh.mishmash.MishMash;
import codyhuh.mishmash.common.blocks.BiowireBlock;
import codyhuh.mishmash.common.blocks.MashingPadBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MMBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MishMash.MOD_ID);

    public static final RegistryObject<Block> MASHING_PAD = BLOCKS.register("mashing_pad", () -> new MashingPadBlock(BlockBehaviour.Properties.of().strength(1.0F)));
    public static final RegistryObject<Block> BIOWIRE = BLOCKS.register("biowire", () -> new BiowireBlock(BlockBehaviour.Properties.of().instabreak().noCollission().noOcclusion()));
}
