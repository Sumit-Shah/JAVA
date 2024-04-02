import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
public class GreedyApproach {


    // //Activity Selection Code ------IMPORATANT
    // public static void main(String[] args) { //O(n)
    //     int statrt[] = {1, 3, 0, 5, 8, 5};
    //     int end[] = {2, 3, 6, 7, 9, 9};

    //     //Sorting 
    //     int activities [][] = new int[statrt.length][3];
    //     for(int i=0; i<statrt.length; i++) {
    //         activities[i][0] = i; //This is to store the initial addres of the indexing
    //         activities[i][1] = statrt[i];
    //         activities[i][2] = end[i];
    //     }

    //     // lamda fuction -> shortform 
    //     Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

    //     //end time basis sorted
    //     int maxAct = 0;
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     //1st activity 
    //     maxAct = 1;
    //     ans.add(activities[0][0]);
    //     int lastEnd = activities[0][2];
    //     for(int i=1; i<end.length; i++) {
    //         if(activities[i][1] >= lastEnd) {
    //             //activity select
    //             maxAct++;
    //             ans.add(activities[i][0]);
    //             lastEnd = activities[i][2];


    //         }
    //     }

    //     System.out.println("max activities = " + maxAct);
    //     for(int i=0; i<ans.size(); i++) {
    //         System.out.println("A" + ans.get(i) + " ");
    //     }
    //     System.out.println();
    // }









    // //Fractional KNAPSACK Code
    // public static void main(String[] args) {
    //     int val[] = {60, 100, 120};
    //     int weight[] = {10, 20, 30};
    //     int W = 50;

    //     double ratio[][] = new double[val.length][2];
    //     //0th col => idx; 1st col => ratio

    //     for(int i=0; i<val.length; i++) {
    //         ratio[i][0] = i;
    //         ratio[i][1] = val[i]/(double)weight[i];
    //     }

    //     //ascending order
    //     Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    //     int capacity = W;
    //     int finalVal = 0;
    //     for(int i=ratio.length-1; i>=0; i--) {
    //         int idx = (int)ratio[i][0];
    //         if(capacity >= weight[idx]) { //include full item
    //             finalVal += val[idx];
    //             capacity = 0;
    //             break;

    //         }
    //     }

    //     System.out.println("final value = " + finalVal);


    // }



    









    //Min ABSOLUTE DIFFERENCE Pairs
    // public static void main(String[] args) {
    //     int A[] = {1, 2, 3};
    //     int B[] = {2, 1, 3};

    //     Arrays.sort(A);
    //     Arrays.sort(B);

    //     int minDiff = 0;

    //     for(int i=0; i<A.length; i++) {
    //         minDiff += Math.abs(A[i]-B[i]);
    //     }

    //     System.out.println("Min absolute diff of pairs = " + minDiff);
    // }









    //MAX Length CHAIN OF PAIRS.
    // public static void main(String[] args) {
    //     int pairs[][] = {{5,24}, {39, 60}, {5, 28}, {27,40}, {50,90}};

    //     Arrays.sort(pairs, Comparator.comparingDouble(O -> O[1]));

    //     int chainLen = 1;
    //     int chainEnd = pairs[0][1]; //Last selected pair end //chain end


    //     for(int i =1; i<pairs.length; i++) {
    //         if(pairs[i][0] > chainEnd) {
    //             chainLen++;
    //             chainEnd = pairs[i][1];
    //         }
    //     }

    //     System.out.println("Max length of chain = " + chainLen);
    // }









    // //NEPALESE Coins
    // public static void main(String[] args) {
    //     Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

    //     Arrays.sort(coins, Comparator.reverseOrder());

    //     int countOfCoins = 0;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the amount : ");
    //     int amount = sc.nextInt();
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     for (int i = 0; i < coins.length; i++) {
    //         if (coins[i] <= amount) {
    //             while (coins[i] <= amount) {
    //                 countOfCoins++;
    //                 ans.add(coins[i]);
    //                 amount -= coins[i];
    //             }
    //         }
    //     }

    //     System.out.println("Total (min) coins used = " + countOfCoins);

    //     for (int i = 0; i < ans.size(); i++) {
    //         System.out.print(ans.get(i) + " ");
    //     }
    // }









    //JOB Sequencing Problem 
    // static class Job {
    //     int deadLine;
    //     int profit;
    //     int id;

    //     public Job(int i, int d, int p) {
    //         id = i;
    //         deadLine = d;
    //         profit = p;
    //     }
    // }

    // public static void main(String[] args) {
    //     int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

    //     ArrayList<Job> jobs = new ArrayList<>();

    //     for(int i=0; i<jobsInfo.length; i++) {
    //         jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
    //     }

    //     Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
    //     //descending order of profit 

    //     ArrayList<Integer> seq =  new ArrayList<>();
    //     int time = 0;
    //     for(int i=0; i<jobs.size(); i++) {
    //         Job curr = jobs.get(i);
    //         if(curr.deadLine > time) {
    //             seq.add(curr.id);
    //             time++;
    //         }

    //     }

    //     //print seq
    //     System.out.println("Max Jobs = " + seq.size());
    //     for(int i=0; i<seq.size(); i++) {
    //         System.out.println(seq.get(i) + " ");
    //     }
    //     System.out.println();


    // }










    //Chocola Problem
    public static void main(String[] args) {
        int n = 4, m =6;
        Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
        Integer costHor[] = {4, 1, 2}; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length) {
            if(costVer[v] <= costHor[h]) { //horizonal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { //vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            v++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;

            
        }

        System.out.println("Min cost of cuts = " + cost);
    }
     






    
}
