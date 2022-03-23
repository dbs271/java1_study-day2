package java_day02;

public class EX1_VariableTest {
	public static void main(String[] args) {
		// ♡♡♡♡ 홍길동 님의 정보 ♡♡♡♡
		// 이름: 홍길동 
		// 나이: 10살
		// 키: 180.24cm
		// 몸무게: 70.11kg
		// 성적: A
		
		// 1. 데이터들은 변수에 담아서 선언. 변수를 사용해서 위의 폼대로 출력
		
		String name = "윤국현";
		int age = 10;
		double height = 180.24;
		float weight = 70.1143f;
		char score = 'A';
		
		System.out.println(name + "님의 정보");
//		System.out.println("이름: " + name );
		System.out.printf("이름: %s \n", name);
//		System.out.println("나이: " + age + "살" );
		System.out.printf("나이: %d살 \n", age);
		// 소수점 밑으로 한자리까지 출력 
//		System.out.println("키: " + height + "cm" );
		System.out.printf("키: %.1fkg \n", height);
		// 소수점 밑으로 3자리까지 출력 
//		System.out.println("몸무게: " + weight + "kg");
		System.out.printf("몸무게: %.3fcm \n", weight);
//		System.out.println("성적: " + score );
		System.out.printf("성적: %c \n", score);
		
	}
}
