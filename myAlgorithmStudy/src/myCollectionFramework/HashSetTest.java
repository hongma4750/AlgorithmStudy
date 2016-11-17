package myCollectionFramework;

import java.util.HashSet;

public class HashSetTest {
	//person 객체의 속성 값은 같지만 일반 set을 사용시 같은 인스턴스로 판단을 하지 않는다.
	//그러므로 equals 메서드를 오버라이딩하여 새롭게 재정의를 하여 속성값 판단 후 set에 add한다.
	//결과적으로 속성값이 같은 인스턴스를 set에 add할시 equasl메서드를 이용하여 판단후 중복값을 허용하지 않게 입력함
	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		
		mySet.add(new String("abc"));
		mySet.add(new String("abc"));
		mySet.add(new person("hongma",26));
		mySet.add(new person("hongma",26));
		
		System.out.println(mySet);
		System.out.println("--------------------------------");
		
		person p1 = new person("hongmin",25);
		
		int hashCode1=p1.hashCode();
		int hashCode2=p1.hashCode();
		
		System.out.println("hashCode1"+hashCode1);
		System.out.println("hashCode1"+hashCode2);
		

	}

}

class person{
	String name;
	int age;
	
	public person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof person){
			person temp = (person)obj;
			return name.equals(temp.name) && age==temp.age;
		}
		
		return false;
	}
	
	public int hashCode(){
		return (name+age).hashCode();
	}
	
	public String toString(){
		return name+":"+age;
	}
}
