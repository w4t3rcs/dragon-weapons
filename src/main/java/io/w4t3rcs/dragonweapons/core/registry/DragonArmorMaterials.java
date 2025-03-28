package io.w4t3rcs.dragonweapons.core.registry;

import com.temporal.api.core.engine.io.metadata.annotation.data.model.ArmorAsset;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.registry.factory.other.ArmorMaterialFactory;
import io.w4t3rcs.dragonweapons.core.tag.DragonItemTags;
import net.minecraft.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

@Injected(false)
public final class DragonArmorMaterials {
    @ArmorAsset
    public static ArmorMaterial DRAGON = ArmorMaterialFactory.create("dragon", Util.make(new EnumMap<>(ArmorType.class), (map) -> {
        map.put(ArmorType.BOOTS, 4);
        map.put(ArmorType.LEGGINGS, 7);
        map.put(ArmorType.CHESTPLATE, 9);
        map.put(ArmorType.HELMET, 4);
        map.put(ArmorType.BODY, 12);
    }), 16, 4, 4F, 0.5F, DragonItemTags.REPAIRS_DRAGON_ARMOR, DragonSoundEvents.ARMOR_EQUIP_DRAGON, true);
}
