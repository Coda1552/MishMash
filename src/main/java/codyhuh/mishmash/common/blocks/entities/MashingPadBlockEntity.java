package codyhuh.mishmash.common.blocks.entities;

import codyhuh.mishmash.registry.MMBlockEntities;
import codyhuh.mishmash.registry.MMBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class MashingPadBlockEntity extends BlockEntity {

    public MashingPadBlockEntity(BlockPos pos, BlockState state) {
        super(MMBlockEntities.MASHING_PAD.get(), pos, state);
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, MashingPadBlockEntity blockEntity) {
        AABB aabb = new AABB(pos);
        List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class, aabb.expandTowards(0.0D, 1.0D, 0.0D));

        if (level.hasChunksAt(pos, pos) && state.is(MMBlocks.MASHING_PAD.get()) && !level.getBlockState(pos).isAir() && !entities.isEmpty()) {
            Minecraft.getInstance().getChatListener().handleSystemMessage(Component.literal("ewww dude don't step in that!"), true);
        }
    }
}
