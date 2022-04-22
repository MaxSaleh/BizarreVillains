package me.maxsaleh.bizarrevillains;

import me.maxsaleh.bizarrevillains.client.StartupClientOnly;
import me.maxsaleh.bizarrevillains.common.init.ModEntityAttributes;
import me.maxsaleh.bizarrevillains.common.init.ModEntityType;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bizarrevillains")
public class BizarreVillainsMod {

    public BizarreVillainsMod() {
        final IEventBus iEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntityType.ENTITIES.register(iEventBus);
        iEventBus.addListener(EventPriority.LOWEST, this::setupCommon);
        iEventBus.addListener(StartupClientOnly::onClientSetupEvent);
        iEventBus.addListener(StartupClientOnly::onModelRegistryEvent);
        iEventBus.addListener(ModEntityAttributes::registerAttributes);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //ModEntityAttributes.putAttributes();
        });
    }

}
