package com.kittyherz.forgottenworlds.items;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{

    public ItemBase(){
        super(new Item.Properties().group(ForgottenWorlds.TAB));
    }
}
