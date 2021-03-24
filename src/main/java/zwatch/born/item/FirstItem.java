package zwatch.born.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class FirstItem extends Item {
    public FirstItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        //tooltip.add(new TranslatableText("item.born.first_item.tooltip"));
        int currentDay = 4;
        int currentMonth = 7;
        tooltip.add(new TranslatableText("item.born.first_item.tooltip", currentDay, currentMonth));
        //Making \n work was far too difficult for Mojang,
        // so in order to have a string with multiple lines you must split the translation key into multiple keys:
        /*
            {
              "item.tutorial.fabric_item.tooltip_1": "Line 1 of my tooltip"
              "item.tutorial.fabric_item.tooltip_2": "Line 2 of my tooltip"
            }
         */

        /*
        Object Type	Format	Example
        Block	block.<namespace>.<path>	“block.tutorial.example_block”: “Example Block”
        Item	item.<namespace>.<path>	“item.tutorial.my_item”: “My Item”
        ItemGroup	itemGroup.<namespace>.<path>	“itemGroup.tutorial.my_group”: “My Group”
        Fluid	fluid.<namespace>.<path>
        SoundEvent	sound_event.<namespace>.<path>
        StatusEffect	effect.<namespace>.<path>
        Enchantment	enchantment.<namespace>.<path>
        EntityType	entity.<namespace>.<path>
        Biome	biome.<namespace>.<path>
        Stat	stat.<namespace>.<path>
        For types not in this list, see net.minecraft.util.registry.Registry.
         */
    }
}
