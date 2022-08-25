package com.lxy.practise.algorithm.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * HJ21 简单密码
 * @author luo
 * @date 2022/07/24 14:51
 **/
public class HJ21简单密码 {
    public static void main(String[] args) throws IOException {
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String source = "abcdefghijklmnopqrstuvwsyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String target = "22233344455566677778889999bcdefghijklmnopqrstuvwxyza0123456789";
        String str = br.readLine();

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < chars.length; i++){
            char c = chars[i];
            int index = source.indexOf(c);
            sb.append(target.charAt(index));
        }
        System.out.println(sb.toString());*/
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int total = 0;
            int num = Integer.parseInt(sc.nextLine());
                while (num / 3 > 0) {
                    int x = num % 3;
                    int y = num / 3;

                    total = total + y;
                    int sum = x + y;
                    if (sum == 2) {
                        total ++;
                    }
                    num = sum;
                }

            System.out.println(total);
        }


    }
}
