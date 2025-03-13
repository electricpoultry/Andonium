package net.xboxman.andonium.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.xboxman.andonium.item.ModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ModIntroBookToPlayer {
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        execute(event, event.getEntity());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(ResourceLocation.parse("andonium:andonium_intro_book_give_anvace"))).isDone()) {
            if (entity instanceof Player _player)
                _player.giveExperiencePoints(0);
            if (entity instanceof ServerPlayer _player) {
                AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("andonium:base_andonium_advacement"));
                if (_adv != null) {
                    AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
                    if (!_ap.isDone()) {
                        for (String criteria : _ap.getRemainingCriteria())
                            _player.getAdvancements().award(_adv, criteria);
                    }
                }
            }
        } else {
            if (entity instanceof ServerPlayer _player) {
                AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("andonium:andonium_intro_book_give_anvace"));
                if (_adv != null) {
                    AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
                    if (!_ap.isDone()) {
                        for (String criteria : _ap.getRemainingCriteria())
                            _player.getAdvancements().award(_adv, criteria);
                    }
                }
            }
            if (entity instanceof Player _player) {
                ItemStack _setstack = new ItemStack(ModItems.INTRO_BOOK.get()).copy();
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
            }
            if (entity instanceof ServerPlayer _player) {
                AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("andonium:base_andonium_advacement"));
                if (_adv != null) {
                    AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
                    if (!_ap.isDone()) {
                        for (String criteria : _ap.getRemainingCriteria())
                            _player.getAdvancements().award(_adv, criteria);
                    }
                }
            }
        }
    }
}
