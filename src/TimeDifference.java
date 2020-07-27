/*
 * StringBuffer,StringBuilder�� ���� �ð� ��
 * */

public class TimeDifference {
	public static long getStringSpeed(){
		String text = "Hello";
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//����ð��� �и������� ������ ��ȯ��
		
		for(int i = 0; i < 100000; i++) {
			text = text + target;
		}
		
		end = System.currentTimeMillis();//�ݺ����� ������ ������ ����ð��� ����
		
		return end-start;//����ð��� ��ȯ
		
	}
	public static long getStringBufferSpeed() {
		StringBuffer text = new StringBuffer("Hello");
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//����ð��� �и������� ������ ��ȯ��
		
		for(int i = 0; i < 100000; i++) {
			text.append(target);
		}
		
		end = System.currentTimeMillis();//�ݺ����� ������ ������ ����ð��� ����
		
		return end-start;//����ð��� ��ȯ
	}
	public static long getStringBuilderSpeed() {
		StringBuilder text = new StringBuilder("Hello");
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//����ð��� �и������� ������ ��ȯ��
		
		for(int i = 0; i < 100000; i++) {
			text.append(target);
		}
		
		end = System.currentTimeMillis();//�ݺ����� ������ ������ ����ð��� ����
		
		return end-start;//����ð��� ��ȯ
	}
	public static void main(String[] args) {
		long StringBufferTime,StringTime,StringBuilderTime;
		
		StringBufferTime = getStringBufferSpeed();
		StringTime = getStringSpeed();
		StringBuilderTime = getStringBuilderSpeed();
		
		//String, StringBuffer, StringBuilder ������ ���� �ð��� ��
		System.out.println("String ���� �ð� : " + StringTime);
		System.out.println("StringBuffer ���� �ð� : " + StringBufferTime);
		System.out.println("StringBuilder ���� �ð� : " + StringBuilderTime);
	}

}
