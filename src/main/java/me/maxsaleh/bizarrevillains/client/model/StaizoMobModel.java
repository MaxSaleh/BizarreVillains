package me.maxsaleh.bizarrevillains.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.maxsaleh.bizarrevillains.common.entity.StraizoMobEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class StaizoMobModel extends EntityModel<StraizoMobEntity> {

    private final ModelRenderer Staizo;
    private final ModelRenderer head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Leftarm;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer rightarm;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftleg;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer rightleg;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;

    public StaizoMobModel() {
        this.texWidth = 64;
        this.texHeight = 64;

        Staizo = new ModelRenderer(this);
        Staizo.setPos(0.6F, 24.0F, 0.0F);

        head = new ModelRenderer(this);
        head.setPos(0.1F, -33.2F, 0.8F);
        Staizo.addChild(head);
        head.texOffs(11, 17).addBox(-3.7F, -7.0F, -2.9F, 7.0F, 7.0F, 7.0F, 0.0F, false);
        head.texOffs(33, 55).addBox(2.3F, -5.6F, -3.0F, 2.0F, 7.0F, 0.0F, 0.0F, false);
        head.texOffs(32, 15).addBox(-4.6F, -5.6F, -3.0F, 2.0F, 7.0F, 0.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(3.2665F, -6.3132F, -2.7627F);
        head.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0177F, -0.0193F, -0.8289F);
        cube_r1.texOffs(44, 33).addBox(-6.4F, -5.2F, -0.2F, 5.0F, 2.0F, 0.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-3.5665F, -6.3132F, -2.7627F);
        head.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0177F, 0.0193F, 0.8289F);
        cube_r2.texOffs(54, 33).addBox(1.4F, -5.2F, -0.2F, 5.0F, 2.0F, 0.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-0.2F, -0.1F, 4.1F);
        head.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0262F, 0.0F, 0.0F);
        cube_r3.texOffs(12, 48).addBox(-3.5F, 0.1F, 0.0F, 7.0F, 8.0F, 0.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(3.2965F, -3.2921F, 0.7765F);
        head.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0718F, -0.7881F, -0.0632F);
        cube_r4.texOffs(41, 0).addBox(-1.1F, -1.6F, -0.6F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-4.2F, -3.4F, 0.6F);
        head.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0713F, 0.7844F, 0.063F);
        cube_r5.texOffs(46, 7).addBox(-0.4F, -1.5F, -0.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        Leftarm = new ModelRenderer(this);
        Leftarm.setPos(4.3824F, -29.995F, 1.3846F);
        Staizo.addChild(Leftarm);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(1.8F, 5.6F, 0.0F);
        Leftarm.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0064F, -0.0117F, 0.044F);
        cube_r6.texOffs(40, 50).addBox(-1.5372F, 4.7878F, -2.0198F, 3.0F, 3.0F, 4.0F, 0.0F, true);
        cube_r6.texOffs(23, 55).addBox(-0.9372F, -0.2122F, -1.5198F, 2.0F, 5.0F, 3.0F, 0.0F, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(1.8F, 5.6F, 0.0F);
        Leftarm.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0074F, -0.0111F, -0.0433F);
        cube_r7.texOffs(0, 54).addBox(-1.3845F, -5.1039F, -1.5198F, 3.0F, 5.0F, 3.0F, 0.0F, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(1.8F, 5.6F, 0.0F);
        Leftarm.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0003F, -0.0013F, 0.1746F);
        cube_r8.texOffs(46, 0).addBox(-3.062F, -7.3742F, -1.9787F, 4.0F, 3.0F, 4.0F, 0.0F, true);

        rightarm = new ModelRenderer(this);
        rightarm.setPos(-4.6F, -29.9F, 1.4F);
        Staizo.addChild(rightarm);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-1.4824F, 5.505F, -0.0154F);
        rightarm.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0064F, 0.0117F, -0.044F);
        cube_r9.texOffs(40, 50).addBox(-1.4628F, 4.7878F, -2.0198F, 3.0F, 3.0F, 4.0F, 0.0F, false);
        cube_r9.texOffs(23, 55).addBox(-1.0628F, -0.2122F, -1.5198F, 2.0F, 5.0F, 3.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(-1.4824F, 5.505F, -0.0154F);
        rightarm.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0074F, 0.0111F, 0.0433F);
        cube_r10.texOffs(0, 54).addBox(-1.6155F, -5.1039F, -1.5198F, 3.0F, 5.0F, 3.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(-1.4824F, 5.505F, -0.0154F);
        rightarm.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0003F, 0.0013F, -0.1746F);
        cube_r11.texOffs(46, 0).addBox(-0.938F, -7.3742F, -1.9787F, 4.0F, 3.0F, 4.0F, 0.0F, false);

        leftleg = new ModelRenderer(this);
        leftleg.setPos(0.5F, -16.4F, 1.0F);
        Staizo.addChild(leftleg);


        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.1F, -7.3F, 0.6F);
        leftleg.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.0059F, -0.0043F, -0.043F);
        cube_r12.texOffs(43, 35).addBox(-0.1457F, 21.817F, -4.0405F, 3.0F, 2.0F, 5.0F, 0.0F, true);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.1F, -8.6F, 0.4F);
        leftleg.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0057F, 0.0045F, -0.043F);
        cube_r13.texOffs(39, 12).addBox(-0.24F, 12.77F, -1.8588F, 3.0F, 11.0F, 3.0F, 0.0F, true);
        cube_r13.texOffs(12, 40).addBox(-0.7158F, 8.9768F, -2.3588F, 4.0F, 4.0F, 4.0F, 0.0F, true);

        rightleg = new ModelRenderer(this);
        rightleg.setPos(-0.4F, -16.0F, 0.8F);
        Staizo.addChild(rightleg);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(0.0F, -7.7F, 0.8F);
        rightleg.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.0059F, 0.0043F, 0.043F);
        cube_r14.texOffs(43, 35).addBox(-2.8543F, 21.817F, -4.0405F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, -9.0F, 0.6F);
        rightleg.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0057F, -0.0045F, 0.043F);
        cube_r15.texOffs(39, 12).addBox(-2.76F, 12.77F, -1.8588F, 3.0F, 11.0F, 3.0F, 0.0F, false);
        cube_r15.texOffs(12, 40).addBox(-3.2842F, 8.9768F, -2.3588F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        chest = new ModelRenderer(this);
        chest.setPos(0.0F, -26.7F, 1.5F);
        Staizo.addChild(chest);
        chest.texOffs(48, 7).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
        chest.texOffs(18, 0).addBox(-4.5F, -4.0F, -2.6F, 9.0F, 7.0F, 5.0F, 0.0F, false);
        chest.texOffs(26, 31).addBox(-3.4F, 2.0F, -2.1F, 7.0F, 5.0F, 4.0F, 0.0F, false);
        chest.texOffs(0, 31).addBox(-3.9F, 6.7F, -2.8F, 8.0F, 4.0F, 5.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(2.9134F, -4.4015F, 1.7423F);
        chest.addChild(cube_r16);
        setRotationAngle(cube_r16, 3.1271F, -0.4053F, -3.1403F);
        cube_r16.texOffs(0, 24).addBox(-0.7F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.5194F, -4.268F, 2.0556F);
        chest.addChild(cube_r17);
        setRotationAngle(cube_r17, -2.8925F, 1.2612F, -2.8601F);
        cube_r17.texOffs(21, 31).addBox(0.4499F, -0.9324F, -3.5739F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(-1.0012F, -4.4476F, 2.3111F);
        chest.addChild(cube_r18);
        setRotationAngle(cube_r18, -3.0699F, 0.0173F, 3.1343F);
        cube_r18.texOffs(0, 27).addBox(-2.9F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(-2.8977F, -4.4849F, -0.9939F);
        chest.addChild(cube_r19);
        setRotationAngle(cube_r19, 2.8785F, -1.2497F, -2.92F);
        cube_r19.texOffs(39, 26).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(4.8696F, -4.4218F, 0.5251F);
        chest.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.4153F, -1.4529F, -0.4376F);
        cube_r20.texOffs(24, 40).addBox(-1.9F, -1.1F, 1.1F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(2.1298F, -4.3177F, -1.9238F);
        chest.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.1269F, -0.8652F, -0.1255F);
        cube_r21.texOffs(29, 12).addBox(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(-2.0F, -4.3F, -2.8F);
        chest.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.014F, 0.2614F, 0.0542F);
        cube_r22.texOffs(51, 22).addBox(-1.0F, -1.0F, -0.1F, 4.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(-0.1F, -6.6F, 3.4F);
        chest.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0262F, 0.0F, 0.0F);
        cube_r23.texOffs(0, 0).addBox(-4.5F, 2.6F, -1.0F, 9.0F, 24.0F, 0.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(-0.2F, 2.1F, -0.1F);
        chest.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.5236F);
        cube_r24.texOffs(18, 12).addBox(-0.4687F, -7.006F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(-0.2F, 2.1F, -0.1F);
        chest.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.48F);
        cube_r25.texOffs(50, 42).addBox(-2.6045F, -7.3043F, -1.4F, 4.0F, 1.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(StraizoMobEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) { }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Staizo.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
