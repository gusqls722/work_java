package ch02;
import java.text.DecimalFormat;
public class Ch02Ex01_05 {
	public static void main(String[] args) {
		String Seoul="Seoul", Pusan="Pusan", Incheon="Incheon",
				Daegu="Daegu", Gwangju="Gwangju";
		
		int num1=10312545, num2=91375;
		int num3=3567910, num4=5868;
		int num5=2758296, num6=64888;
		int num7=2511676, num8=17230;
		int num9=1454636, num10=29774;
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		DecimalFormat dx = new DecimalFormat("+###,###,###,###");
		String ch1= dc.format(num1);
		String ch3= dc.format(num3);
		String ch5= dc.format(num5);
		String ch7= dc.format(num7);
		String ch9= dc.format(num9);
		
		String ch2= dx.format(num2);
		String ch4= dx.format(num4);
		String ch6= dx.format(num6);
		String ch8= dx.format(num8);
		String ch10= dx.format(num10);
		System.out.printf("%15s%15s%15s%n",Seoul,ch1,ch2);
		System.out.printf("%15s%15s%15s%n",Pusan,ch3,ch4);
		System.out.printf("%15s%15s%15s%n",Incheon,ch5,ch6);
		System.out.printf("%15s%15s%15s%n",Daegu,ch7,ch8);
		System.out.printf("%15s%15s%15s%n",Gwangju,ch9,ch10);
	}
}
