package 기타문제;

/**
 * BOJ 5543 : 상근날드
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_5543 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int burger = 2001;
		int drink = 2001;

		for (int i = 0; i < 3; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value < burger) {
				burger = value;
			}
		}

		for (int i = 0; i < 2; i++) {
			int value = Integer.parseInt(br.readLine());
			if (value < drink) {
				drink = value;
			}
		}

		System.out.println(burger + drink - 50);
	}

}
