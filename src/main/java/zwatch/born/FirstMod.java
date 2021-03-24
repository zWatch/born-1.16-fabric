package zwatch.born;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import zwatch.born.item.FirstItem;

public class FirstMod implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("born", "general"),
            () -> new ItemStack(Blocks.COBBLESTONE));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier("born", "other"))
            .icon(() -> new ItemStack(Items.BOWL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blocks.BONE_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(PotionUtil.setPotion(new ItemStack(Items.POTION), Potions.WATER));
                stacks.add(ItemStack.EMPTY);
                stacks.add(new ItemStack(Items.IRON_SHOVEL));
            })
            .build();

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
