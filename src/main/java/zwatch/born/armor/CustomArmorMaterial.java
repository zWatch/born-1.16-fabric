package zwatch.born.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CustomArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{4, 7, 9, 4};
    private static final int X = 1;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * X;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return X;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "XXXName";
    }

    @Override
    public float getToughness() {
        return X;
    }

    @Override
    public float getKnockbackResistance() {
        return X/10.0f;
    }
}

//class RegisterItems {
//
//    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new CustomArmorMaterial();
//    public static final Item CUSTOM_MATERIAL = new CustomMaterialItem(new Item.Settings().group(born.EXAMPLE_MOD_GROUP));
//    // If you made a new material, this is where you would note it.
//    public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
//    public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
//    public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
//    public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
//
//}