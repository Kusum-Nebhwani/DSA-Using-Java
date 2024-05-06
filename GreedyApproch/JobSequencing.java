package GreedyApproch;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        int  id; //0(A),1(B),......

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }

    }
    public static void main(String[] args) {
        int [][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs =  new ArrayList<>();

        for(int i = 0;i< jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }

        //sorting of objects of class Job in descending order
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit);

        ArrayList <Integer> seq = new ArrayList<>();
        int time = 0;
        int profit = 0;
        for(int i =0;i< jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                profit += curr.profit;
                time++;
            }
        }
        System.out.println("max jobs: " + seq.size());
        System.out.println("profit earned: " +profit);
        System.out.print("jobs: ");
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();





    }
}
