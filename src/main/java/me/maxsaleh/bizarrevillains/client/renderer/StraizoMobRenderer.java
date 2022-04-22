package me.maxsaleh.bizarrevillains.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.maxsaleh.bizarrevillains.client.model.StaizoMobModel;
import me.maxsaleh.bizarrevillains.common.entity.StraizoMobEntity;
import me.maxsaleh.bizarrevillains.utilities.ModReference;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

public class StraizoMobRenderer extends EntityRenderer<StraizoMobEntity> {
    public static final ResourceLocation modelTexture = new ResourceLocation(ModReference.MOD_ID, "textures/entity/straizo_mob.png");
    private static final RenderType RENDER_TYPE = RenderType.entitySolid(modelTexture);
    private final StaizoMobModel model = new StaizoMobModel();

    public StraizoMobRenderer(EntityRendererManager rendererManager) {
        super(rendererManager);
    }

    @Override
    public void render(StraizoMobEntity entity, float p_225623_2_, float p_225623_3_, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int packedLight) {
        matrixStack.pushPose();
        IVertexBuilder ivertexbuilder = iRenderTypeBuffer.getBuffer(RENDER_TYPE);
        matrixStack.translate(0.0F, 1.5F, 0.0F);
        matrixStack.mulPose(new Quaternion(new Vector3f(1.0F, 0.0F, 0.0F), 180.0F, true));
        model.renderToBuffer(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(StraizoMobEntity p_110775_1_) {
        return modelTexture;
    }
}
