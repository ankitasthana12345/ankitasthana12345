package com.prac.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {
	GraphRepresentation gh = new GraphRepresentation();
	//gh.method();
	
	
static	public void method1() {
		
	}

public static void main(String[] args) throws NumberFormatException, IOException {

	
	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

     int N = Integer.parseInt(bufferedReader.readLine().trim());
     for(int i=1;i<=10;i++){
         System.out.printf("%d x %d = %d%n", N, i, N*i);

     }
     bufferedReader.close();
 }
}
