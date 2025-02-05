package io.w4t3rcs.dragonweapons.core.tag;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.tag.factory.ItemTagFactory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class DragonItemTags {
    private static final ItemTagFactory ITEM_TAG_FACTORY = InjectionContext.getFromInstance(ItemTagFactory.class);
    public static final TagKey<Item> REPAIRS_DRAGON_ARMOR = ITEM_TAG_FACTORY.createTag("repairs_dragon_armor");
}
