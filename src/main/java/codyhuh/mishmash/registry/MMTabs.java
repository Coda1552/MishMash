package codyhuh.mishmash.registry;

import codyhuh.mishmash.MishMash;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MMTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MishMash.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MM_TAB = TABS.register("mm_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.mish_mash"))
                    .icon(MMItems.MASHING_PAD.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        for (var item : MMItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                    })
                    .build()
    );
}
