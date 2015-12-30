package com.digitek.abstractmodifier;

public class ReportsClientClass {

	public static void main(String[] args) {

		csvReportsClient();
		System.out.println("");
		xmlReportsClient();
	}
	
	public static void csvReportsClient() {
		
		CSVReportGenerator csvreport = new CSVReportGenerator();
		csvreport.generateHeader();
		csvreport.subHeader();
		csvreport.putLogo();
		csvreport.generateBody();
		csvreport.generateFooter();
		
	}
	
	public static void xmlReportsClient() {
		
		XMLReportGenerator xmlreport = new XMLReportGenerator();
		xmlreport.generateHeader();
		xmlreport.subHeader();
		xmlreport.putLogo();
		xmlreport.generateBody();
		xmlreport.generateFooter();
		
	}

}
