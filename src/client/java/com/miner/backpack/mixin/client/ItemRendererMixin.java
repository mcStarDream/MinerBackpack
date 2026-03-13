package com.miner.backpack.mixin.client;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Inject(method = "renderGuiItemOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V", at = @At("HEAD"), cancellable = true)
    private void onRenderGuiItemOverlay(DrawContext context, TextRenderer renderer, ItemStack stack, int x, int y, String countLabel, CallbackInfo ci) {
        if (stack.isEmpty()) {
            return;
        }

        if (countLabel == null) {
            countLabel = String.valueOf(stack.getCount());
        }

        int length = countLabel.length();
        if (length <= 2) {
            return;
        }

        float scale = 1.0f;
        if (length == 3) {
            scale = 0.8f;
        } else if (length >= 4) {
            scale = 0.65f;
        }

        context.getMatrices().push();
        context.getMatrices().translate(x + 16, y + 16, 0);
        context.getMatrices().scale(scale, scale, 1.0f);
        context.getMatrices().translate(-(x + 16), -(y + 16), 0);

        int textX = x + 19 - 2 - renderer.getWidth(countLabel);
        int textY = y + 6 + 3;
        context.drawTextWithShadow(renderer, countLabel, textX, textY, 0xFFFFFF);

        context.getMatrices().pop();

        ci.cancel();
    }
}
