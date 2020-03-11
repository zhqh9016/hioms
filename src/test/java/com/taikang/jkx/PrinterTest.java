package com.taikang.jkx;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;


public class PrinterTest {
	
	public static void main(String[] args) {
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		for (PrintService printService : services) {
			System.out.println(printService.getName());
		}
	}
	
}
