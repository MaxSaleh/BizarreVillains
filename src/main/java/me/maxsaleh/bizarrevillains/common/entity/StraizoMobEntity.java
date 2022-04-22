package me.maxsaleh.bizarrevillains.common.entity;

import me.maxsaleh.bizarrevillains.common.init.ModEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class StraizoMobEntity extends MonsterEntity {

    public StraizoMobEntity(EntityType<? extends StraizoMobEntity> entityType, World world) {
        super(entityType, world);
    }

    public StraizoMobEntity(World world) {
        this(ModEntityType.STRAIZO.get(), world);
    }

    public static boolean spawning(EntityType<StraizoMobEntity> entity, IWorld world, SpawnReason reason,
                                   BlockPos blockPos, Random random) {
        return world.getDifficulty() != Difficulty.PEACEFUL;
    }

    @Override
    public void tick() {
        World level = this.level;
        float currentHealth = this.getHealth();

        if (level.getGameTime() % 200 == 0) { // 10 seconds

        }
    }
}
