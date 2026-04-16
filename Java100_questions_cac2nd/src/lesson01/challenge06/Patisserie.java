/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronstock = 30;
		int chocolatstock = 30;
		int pistachestock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronstock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatstock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachestock + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン      >");
		String citronBuyCountStr = reader.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.println("ショコラ      >");
		String chocolatBuyCountStr = reader.readLine();
		int chocolateBuyCount = Integer.parseInt(chocolatBuyCountStr);

		System.out.println("ピスターシュ  >");
		String pistacheBuyCountStr = reader.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolateBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		System.out.println("\n合計個数   " + (citronBuyCount + chocolateBuyCount + pistacheBuyCount) + "個");
		System.out.println("合計金額 " + (250 * citronBuyCount + 280 * chocolateBuyCount + 320 * pistacheBuyCount) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citronstock = 30 - citronBuyCount;
		chocolatstock = 30 - chocolateBuyCount;
		pistachestock = 30 - pistacheBuyCount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronstock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatstock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachestock + "個");

	}
}
