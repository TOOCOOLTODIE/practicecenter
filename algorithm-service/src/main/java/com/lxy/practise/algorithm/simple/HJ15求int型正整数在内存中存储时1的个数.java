package com.lxy.practise.algorithm.simple;

import java.util.Scanner;

/**
 * HJ15 求int型正整数在内存中存储时1的个数
 * @author luo
 * @date 2022/07/23 21:46
 **/
public class HJ15求int型正整数在内存中存储时1的个数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = 0;
        for(int i=0; i< 32; i++){
            if((num%2) != 0){
                n++;
            }
            num = num /2;
        }
        System.out.println(n);
    }
}
