package miridi;

import java.util.ArrayList;
import java.util.Scanner;

public class InvestmentInStocks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int repeat = 0;
		
		int[] myIncome = new int[T];
		ArrayList<Integer> price;
		ArrayList<Integer> myStocks;
		
		while(repeat != T){

			int dayN = scan.nextInt();
			
			price = new ArrayList<Integer>();
			myStocks = new ArrayList<Integer>();

			int income = 0;
			
			for(int i=0;i<dayN;i++){
				
				price.add(scan.nextInt());
				//System.out.println(repeat+" 주가 : "+price.get(i));

			}
			
			//문제의 핵심은 내 주식을 언제 파느냐 이다
			//파는 시점은 이전의 주가가 얼마이든 상관없이 주가가 제일 높은 시점에 모든 주식들을 팔면 최고 이득 이다
			//주가가 제일 높은 시점이 되기 전까지 그 날 주가와 상관없이 주식들을 사면 된다.
			//하지만 주가가 제일 높은 시점이 첫날이면 주가를 사지 않는다.
			//다음 주가가 제일 높은 시점을 찾고 다시 그날이 되기 전까지 주식을 계속 산다.
			//모든 주식을 다 판 후 다시 다음 주가가 제일 높은 날을 찾고 그날이 되기전까지 주식을 산다.
			
			int bestPrice = findBestPrice(price,0,price.size());		//주가가 제일 높을때를 찾는다.
			
			for(int i=0;i<price.size();i++){
				if(price.get(i) != bestPrice ){							//찾는 주가 보다 낮으면 주식을 산다.
					
					myStocks.add(price.get(i));
					
				}else if(price.get(i) == bestPrice && i != 0){			//제일 높은 주가를 찾았고 그 날이 첫날이 아니면 주가를 판다.
					income += saleMyStock(myStocks,bestPrice);			//주가를 팔면서 나의 주식 정보가 담겨있는 ArrayList를 초기화 시킨다.
					
					bestPrice = findBestPrice(price, i+1, price.size());	//다음 주가가 제일 높은 날을 찾는다.
		
				}else if(price.get(i) == bestPrice && i==0){
					bestPrice = findBestPrice(price,i+1,price.size());	//주가는 제일 높지만 첫날이기에 다음 주가가 제일 높은 날을 찾는다.
				}
			}

			myIncome[repeat] = income;
			
	
			repeat ++;
		}
		
		for(int i=0;i<myIncome.length;i++){
			System.out.println(myIncome[i]);
		}

	}
	
	static int saleMyStock(ArrayList<Integer> myStocks,int bestPrice){		//주가를 파는 역활
		
		int money = 0;
		
		for(int i=0;i<myStocks.size();i++){
			money += bestPrice-myStocks.get(i);
		}
		myStocks.removeAll(myStocks);
		return money;
	}
	
	static int findBestPrice(ArrayList<Integer> price, int first, int max){		//최고주가를 찾는 역활
		
		int bestPrice = 0;
		
		if(first+1 == max){
			bestPrice = 0;
			
		}else{
			for(int i=first;i<max;i++){
				if(bestPrice < price.get(i)){
					bestPrice=price.get(i);
				}
			}
		}
		
		return bestPrice;
	}

}

