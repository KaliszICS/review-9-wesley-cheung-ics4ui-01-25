public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(countLetter("hello",'l'));
	}
	public static int lettersToFive(String input1, char input2) {
		int num = 0;
		while (num < input1.length()) {
			String the = input1.substring(num);
			int num2 = 0;
			int many = 0;
			while (num2 < the.length()) {
				if (the.charAt(num2)==input2) {
					many += 1;
					if (many == 5) {
						return num2+1;
					}
				}
				num2+=1;
			num += 1;
		}
	}
	return -1;

}
	public static int countLetter(String input1, char input2) {
			int num2 = 0;
			int many = 0;
			while (num2 < input1.length()) {
				if (input1.charAt(num2)==input2) {
					many += 1;
					}
				num2+=1;
				}
			return many;
		}
	public static int oddSum(int num1, int num2) {
			int lower = Math.min(num1,num2);
			int upper = Math.max(num1,num2);
			int count = 0;
			if (lower%2 == 0) {
				lower+=1;
			}
			if (upper%2 == 0) {
				upper-=1;
			}
			while (lower <= upper) {
				count += lower;
				lower += 2;
			}
			return count;
		}
	
}