package task2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//課題1
		String greeting = "Hello World";
		System.out.println(greeting);

		//課題2
		int sum = 0;
		for (int number = 0; number <= 10; number++) {
			sum += number;
		}
		System.out.println("sum:" + sum);

		//課題3
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d);//今日の日付取得

		System.out.println(d.getDayOfWeek());

		System.out.println(d.plusYears(3));
		LocalDateTime localDate = LocalDateTime.of(2023, 10, 04, 17, 00);
		System.out.println(localDate.getDayOfWeek());

		//課題4
		int number = 0;
		if(number == 1) {
			System.out.println("真");
		} else if (number == 0) {
			System.out.println("偽");
		}

		//課題5
		List<String> list = new ArrayList<>();
		list.add("ピカチュウ");
		list.add("フシギバナ");
		list.add("カメックス");
		list.add("リザードン");
		System.out.println(list);

	}
}
