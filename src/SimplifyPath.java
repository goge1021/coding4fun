import java.util.ArrayList;
import java.util.List;


public class SimplifyPath {

	public String simplifyPath(String path) {
		List<String> stack = new ArrayList<String>();
		String[] token = path.split("/");
		for(String str : token){
			if(str.equals("") || str.equals(".")){
				continue;
			} else if(str.equals("..")){
				if(!stack.isEmpty())
					stack.remove(stack.size()-1);
			} else {
				stack.add(str);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String str : stack){
			sb.append("/").append(str);
		}
		String ret = sb.toString();
		if(ret.equals(""))
			return "/";
		else
			return ret;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimplifyPath sp = new SimplifyPath();
		System.out.println(sp.simplifyPath("/home//foo/"));
	}

}
