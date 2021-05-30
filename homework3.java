
public class homework3 {

	public static void main(String[] args) {
      java.util.Scanner s = new java.util.Scanner(System.in);
      System.out.println("请输入一个正整数：");
      int num = s.nextInt();//先不用管乘法，先实现键盘输入值的遍历，递减方式取值
      int jieguo=1;//阶乘初始值需要是1 否则无意义
      for(int i =num;i>0;i--) {
    	  
    	  jieguo *= i; //jieguo2 = jieguo1*i;乘积赋值给前面的jieguo2  循环计算
    	  
    	  //System.out.println(i);
      }
      System.out.println("结果为："+ jieguo);
      
	}

}
