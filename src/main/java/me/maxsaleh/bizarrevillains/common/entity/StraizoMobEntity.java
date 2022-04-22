package me.maxsaleh.bizarrevillains.common.entity;

import me.maxsaleh.bizarrevillains.common.init.ModEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class StraizoMobEntity extends MonsterEntity {

    public StraizoMobEntity(EntityType<? extends StraizoMobEntity> entityType, World world) {
        super(entityType, world);
    }

    public StraizoMobEntity(World world) {
        this(ModEntityType.STRAIZO.get(), world);
    }

    @Override
    public void tick() {
        World level = this.level;
        float currentHealth = this.getHealth();

        if (level.getGameTime() % 200 == 0) { // 10 seconds

        }
    }
}
