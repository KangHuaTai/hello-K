import java.util.*;
public class ShiTouJianDaoBu{
	static Scanner sc=new Scanner(System.in);
	static String r,j;
	public static void main(String[] ages){
		//double num=(int)(Math.random()*10);
		System.out.println("****欢迎来到石头剪刀布小游戏****");
		ren();
	}
	public static void ren(){
		boolean ad=true;
		while(ad){
			System.out.println("********************************");
			System.out.println("***********人机对战*************");
			System.out.println("************1.石头**************");
			System.out.println("************2.剪刀**************");
			System.out.println("************3.布****************");
			System.out.println("********************************");
			int in=sc.nextInt();
			switch(in){
				case 1:r="石头";ad=false;ji();break;
				case 2:r="剪刀";ad=false;ji();break;
				case 3:r="布";ad=false;ji();break;
				default:System.out.println("输入有误！请重新输入！");
			}
		}
	}
	public static void ji(){
		double num=(int)(Math.random()*10);
		if(num>=0&num<4){
			j="石头";
		}else if(num>=4&num<7){
			j="剪刀";
		}else if(num>=7&num<10){
			j="布";
		}
		jieguo();
	}
	public static void jieguo(){
		System.out.println("你出"+r+"电脑出"+j);
		if(r=="石头"&j=="剪刀"|r=="剪刀"&j=="布"|r=="布"&j=="石头"){
			System.out.println("你赢了");
		}else if(j=="石头"&r=="剪刀"|j=="剪刀"&r=="布"|j=="布"&r=="石头"){
			System.out.println("你输了");
		}else if(j=="石头"&r=="石头"|j=="剪刀"&r=="剪刀"|j=="布"&r=="布"){
			System.out.println("平局");
		}
		jixu();
	}
	public static void jixu(){
		boolean ad=true;
		System.out.println("要继续玩吗？\n1.继续\t2.退出");
		while(ad){
			int in=sc.nextInt();
			switch(in){
				case 1:ad=false;ren();break;
				case 2:ad=false;System.out.println("退出成功！再见！");break;
				default:System.out.println("输入有误！请重新输入！");
			}
		}
	}
}