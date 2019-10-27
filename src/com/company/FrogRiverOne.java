package com.company;

import java.util.HashSet;

/**
 * Created by monik on 27.10.2019.
 */
public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        HashSet<Integer> river = new HashSet<>(  );
        for (int i=0;i<A.length;i++){
            if(A[i]<=X){
                river.add( A[i] );
            }
            if(river.size()==X){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution( 5,new int[]{1, 3, 1, 4, 2, 3, 5, 4} ));
    }
}
