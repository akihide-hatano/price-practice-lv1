package com.discount;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int price = 1200;

        System.out.println("=== 割引アプリ (Lv1) ===");
        System.out.println("プレミアム会員ですか？ yes / no / q(終了)");

        try( Scanner scanner = new Scanner(System.in)){

            while (true) {
                
                System.out.println("入力 > ");
                String input = scanner.nextLine().trim();
                
                if("q".equalsIgnoreCase(input)){
                    System.out.println("終了します。ありがとうございました");
                    break;
                }
                
                if("yes".equalsIgnoreCase(input)){
                    double finalPrice = price * 0.9;
                    System.out.println("割引が適用されました。" + finalPrice + "円");
                    break;
                }else if("no".equalsIgnoreCase(input)){
                    System.out.println("割引が適用されました。" + price + "円");
                    break;
                }else{
                    System.out.println("yesかnoを入れてください");
                }
            }
        }
    }
}