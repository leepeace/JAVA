
public class StringBuffer_Example {

	public static void main(String[] args) {
		String StringText = "This";
		StringBuffer BufferText = new StringBuffer(StringText);
		
		BufferText.append(" is pencil");
		System.out.println(BufferText);
		
		BufferText.insert(7, " my");//"my" 문자열 삽입
		System.out.println(BufferText);
		
		BufferText.replace(8, 10, "his");//문자열 "my"를 "his"로 변경
		System.out.println(BufferText);
		
		BufferText.delete(8, 12);//문자열  "his" 삭제
		System.out.println(BufferText);
		
		BufferText.setLength(4);//스트링 버퍼 내 문자열 길이 수정
		System.out.println(BufferText);
	}

}
