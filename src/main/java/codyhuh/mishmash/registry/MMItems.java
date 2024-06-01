package codyhuh.mishmash.registry;

import codyhuh.mishmash.MishMash;
import codyhuh.mishmash.common.blocks.MashingPadBlock;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MishMash.MOD_ID);

    public static final RegistryObject<Item> MASHING_PAD = ITEMS.register("mashing_pad", () -> new BlockItem(MMBlocks.MASHING_PAD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIOWIRE = ITEMS.register("biowire", () -> new BlockItem(MMBlocks.BIOWIRE.get(), new Item.Properties()));
}
