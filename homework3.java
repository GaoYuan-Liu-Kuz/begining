
public class homework3 {

	public static void main(String[] args) {
      java.util.Scanner s = new java.util.Scanner(System.in);
      System.out.println("������һ����������");
      int num = s.nextInt();//�Ȳ��ùܳ˷�����ʵ�ּ�������ֵ�ı������ݼ���ʽȡֵ
      int jieguo=1;//�׳˳�ʼֵ��Ҫ��1 ����������
      for(int i =num;i>0;i--) {
    	  
    	  jieguo *= i; //jieguo2 = jieguo1*i;�˻���ֵ��ǰ���jieguo2  ѭ������
    	  
    	  //System.out.println(i);
      }
      System.out.println("���Ϊ��"+ jieguo);
      
	}

}
