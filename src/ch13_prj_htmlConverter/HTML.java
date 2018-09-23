package ch13_prj_htmlConverter;

import java.util.Scanner;

public class HTML {
	
	Scanner s = new Scanner(System.in);
	
	String greeting = "HTML Converter";
	String html = "<h1>Grocery List</h1>\n" + "<ul>\n" + 
					"    <li>Eggs</li>\n" + 
					"    <li>Milk</li>\n"+
					"    <li>Butter</li>\n" + 
					"</ul>\n";

	public HTML() {

	}

	public String getGreeting() {
		System.out.println("HTML Converter\n");
		return greeting;
	}

	public String getInput() {
		System.out.println("INPUT\n" + html);
		return html;
	}

	public String getOutput() {
		html = html.replace("<li>", "* ");
		html = html.replaceAll("<\\S*?>", "");

		System.out.println("OUTPUT\n" + html);
		return html;
	}

}
