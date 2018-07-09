package practice.methods;

public class DefineMethods {
	public void printTenTimes (int input){
		int sum = 0;
		for (int times = 0; times < 10; times++){
			System.out.printf("%d%n",input + sum);
		sum += 10;
		}
	}

	public void printSomebodysMessage(String name, String messge){
		System.out.printf("[%s]의 메세지 : [%s]", name, messge);
	}

	public void printMessage(String message){
		System.out.printf("%s", message);
	}

	public String returnOriginalMessage(String message){
		return message;
	}

	public int addten(int input){
		return input + 10;
	}

	public int subtractTen(int input){
		return input - 10;
	}

	public double makeDouble(double input){
		return input * 2;
	}

	public double subtractFivePointFive(double input){
		return input - 5.5;
	}

	public String makeFullName(String name, String surname){
		return surname + name;
	}

	public int add(int x, int y){
		return x+y;
	}

	public double add(double x, double y){
		return x+y;
	}

	public void printMsgManyTimes(String message, int input){
//		int times;
		for(int times = 0; times < input; times++){
			System.out.printf("%s%n", message);
		}
	}

	public void arithmetic(char op, int x, int y){
		if(op == '+'){
			System.out.printf("%d %c %d = %d%n", x, op, y, x+y);
		} else if(op == '-'){
			System.out.printf("%d %c %d = %d%n", x, op, y, x-y);
		} else if(op == '*'){
			System.out.printf("%d %c %d = %d%n", x, op, y, x*y);
		} else if(op == '/'){
			System.out.printf("%d %c %d = %d%n", x, op, y, x/y);
		} else {
			System.out.printf("연산자가 올바르지 않습니다.");
		}
	}
	public double doubleArithmetic(char op, double x, double y){
		double result;
		
		if(op == '+'){
			result = x + y ;
		} else if(op == '-'){
			result = x - y ;
		} else if(op == '*'){
			result = x * y ;
		} else if(op == '/'){
			result = x / y ;
		} else {
			result = 0.0 ;
		}
		
		return result;
	}

	public boolean isEven(int input){
		boolean result;
		
		if(input % 2 == 0){
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
