import java.util.*;
public class ShiTouJianDaoBu{
	static Scanner sc=new Scanner(System.in);
	static String r,j;
	public static void main(String[] ages){
		//double num=(int)(Math.random()*10);
		System.out.println("****��ӭ����ʯͷ������С��Ϸ****");
		ren();
	}
	public static void ren(){
		boolean ad=true;
		while(ad){
			System.out.println("********************************");
			System.out.println("***********�˻���ս*************");
			System.out.println("************1.ʯͷ**************");
			System.out.println("************2.����**************");
			System.out.println("************3.��****************");
			System.out.println("********************************");
			int in=sc.nextInt();
			switch(in){
				case 1:r="ʯͷ";ad=false;ji();break;
				case 2:r="����";ad=false;ji();break;
				case 3:r="��";ad=false;ji();break;
				default:System.out.println("�����������������룡");
			}
		}
	}
	public static void ji(){
		double num=(int)(Math.random()*10);
		if(num>=0&num<4){
			j="ʯͷ";
		}else if(num>=4&num<7){
			j="����";
		}else if(num>=7&num<10){
			j="��";
		}
		jieguo();
	}
	public static void jieguo(){
		System.out.println("���"+r+"���Գ�"+j);
		if(r=="ʯͷ"&j=="����"|r=="����"&j=="��"|r=="��"&j=="ʯͷ"){
			System.out.println("��Ӯ��");
		}else if(j=="ʯͷ"&r=="����"|j=="����"&r=="��"|j=="��"&r=="ʯͷ"){
			System.out.println("������");
		}else if(j=="ʯͷ"&r=="ʯͷ"|j=="����"&r=="����"|j=="��"&r=="��"){
			System.out.println("ƽ��");
		}
		jixu();
	}
	public static void jixu(){
		boolean ad=true;
		System.out.println("Ҫ��������\n1.����\t2.�˳�");
		while(ad){
			int in=sc.nextInt();
			switch(in){
				case 1:ad=false;ren();break;
				case 2:ad=false;System.out.println("�˳��ɹ����ټ���");break;
				default:System.out.println("�����������������룡");
			}
		}
	}
}