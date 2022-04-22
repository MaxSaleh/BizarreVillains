package me.maxsaleh.bizarrevillains.common.init;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEntityAttributes {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityType.STRAIZO.get(),
                MonsterEntity.createMobAttributes()
                        .add(Attributes.MAX_HEALTH, 300.0D)
                        .add(Attributes.MOVEMENT_SPEED, 0.278D)
                        .add(Attributes.KNOCKBACK_RESISTANCE, 0.3D)
                        .build());
    }

}
