package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.metadata.annotation.*;
import io.w4t3rcs.dragonweapons.core.registry.factory.DragonItemFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;

@Injected(false)
public final class DragonItems {
    @Registry
    private static final DragonItemFactory ITEM_FACTORY = new DragonItemFactory();
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Scale")
    public static final DeferredItem<Item> DRAGON_SCALE = ITEM_FACTORY.create("dragon_scale", new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Ingot")
    public static final DeferredItem<Item> DRAGON_INGOT = ITEM_FACTORY.create("dragon_ingot", new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel(type = ItemModel.Type.HANDHELD)
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Sword")
    public static final DeferredItem<Item> DRAGON_SWORD = ITEM_FACTORY.createSword("dragon_sword", ToolMaterial.NETHERITE, 4, -2.6F, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel(type = ItemModel.Type.HANDHELD)
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Pickaxe")
    public static final DeferredItem<Item> DRAGON_PICKAXE = ITEM_FACTORY.createPickaxe("dragon_pickaxe", ToolMaterial.NETHERITE, 2, -3F, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel(type = ItemModel.Type.HANDHELD)
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Axe")
    public static final DeferredItem<Item> DRAGON_AXE = ITEM_FACTORY.createAxe("dragon_axe", ToolMaterial.NETHERITE, 6, -3.2F, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel(type = ItemModel.Type.HANDHELD)
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Shovel")
    public static final DeferredItem<Item> DRAGON_SHOVEL = ITEM_FACTORY.createShovel("dragon_shovel", ToolMaterial.NETHERITE, 2.5F, -3.2F, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel(type = ItemModel.Type.HANDHELD)
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Hoe")
    public static final DeferredItem<Item> DRAGON_HOE = ITEM_FACTORY.createHoe("dragon_hoe", ToolMaterial.NETHERITE, -3, -0.2F, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Helmet")
    public static final DeferredItem<Item> DRAGON_HELMET = ITEM_FACTORY.createArmor("dragon_helmet", DragonArmorMaterials.DRAGON, ArmorType.HELMET, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Chestplate")
    public static final DeferredItem<Item> DRAGON_CHESTPLATE = ITEM_FACTORY.createArmor("dragon_chestplate", DragonArmorMaterials.DRAGON, ArmorType.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Leggings")
    public static final DeferredItem<Item> DRAGON_LEGGINGS = ITEM_FACTORY.createArmor("dragon_leggings", DragonArmorMaterials.DRAGON, ArmorType.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC));
    @ItemModel
    @EnglishTranslation(type = TranslationType.ITEM, value = "Dragon Boots")
    public static final DeferredItem<Item> DRAGON_BOOTS = ITEM_FACTORY.createArmor("dragon_boots", DragonArmorMaterials.DRAGON, ArmorType.BOOTS, new Item.Properties().rarity(Rarity.EPIC));
}
