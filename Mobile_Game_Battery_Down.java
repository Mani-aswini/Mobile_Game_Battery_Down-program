import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int n = sc.nextInt();
		int[] C = new int[n];
		for (int i = 0 i < n; i++)
				C[i] = sc.nextInt();
		System.out.println(minPowerMoves (B, C));
	}
	public static String minPowerMoves (int B, int[] C) {
	int sum = 0;
	for(int i = 0 ; i < C.length; i++) {
			sum += C[i] + C[i];
	}
	if(sum >= B) {
		System.out.println("Possible");
	} else {
		System.out.println("Cannot reach zero");
	}
	return "";
	}
}
