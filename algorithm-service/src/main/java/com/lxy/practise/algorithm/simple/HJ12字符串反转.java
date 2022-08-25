/**
 * 字符串反转
 *https://www.nowcoder.com/practice/e45e078701ab4e4cb49393ae30f1bb04?tpId=37&tags=&title=&difficulty=0&judgeStatus=0&rp=1&sourceUrl=%2Fexam%2Foj%2Fta%3Fpage%3D1%26pageSize%3D50%26search%3D%26tpId%3D37%26type%3D37
 * HJ12 字符串反转
 * 简单  通过率：62.05%  时间限制：1秒  空间限制：32M
 * 知识点
 * 字符串
 * 描述
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入描述：
 * 输入一行，为一个只包含小写字母的字符串。
 *
 * 输出描述：
 * 输出该字符串反转后的字符串。
 *
 * 示例1
 * abcd
 * 输出：
 * dcba
 * @author luo
 * @date 2022/07/20 16:35
 **/

package com.lxy.practise.algorithm.simple;


import java.util.Scanner;


public class HJ12字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new StringBuilder(sc.next()).reverse().toString());
    }
}
