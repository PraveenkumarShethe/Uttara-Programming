import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp="(([a-zA-Z0-9]+:[+]{0,1})?[0-9]+-[+]{0,1}[0-9]+)";
		Pattern p=Pattern.compile(regExp);
		
		System.out.println(p.matcher("tel:+123-++333".toString()).matches());
		Matcher m=p.matcher("tel");
		System.out.println(m.matches());

	}

}
