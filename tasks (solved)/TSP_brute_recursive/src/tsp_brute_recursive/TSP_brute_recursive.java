/*
 * Jen pro vnitřní potřebu. For internal use only
 */
package tsp_brute_recursive;

/**
 * TSP = Travelling Salesman Problem, Problém obchodního cestujícího 
 * Dumb brutal force solution. Hloupé řešení brutální silou.
 *
 * @author Kokes
 */
public class TSP_brute_recursive {

    static final int xxx = Integer.MAX_VALUE;

    static String[] towns = {"Prague", "Berlin", "Wien", "London", "Roma"};
    static int[][] prices = {{xxx, 351, 333, 1268, 1315},
    {351, xxx, 680, 1093, 1501},
    {333, 680, xxx, 1470, 1121},
    {1268, 1093, 1470, xxx, 1864},
    {1315, 1501, 1121, 1864, xxx}
    };

    static void goNext(String path, int depth) {
        // debug - ladeni
        String tabs = "";
        for(int i=0; i<depth; i++)
            tabs += "\t";
        System.out.printf("%sENTRY: path=\"%s\" depth=%d\n", tabs, path, depth);

        // is it last town?
        // je to poslední mesto?
        if(depth>=5){
            System.out.printf("%sFOUND: %s \n\n", tabs, path);
            return;
        }

        // try out all possible next towns
        // vyzkousime vsecna dalsi mesta
        for (int nextTown = 0; nextTown < towns.length; nextTown++) {
            System.out.print(tabs + "trying " + towns[nextTown]);
            // invalid jump - already visited nextTown
            // nedovoleny skok - v nextTown uz byl
            if (path.contains(towns[nextTown])) {
                System.out.println("...illegal, try next");
                continue;
            }

            // valid jump - recursively borrow to deeper level
            // dovolený skok - rekurzivne sestoupime do dalsi urovne
            System.out.println("...valid");
            goNext(path + " " + towns[nextTown], depth+1);
        }
        return;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        goNext("", 0);
    }
}


