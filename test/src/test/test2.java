package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(newIPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(newIPInfo("212.133.7.8", "아무"));
		ipInfoList.add(newIPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
			if(ipInfoList.get(i).getInfo.get.equals) {
				System.out.println(ipInfoList.get(u));
				return;
				
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}
