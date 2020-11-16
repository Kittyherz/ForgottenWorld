package com.kittyherz.forgottenworlds.base;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import net.minecraft.item.Item;

public class ItemBase extends Item{

    public ItemBase(){
        super(new Item.Properties().group(ForgottenWorlds.TAB));
    }
}
