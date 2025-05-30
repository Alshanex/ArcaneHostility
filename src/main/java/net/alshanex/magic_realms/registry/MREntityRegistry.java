package net.alshanex.magic_realms.registry;

import net.alshanex.magic_realms.MagicRealms;
import net.alshanex.magic_realms.entity.RandomHumanEntity;
import net.alshanex.magic_realms.entity.WardenCloneEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MREntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MagicRealms.MODID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    public static final DeferredHolder<EntityType<?>, EntityType<RandomHumanEntity>> HUMAN =
            ENTITIES.register("human_entity", () -> EntityType.Builder.<RandomHumanEntity>of(RandomHumanEntity::new, MobCategory.MISC)
                    .sized(.6f, 1.8f)
                    .clientTrackingRange(64)
                    .build(ResourceLocation.fromNamespaceAndPath(MagicRealms.MODID, "human_entity").toString()));

    public static final DeferredHolder<EntityType<?>, EntityType<WardenCloneEntity>> ELDRITCH_CLONE =
            ENTITIES.register("warden_clone", () -> EntityType.Builder.<WardenCloneEntity>of(WardenCloneEntity::new, MobCategory.MONSTER)
                    .sized(.6f, 1.8f)
                    .clientTrackingRange(64)
                    .build(ResourceLocation.fromNamespaceAndPath(MagicRealms.MODID, "warden_clone").toString()));
}
