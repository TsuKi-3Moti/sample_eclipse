import pack.Student;

public class Sample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("菅原");
		s1.setScore(80);
		Student s2 = new Student();
		s2.setName("桜井");
		s2.setScore(-80);

		System.out.println(s1.getName() + "さん：" + s1.getScore() + "点");
		System.out.println(s2.getName() + "さん：" + s2.getScore() + "点");
		
//		int i = 1;
//		while ( 10 >= i ) {
//			// 奇数の判定
//			if ( 0 != ( i % 2 ) )
//				System.out.println( i );
//
//			// iに1を足していく
//			i++;
//		}
//		
//		for(int b = 1; b<=10; b++) {
//			if(b % 2 != 0) {
//				System.out.println(b);
//			}
//		}
//		
//		for(int a = 1; a<= 10; a++) {
//			if(a % 2 == 0) {
//				System.out.println(a);
//			}
//		}
		
		for(int c = 1; c<=10; c++) {
			System.out.println(c);
		}
		
	}
}