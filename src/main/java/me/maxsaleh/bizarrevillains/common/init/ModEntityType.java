package me.maxsaleh.bizarrevillains.common.init;

import me.maxsaleh.bizarrevillains.common.entity.StraizoMobEntity;
import me.maxsaleh.bizarrevillains.utilities.ModReference;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "bizarrevillains", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ModReference.MOD_ID);

    public static final RegistryObject<EntityType<StraizoMobEntity>> STRAIZO = ENTITIES.register("straizo",
            () -> EntityType.Builder.<StraizoMobEntity>of(StraizoMobEntity::new, EntityClassification.MONSTER)
                    .sized(1F, 1F)
                    .build("straizo"));

    @SubscribeEvent
    public static void entitySpawnPlacementRegistry(final RegistryEvent.Register<EntityType<?>> event) {
        EntitySpawnPlacementRegistry.register(
                STRAIZO.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, StraizoMobEntity::spawning);
    }

}
