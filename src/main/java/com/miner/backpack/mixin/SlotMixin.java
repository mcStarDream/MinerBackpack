package com.miner.backpack.mixin;

import com.miner.backpack.ModItems;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Slot.class)
public abstract class SlotMixin {
    @Shadow
    @Final
    private Inventory inventory;

    @Inject(method = "getMaxItemCount(Lnet/minecraft/item/ItemStack;)I", at = @At("HEAD"), cancellable = true)
    private void onGetMaxItemCount(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        if (inventory instanceof PlayerInventory && ModItems.isStackableItem(stack.getItem())) {
            cir.setReturnValue(ModItems.MAX_STACK_SIZE);
        }
    }
}