package org.example;

import java.util.ArrayList;

public class Metro {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int taked = 0;
        int droped = 0;
        for(int i = 0; i < stops.size();i++) {
            taked+= stops.get(i)[0];
            droped+= stops.get(i)[1];
        }
        return taked - droped;
    }
}