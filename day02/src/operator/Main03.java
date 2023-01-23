package operator;

public class Main03 {
	public static void main(String[] args) {
		int plus_name = 1;
		plus_name = plus_name + 1; // 2
		plus_name += 1; // 3
		plus_name++; // 4
		++plus_name; // 5
		System.out.println(plus_name);
		
		int minus_name = 5;
		minus_name = minus_name - 1; // 2
		minus_name -= 1; // 3
		minus_name--; // 4
		--minus_name; // 5
		System.out.println(minus_name);
	}
}
