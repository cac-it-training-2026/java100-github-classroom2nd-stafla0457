/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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

	}
}
