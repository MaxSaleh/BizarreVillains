package me.maxsaleh.bizarrevillains.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.maxsaleh.bizarrevillains.client.model.StaizoMobModel;
import me.maxsaleh.bizarrevillains.common.entity.StraizoMobEntity;
import me.maxsaleh.bizarrevillains.utilities.ModReference;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.BatModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class StraizoMobRenderer extends MobRenderer<StraizoMobEntity, StaizoMobModel> {
    public static final ResourceLocation modelTexture = new ResourceLocation(ModReference.MOD_ID, "textures/entity/straizo_mob.png");

    public StraizoMobRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new StaizoMobModel(), 0.75F);
    }

    @Override
    protected void scale(StraizoMobEntity entity, MatrixStack matrixStack, float p_225620_3_) {
        matrixStack.scale(1F, 1F, 1F);
    }

    @Override
    public ResourceLocation getTextureLocation(StraizoMobEntity p_110775_1_) {
        return modelTexture;
    }
}
