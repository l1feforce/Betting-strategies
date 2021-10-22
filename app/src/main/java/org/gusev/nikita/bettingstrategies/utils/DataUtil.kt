package org.gusev.nikita.bettingstrategies.utils

import org.gusev.nikita.bettingstrategies.R
import org.gusev.nikita.bettingstrategies.model.Strategy

object DataUtil {
    fun getStrategiesData(): List<Strategy> =
        listOf(
            Strategy(
                title = "Card counting",
                image = R.drawable.img_card_counting,
                description = "Card counting is a blackjack strategy used to determine whether the player or the dealer has an advantage on the next hand. Card counters are advantage players who try to overcome the casino house edge by keeping a running count of high and low valued cards dealt. They generally bet more when they have an advantage and less when the dealer has an advantage. They also change playing decisions based on the composition of the deck."
            ),
            Strategy(
                title = "Martingale",
                image = R.drawable.img_martingale,
                description = "A martingale is a class of betting strategies that originated from and were popular in 18th-century France. The simplest of these strategies was designed for a game in which the gambler wins the stake if a coin comes up heads and loses if it comes up tails. The strategy had the gambler double the bet after every loss, so that the first win would recover all previous losses plus win a profit equal to the original stake. Thus the strategy is an instantiation of the St. Petersburg paradox.\n" +
                        "\n" +
                        "Since a gambler will almost surely eventually flip heads, the martingale betting strategy is certain to make money for the gambler provided they have infinite wealth and there is no limit on money earned in a single bet. However, no gambler has infinite wealth, and the exponential growth of the bets can bankrupt unlucky gamblers who chose to use the martingale, causing a catastrophic loss. Despite the fact that the gambler usually wins a small net reward, thus appearing to have a sound strategy, the gambler's expected value remains zero because the small probability that the gambler will suffer a catastrophic loss exactly balances with the expected gain. In a casino, the expected value is negative, due to the house's edge. Additionally, as the likelihood of a string of consecutive losses occurs more often than common intuition suggests, martingale strategies can bankrupt a gambler quickly.\n" +
                        "\n" +
                        "The martingale strategy has also been applied to roulette, as the probability of hitting either red or black is close to 50%."
            ),
            Strategy(
                title = "Handicapping",
                image = R.drawable.img_handicapping,
                description = "Handicapping, in sport and games, is the practice of assigning advantage through scoring compensation or other advantage given to different contestants to equalize the chances of winning. The word also applies to the various methods by which the advantage is calculated. In principle, a more experienced participant is disadvantaged, or a less experienced or capable participant is advantaged, in order to make it possible for the less experienced participant to win whilst maintaining fairness. Handicapping is used in scoring many games and competitive sports, including go, shogi, chess, croquet, golf, bowling, polo, basketball, and track and field events. Handicap races are common in clubs which encourage all levels of participants, such as swimming or in cycling clubs and sailing clubs, or which allow participants with a variety of standards of equipment. Often races, contests or tournaments where this practice is competitively employed are known as Handicaps.\n" +
                        "\n" +
                        "Handicapping also refers to the various methods by which spectators can predict and quantify the results of a sporting match. The term is applied to the practice of predicting the result of a competition, such as for purposes of betting against the point spread. A favored team that wins by less than the point spread still wins the game, but bets on that team lose.\n" +
                        "\n" +
                        "In either case the handicapper is the person who sets the handicaps for the activity."
            ),
            Strategy(
                title = "Kelly criterion",
                image = R.drawable.img_kelly_criterion,
                description = "In probability theory, the Kelly criterion (or Kelly strategy or Kelly bet), is a formula that determines the optimal theoretical size for a bet. It is valid when the expected returns are known. The Kelly bet size is found by maximizing the expected value of the logarithm of wealth, which is equivalent to maximizing the expected geometric growth rate. It was described by J. L. Kelly Jr, a researcher at Bell Labs, in 1956.[1] The criterion is also known as the scientific gambling method, as it leads to higher wealth compared to any other strategy in the long run (i.e. the theoretical maximum return as the number of bets goes to infinity).\n" +
                        "\n" +
                        "The practical use of the formula has been demonstrated for gambling[2][3] and the same idea was used to explain diversification in investment management.[4] In the 2000s, Kelly-style analysis became a part of mainstream investment theory[5] and the claim has been made that well-known successful investors including Warren Buffett[6] and Bill Gross[7] use Kelly methods. William Poundstone wrote an extensive popular account of the history of Kelly betting.[8] Also see Intertemporal portfolio choice."
            ),
            Strategy(
                title = "Labouchere system",
                image = R.drawable.img_labouchere_system,
                description = "The Labouchère system, also called the cancellation system or split martingale, is a gambling strategy used in roulette. The user of such a strategy decides before playing how much money they want to win, and writes down a list of positive numbers that sum to the predetermined amount. With each bet, the player stakes an amount equal to the sum of the first and last numbers on the list. If only one number remains, that number is the amount of the stake. If the bet is successful, the two amounts are removed from the list. If the bet is unsuccessful, the amount lost is appended to the end of the list. This process continues until either the list is completely crossed out, at which point the desired amount of money has been won, or until the player runs out of money to wager.[1] The system is named for British politician and journalist Henry Labouchère, who originally devised the strategy.[2]"
            ),
            Strategy(
                title = "Gambler's fallacy",
                image = R.drawable.img_gamblers_fallacy,
                description = "The gambler's fallacy, also known as the Monte Carlo fallacy or the fallacy of the maturity of chances, is the incorrect belief that, if a particular event occurs more frequently than normal during the past, it is less likely to happen in the future (or vice versa), when it has otherwise been established that the probability of such events does not depend on what has happened in the past. Such events, having the quality of historical independence, are referred to as statistically independent. The fallacy is commonly associated with gambling, where it may be believed, for example, that the next dice roll is more than usually likely to be six because there have recently been fewer than the usual number of sixes.\n" +
                        "\n" +
                        "The term \"Monte Carlo fallacy\" originates from the best known example of the phenomenon, which occurred in the Monte Carlo Casino in 1913.[1]"
            ),
            Strategy(
                title = "Oscar's grind",
                image = R.drawable.img_oscars_grind,
                description = "Oscar's Grind is a betting strategy used by gamblers on wagers where the outcome is evenly distributed between two results of equal value (like flipping a coin.) It is an archetypal positive progression strategy. It is also called Hoyle's Press. In German and French it is often referred to as the Pluscoup Progression. It was first documented by Allan Wilson in his 1965 book, The Casino Gambler's Guide.[1] This progression is based on calculating the size of bets so that in the event of a losing streak, if and when a same-length winning streak occurs, a profit is obtained. The main concept is that there are periods of many wins and periods of many losses. Losses and wins often come in streaks. Ideally, bets are kept low on losing streaks and increased on winning streaks, which hopefully will follow."
            )
        )

}