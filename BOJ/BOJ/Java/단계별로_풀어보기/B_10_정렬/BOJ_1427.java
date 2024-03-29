package 단계별로_풀어보기.B_10_정렬;

/**
 * BOJ 10989 : 수 정렬하기 3
 * 
 * @author kdgyun
 * {@link https://st-lab.tistory.com}
 * {@link https://github.com/kdgyun}
 *
 */

import java.io.InputStream;
import java.io.IOException;

public class BOJ_1427 {

	public static void main(String[] args) throws IOException {

		InputStream in = System.in;

		int[] counting = new int[10];
		int c;
		while ((c = in.read()) != '\n') {
			counting[c - '0']++;
		}

		for (int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				System.out.print(i);
			}
		}
	}
}
