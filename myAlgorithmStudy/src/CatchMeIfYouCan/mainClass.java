package CatchMeIfYouCan;

import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// 질문 리스트 선택 프로그램
		
		// 개발자 : 김홍민
		// 만든이유 : 상당히 귀찮아서 .... 스터디까지 시간이 남아서 재미삼아...
		
		
		// 사용법 : 숫자 1을 input 값으로 넣어주삼
		// 데이터 추가시 myArr 배열에 데이터 값 넣어주면 됨
		
		
		// https://repl.it/languages
		// 웹 코딩 사이트
		
		
		ArrayList<String> myList = new ArrayList<String>();
		
		String[] myArr = {"클래스vs객체","객체지향특징","자바특징","절차vs객체","main메서드",
							"스레드vs프로세스","배열vs연결리스트","tcp/udp","스택vs큐","call by value vs call by reference",
							"스트림","메모리구조","컬렉션프레임워크","트랜잭션","트리vs해쉬","스프링(DI,aop,anotaion,IOC"
				 ,"해쉬"};
		
		for(int i=0;i<myArr.length;i++){
			myList.add(myArr[i]);
		}
		
		//input 값 설정 불가능
		// size: 14
		
		//System.out.println(myList.get(0));
		
		
		
		//input 값 설정 가능
		while(true){
			Scanner sc = new Scanner(System.in);
			
			if(sc.nextInt()==1){
				int checkPoint = (int)(Math.random()*myList.size());
				System.out.println(myList.get(checkPoint));
				myList.remove(checkPoint);
				
				/*for(int j=0;j<myList.size();j++){
					System.out.println("j : "+j +" = "+myList.get(j));
				}*/
				
				if(myList.size()==0){
					break;
				}
			}
		}

	}

}
