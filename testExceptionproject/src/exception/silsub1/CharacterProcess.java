package exception.silsub1;

public class CharacterProcess {
	public CharacterProcess() {}
	
	public int countAlpha(String s) throws CharCheckException{
		int count=0;
		
		for(int i=0; i<s.length();i++) {
			if(Character.isWhitespace(s.charAt(i))) { //isWhitespace ���鹮������
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ���� ������ �� �����ϴ�.");
			}//new ������ ����
			
			/*else if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				count++;
			}*/
			else if(Character.isAlphabetic((int)(s.charAt(i))))
					count++;
		}
		return count;
	}
}
