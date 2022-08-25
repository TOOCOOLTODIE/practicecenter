package com.lxy.practise.algorithm.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * HJ13 句子逆序
 * @author luo
 * @date 2022/07/22 14:09
 **/
public class HJ13句子逆序 {
    public static void main(String[] args) throws IOException {
//        main();
        main1();
    }
    private static void main1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        System.out.println(sb.append(" ").toString());
    }

    private static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chars = (str + " ").toCharArray();
            int len = str.length();
            // 碰到空格就将当前
            int first = 0;
            int last = len;
            char[] newchar = new char[len];
            for (int j = 0; j <= str.length(); j++) {
                char c = chars[j];
                if (c == ' ') {
                    // 需要copy的长度
                    int _len = j - first;
                    // 开始位置
                    int despos = last - _len;
                    System.arraycopy(chars, first, newchar, despos, _len);
                    // 从旧的下一个位置开始copy，需要赋值空，所以多移动一位
                    first = j + 1;
                    len = len - _len - 1;
                    last = len;
                    // copy完成后，指针变动后，赋值空
                    if (last > 0) {
                        newchar[last] = ' ';
                    }
                }
            }
            System.out.println(new String(newchar));
        }
    }
}
