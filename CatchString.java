package summer021;

public class CatchString {

 	private char[] aCharArray;
	private char[] bCharArray;
	
	public CatchString() {
		// TODO Auto-generated constructor stub
	}

	public CatchString(String a,String b) {
		setACharArray(a);
		setBCharArray(b);
	}
	
	public void setACharArray(String a) {
		aCharArray = new char[a.length()];
		for(int i=0;i<aCharArray.length;i++) {
			aCharArray[i]=a.charAt(i);
		}
	}
	
	public void setBCharArray(String b) {
		bCharArray = new char[b.length()];
		for(int i=0;i<bCharArray.length;i++) {
			bCharArray[i]=b.charAt(i);
		}
	}
	
	public String toString() {
		int a = aCharArray.length;
		int b = bCharArray.length;
		int time=0;
		if(a>b) {
			for(int i=0;i<b;i++) {
				if(aCharArray[i]==bCharArray[i])
					time+=1;
			}
		}
		
		else {
			for(int i=0;i<a;i++) {
				if(aCharArray[i]==bCharArray[i])
					time+=1;
			}
		}
		return "相同字共有"+time;
	}
}
