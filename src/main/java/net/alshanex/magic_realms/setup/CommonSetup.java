package net.alshanex.magic_realms.setup;

import net.alshanex.magic_realms.MagicRealms;
import net.alshanex.magic_realms.entity.RandomHumanEntity;
import net.alshanex.magic_realms.entity.WardenCloneEntity;
import net.alshanex.magic_realms.registry.MREntityRegistry;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = MagicRealms.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CommonSetup {
    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put(MREntityRegistry.HUMAN.get(), RandomHumanEntity.prepareAttributes().build());
        event.put(MREntityRegistry.ELDRITCH_CLONE.get(), WardenCloneEntity.createCloneAttributes().build());
    }
}
