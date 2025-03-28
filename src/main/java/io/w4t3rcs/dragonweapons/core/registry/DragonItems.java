package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.metadata.annotation.data.language.EnglishTranslation;
import com.temporal.api.core.engine.io.metadata.annotation.data.model.ItemModel;
import com.temporal.api.core.engine.io.metadata.annotation.data.tag.ItemTagComponent;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Registry;
import com.temporal.api.core.engine.io.metadata.constant.ItemModelType;
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
    @EnglishTranslation("Dragon Scale")
    public static final DeferredItem<Item> DRAGON_SCALE = ITEM_FACTORY.create("dragon_scale", new Item.Properties().rarity(Rarity.EPIC));

    @ItemTagComponent({"repairs_dragon_armor", "trim_materials"})
    @ItemModel
    @EnglishTranslation("Dragon Ingot")
    public static final DeferredItem<Item> DRAGON_INGOT = ITEM_FACTORY.create("dragon_ingot", new Item.Properties().rarity(Rarity.EPIC));

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Dragon Sword")
    public static final DeferredItem<Item> DRAGON_SWORD = ITEM_FACTORY.createSword("dragon_sword", new Item.Properties().rarity(Rarity.EPIC), ToolMaterial.NETHERITE, 4, -2.6F);

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Dragon Pickaxe")
    public static final DeferredItem<Item> DRAGON_PICKAXE = ITEM_FACTORY.createPickaxe("dragon_pickaxe", new Item.Properties().rarity(Rarity.EPIC), ToolMaterial.NETHERITE, 2, -3F);

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Dragon Axe")
    public static final DeferredItem<Item> DRAGON_AXE = ITEM_FACTORY.createAxe("dragon_axe", new Item.Properties().rarity(Rarity.EPIC), ToolMaterial.NETHERITE, 6, -3.2F);

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Dragon Shovel")
    public static final DeferredItem<Item> DRAGON_SHOVEL = ITEM_FACTORY.createShovel("dragon_shovel", new Item.Properties().rarity(Rarity.EPIC), ToolMaterial.NETHERITE, 2.5F, -3.2F);

    @ItemModel(ItemModelType.HANDHELD)
    @EnglishTranslation("Dragon Hoe")
    public static final DeferredItem<Item> DRAGON_HOE = ITEM_FACTORY.createHoe("dragon_hoe", new Item.Properties().rarity(Rarity.EPIC), ToolMaterial.NETHERITE, -3, -0.2F);

    @ItemTagComponent("trimmable_armor")
    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @EnglishTranslation(value = "Dragon Helmet")
    public static final DeferredItem<Item> DRAGON_HELMET = ITEM_FACTORY.createArmor("dragon_helmet", new Item.Properties().rarity(Rarity.EPIC), DragonArmorMaterials.DRAGON, ArmorType.HELMET);

    @ItemTagComponent("trimmable_armor")
    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @EnglishTranslation("Dragon Chestplate")
    public static final DeferredItem<Item> DRAGON_CHESTPLATE = ITEM_FACTORY.createArmor("dragon_chestplate", new Item.Properties().rarity(Rarity.EPIC), DragonArmorMaterials.DRAGON, ArmorType.CHESTPLATE);

    @ItemTagComponent("trimmable_armor")
    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @EnglishTranslation("Dragon Leggings")
    public static final DeferredItem<Item> DRAGON_LEGGINGS = ITEM_FACTORY.createArmor("dragon_leggings", new Item.Properties().rarity(Rarity.EPIC), DragonArmorMaterials.DRAGON, ArmorType.LEGGINGS);

    @ItemTagComponent("trimmable_armor")
    @ItemModel(ItemModelType.TRIMMED_ARMOR)
    @EnglishTranslation("Dragon Boots")
    public static final DeferredItem<Item> DRAGON_BOOTS = ITEM_FACTORY.createArmor("dragon_boots", new Item.Properties().rarity(Rarity.EPIC), DragonArmorMaterials.DRAGON, ArmorType.BOOTS);

    @ItemModel
    @EnglishTranslation("Dragon Armor Trim")
    public static final DeferredItem<Item> DRAGON_SMITHING_TEMPLATE = ITEM_FACTORY.createSmithingTemplate("dragon_armor_smithing_template", new Item.Properties().rarity(Rarity.EPIC));
}
