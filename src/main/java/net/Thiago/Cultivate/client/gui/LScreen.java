package net.Thiago.Cultivate.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.Thiago.Cultivate.Cultivate;
import net.Thiago.Cultivate.network.LButtonMessage;
import net.Thiago.Cultivate.procedures.*;
import net.Thiago.Cultivate.world.inventory.LMenu;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;

public class LScreen extends AbstractContainerScreen<LMenu> {
	private final static HashMap<String, Object> guistate = LMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_breakthrough;

	public LScreen(LMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 223;
		this.imageHeight = 131;
	}

	private static final ResourceLocation texture = new ResourceLocation("cultivate:textures/screens/l.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.cultivate.l.label_talent"), 5, 30, -12829636);
		this.font.draw(poseStack,

				ReturnTalentProcedure.execute(entity), 44, 30, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cultivate.l.label_extra_damage"), 4, 45, -12829636);
		this.font.draw(poseStack,

				ReturnDamageProcedure.execute(entity), 77, 45, -12829636);
		this.font.draw(poseStack,

				RetterProcedure.execute(world, entity), 5, 3, -12829636);
		this.font.draw(poseStack,

				RatioChangerProcedure.execute(world, entity), 5, 15, -12829636);
		this.font.draw(poseStack,

				RetfProcedure.execute(entity), -283, 4, -12829636);
		this.font.draw(poseStack,

				Proc4Procedure.execute(entity), -172, 57, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_breakthrough = Button.builder(Component.translatable("gui.cultivate.l.button_breakthrough"), e -> {
			if (IfbreakthroughProcedure.execute(entity)) {
				Cultivate.PACKET_HANDLER.sendToServer(new LButtonMessage(0, x, y, z));
				LButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 66, this.topPos + 96, 88, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (IfbreakthroughProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_breakthrough", button_breakthrough);
		this.addRenderableWidget(button_breakthrough);
	}
}
