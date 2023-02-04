package test;

import java.util.Scanner;

public class beackjun25594 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		String result = "";
		
		while(S.length() > 0)
		{	
			String temp = S.substring(0,1);
			boolean flag = false;
			if(S.contains("aespa") && temp.equals("a"))
			{
				S = S.replace("aespa", "");
				result += "a";
				flag = true;
			}
			if(S.contains("baekjoon") && temp.equals("b"))
			{
				S = S.replace("baekjoon", "");
				result += "b";
				flag = true;
			}
			if(S.contains("cau") && temp.equals("c"))
			{
				S = S.replace("cau", "");
				result += "c";
				flag = true;
			}
			if(S.contains("debug") && temp.equals("d"))
			{
				S =S.replace("debug", "");
				result += "d";
				flag = true;
			}
			if(S.contains("edge") && temp.equals("e"))
			{
				S =S.replace("edge", "");
				result += "e";
				flag = true;
			}
			if(S.contains("firefox") && temp.equals("f"))
			{
				S  = S.replace("firefox", "");
				result += "f";
				flag = true;
			}
			if(S.contains("golang") && temp.equals("g"))
			{
				S =S.replace("golang", "");
				result += "g";
				flag = true;
			}
			if(S.contains("haegang") && temp.equals("h"))
			{
				S =S.replace("haegang", "");
				result += "h";
				flag = true;
			}
			if(S.contains("iu") && temp.equals("i"))
			{
				S =S.replace("iu", "");
				result += "i";
				flag = true;
			}
			if(S.contains("java") && temp.equals("j")) 
			{
				S =S.replace("java", "");
				result += "j";
				flag = true;
			}
			if(S.contains("kotlin") && temp.equals("k"))
			{
				S =S.replace("kotlin", "");
				result += "k";
				flag = true;
			}
			if(S.contains("lol") && temp.equals("l"))
			{
				S =S.replace("lol", "");
				result += "l";
				flag = true;
			}
			if(S.contains("mips") && temp.equals("m"))
			{
				S =S.replace("mips", "");
				result += "m";
				flag = true;
			}
			if(S.contains("null") && temp.equals("n")) 
			{
				S =S.replace("null", "");
				result += "n";
				flag = true;
			}
			if(S.contains("os") && temp.equals("o"))
			{
				S =S.replace("os", "");
				result += "o";
				flag = true;
			}
			if(S.contains("python") && temp.equals("p"))
			{
				S =S.replace("python", "");
				result += "p";
				flag = true;
			}
			if(S.contains("query") && temp.equals("q"))
			{
				S =S.replace("query", "");
				result += "q";
				flag = true;
			}
			if(S.contains("roka") && temp.equals("r"))
			{
				S =S.replace("roka", "");
				result += "r";
				flag = true;
			}
			if(S.contains("solvedac") && temp.equals("s"))
			{
				S =S.replace("solvedac", "");
				result += "s";
				flag = true;
			}
			if(S.contains("tod") && temp.equals("t"))
			{
				S =S.replace("tod", "");
				result += "t";
				flag = true;
			}
			if(S.contains("unix") && temp.equals("u"))
			{
				S =S.replace("unix", "");
				result += "u";
				flag = true;
			}
			if(S.contains("virus") && temp.equals("v"))
			{
				S =S.replace("virus", "");
				result += "v";
				flag = true;
			}
			if(S.contains("whale") && temp.equals("w"))
			{
				S =S.replace("whale", "");
				result += "w";
				flag = true;
			}
			if(S.contains("xcode") && temp.equals("x"))
			{
				S =S.replace("xcode", "");
				result += "x";
				flag = true;
			}
			if(S.contains("yahoo") && temp.equals("y"))
			{
				S =S.replace("yahoo", "");
				result += "y";
				flag = true;
			}
			if(S.contains("zebra") && temp.equals("z"))
			{
				S =S.replace("zebra", "");
				result += "z";
				flag = true;
			}
			if(flag == false) break;
		}
		if(S.length() > 0) System.out.println("ERROR!");
		else System.out.println("It's HG!\n" + result);
	}

}
