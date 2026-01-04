package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		// Assignment (=)
		int number = 7;

		// Assignment (add, sub, mul, div)

		int a = 7;
		int b = 2;
		// add (+)
		System.out.println(a + b);

		// sub (-)
		System.out.println(a - b);

		// mul (*)
		System.out.println(a * b);

		// div
		// Quotient (/)
		System.out.println(a / b);

		// Remainder (%)
		System.out.println(a % b); // 7%2

		System.out.println("----------------------------");

		int c = 10;
		int d = 7;

		// Comparison - boolean

		// lessThan (<)
		System.out.println(c < d);

		// greterThan (>)

		// equalTo (==)
		System.out.println(c == d);

		System.out.println("-------------------------");

		int s = 10;
		int v = 20;

		// lessThanOrEqualTo (<=)
		System.out.println(s <= v);

		// greaterThanOrEqualTo (>=)
		System.out.println(s >= v);

		// notEqualTo !=
		System.out.println(s != v);

		int x = 20;
		int y = 30;

		System.out.println("-------------------------");

		// Logical
		// AND &&
		// OR ||

		// AND && - 2 conditions
		System.out.println(x < y && x <= y);

		// OR || - 2 Conditions
		System.out.println(x == y || x > y);

		int p = 7;

		// Increment and Decrement
		// Increment ++

		// postIncrement
		// preIncrement

		// postIncrement -Increase the value by 1 (p++)

		System.out.println(p++); // 7

		System.out.println(p); // 8

		// preIncrement -Increase the value by 1 (++p)
		System.out.println(++p); // 9

		// decrement
		// postDecrement - Decrease the value by 1 (p--)

		System.out.println(p--); // 9
		System.out.println(p); // 8

		// preDecrement - Decrease the value by 1 (--p)
		System.out.println(--p); // 7

	}

}
