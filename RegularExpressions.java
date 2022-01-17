package javafirstTask.come;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		String[] words= {"hi", "Hello","How"};
		String find="hi",nofind="way";
		boolean a=meth(find,words);
		boolean b=meth(nofind,words);
		System.out.println(a);
		System.out.println(b);



	}
	static boolean meth(String find,String[] words) {
		Pattern pattern=Pattern.compile(find);
		boolean flag=false;
		for(int i=0;i<words.length;i++) {
			Matcher m =pattern.matcher(words[i]);
			while(m.find()) {
				flag=true;
			}
		}
		return flag;
	}

}


