package me.nerdies.minecraft.mod.donottouch.proxy

import me.nerdies.minecraft.mod.donottouch.ModInfo
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.client.model.ModelLoader


class ClientProxy : CommonProxy()
{
    override fun registerItemRenderer(item: Item, meta: Int, id: String)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, ModelResourceLocation(ModInfo.MOD_ID + ":" + id, "inventory"))
    }
}