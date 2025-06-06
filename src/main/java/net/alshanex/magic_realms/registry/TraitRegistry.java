package net.alshanex.magic_realms.registry;

import dev.xkmc.l2hostility.content.config.TraitConfig;
import dev.xkmc.l2hostility.init.entries.TraitEntry;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import net.alshanex.magic_realms.MagicRealms;
import net.alshanex.magic_realms.traits.*;
import net.minecraft.ChatFormatting;

public class TraitRegistry {
    public static final TraitEntry<MagicSchoolImmunity> FIRE_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> BLOOD_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> ELDRITCH_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> ENDER_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> EVOCATION_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> HOLY_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> ICE_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> LIGHTNING_SCHOOL_IMMUNITY;
    public static final TraitEntry<MagicSchoolImmunity> NATURE_SCHOOL_IMMUNITY;

    public static final TraitEntry<Vampiric> VAMPIRIC;
    public static final TraitEntry<Sneaky> SNEAKY;
    public static final TraitEntry<AntiMagic> ANTI_MAGIC;
    public static final TraitEntry<ManaSyphon> MANA_SIPHON;
    public static final TraitEntry<DephtRuler> DEPHT_RULER;
    public static final TraitEntry<Disrupt> DISRUPT;
    public static final TraitEntry<Pickpocket> PICKPOCKET;
    public static final TraitEntry<TrueEye> TRUE_EYE;

    static {
        //no desc
        {}
        //common
        {
            FIRE_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("fire_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.RED, SchoolRegistry.FIRE.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by fire spells.")
                    .lang("Fire Spells Immunity").register();

            BLOOD_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("blood_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.DARK_RED, SchoolRegistry.BLOOD.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by blood spells.")
                    .lang("Blood Spells Immunity").register();

            ELDRITCH_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("eldritch_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.DARK_AQUA, SchoolRegistry.ELDRITCH.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by eldritch spells.")
                    .lang("Eldritch Spells Immunity").register();

            ENDER_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("ender_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.LIGHT_PURPLE, SchoolRegistry.ENDER.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by ender spells.")
                    .lang("Ender Spells Immunity").register();

            EVOCATION_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("evocation_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.GRAY, SchoolRegistry.EVOCATION.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by evocation spells.")
                    .lang("Evocation Spells Immunity").register();

            HOLY_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("holy_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.YELLOW, SchoolRegistry.HOLY.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by holy spells.")
                    .lang("Holy Spells Immunity").register();

            ICE_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("ice_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.AQUA, SchoolRegistry.ICE.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by ice spells.")
                    .lang("Ice Spells Immunity").register();

            LIGHTNING_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("lightning_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.BLUE, SchoolRegistry.LIGHTNING.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by lightning spells.")
                    .lang("Lightning Spells Immunity").register();

            NATURE_SCHOOL_IMMUNITY = MagicRealms.MRREGISTRATE.regTrait("nature_school_immunity", () -> new MagicSchoolImmunity(ChatFormatting.GREEN, SchoolRegistry.NATURE.get()),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Immune to all damage caused by nature spells.")
                    .lang("Nature Spells Immunity").register();

            VAMPIRIC = MagicRealms.MRREGISTRATE.regTrait("vampiric", () -> new Vampiric(ChatFormatting.DARK_RED),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("When attacked by blood spells, get healed instead of damaged.")
                    .lang("Vampiric").register();

            SNEAKY = MagicRealms.MRREGISTRATE.regTrait("sneaky", () -> new Sneaky(ChatFormatting.DARK_GREEN),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Dodges long range attacks, only receives damage from close range attacks.")
                    .lang("Sneaky").register();

            DEPHT_RULER = MagicRealms.MRREGISTRATE.regTrait("depht_ruler", () -> new DephtRuler(ChatFormatting.DARK_AQUA),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Cancels eldritch school casts and a sculk guardian will punish the caster.")
                    .lang("Ruler of the Dephts").register();

            PICKPOCKET = MagicRealms.MRREGISTRATE.regTrait("pickpocket", () -> new Pickpocket(ChatFormatting.GRAY),
                            new TraitConfig(20, 100, 1, 10))
                    .desc("Has a 50% chance to steal a random effect from the attacker.")
                    .lang("Pickpocket").register();
        }
        //legendary
        {
            ANTI_MAGIC = MagicRealms.MRREGISTRATE.regTrait("anti_magic", () -> new AntiMagic(ChatFormatting.BLACK),
                            new TraitConfig(120, 50, 1, 100))
                    .desc("Being attacked by a magic summon will cancel their magic, getting them unsummoned.")
                    .lang("Antimagic Touch").register();

            DISRUPT = MagicRealms.MRREGISTRATE.regTrait("disrupt", () -> new Disrupt(ChatFormatting.LIGHT_PURPLE),
                            new TraitConfig(120, 50, 1, 50))
                    .desc("There's a 50% chance for spells casted near the entity to backfire.")
                    .lang("Disrupt").register();

            TRUE_EYE = MagicRealms.MRREGISTRATE.regTrait("true_eye", () -> new TrueEye(ChatFormatting.GOLD),
                            new TraitConfig(120, 50, 1, 50))
                    .desc("Can see through everything, cancels effects like invisibility or evasion.")
                    .lang("True Eye").register();

            MANA_SIPHON = MagicRealms.MRREGISTRATE.regTrait("mana_siphon", () -> new ManaSyphon(ChatFormatting.AQUA),
                            new TraitConfig(100, 50, 3, 300))
                    .desc("Drains 50 mana to players within %s blocks and apply trait effects for every %ss")
                    .lang("Mana Siphon").register();
        }
    }

    public static void register() {
    }
}
