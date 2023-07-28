package net.elytraautopilot.mixin;

import net.elytraautopilot.ElytraAutoPilot;
import net.elytraautopilot.config.ModConfig;
import net.elytraautopilot.utils.Hud;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {
	@Inject(at = @At(value = "RETURN"), method = "render")
	public void renderPost(DrawContext context, float f, CallbackInfo ci) {
		// TODO allow drawing on background of current screen
		if (!ci.isCancelled()) {
			MinecraftClient minecraftClient = MinecraftClient.getInstance();
			if (minecraftClient.currentScreen == null && ElytraAutoPilot.calculateHud) {
				if (Hud.hudString != null) {
					int stringX = ModConfig.gui.guiX;
					int stringY = ModConfig.gui.guiY;
					for (int i = 0; i < Hud.hudString.length; i++) {
						context.drawTextWithShadow(minecraftClient.textRenderer, Hud.hudString[i].asOrderedText(), stringX, stringY, 0xFFFFFF);
						stringY += minecraftClient.textRenderer.fontHeight + 1;
					}
				}
			}
		}
	}
}
