package jk_5.mods.nodebug

import net.minecraft.client.Minecraft.{getMinecraft => mc}
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import net.minecraftforge.fml.common.{FMLCommonHandler, Mod}

@Mod(modid = "NoDebug", version = "1.0.2", modLanguage = "scala", clientSideOnly = true)
object NoDebug {
  @EventHandler def preInit(event: FMLPreInitializationEvent){
    if(event.getSide.isClient) FMLCommonHandler.instance.bus.register(this)
  }
  @SubscribeEvent def onTick(event: TickEvent.RenderTickEvent) = mc.gameSettings.showDebugInfo = false
}
