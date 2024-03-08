package net.seska.normality.item.custom;


import net.minecraft.entity.decoration.LeashKnotEntity;
import net.minecraft.item.LeadItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.List;

public class WebLeadItem  extends LeadItem{

    public WebLeadItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos;
        World world = context.getWorld();
        BlockState blockState = world.getBlockState(blockPos = context.getBlockPos());
        if (blockState.isIn(BlockTags.FENCES)) {PlayerEntity playerEntity = context.getPlayer();if (!world.isClient && playerEntity != null) {    LeadItem.attachHeldMobsToBlock(playerEntity, world, blockPos);}return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    public static ActionResult attachHeldMobsToBlock(PlayerEntity player, World world, BlockPos pos) {
        LeashKnotEntity leashKnotEntity = null;
        boolean bl = false;
        double d = 7.0;
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        List<MobEntity> list = world.getNonSpectatingEntities(MobEntity.class, new Box((double)i - 7.0, (double)j - 7.0, (double)k - 7.0, (double)i + 7.0, (double)j + 7.0, (double)k + 7.0));
        for (MobEntity mobEntity : list) {if (mobEntity.getHoldingEntity() != player) continue;if (leashKnotEntity == null) {    leashKnotEntity = LeashKnotEntity.getOrCreate(world, pos);    leashKnotEntity.onPlace();}mobEntity.attachLeash(leashKnotEntity, true);bl = true;
        }
        if (bl) {world.emitGameEvent(GameEvent.BLOCK_ATTACH, pos, GameEvent.Emitter.of(player));
        }
        return bl ? ActionResult.SUCCESS : ActionResult.PASS;
    }
}
