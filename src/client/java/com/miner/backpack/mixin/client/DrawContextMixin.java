package com.miner.backpack.mixin.client;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DrawContext.class)
public abstract class DrawContextMixin {

    @Redirect(method = "drawItemInSlot", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)I"))
    private int onDrawTextWithShadow(DrawContext context, TextRenderer renderer, String text, int x, int y, int color) {
        if (text == null) {
            return 0;
        }

        int length = text.length();
        if (length <= 2) {
            return context.drawTextWithShadow(renderer, text, x, y, color);
        }

        float scale = 1.0f;
        if (length == 3) {
            scale = 0.8f;
        } else if (length >= 4) {
            scale = 0.65f;
        }

        ((DrawContext) (Object) this).getMatrices().push();
        ((DrawContext) (Object) this).getMatrices().translate(x + renderer.getWidth(text) / 2.0f, y + 4, 0);
        ((DrawContext) (Object) this).getMatrices().scale(scale, scale, 1.0f);
        ((DrawContext) (Object) this).getMatrices().translate(-(x + renderer.getWidth(text) / 2.0f), -(y + 4), 0);

        int result = context.drawTextWithShadow(renderer, text, x, y, color);

        ((DrawContext) (Object) this).getMatrices().pop();

        return result;
    }
}
