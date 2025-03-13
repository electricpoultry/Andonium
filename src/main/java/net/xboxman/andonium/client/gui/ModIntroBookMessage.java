package net.xboxman.andonium.client.gui;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.xboxman.andonium.Andonium;
import net.xboxman.andonium.client.inventory.ModIntroBookScreen;
import net.xboxman.andonium.procedures.ModIntroGuiButtonClicked;

import java.util.HashMap;

import static net.xboxman.andonium.Andonium.MOD_ID;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record ModIntroBookMessage (int buttonID, int x, int y, int z) implements CustomPacketPayload {
    public static final Type<ModIntroBookMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MOD_ID, "andoniumbookgui_buttons"));
    public static final StreamCodec<RegistryFriendlyByteBuf, ModIntroBookMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ModIntroBookMessage message) -> {
        buffer.writeInt(message.buttonID);
        buffer.writeInt(message.x);
        buffer.writeInt(message.y);
        buffer.writeInt(message.z);
    }, (RegistryFriendlyByteBuf buffer) -> new ModIntroBookMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
    @Override
    public Type<ModIntroBookMessage> type() {
        return TYPE;
    }

    public static void handleData(final ModIntroBookMessage message, final IPayloadContext context) {
        if (context.flow() == PacketFlow.SERVERBOUND) {
            context.enqueueWork(() -> {
                Player entity = context.player();
                int buttonID = message.buttonID;
                int x = message.x;
                int y = message.y;
                int z = message.z;
                handleButtonAction(entity, buttonID, x, y, z);
            }).exceptionally(e -> {
                context.connection().disconnect(Component.literal(e.getMessage()));
                return null;
            });
        }
    }

    public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
        Level world = entity.level();
        HashMap guistate = ModIntroBookScreen.guistate;
        // security measure to prevent arbitrary chunk generation
        if (!world.hasChunkAt(new BlockPos(x, y, z)))
            return;
        if (buttonID == 0) {

            ModIntroGuiButtonClicked.execute(entity);
        }
    }

    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        Andonium.addNetworkMessage(ModIntroBookMessage.TYPE, ModIntroBookMessage.STREAM_CODEC, ModIntroBookMessage::handleData);
    }
}
