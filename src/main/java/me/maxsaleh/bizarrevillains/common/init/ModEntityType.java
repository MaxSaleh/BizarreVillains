package me.maxsaleh.bizarrevillains.common.init;

import me.maxsaleh.bizarrevillains.common.entity.StraizoMobEntity;
import me.maxsaleh.bizarrevillains.utilities.ModReference;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ModReference.MOD_ID);

    public static final RegistryObject<EntityType<StraizoMobEntity>> STRAIZO = ENTITIES.register("straizo",
            () -> EntityType.Builder.<StraizoMobEntity>of(StraizoMobEntity::new, EntityClassification.MONSTER)
                    .sized(1F, 1F)
                    .build("straizo"));

}
