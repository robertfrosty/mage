package mage.cards.u;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.continuous.BecomesCreatureTargetEffect;
import mage.abilities.keyword.ToxicAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.game.permanent.token.custom.CreatureToken;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

public class UnctussRetrofitter extends CardImpl {
    public UnctussRetrofitter(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.addSubType(SubType.PHYREXIAN);
        this.addSubType(SubType.ARTIFICER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        //Toxic 1
        this.addAbility(new ToxicAbility(1));

        //When Unctus's Retrofitter enters the battlefield, up to one target artifact you control becomes an artifact
        //creature with base power and toughness 4/4 for as long as Unctus's Retrofitter remains on the battlefield.
        EntersBattlefieldTriggeredAbility entersBattlefieldTriggeredAbility =
                new EntersBattlefieldTriggeredAbility(new UnctussRetrofitterBecomesCreatureEffect());
        entersBattlefieldTriggeredAbility.addTarget(new TargetControlledPermanent(
                0, 1, StaticFilters.FILTER_CONTROLLED_PERMANENT_ARTIFACT, false
        ));
        this.addAbility(entersBattlefieldTriggeredAbility);
    }

    private UnctussRetrofitter(final UnctussRetrofitter card) {
        super(card);
    }

    @Override
    public UnctussRetrofitter copy() {
        return new UnctussRetrofitter(this);
    }
}

class UnctussRetrofitterBecomesCreatureEffect extends BecomesCreatureTargetEffect {

    public UnctussRetrofitterBecomesCreatureEffect() {
        super( new CreatureToken(4, 4, "4/4 artifact creature")
                .withType(CardType.ARTIFACT), false, false, Duration.WhileOnBattlefield);
        this.staticText = "up to one target artifact you control becomes an artifact creature with base power and " +
                "toughness 4/4 for as long as {this} remains on the battlefield";
    }

    public UnctussRetrofitterBecomesCreatureEffect(final UnctussRetrofitterBecomesCreatureEffect effect) {
        super(effect);
    }

    @Override
    public UnctussRetrofitterBecomesCreatureEffect copy() {
        return new UnctussRetrofitterBecomesCreatureEffect(this);
    }

    @Override
    public boolean apply(Layer layer, SubLayer sublayer, Ability source, Game game) {
        Permanent sourcePermanent = game.getPermanent(source.getSourceId());
        if (sourcePermanent == null) {
            this.discard();
            return false;
        }
        return super.apply(layer, sublayer, source, game);
    }
}
