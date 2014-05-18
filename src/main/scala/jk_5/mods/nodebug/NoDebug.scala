package jk_5.mods.nodebug

import cpw.mods.fml.common.{FMLCommonHandler, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import cpw.mods.fml.common.gameevent.TickEvent
import net.minecraft.client.Minecraft.{getMinecraft => mc}

@Mod(modid = "NoDebug", version = "1.0", modLanguage = "scala")
object NoDebug {
  @EventHandler def preInit(event: FMLPreInitializationEvent){
    if(event.getSide.isClient) FMLCommonHandler.instance.bus.register(this)
  }
  @SubscribeEvent def onTick(event: TickEvent.RenderTickEvent) = mc.gameSettings.showDebugInfo = false
}
