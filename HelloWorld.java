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
		System.out.println("���û�����һ��������");
		int num=input.nextInt();
		if(num==1) {
			System.out.println("�û����������Ϊ��"+num);
		}else {
			num--;
			System.out.println("����������Ϊ��"+num);
		}*/

		
		
		//��whileѭ�����10���ڵ�����
		/*int i=1;
		while(i<10) {
			System.out.println(i);	
			i++;
		}*/

		
		
		//��do-whileѭ�����10���ڵ�����
		/*int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<10);*/
		
		
		
		//��forѭ�����10���ڵ�����
		/*for(int i=1;i<+10;i++) {
			System.out.println(i);
		}*/
		
		
		


		/**
		 * ��ATM��ȡ�����
		 * @author bdqn
		 *
		 */
		
		   
				String pwd = "";  //�����û�����
				int amount = 0;   //ȡ����
				int count =0;  //��¼�û�����Ĵ���
				boolean isPass = false;  //��¼�����Ƿ���֤ͨ��
				Scanner input = new Scanner(System.in);
				
				while(count<3 && !isPass){
					System.out.print("���������룺");
					pwd = input.next();
					if(!pwd.equals("111111")){
						count++;
						continue;
					}
					isPass = true;
					System.out.print("�������");
					amount = input.nextInt();
					while(amount>0){
						if(amount<=1000 && amount%100==0){
							System.out.println("��֧ȡ��"+amount+"Ԫ��");
							System.out.println("������ɣ���ȡ����");
							break;   //��ɽ��ף��˳�
						}else{
							System.out.print("������Ľ��Ϸ������������룺");
							amount = input.nextInt();
							continue;   //�������û�������
						}
					}
				}
				//�û�������3�δ�������
				if(!isPass){
					System.out.println("���������ȡ����");
				}
				
				//
			
		
		
		
	}
}
