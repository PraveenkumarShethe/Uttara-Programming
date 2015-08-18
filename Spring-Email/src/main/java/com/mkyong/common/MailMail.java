package com.mkyong.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailMail
{
	// private MailSender mailSender;
	private JavaMailSender mailSender; // for atatchments
	private SimpleMailMessage simpleMailMessage;
	
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String dear, String content) {

		SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);		
		message.setText(String.format(simpleMailMessage.getText(), dear, content));
		
		mailSender.send(message);
		
	}
	
	public void sendMailWithOutAtatchement(String dear, String content) {
		 
		   MimeMessage message = mailSender.createMimeMessage();
	 
		   try{
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
	 
			helper.setFrom(simpleMailMessage.getFrom());
			helper.setTo(simpleMailMessage.getTo());
			helper.setSubject("HTML   .......GGGG......");
			
			  //message.setText("my text <img src='cid:myLogo'>", true);
			    // message.addInline("myLogo", new ClassPathResource("img/mylogo.gif"));
			     //message.addAttachment("myDocument.pdf", new ClassPathResource("doc/myDocument.pdf"));
			String t="<!DOCTYPE html><html><body><p>An image:<img src=\"http://www.mamaliciousnoire.com/wp-content/uploads/2012/01/smiley-face1.jpg\" alt=\"Smiley face\"width=\"32\" height=\"32\"></p><p>A moving image:<img src=\"cid:myLogo\" alt=\"Computer man\" width=\"48\" height=\"48\"></p><p>Note that the syntax of inserting a moving image is no different from a non-moving image.</p></body></html>";
			//message.setContent(new String(FileUtils.readFileToByteArray(new File("/home/manjugm/Desktop/java-memory-architecture.jpg"))), "text/plain");
			helper.setText(getHTML(),true);
			//helper.addInline("cid:", new File("/home/manjugm/Desktop/java-memory-architecture.jpg"));
		//	helper.addInline("myLogo", new File("/home/manjugm/Desktop/java-memory-architecture.jpg"));
			//message.setDisposition(message.INLINE);"
			
			//FileUtils.
	 
		//	FileSystemResource file = new FileSystemResource("D:\\fax-demo\\src\\main\\java\\com\\tecnomen\\mtni\\demo\\notification\\EmailMessage.java");
			//helper.addAttachment(file.getFilename(), file);
			 mailSender.send(message);
	 
		     }catch (MessagingException e) {
			 e.printStackTrace();
		     }
		   System.out.println("Done ");
		    
	         }
	
	
	public  String getCont() {
		 
		URL url;
		StringBuffer buffer=new StringBuffer();
 
		try {
			// get URL content
			url = new URL("http://jira.tecnotree.com/jira/browse/MBUCR-2181");
			URLConnection conn = url.openConnection();
 
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
			
			String inputLine;
 
			//save to this filename
			String fileName = "/home/manju/test.html";
			File file = new File(fileName);
 
			if (!file.exists()) {
				//file.createNewFile();
			}
 
			//use FileWriter to write file
		//	FileWriter fw = new FileWriter(file.getAbsoluteFile());
			//BufferedWriter bw = new BufferedWriter(fw);
 
			while ((inputLine = br.readLine()) != null) {
				buffer.append(inputLine);
			//	bw.write(inputLine);
			}
 
			//bw.close();
			br.close();
 
			System.out.println("Done" +buffer.toString());
 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
      return buffer.toString();
	}
	
	String getHTML(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
		buffer.append("<html>");
		buffer.append("<head>");
		buffer.append("<title>My first styled page</title>");
		buffer.append("<style type=\"text//css\">");
		buffer.append("body { padding-left: 11em; font-family: Georgia, \"Times New Roman\", Times, serif;");
		buffer.append("color: purple; background-color: #d8da3d }");
		buffer.append("ul.navbar { list-style-type: none; padding: 0; margin: 0; position: absolute; top: 2em;left: 1em; width: 9em }");
		buffer.append("h1 { font-family: Helvetica, Geneva, Arial, SunSans-Regular, sans-serif }");
		buffer.append("ul.navbar li { background: white; margin: 0.5em 0; padding: 0.3em; border-right: 1em solid black }");
		buffer.append("ul.navbar a { text-decoration: none } a:link { color: blue } a:visited { color: purple }" +
				" address { margin-top: 1em; padding-top: 1em; border-top: thin dotted } </style>");
		
		buffer.append("</head>");
		buffer.append("<body>");

	// Site navigation menu 
		buffer.append("<ul class=\"navbar\">");
		buffer.append("<li><a href=\"index.html\">Home page</a>");
		buffer.append("<li><a href=\"musings.html\">Musings</a>");
		buffer.append("<li><a href=\"town.html\">My town</a>");
		buffer.append("<li><a href=\"links.html\">Links</a>");
		buffer.append("</ul>");

		// Main content 
		buffer.append("<h1>My first styled page</h1>");
		buffer.append("<p>Welcome to my styled page!");
	    buffer.append("<img src=\"cid:myLogo\" alt=\"Computer man\" width=\"48\" height=\"48\">"); 
		buffer.append("<p>It lacks images, but at least it has style.");
		buffer.append("<p>There should be more here, but I don't know");
		buffer.append("</body>");
		buffer.append("</html>");
		System.err.println(buffer);
		return buffer.toString();
	}
}
	
	