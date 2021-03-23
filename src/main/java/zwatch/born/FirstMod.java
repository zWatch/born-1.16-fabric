package zwatch.born;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import zwatch.born.item.FirstItem;

public class FirstMod implements ModInitializer {
    public static final Item FirstItem  = new FirstItem(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        Registry.register(Registry.ITEM, new Identifier("born", "first_item"), FirstItem);
        //System.out.println("Hello Fabric world!");
    }
}
