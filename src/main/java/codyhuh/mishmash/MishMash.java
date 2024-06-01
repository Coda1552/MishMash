package codyhuh.mishmash;

import codyhuh.mishmash.registry.MMBlockEntities;
import codyhuh.mishmash.registry.MMBlocks;
import codyhuh.mishmash.registry.MMItems;
import codyhuh.mishmash.registry.MMTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MishMash.MOD_ID)
public class MishMash {
    public static final String MOD_ID = "mishmash";

    public MishMash() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MMBlocks.BLOCKS.register(bus);
        MMItems.ITEMS.register(bus);
        MMBlockEntities.BLOCK_ENTITIES.register(bus);
        MMTabs.TABS.register(bus);
    }
}
