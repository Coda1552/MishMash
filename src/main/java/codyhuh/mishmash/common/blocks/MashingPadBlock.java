package codyhuh.mishmash.common.blocks;

import codyhuh.mishmash.common.blocks.entities.MashingPadBlockEntity;
import codyhuh.mishmash.registry.MMBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class MashingPadBlock extends BaseEntityBlock {

    public MashingPadBlock(Properties builder) {
        super(builder);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState p_153213_, BlockEntityType<T> type) {
        return createTickerHelper(type, MMBlockEntities.MASHING_PAD.get(), MashingPadBlockEntity::serverTick);
    }

    @Override
    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return MMBlockEntities.MASHING_PAD.get().create(pos, state);
    }
}
