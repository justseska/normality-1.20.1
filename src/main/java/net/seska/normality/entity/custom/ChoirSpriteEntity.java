package net.seska.normality.entity.custom;

import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.seska.normality.entity.ModEntities;
import net.seska.normality.entity.variant.ChoirSpriteVariant;
import net.seska.normality.item.ModItems;
import net.seska.normality.loot.ModLootTables;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class ChoirSpriteEntity extends AnimalEntity
    implements Flutterer {
    private float currentPitch;
    private float lastPitch;
    private static final TrackedData<Integer> DATA_ID_TYPE_VARIANT =
            DataTracker.registerData(ChoirSpriteEntity.class, TrackedDataHandlerRegistry.INTEGER);
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }
    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition) {
    }
    private static final Map<ChoirSpriteVariant, ItemConvertible> DROPS = Util.make(Maps.newEnumMap(ChoirSpriteVariant.class), map -> {
        map.put(ChoirSpriteVariant.ROSE, ModItems.ROSE_FUZZ);
        map.put(ChoirSpriteVariant.ULTRAMARINE, ModItems.ULTRAMARINE_FUZZ);
        map.put(ChoirSpriteVariant.CHARTREUSE, ModItems.CHARTREUSE_FUZZ);
        map.put(ChoirSpriteVariant.SPRING_GREEN, ModItems.SPRING_GREEN_FUZZ);
        map.put(ChoirSpriteVariant.VIOLET, ModItems.VIOLET_FUZZ);
        map.put(ChoirSpriteVariant.CAPRI, ModItems.CAPRI_FUZZ);
        map.put(ChoirSpriteVariant.PRIMROSE, ModItems.PRIMROSE_FUZZ);
    });
    public ChoirSpriteEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new FlightMoveControl(this, 20, true);
        this.lookControl = new ChoirSpriteLookControl(this);
        this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, -1.0f);
        this.setPathfindingPenalty(PathNodeType.WATER, -1.0f);
        this.setPathfindingPenalty(PathNodeType.WATER_BORDER, 16.0f);
        this.setPathfindingPenalty(PathNodeType.COCOA, -1.0f);
        this.setPathfindingPenalty(PathNodeType.FENCE, -1.0f);
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new EscapeDangerGoal(this, 1.25));
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(0, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(1, new TemptGoal(this, 1.25, Ingredient.ofItems(Items.CHORUS_FRUIT), false));
        this.goalSelector.add(2, new FollowParentGoal(this, 1.25));
        this.goalSelector.add(3, new WanderAroundGoal(this, 0.75));
        this.goalSelector.add(4, new FollowMobGoal(this, 1.0, 3.0f, 7.0f));
    }
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }
    public float getBodyPitch(float tickDelta) {
        return MathHelper.lerp(tickDelta, this.lastPitch, this.currentPitch);
    }
    @Override
    protected EntityNavigation createNavigation(World world) {
        BirdNavigation birdNavigation = new BirdNavigation(this, world){
            @Override
            public boolean isValidPosition(BlockPos pos) {
                return !this.world.getBlockState(pos.down()).isAir();
            }
            @Override
            public void tick() {
                super.tick();
            }
        };
        birdNavigation.setCanPathThroughDoors(false);
        birdNavigation.setCanSwim(false);
        birdNavigation.setCanEnterOpenDoors(true);
        return birdNavigation;
    }
    protected void updateLimbs(float v) {
        float f;
        if (this.getPose() == EntityPose.STANDING) {
            f = Math.min(v * 6.0F, 1.0F);
        } else {
            f = 0.0F;
        }
    }
    @Override
    public void tick() {
        super.tick();

        if(this.getWorld().isClient()) {
            this.setupAnimationStates();
            this.setVelocity(this.getVelocity().multiply(1.0, 0.6, 1.0));
        }
    }
    public static DefaultAttributeContainer.Builder createChoirSpriteAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0).add(EntityAttributes.GENERIC_FLYING_SPEED, 0.6f).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0);
    }
    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.CHOIR_SPRITE.create(world);
    }
    @Override
    public boolean isInAir() {
        return !this.isOnGround();
    }
    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(DATA_ID_TYPE_VARIANT, 0);
    }
    @Override
    public Identifier getLootTableId() {
        return switch (this.getVariant()) {
            case ROSE -> ModLootTables.ROSE_CHOIR_SPRITE_ENTITY;
            case ULTRAMARINE -> ModLootTables.ULTRAMARINE_CHOIR_SPRITE_ENTITY;
            case CHARTREUSE -> ModLootTables.CHARTREUSE_CHOIR_SPRITE_ENTITY;
            case SPRING_GREEN -> ModLootTables.SPRING_GREEN_CHOIR_SPRITE_ENTITY;
            case VIOLET -> ModLootTables.VIOLET_CHOIR_SPRITE_ENTITY;
            case CAPRI -> ModLootTables.CAPRI_CHOIR_SPRITE_ENTITY;
            case PRIMROSE -> ModLootTables.PRIMROSE_CHOIR_SPRITE_ENTITY;
        };
    }
    class ChoirSpriteLookControl
            extends LookControl {
        ChoirSpriteLookControl(MobEntity entity) {
            super(entity);
        }
    }
    // VARIANTS
    public ChoirSpriteVariant getVariant() {
        return ChoirSpriteVariant.byId(this.getTypeVariant() & 255);
    }
    private int getTypeVariant() {
        return this.dataTracker.get(DATA_ID_TYPE_VARIANT);
    }
    private void setVariant(ChoirSpriteVariant variant) {
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, variant.getId() & 255);
    }
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable NbtCompound entityNbt) {

        ChoirSpriteVariant variant = Util.getRandom(ChoirSpriteVariant.values(), this.random);
        setVariant(variant);
        return super.initialize(world, difficulty, spawnReason, entityData, entityNbt);
    }
    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.dataTracker.set(DATA_ID_TYPE_VARIANT, nbt.getInt("Variant"));
    }
    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getTypeVariant());
    }
    //SOUNDS

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_BEE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_BEE_DEATH;
    }
    //BREEDING

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.CHORUS_FRUIT);
    }
}
