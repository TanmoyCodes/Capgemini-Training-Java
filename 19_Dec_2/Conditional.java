class Ccondition {
	public static void main(String[] args){
		int amount = 4000;
		String res = (amount>5000) ? "Greater than 5k" : "Is not greater than 5k";
		System.out.println(res);


		int num1 = 400;
		int num2 = 200;
		
		String result = (num1 > num2) ? "Num1 is greater" : "Num2 is greater";
		System.out.println(result);

		int num3 = 300;
		String threeResult = (num1 > num2 && num1 > num3) ? "Int1 is greatest" : (num2 > num3) ? "int2 is greatest" : " int3 is greatest";
		System.out.println(threeResult);

		}
	}

