package GreedyApproch;

import java.util.*;

public class ActivitySelection {

    public static void maximumNoOfActivitiesAlreadySorted(int [] start, int [] end){ //0(N)
        int maxAct = 0;

        ArrayList <Integer> ans = new ArrayList<>();
        //1st activity selected
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("no of activities selected: " + maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
    public static void maximumNoOfActivitiesAlreadyNotSorted(int [][] activities,int [] start,int [] end){
        //o(nlogn)
        int maxAct = 0;
        for(int i =0;i<start.length;i++){
            activities[i][0] = i; //index stored
            activities[i][1] = start[i]; //start stored
            activities[i][2] = end[i]; //end stored
        }

        //for sorting = lambda function /comparator / short form
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        ArrayList <Integer> ans = new ArrayList<>();
        //1st activity selected
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("no of activities selected: " + maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};
        System.out.println("in case of already sorted: ");
        maximumNoOfActivitiesAlreadySorted(start,end);
        int [][] activities = new int[start.length][3];


        System.out.println("in case of not already sorted: ");
        maximumNoOfActivitiesAlreadyNotSorted(activities,start,end);






    }
}
