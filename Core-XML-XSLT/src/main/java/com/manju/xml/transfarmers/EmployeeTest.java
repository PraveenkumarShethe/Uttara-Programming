package com.manju.xml.transfarmers;

import java.io.File;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlTransformation xmltrns;
		/**
		System.out.println("**** emp1 ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp1.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp1.xml"));
		System.out.println("**** emp1 end ******************************");
		
		System.out.println("**** emp2 ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp2.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp2.xml"));
		System.out.println("**** emp2 end ******************************");
		
		
		System.out.println("**** emp3 start ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp3.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp3.xml"));
		System.out.println("**** emp3 end ******************************");  
		
		
		System.out.println("**** emp4 start ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp4.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp4.xml"));
		System.out.println("**** emp4 end ******************************"); 
		
		System.out.println("**** emp5 start ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp5.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp5.xml"));
		System.out.println("**** emp5 end ******************************"); **/
		
		System.out.println("**** emp6 start ******************************");
		xmltrns=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp6.xslt"));
		xmltrns.transfer1(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/emp6.xml"));
		System.out.println("**** emp6 end ******************************");
		
		
	}

}
