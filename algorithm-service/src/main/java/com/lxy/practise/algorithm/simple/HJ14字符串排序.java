package com.lxy.practise.algorithm.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  HJ14 字符串排序
 * @author luo
 * @date 2022/07/22 16:32
 **/
public class HJ14字符串排序 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            array[i] = br.readLine();
        }
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
