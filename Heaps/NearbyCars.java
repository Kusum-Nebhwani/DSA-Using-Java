package Heaps;

import java.util.PriorityQueue;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int dist_sqr;
        int idx;

        public Point(int x, int y, int dist_sqr,int idx) {
            this.x = x;
            this.y = y;
            this.dist_sqr = dist_sqr;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.dist_sqr - p2.dist_sqr;
        }
    }

    public static void main(String[] args) {
        int[][] cars = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < cars.length; i++) {
            int distSqr = cars[i][0] * cars[i][0] + cars[i][1] * cars[i][1];
            pq.add(new Point(cars[i][0], cars[i][1], distSqr,i));
        }

        //nearest K cars
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);

        }
    }
}
