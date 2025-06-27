package io.w4t3rcs.dragonweapons.core.registry.factory;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.injection.Injected;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.temporal.api.core.registry.factory.extension.item.*;
import io.w4t3rcs.dragonweapons.common.DragonArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;

@Injected
public final class DragonItemFactory extends ItemFactory implements SwordExtension,
        PickaxeExtension, AxeExtension, ShovelExtension, HoeExtension,
        ArmorExtension, SmithingTemplateExtension {
    public DeferredItem<Item> createDragonArmor(String name, ArmorMaterial material, ArmorType type, Item.Properties properties) {
        ItemFactory itemFactory = InjectionContext.getFromInstance(ItemFactory.class);
        return itemFactory.create(name, properties, (props) -> new DragonArmorItem(material, type, props));
    }
}
