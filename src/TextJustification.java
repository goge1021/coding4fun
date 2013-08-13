import java.util.ArrayList;


public class TextJustification {

	public ArrayList<String> fullJustify(String[] words, int L) {
        ArrayList<String> ret = new ArrayList<String>();
        int cur = 0;
        int start = 0;
        for(int i=0; i<words.length; i++){
        	if(cur+words[i].length() > L){
        		int wordCount = i - start;
        		int white = L-cur+wordCount;
        		if(wordCount == 1){
        			int c = L-words[start].length();
        			if(c == 0){
        				ret.add(words[start]);
        			} else {
        				ret.add(words[start]+String.format("%"+c+"s", ""));
        			}
        		} else {
        			int minWhite = white / (wordCount-1);
        			int extra = white % (wordCount-1);
        			StringBuilder sb = new StringBuilder();
        			sb.append(words[start]);
        			for(int j=1; j<wordCount; j++){
        				if(j <= extra){
        					sb.append(String.format("%"+(minWhite+1)+"s", ""));
        				} else {
        					sb.append(String.format("%"+minWhite+"s", ""));
        				}
        				sb.append(words[start+j]);
        			}
        			ret.add(sb.toString());
        		}
        		
        		start = i;
        		cur = words[i].length() + 1;
        	} else {
        		cur += words[i].length() + 1;
        	}
        }
        StringBuilder sb = new StringBuilder();
        sb.append(words[start]);
        for(int i=start+1; i<words.length; i++){
        	sb.append(" ").append(words[i]);
        }
        if(sb.length() != L){
        	sb.append(String.format("%"+(L-sb.length())+"s", ""));
        }
        ret.add(sb.toString());
        return ret;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TextJustification t = new TextJustification();
		ArrayList<String> r = t.fullJustify(new String[]{"What","must","be","shall","be."},12);
		for(String s : r){
			System.out.println(s);
		}
	}

}
