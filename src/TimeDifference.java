/*
 * StringBuffer,StringBuilder의 실행 시간 비교
 * */

public class TimeDifference {
	public static long getStringSpeed(){
		String text = "Hello";
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//현재시각을 밀리세컨드 단위로 반환함
		
		for(int i = 0; i < 100000; i++) {
			text = text + target;
		}
		
		end = System.currentTimeMillis();//반복문을 끝내고 난뒤의 현재시각을 구함
		
		return end-start;//실행시간을 반환
		
	}
	public static long getStringBufferSpeed() {
		StringBuffer text = new StringBuffer("Hello");
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//현재시각을 밀리세컨드 단위로 반환함
		
		for(int i = 0; i < 100000; i++) {
			text.append(target);
		}
		
		end = System.currentTimeMillis();//반복문을 끝내고 난뒤의 현재시각을 구함
		
		return end-start;//실행시간을 반환
	}
	public static long getStringBuilderSpeed() {
		StringBuilder text = new StringBuilder("Hello");
		String target = "Bye";
		long start, end;
		
		start = System.currentTimeMillis();//현재시각을 밀리세컨드 단위로 반환함
		
		for(int i = 0; i < 100000; i++) {
			text.append(target);
		}
		
		end = System.currentTimeMillis();//반복문을 끝내고 난뒤의 현재시각을 구함
		
		return end-start;//실행시간을 반환
	}
	public static void main(String[] args) {
		long StringBufferTime,StringTime,StringBuilderTime;
		
		StringBufferTime = getStringBufferSpeed();
		StringTime = getStringSpeed();
		StringBuilderTime = getStringBuilderSpeed();
		
		//String, StringBuffer, StringBuilder 각각의 실행 시간을 비교
		System.out.println("String 실행 시간 : " + StringTime);
		System.out.println("StringBuffer 실행 시간 : " + StringBufferTime);
		System.out.println("StringBuilder 실행 시간 : " + StringBuilderTime);
	}

}
