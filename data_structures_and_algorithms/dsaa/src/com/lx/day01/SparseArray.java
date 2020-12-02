package com.lx.day01;

public class SparseArray {
    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][4] = 2;

//        for (int i = 0; i < chessArr1.length; i++) {
//            for (int j = 0; j < chessArr1[i].length; j++) {
//                System.out.print(chessArr1[i][j] + "\t");
//            }
//            System.out.println();
//        }
        System.out.println("====================================");
        for(int[] row:chessArr1){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        System.out.println("====================================");
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }

        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArr1[i][j] != 0){

                }
            }
        }

    }
}
