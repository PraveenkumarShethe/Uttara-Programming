package com.manju.xml.transfarmers;

import java.io.File;

import junit.framework.TestCase;

import org.junit.Test;

public class UnitTest extends TestCase{
	XmlTransformation xmltrns;
	static final String ROOT="/drives/ext-data/ngm/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/";
   
	
	
	@Test
	public void DISABLE_testExample1() throws Exception {
		System.out.println("**** example1 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp1.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp1.xml"));
		System.out.println("**** example1 end ******************************");
	}
	
	@Test
	public void DISABLE_testExample2() throws Exception {
		System.out.println("**** example2 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp2.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp2.xml"));
		System.out.println("**** example2 end ******************************");
	}
	
	@Test
	public void DISABLE_testExample3() throws Exception {
		System.out.println("**** example3 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp3.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp3.xml"));
		System.out.println("**** example3 end ******************************");
	}
	
	@Test
	public void DISABLE_testExample4() throws Exception {
		System.out.println("**** example4 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp4.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp4.xml"));
		System.out.println("**** example4 end ******************************");
	}
	
	@Test
	public void DISABLE_testExample5() throws Exception {
		System.out.println("**** example5 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp5.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp5.xml"));
		System.out.println("**** example5 end ******************************");
	}
	
	@Test
	public void DISABLE_testExample6() throws Exception {
		System.out.println("**** example6 ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"emp6.xslt"));
		xmltrns.transfer1(new File(ROOT+"emp6.xml"));
		System.out.println("**** example6 end ******************************");
	}
	@Test
	public void DISABLE_testCopy() throws Exception {
		System.out.println("**** Copy ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"copy.xslt"));
		xmltrns.transfer1(new File(ROOT+"copy.xml"));
		System.out.println("**** Copy end ******************************");
	}
	
	@Test
	public void DISABLE_testCopyOf() throws Exception {
		System.out.println("**** testCopyOf ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"copy-of.xslt"));
		xmltrns.transfer1(new File(ROOT+"copy-of.xml"));
		System.out.println("**** testCopyOf end ******************************");
	}

	@Test
	public void testSubscriberws() throws Exception {
		System.out.println("**** testSubscriberws ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"subscriberws.xslt"));
		xmltrns.transfer1(new File(ROOT+"subscriberws.xml"));
		System.out.println("**** testSubscriberws end ******************************");
	
	
	}
	
	
	@Test
	public void DISABLE_testCreateSubReq() throws Exception {
		System.out.println("**** testCreateSubReq ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"CreateSubReq.xslt"));
		xmltrns.transfer1(new File(ROOT+"CreateSubReq.xml"));
		System.out.println("**** testCreateSubReq end ******************************");
	
	
	}
	
	@Test
	public void DISABLE_testCreateSubResp() throws Exception {
		System.out.println("**** testCreateSubResp ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"CreateSubResp.xslt"));
		xmltrns.transfer1(new File(ROOT+"CreateSubResp.xml"));
		System.out.println("**** testCreateSubResp end ******************************");
	
	
	}
	
	
	
	@Test
	public void DISABLE_testTest() throws Exception {
		System.out.println("**** testTest ******************************");
		xmltrns=new XmlTransformation(new File(ROOT+"test.xslt"));
		xmltrns.transfer1(new File(ROOT+"test.xml"));
		System.out.println("**** testTest end ******************************");
	
	
	}
	
	

}
