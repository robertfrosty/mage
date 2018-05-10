/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author noxx
 */
public class Weatherlight extends ExpansionSet {

    private static final Weatherlight instance = new Weatherlight();

    public static Weatherlight getInstance() {
        return instance;
    }

    private Weatherlight() {
        super("Weatherlight", "WTH", ExpansionSet.buildDate(1997, 5, 31), SetType.EXPANSION);
        this.blockName = "Mirage";
        this.parentSet = Mirage.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Abduction", 30, Rarity.UNCOMMON, mage.cards.a.Abduction.class));
        cards.add(new SetCardInfo("Abeyance", 1, Rarity.RARE, mage.cards.a.Abeyance.class));
        cards.add(new SetCardInfo("Abjure", 31, Rarity.COMMON, mage.cards.a.Abjure.class));
        cards.add(new SetCardInfo("Aboroth", 117, Rarity.RARE, mage.cards.a.Aboroth.class));
        cards.add(new SetCardInfo("Abyssal Gatekeeper", 59, Rarity.COMMON, mage.cards.a.AbyssalGatekeeper.class));
        cards.add(new SetCardInfo("Aether Flash", 88, Rarity.UNCOMMON, mage.cards.a.AetherFlash.class));
        cards.add(new SetCardInfo("Agonizing Memories", 60, Rarity.UNCOMMON, mage.cards.a.AgonizingMemories.class));
        cards.add(new SetCardInfo("Alabaster Dragon", 2, Rarity.RARE, mage.cards.a.AlabasterDragon.class));
        cards.add(new SetCardInfo("Alms", 3, Rarity.COMMON, mage.cards.a.Alms.class));
        cards.add(new SetCardInfo("Ancestral Knowledge", 32, Rarity.RARE, mage.cards.a.AncestralKnowledge.class));
        cards.add(new SetCardInfo("Angelic Renewal", 4, Rarity.COMMON, mage.cards.a.AngelicRenewal.class));
        cards.add(new SetCardInfo("Arctic Wolves", 118, Rarity.UNCOMMON, mage.cards.a.ArcticWolves.class));
        cards.add(new SetCardInfo("Ardent Militia", 5, Rarity.COMMON, mage.cards.a.ArdentMilitia.class));
        cards.add(new SetCardInfo("Argivian Find", 6, Rarity.UNCOMMON, mage.cards.a.ArgivianFind.class));
        cards.add(new SetCardInfo("Argivian Restoration", 34, Rarity.UNCOMMON, mage.cards.a.ArgivianRestoration.class));
        cards.add(new SetCardInfo("Aura of Silence", 7, Rarity.UNCOMMON, mage.cards.a.AuraOfSilence.class));
        cards.add(new SetCardInfo("Avizoa", 35, Rarity.RARE, mage.cards.a.Avizoa.class));
        cards.add(new SetCardInfo("Barrow Ghoul", 61, Rarity.COMMON, mage.cards.b.BarrowGhoul.class));
        cards.add(new SetCardInfo("Benalish Infantry", 8, Rarity.COMMON, mage.cards.b.BenalishInfantry.class));
        cards.add(new SetCardInfo("Benalish Knight", 9, Rarity.COMMON, mage.cards.b.BenalishKnight.class));
        cards.add(new SetCardInfo("Benalish Missionary", 10, Rarity.COMMON, mage.cards.b.BenalishMissionary.class));
        cards.add(new SetCardInfo("Bloodrock Cyclops", 90, Rarity.COMMON, mage.cards.b.BloodrockCyclops.class));
        cards.add(new SetCardInfo("Blossoming Wreath", 120, Rarity.COMMON, mage.cards.b.BlossomingWreath.class));
        cards.add(new SetCardInfo("Bogardan Firefiend", 91, Rarity.COMMON, mage.cards.b.BogardanFirefiend.class));
        cards.add(new SetCardInfo("Boiling Blood", 92, Rarity.COMMON, mage.cards.b.BoilingBlood.class));
        cards.add(new SetCardInfo("Bone Dancer", 62, Rarity.RARE, mage.cards.b.BoneDancer.class));
        cards.add(new SetCardInfo("Briar Shield", 121, Rarity.COMMON, mage.cards.b.BriarShield.class));
        cards.add(new SetCardInfo("Bubble Matrix", 146, Rarity.RARE, mage.cards.b.BubbleMatrix.class));
        cards.add(new SetCardInfo("Buried Alive", 63, Rarity.UNCOMMON, mage.cards.b.BuriedAlive.class));
        cards.add(new SetCardInfo("Call of the Wild", 122, Rarity.RARE, mage.cards.c.CallOfTheWild.class));
        cards.add(new SetCardInfo("Chimeric Sphere", 148, Rarity.UNCOMMON, mage.cards.c.ChimericSphere.class));
        cards.add(new SetCardInfo("Cinder Giant", 93, Rarity.UNCOMMON, mage.cards.c.CinderGiant.class));
        cards.add(new SetCardInfo("Cinder Wall", 94, Rarity.COMMON, mage.cards.c.CinderWall.class));
        cards.add(new SetCardInfo("Cloud Djinn", 36, Rarity.UNCOMMON, mage.cards.c.CloudDjinn.class));
        cards.add(new SetCardInfo("Cone of Flame", 95, Rarity.UNCOMMON, mage.cards.c.ConeOfFlame.class));
        cards.add(new SetCardInfo("Debt of Loyalty", 11, Rarity.RARE, mage.cards.d.DebtOfLoyalty.class));
        cards.add(new SetCardInfo("Dense Foliage", 124, Rarity.RARE, mage.cards.d.DenseFoliage.class));
        cards.add(new SetCardInfo("Desperate Gambit", 96, Rarity.UNCOMMON, mage.cards.d.DesperateGambit.class));
        cards.add(new SetCardInfo("Dingus Staff", 149, Rarity.UNCOMMON, mage.cards.d.DingusStaff.class));
        cards.add(new SetCardInfo("Disrupt", 37, Rarity.COMMON, mage.cards.d.Disrupt.class));
        cards.add(new SetCardInfo("Doomsday", 66, Rarity.RARE, mage.cards.d.Doomsday.class));
        cards.add(new SetCardInfo("Downdraft", 125, Rarity.UNCOMMON, mage.cards.d.Downdraft.class));
        cards.add(new SetCardInfo("Duskrider Falcon", 12, Rarity.COMMON, mage.cards.d.DuskriderFalcon.class));
        cards.add(new SetCardInfo("Dwarven Berserker", 97, Rarity.COMMON, mage.cards.d.DwarvenBerserker.class));
        cards.add(new SetCardInfo("Dwarven Thaumaturgist", 98, Rarity.RARE, mage.cards.d.DwarvenThaumaturgist.class));
        cards.add(new SetCardInfo("Empyrial Armor", 13, Rarity.COMMON, mage.cards.e.EmpyrialArmor.class));
        cards.add(new SetCardInfo("Fallow Wurm", 126, Rarity.UNCOMMON, mage.cards.f.FallowWurm.class));
        cards.add(new SetCardInfo("Familiar Ground", 127, Rarity.UNCOMMON, mage.cards.f.FamiliarGround.class));
        cards.add(new SetCardInfo("Fatal Blow", 67, Rarity.COMMON, mage.cards.f.FatalBlow.class));
        cards.add(new SetCardInfo("Fervor", 99, Rarity.RARE, mage.cards.f.Fervor.class));
        cards.add(new SetCardInfo("Festering Evil", 68, Rarity.UNCOMMON, mage.cards.f.FesteringEvil.class));
        cards.add(new SetCardInfo("Fire Whip", 100, Rarity.COMMON, mage.cards.f.FireWhip.class));
        cards.add(new SetCardInfo("Firestorm", 101, Rarity.RARE, mage.cards.f.Firestorm.class));
        cards.add(new SetCardInfo("Fit of Rage", 102, Rarity.COMMON, mage.cards.f.FitOfRage.class));
        cards.add(new SetCardInfo("Fledgling Djinn", 69, Rarity.COMMON, mage.cards.f.FledglingDjinn.class));
        cards.add(new SetCardInfo("Flux", 39, Rarity.COMMON, mage.cards.f.Flux.class));
        cards.add(new SetCardInfo("Fog Elemental", 40, Rarity.COMMON, mage.cards.f.FogElemental.class));
        cards.add(new SetCardInfo("Foriysian Brigade", 14, Rarity.UNCOMMON, mage.cards.f.ForiysianBrigade.class));
        cards.add(new SetCardInfo("Gaea's Blessing", 129, Rarity.UNCOMMON, mage.cards.g.GaeasBlessing.class));
        cards.add(new SetCardInfo("Gallowbraid", 70, Rarity.RARE, mage.cards.g.Gallowbraid.class));
        cards.add(new SetCardInfo("Gemstone Mine", 164, Rarity.UNCOMMON, mage.cards.g.GemstoneMine.class));
        cards.add(new SetCardInfo("Gerrard's Wisdom", 15, Rarity.UNCOMMON, mage.cards.g.GerrardsWisdom.class));
        cards.add(new SetCardInfo("Goblin Bomb", 103, Rarity.RARE, mage.cards.g.GoblinBomb.class));
        cards.add(new SetCardInfo("Goblin Grenadiers", 104, Rarity.UNCOMMON, mage.cards.g.GoblinGrenadiers.class));
        cards.add(new SetCardInfo("Goblin Vandal", 105, Rarity.COMMON, mage.cards.g.GoblinVandal.class));
        cards.add(new SetCardInfo("Guided Strike", 16, Rarity.COMMON, mage.cards.g.GuidedStrike.class));
        cards.add(new SetCardInfo("Harvest Wurm", 130, Rarity.COMMON, mage.cards.h.HarvestWurm.class));
        cards.add(new SetCardInfo("Haunting Misery", 71, Rarity.COMMON, mage.cards.h.HauntingMisery.class));
        cards.add(new SetCardInfo("Heart of Bogardan", 106, Rarity.RARE, mage.cards.h.HeartOfBogardan.class));
        cards.add(new SetCardInfo("Heat Stroke", 107, Rarity.RARE, mage.cards.h.HeatStroke.class));
        cards.add(new SetCardInfo("Heavy Ballista", 17, Rarity.COMMON, mage.cards.h.HeavyBallista.class));
        cards.add(new SetCardInfo("Hidden Horror", 72, Rarity.UNCOMMON, mage.cards.h.HiddenHorror.class));
        cards.add(new SetCardInfo("Hurloon Shaman", 108, Rarity.UNCOMMON, mage.cards.h.HurloonShaman.class));
        cards.add(new SetCardInfo("Infernal Tribute", 73, Rarity.RARE, mage.cards.i.InfernalTribute.class));
        cards.add(new SetCardInfo("Inner Sanctum", 18, Rarity.RARE, mage.cards.i.InnerSanctum.class));
        cards.add(new SetCardInfo("Jabari's Banner", 150, Rarity.UNCOMMON, mage.cards.j.JabarisBanner.class));
        cards.add(new SetCardInfo("Lava Hounds", 109, Rarity.UNCOMMON, mage.cards.l.LavaHounds.class));
        cards.add(new SetCardInfo("Llanowar Behemoth", 132, Rarity.UNCOMMON, mage.cards.l.LlanowarBehemoth.class));
        cards.add(new SetCardInfo("Llanowar Druid", 133, Rarity.COMMON, mage.cards.l.LlanowarDruid.class));
        cards.add(new SetCardInfo("Llanowar Sentinel", 134, Rarity.COMMON, mage.cards.l.LlanowarSentinel.class));
        cards.add(new SetCardInfo("Lotus Vale", 165, Rarity.RARE, mage.cards.l.LotusVale.class));
        cards.add(new SetCardInfo("Mana Chains", 41, Rarity.COMMON, mage.cards.m.ManaChains.class));
        cards.add(new SetCardInfo("Mana Web", 152, Rarity.RARE, mage.cards.m.ManaWeb.class));
        cards.add(new SetCardInfo("Manta Ray", 42, Rarity.COMMON, mage.cards.m.MantaRay.class));
        cards.add(new SetCardInfo("Maraxus of Keld", 111, Rarity.RARE, mage.cards.m.MaraxusOfKeld.class));
        cards.add(new SetCardInfo("Master of Arms", 20, Rarity.UNCOMMON, mage.cards.m.MasterOfArms.class));
        cards.add(new SetCardInfo("Merfolk Traders", 43, Rarity.COMMON, mage.cards.m.MerfolkTraders.class));
        cards.add(new SetCardInfo("Mind Stone", 153, Rarity.COMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mischievous Poltergeist", 74, Rarity.UNCOMMON, mage.cards.m.MischievousPoltergeist.class));
        cards.add(new SetCardInfo("Mistmoon Griffin", 21, Rarity.UNCOMMON, mage.cards.m.MistmoonGriffin.class));
        cards.add(new SetCardInfo("Morinfen", 75, Rarity.RARE, mage.cards.m.Morinfen.class));
        cards.add(new SetCardInfo("Mwonvuli Ooze", 135, Rarity.RARE, mage.cards.m.MwonvuliOoze.class));
        cards.add(new SetCardInfo("Nature's Kiss", 136, Rarity.COMMON, mage.cards.n.NaturesKiss.class));
        cards.add(new SetCardInfo("Nature's Resurgence", 137, Rarity.RARE, mage.cards.n.NaturesResurgence.class));
        cards.add(new SetCardInfo("Necratog", 76, Rarity.UNCOMMON, mage.cards.n.Necratog.class));
        cards.add(new SetCardInfo("Noble Benefactor", 44, Rarity.UNCOMMON, mage.cards.n.NobleBenefactor.class));
        cards.add(new SetCardInfo("Null Rod", 154, Rarity.RARE, mage.cards.n.NullRod.class));
        cards.add(new SetCardInfo("Odylic Wraith", 77, Rarity.UNCOMMON, mage.cards.o.OdylicWraith.class));
        cards.add(new SetCardInfo("Ophidian", 45, Rarity.COMMON, mage.cards.o.Ophidian.class));
        cards.add(new SetCardInfo("Orcish Settlers", 112, Rarity.UNCOMMON, mage.cards.o.OrcishSettlers.class));
        cards.add(new SetCardInfo("Paradigm Shift", 46, Rarity.RARE, mage.cards.p.ParadigmShift.class));
        cards.add(new SetCardInfo("Peacekeeper", 22, Rarity.RARE, mage.cards.p.Peacekeeper.class));
        cards.add(new SetCardInfo("Pendrell Mists", 47, Rarity.RARE, mage.cards.p.PendrellMists.class));
        cards.add(new SetCardInfo("Phantom Warrior", 48, Rarity.UNCOMMON, mage.cards.p.PhantomWarrior.class));
        cards.add(new SetCardInfo("Phantom Wings", 49, Rarity.COMMON, mage.cards.p.PhantomWings.class));
        cards.add(new SetCardInfo("Phyrexian Furnace", 155, Rarity.UNCOMMON, mage.cards.p.PhyrexianFurnace.class));
        cards.add(new SetCardInfo("Psychic Vortex", 50, Rarity.RARE, mage.cards.p.PsychicVortex.class));
        cards.add(new SetCardInfo("Razortooth Rats", 78, Rarity.COMMON, mage.cards.r.RazortoothRats.class));
        cards.add(new SetCardInfo("Redwood Treefolk", 138, Rarity.COMMON, mage.cards.r.RedwoodTreefolk.class));
        cards.add(new SetCardInfo("Relearn", 51, Rarity.UNCOMMON, mage.cards.r.Relearn.class));
        cards.add(new SetCardInfo("Revered Unicorn", 23, Rarity.UNCOMMON, mage.cards.r.ReveredUnicorn.class));
        cards.add(new SetCardInfo("Roc Hatchling", 113, Rarity.UNCOMMON, mage.cards.r.RocHatchling.class));
        cards.add(new SetCardInfo("Rogue Elephant", 139, Rarity.COMMON, mage.cards.r.RogueElephant.class));
        cards.add(new SetCardInfo("Sage Owl", 52, Rarity.COMMON, mage.cards.s.SageOwl.class));
        cards.add(new SetCardInfo("Scorched Ruins", 166, Rarity.RARE, mage.cards.s.ScorchedRuins.class));
        cards.add(new SetCardInfo("Serenity", 24, Rarity.RARE, mage.cards.s.Serenity.class));
        cards.add(new SetCardInfo("Serra's Blessing", 25, Rarity.UNCOMMON, mage.cards.s.SerrasBlessing.class));
        cards.add(new SetCardInfo("Serrated Biskelion", 156, Rarity.UNCOMMON, mage.cards.s.SerratedBiskelion.class));
        cards.add(new SetCardInfo("Shadow Rider", 79, Rarity.COMMON, mage.cards.s.ShadowRider.class));
        cards.add(new SetCardInfo("Shattered Crypt", 80, Rarity.COMMON, mage.cards.s.ShatteredCrypt.class));
        cards.add(new SetCardInfo("Soul Shepherd", 26, Rarity.COMMON, mage.cards.s.SoulShepherd.class));
        cards.add(new SetCardInfo("Southern Paladin", 27, Rarity.RARE, mage.cards.s.SouthernPaladin.class));
        cards.add(new SetCardInfo("Spinning Darkness", 81, Rarity.COMMON, mage.cards.s.SpinningDarkness.class));
        cards.add(new SetCardInfo("Steel Golem", 157, Rarity.UNCOMMON, mage.cards.s.SteelGolem.class));
        cards.add(new SetCardInfo("Strands of Night", 82, Rarity.UNCOMMON, mage.cards.s.StrandsOfNight.class));
        cards.add(new SetCardInfo("Straw Golem", 158, Rarity.UNCOMMON, mage.cards.s.StrawGolem.class));
        cards.add(new SetCardInfo("Striped Bears", 140, Rarity.COMMON, mage.cards.s.StripedBears.class));
        cards.add(new SetCardInfo("Tariff", 28, Rarity.RARE, mage.cards.t.Tariff.class));
        cards.add(new SetCardInfo("Teferi's Veil", 53, Rarity.UNCOMMON, mage.cards.t.TeferisVeil.class));
        cards.add(new SetCardInfo("Tendrils of Despair", 83, Rarity.COMMON, mage.cards.t.TendrilsOfDespair.class));
        cards.add(new SetCardInfo("Thran Forge", 159, Rarity.UNCOMMON, mage.cards.t.ThranForge.class));
        cards.add(new SetCardInfo("Thunderbolt", 115, Rarity.COMMON, mage.cards.t.Thunderbolt.class));
        cards.add(new SetCardInfo("Thundermare", 116, Rarity.RARE, mage.cards.t.Thundermare.class));
        cards.add(new SetCardInfo("Timid Drake", 54, Rarity.UNCOMMON, mage.cards.t.TimidDrake.class));
        cards.add(new SetCardInfo("Tolarian Drake", 55, Rarity.COMMON, mage.cards.t.TolarianDrake.class));
        cards.add(new SetCardInfo("Tolarian Entrancer", 56, Rarity.RARE, mage.cards.t.TolarianEntrancer.class));
        cards.add(new SetCardInfo("Tolarian Serpent", 57, Rarity.RARE, mage.cards.t.TolarianSerpent.class));
        cards.add(new SetCardInfo("Touchstone", 161, Rarity.UNCOMMON, mage.cards.t.Touchstone.class));
        cards.add(new SetCardInfo("Tranquil Grove", 142, Rarity.RARE, mage.cards.t.TranquilGrove.class));
        cards.add(new SetCardInfo("Uktabi Efreet", 143, Rarity.COMMON, mage.cards.u.UktabiEfreet.class));
        cards.add(new SetCardInfo("Urborg Justice", 84, Rarity.RARE, mage.cards.u.UrborgJustice.class));
        cards.add(new SetCardInfo("Urborg Stalker", 85, Rarity.RARE, mage.cards.u.UrborgStalker.class));
        cards.add(new SetCardInfo("Veteran Explorer", 144, Rarity.UNCOMMON, mage.cards.v.VeteranExplorer.class));
        cards.add(new SetCardInfo("Vitalize", 145, Rarity.COMMON, mage.cards.v.Vitalize.class));
        cards.add(new SetCardInfo("Vodalian Illusionist", 58, Rarity.UNCOMMON, mage.cards.v.VodalianIllusionist.class));
        cards.add(new SetCardInfo("Volunteer Reserves", 29, Rarity.UNCOMMON, mage.cards.v.VolunteerReserves.class));
        cards.add(new SetCardInfo("Wave of Terror", 86, Rarity.RARE, mage.cards.w.WaveOfTerror.class));
        cards.add(new SetCardInfo("Well of Knowledge", 162, Rarity.RARE, mage.cards.w.WellOfKnowledge.class));
        cards.add(new SetCardInfo("Winding Canyons", 167, Rarity.RARE, mage.cards.w.WindingCanyons.class));
        cards.add(new SetCardInfo("Xanthic Statue", 163, Rarity.RARE, mage.cards.x.XanthicStatue.class));
        cards.add(new SetCardInfo("Zombie Scavengers", 87, Rarity.COMMON, mage.cards.z.ZombieScavengers.class));
    }
}
