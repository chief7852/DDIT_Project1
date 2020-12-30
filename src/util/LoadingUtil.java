package util;

public class LoadingUtil {
	
	static public void loading(){
		String[] str = {"ㅇ","오","온","오느","오늘","오늘 ","오늘 ㅁ","오늘 무","오늘 뭐","오늘 뭐 ㅁ","오늘 뭐 머","오늘 뭐 먹"
				,"오늘 뭐 먹ㅈ","오늘 뭐 먹지","오늘 뭐 먹지","오늘 뭐 먹지.","오늘 뭐 먹지..","오늘 뭐 먹지...","오늘 뭐 먹지...?　 "};
		String[] name1 = {"👨 ㅂ","👨 바","👨 박","👨 밗","👨 박세","👨 박셓","👨 박세혀","👨 박세현"};
		String[] name2 = {"👩 ㅇ","👩 유","👩 윤","👩 윥","👩 윤지","👩 윤짛","👩 윤지혜"};
		String[] name3 = {"👦 ㅈ","👦 저","👦 정","👦 정ㅇ","👦 정이","👦 정잇","👦 정이사","👦 정이삭"};
		int n1=0 ,n2=0, n3=0;
		String pressEnter = "";
		for(int i=0; i<str.length+name1.length+name2.length+name3.length; i++){
			String str_1 = "",name_1="",name_2 = "", name_3 = "";
		
			int j=i;
			if(j>str.length-1) j=str.length-1;
			str_1 = str[j];
			if(i>= str.length){ 
				if(n1>name1.length-1) n1=name1.length-1;
				name_1 = name1[n1++];			}
			if(i>= str.length+name1.length){
				if(n2>name2.length-1) n2=name2.length-1;
				name_2 = name2[n2++];			}
			if(i>= str.length+name1.length+name2.length){
				if(n3>name3.length-1) n3=name3.length-1;
				name_3 = name3[n3++];			}	
			if(n3 == name3.length-1){
				Util.wait(1000);
				pressEnter = " 계속하려면 엔터키를 입력...";
			}

			Util.wait(150);
			System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■");
			System.out.println();
			System.out.println("      ╭∂∂∂∂∂∂╮    ╭──────────────╮                     ");
			System.out.println("      ε • _ •│      "+str_1);
			System.out.println("      ╰──┰┰──╯    ╰──────────────╯ ");
			System.out.println("      ╭──╲╱──╮");
			System.out.println("   ╞══╧══════╧═════════╡▒   "+name_1);
			System.out.println("   │　　대덕인재개발원　302호　│▒   "+name_2);
			System.out.println("   └───────────────────┘▒   "+name_3);
			System.out.println("   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ");
			System.out.print("□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>"+pressEnter);  
		}
		ScanUtil.nextLine();
		
	}
	
	static public void mainUi(int select,String nickname){
		final int max = 1;
		int count = 0;
		String grade ="□" ,review = "□",distance ="□", serch ="□", order ="□",mypage ="□",board ="□";
		String page = "마이페이지";
		if(nickname.equals("비회원")){page = "로그인";}
		if(nickname.equals("관리자")){page = "관리자전용";}
		String x ="";
		String a = "■";
		switch(select)
		{
		case 1 : grade =a;x = "평점순";break;
		case 2 : review =a;x = "리뷰수";break; 
		case 3 : distance =a;x = "거리순";break;
		case 4 : serch =a;x= "평점순";break;
		case 5 : order =a;break;
		case 6 : mypage =a;break;
		case 7 : board  =a;break;
		default : break;
		}


		for(int i = 1; i <6;i++){
			Util.wait(110);
			if(count == max){break;}

			if(i == 5){count++;i = 1;}
			if(i == 1){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           ■ □\n"
						+ " "+serch+" 검색                     	           □ □\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}

			if(i == 2){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ □\n"
						+ " "+serch+" 검색                     	           ■ □\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}

			if(i == 3){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ □\n"
						+ " "+serch+" 검색                     	           □ ■\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}

			if(i == 4){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ ■\n"
						+ " "+serch+" 검색                     	           □ □\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}
		}
	}



}