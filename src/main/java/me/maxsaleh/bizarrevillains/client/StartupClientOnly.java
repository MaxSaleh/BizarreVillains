package me.maxsaleh.bizarrevillains.client;

import me.maxsaleh.bizarrevillains.client.renderer.StraizoMobRenderer;
import me.maxsaleh.bizarrevillains.common.init.ModEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "bizarrevillains", value = Dist.CLIENT)
public class StartupClientOnly {

    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.STRAIZO.get(), StraizoMobRenderer::new);
    }

    @SubscribeEvent
    public static void onModelRegistryEvent(ModelRegistryEvent event) {
        ModelLoader.addSpecialModel(StraizoMobRenderer.modelTexture);
    }

}
