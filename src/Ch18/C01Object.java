package Ch18;

class A {
	
}

public class C01Object {

	public static void main(String[] args) {

		Object ob1 = new Object();
		System.out.println(ob1.toString()); //클래스자료형@Hashcode
		
		System.out.println("------------");
		A ob2 = new A();
		System.out.println("ToString() : "+ ob2.toString()); 					 //Ch18.A@626b2d4a
		System.out.println("getClass() : "+ ob2.getClass());					 //class Ch18.A
		System.out.println("getClass().getName() : "+ ob2.getClass().getName()); //Ch18.A
		System.out.println("hashcode() : %x\n ", ob2.hashCode()); 				 //626b2d4a(1651191114)
		System.out.println("ob2 : "+ ob2);
		System.out.println("------------");
		
		String str="Hello World";
		System.out.println("str : "+ str);						 //Hello World
		System.out.println("str.toString() : "+ str.toString()); //Hello World
		System.out.println("hashCode() %x\n: ", str.hashCode()); //cc969a84
		
	}

}
