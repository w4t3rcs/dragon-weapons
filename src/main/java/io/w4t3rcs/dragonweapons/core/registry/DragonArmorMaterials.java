package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.ArmorAsset;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.registry.factory.common.ArmorMaterialFactory;
import io.w4t3rcs.dragonweapons.core.tag.DragonItemTags;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

@Injected(isInjection = false)
public final class DragonArmorMaterials {
    private static final ArmorMaterialFactory ARMOR_MATERIAL_FACTORY =  InjectionContext.getFromInstance(ArmorMaterialFactory.class);
    @ArmorAsset
    public static ArmorMaterial DRAGON = ARMOR_MATERIAL_FACTORY.create("dragon", Util.make(new EnumMap<>(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 4);
        map.put(ArmorType.LEGGINGS, 7);
        map.put(ArmorType.CHESTPLATE, 9);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 12);
    }), 16, 4, 4F, 0.5F, DragonItemTags.REPAIRS_DRAGON_ARMOR, SoundEvents.ARMOR_EQUIP_NETHERITE);
}
