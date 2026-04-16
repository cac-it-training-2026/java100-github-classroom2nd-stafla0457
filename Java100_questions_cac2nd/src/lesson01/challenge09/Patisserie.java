/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.println("ショコラ      >");
		String chocolatBuyCountStr = reader.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.println("ピスターシュ  >");
		String pistacheBuyCountStr = reader.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		double totalBuyCount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int totalPrice = (int) (250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount);

		System.out.println("\n合計個数   " + totalBuyCount + "個");
		System.out.println(
				"合計金額 " + totalPrice + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citronstock = (int) (30 - citronBuyCount);
		chocolatstock = (int) (30 - chocolatBuyCount);
		pistachestock = (int) (30 - pistacheBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronstock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatstock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachestock + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println(
				"売上の合計" + totalPrice + "円");

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * citronBuyCount) + "・・・"
				+ (int) ((250 * citronBuyCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolatBuyCount) + "・・・"
				+ (int) ((280 * chocolatBuyCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pistacheBuyCount) + "・・・"
				+ (int) ((320 * pistacheBuyCount) / totalPrice * 100) + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("シトロンの味    ・・・" + (int) ((250 * citronBuyCount) / totalPrice * 100) + "%");
		System.out.println("ショコラの味    ・・・" + (int) ((280 * chocolatBuyCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) ((320 * pistacheBuyCount) / totalPrice * 100) + "%");
		System.out.println("\nが楽しめます！\t値段は\\" + ((int) (totalPrice / totalBuyCount) / 10) * 10 + "です。");

	}

}
