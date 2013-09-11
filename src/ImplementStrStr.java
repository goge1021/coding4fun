
public class ImplementStrStr {

	public String strStr(String haystack, String needle) {
		int[] jump = new int[256];
		for(int i=0; i<256; i++){
			jump[i] = needle.length() + 1;
		}
		for(int i=0; i<needle.length(); i++){
			jump[needle.charAt(i)] = needle.length() - i;
		}
		
		boolean isFind = true;
		for(int pos=needle.length()-1; pos < haystack.length(); ){
			isFind = true;
			for(int i=pos,j=needle.length()-1; j>=0; i--,j--){
				if(haystack.charAt(i) != needle.charAt(j)){
					isFind = false;
					break;
				}
			}
			if(isFind){
				return haystack.substring(pos-needle.length()+1);
			} else {
				if(pos != haystack.length()-1)
					pos += jump[haystack.charAt(pos+1)];
				else
					return null;
			}
		}
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImplementStrStr i = new ImplementStrStr();
		System.out.println(i.strStr("here is a simple example", " "));
	}

}
