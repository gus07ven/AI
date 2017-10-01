import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Strategy {

    private int numCities;
    private String costFunc;
    private String searchStrat;
    private int maxEffBound;
    private int x;
    private int y;

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

    public int costFunction3(int x, int y){

        int pathCost = 0;

        if (x == y){
            pathCost = 0;
        } else {
            pathCost = (int) Math.pow((x + y),2);
        }

        return pathCost;
    }

    public void createCostMatrix(int numCities, String costFunc){

        int[][] pathCostMatrix = new int[numCities][numCities];

        switch(costFunc){
            case "c1":
                for(int i = 0; i < numCities; i++){
                    for(int j = 0; j < numCities; j++){
                        pathCostMatrix[i][j] = costFunction1(i,j);
                    }
                }
                for(int[] row : pathCostMatrix){
                    for(int i : row){
                        System.out.print(i);
                        System.out.print("\t");
                    }
                    System.out.println();
                }
                break;
            case "c2":
                for(int i = 0; i < numCities; i++){
                    for(int j = 0; j < numCities; j++){
                        pathCostMatrix[i][j] = costFunction2(i,j);
                    }
                }
                for(int[] row : pathCostMatrix){
                    for(int i : row){
                        System.out.print(i);
                        System.out.print("\t");
                    }
                    System.out.println();
                }
                break;
            case "c3":
                for(int i = 0; i < numCities; i++){
                    for(int j = 0; j < numCities; j++){
                        pathCostMatrix[i][j] = costFunction3(i,j);
                    }
                }
                for(int[] row : pathCostMatrix){
                    for(int i : row){
                        System.out.print(i);
                        System.out.print("\t");
                    }
                    System.out.println();
                }
                break;
        }
    }

    public void SophStrat(){}


    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Please type SIM or SOPH for search strategy:");
        Scanner scanner = new Scanner(System.in);
        String searchStrat = scanner.next();
        inputs.add(searchStrat);
/*        System.out.println(searchStrat);*/

        System.out.println("Please type c1, c2, or c3 for the cost function:");
        String costFunc = scanner.next();
        inputs.add(costFunc);
/*      System.out.println(costFunc);*/

        System.out.println("Please enter the number of cities:");
        String numCities = scanner.next();
        inputs.add(numCities);
/*      System.out.println(numCities)*/;

        System.out.println("Please enter the MEB:");
        String maxEffBound = scanner.next();
        inputs.add(maxEffBound);
/*      System.out.println(maxEffBound);*/

        Strategy strategy = new Strategy();
        strategy.searchStrat = inputs.get(0);
        strategy.costFunc = inputs.get(1);
        strategy.numCities = Integer.parseInt(inputs.get(2));
        strategy.maxEffBound = Integer.parseInt(inputs.get(3));

/*        for (String input : inputs) {
            System.out.println(input);
        }*/
        System.out.println(strategy.searchStrat + " " + strategy.costFunc + " " + strategy.numCities + " " + strategy.maxEffBound);

        strategy.createCostMatrix(strategy.numCities,strategy.costFunc);

    }
}