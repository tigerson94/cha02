package sec01.exam02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "�ð� " + minute + "��");

		int totalMinute = (hour*60) + minute;
		System.out.println("��" + totalMinute + "��");
	
	    int totalsec = hour * 60 * 60 + minute * 60;
	    System.out.println(
	    		"�ð���" + hour + ", ����" + minute);
	    System.out.printf(" �ð���%s , ����%s " , hour , minute);
	    
	   
	
	
	}
}
