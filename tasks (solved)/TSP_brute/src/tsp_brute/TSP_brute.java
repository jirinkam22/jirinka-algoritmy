/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package tsp_brute;

/**
 * TMP = TradeManProblem, Problém obchodního cestujícího 
 * Dumb brutal force solution. Hloupé řešení brutální silou.
 *
 * @author Kokes
 */
public class TSP_brute {

    static final int xxx = Integer.MAX_VALUE;

    static String[] towns = {"Prague", "Berlin", "Wien", "London", "Roma"};
    static int[][] prices = {   {xxx, 351, 333, 1268, 1315},
                                {351, xxx, 680, 1093, 1501},
                                {333, 680, xxx, 1470, 1121},
                                {1268, 1093, 1470, xxx, 1864},
                                {1315, 1501, 1121, 1864, xxx}
                            };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int town1 = 1; town1 < towns.length; town1++) {
            // for simplicity, always start from Prague
            // pro jednoduchost budeme vždycky začínat v Praze
            String path = "Prague ";
            int price = 0;

            // if town1 already is on path - pokud mesto na ceste uz existuje
            if (path.contains(towns[town1])) {
                continue;
            }
            path += towns[town1] + " ";
            price += prices[0][town1];

            for (int town2 = 1; town2 < towns.length; town2++) {
                // if town2 already is on path - pokud mesto na ceste uz existuje
                if (path.contains(towns[town2]) ) {
                    continue;
                }
                path += towns[town2] + " ";
                price += prices[town1][town2];

                for (int town3 = 1; town3 < towns.length; town3++) {
                    // if town3 already is on path - pokud mesto na ceste uz existuje
                    if (path.contains(towns[town3])) {
                        continue;
                    }
                    path += towns[town3] + " ";
                    price += prices[town2][town3];

                    for (int town4 = 1; town4 < towns.length; town4++) {
                        // if town4 already is on path - pokud mesto na ceste uz existuje
                        if (path.contains(towns[town4])) {
                            continue;
                        }
                        path += towns[town4] + " ";
                        price += prices[town3][town4];

                        path += towns[0];
                        price += prices[town4][0];

                        System.out.println(path + " " + price);
                    }
                }
            }
        }

    }
}
