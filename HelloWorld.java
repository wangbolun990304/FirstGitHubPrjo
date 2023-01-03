import java.util.*;
public class HelloWorld{
	/*public static void main(String[] args) {
		System.out.print("hello\t world!\n");
		System.out.print("hello\t world!\n");
		int k=0;
		--k;
		System.out.println(k);
	}*/
	public static void main(String[] args) {
		/*Scanner input=new Scanner(System.in);
		System.out.println("请用户输入一个整数：");
		int num=input.nextInt();
		if(num==1) {
			System.out.println("用户输入的数字为："+num);
		}else {
			num--;
			System.out.println("输出后的数字为："+num);
		}*/

		
		
		//用while循环输出10以内的整数
		/*int i=1;
		while(i<10) {
			System.out.println(i);	
			i++;
		}*/

		
		
		//用do-while循环输出10以内的整数
		/*int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<10);*/
		
		
		
		//用for循环输出10以内的整数
		/*for(int i=1;i<+10;i++) {
			System.out.println(i);
		}*/
		
		
		


		/**
		 * 简单ATM机取款过程
		 * @author bdqn
		 *
		 */
		
		   
				String pwd = "";  //保存用户密码
				int amount = 0;   //取款金额
				int count =0;  //记录用户输入的次数
				boolean isPass = false;  //记录密码是否验证通过
				Scanner input = new Scanner(System.in);
				
				while(count<3 && !isPass){
					System.out.print("请输入密码：");
					pwd = input.next();
					if(!pwd.equals("111111")){
						count++;
						continue;
					}
					isPass = true;
					System.out.print("请输入金额：");
					amount = input.nextInt();
					while(amount>0){
						if(amount<=1000 && amount%100==0){
							System.out.println("您支取了"+amount+"元。");
							System.out.println("交易完成，请取卡！");
							break;   //完成交易，退出
						}else{
							System.out.print("您输入的金额不合法，请重新输入：");
							amount = input.nextInt();
							continue;   //继续让用户输入金额
						}
					}
				}
				//用户输入了3次错误密码
				if(!isPass){
					System.out.println("密码错误，请取卡！");
				}
				
				//
			
		
		
		
	}
}
