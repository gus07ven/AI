
public class Strategy {

    // Fields
    private int x;
    private int y;

    // ------ Functions -------

    // Cost functions
    public int costFunction1(int x, int y) {

        int pathCost = 0;

        if (x == y) {
            pathCost = 0;
        } else if (x < 3 && y < 3) {
            pathCost = 1;
        } else if (x < 3) {
            pathCost = 200;
        } else if (y < 3) {
            pathCost = 200;
        } else if ((x % 7) == (y % 7)) {
            pathCost = 2;
        } else {
            pathCost = ((Math.abs(x - y)) + 3);
        }

        return pathCost;
    }

    public int costFunction2(int x, int y) {

        int pathCost = 0;

        if (x == y) {
            pathCost = 0;
        } else if ((x + y) < 10) {
            pathCost = (Math.abs((x - y)) + 4);
        } else if ((x + y) % 11 == 0) {
            pathCost = 3;
        } else {
            pathCost = (int) (Math.pow((Math.abs(x - y)),2) + 10);
        }

        return pathCost;
    }

    // Simple strategy

    // Sophisticated strategy

    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        System.out.println(strategy.costFunction2(6,7));
    }
}