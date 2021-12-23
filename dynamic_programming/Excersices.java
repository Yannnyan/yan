package Data_Structures.dynamic_programming;

public class Excersices {
    public static void main(String[] args){
        //System.out.println(fibonacci(7));
        //System.out.println(gridTraveler(3,4));
    }
    public static int fibonacci(int index){
        int[] fibNumbers = new int[index+1];
        fibNumbers[0] = 1;
        fibNumbers[1] = 1;
        if(index == 1 || index == 0){
            return 1;
        }
        for (int i = 2; i <= index; i++) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }
        return fibNumbers[index];
    }
    // recursive
    private static int fibonnaci(int index){
        if(index == 1 || index == 0){
            return 1;
        }
        return fibonnaci(index-1) + fibonacci(index-2);
    }
    public static double WorldSeriesOdds(double q, int n, int l1, int l2){
        if(q > 1 || q < 0) return -1;
        // two teams A and B play until one of the teams won n games, the probability for A to win any game is q.
        // what is the probability for A to win the tournament
        // define P(i,j) as the probability for A to win the tournament in i games.
        // and j is the number of games remaining for B to win.
        // P(i,j) = q * P(i-1,j) + (1-q) * P(i,j-1)
        double[][] P = new double[n][n];
        for (int i = 0; i < n; i++) {
            P[i][0] = 0;
            P[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                P[i][j] = q * P[i-1][j] + (1-q) * P[i][j-1];
            }
        }
        return P[l1][l2];
    }
    public static int gridTraveler(int n, int m){
        // given a 2d grid with width of n and height of m
        // calculate the number of ways to reach from top left cornet to bottom right corner
        // with only two possible moves : right and down
        // GT(i,k) = GT(i-1,k) + GT(i,k-1)
        int[][] GT = new int[n][m];
        for (int i = 0; i < n; i++) {
            GT[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            GT[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                GT[i][j] = GT[i-1][j] + GT[i][j-1];
            }
        }
        return GT[n-1][m-1];
    }
    public static int matrixChainMult(int[][] matrix, int i, int j){
        // given n Matrix each has tuple of (rows number,collum number)
        // calculate the minimal number of operations for multiplication of all the matrix
        // define k as the split point then
        // MGM(i,j) = min for each i<=k<=j-1 { MGM(i,k) + MGM(k+1,j-1) + matrix[k][0]*matrix[k][1]*matrix[k+1][1]}
        int[][] MGM = new int[matrix.length][matrix.length];

        return 0;
    }
    public static void sequentialTuples(int N){
        // given number N , print out all tuples of 3 which have this characteristics:
        // numbers are ranging from 1 to N, adjective members difference not more than 2
        //
        int[][][] ST = new int[N][N][N];



    }

}
