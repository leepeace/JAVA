
public class StringBuffer_Example {

	public static void main(String[] args) {
		String StringText = "This";
		StringBuffer BufferText = new StringBuffer(StringText);
		
		BufferText.append(" is pencil");
		System.out.println(BufferText);
		
		BufferText.insert(7, " my");//"my" ���ڿ� ����
		System.out.println(BufferText);
		
		BufferText.replace(8, 10, "his");//���ڿ� "my"�� "his"�� ����
		System.out.println(BufferText);
		
		BufferText.delete(8, 12);//���ڿ�  "his" ����
		System.out.println(BufferText);
		
		BufferText.setLength(4);//��Ʈ�� ���� �� ���ڿ� ���� ����
		System.out.println(BufferText);
	}

}
