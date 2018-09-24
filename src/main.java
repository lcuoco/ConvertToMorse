import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner;



public class main {



	public static void main(String[] args) throws Exception {

		File file = new File("/Users/lucascuoco/eclipse-lic/ConvertToMorse/src/text.txt"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st;

		while ((st = br.readLine()) != null) {

			st = st.toLowerCase();

			System.out.println(st);

			char[] arrStr = st.toCharArray();

			for(int j=0; j < arrStr.length-1;j++) {

				System.out.print(convertToMorse(arrStr[j], arrStr[j+1]));

			}

			System.out.println();

			System.out.println("=.-.=.-...=.=.=...=.-.-...-.......=.=...=.=.=...-.=.-...-.-.-...-");

			//System.out.println("DEBUG : " + line.getVal());

		}

	}

	public static String convertToMorse(char car , char carPlus1) {

		String result = "";

		String allMorse[] = {

				"-.=", "=s.---", "=.-.=.-", "=.--", "-",

				"--.=.-", "==.-", "----", "--", "-.===",

				"=.-.=", "-.=.--", "==", "=.-", "===",

				"-.==.-", "==.-.=", "-.=.-", "---", "=",

				"--.=", "---.=", "-.==", "=.--.=", "=.-.==",

				"==.--", "=====", "-.====", "--.===", "---.==",

				"----.=", "-----", "=.----", "==.---", "===.--", "====.-"};

		char allAlphabet[] = {

				'a', 'b', 'c', 'd', 'e',

				'f', 'g', 'h', 'i', 'j',

				'k', 'l', 'm', 'n', 'o',

				'p', 'q', 'r', 's', 't',

				'u', 'v', 'w', 'x', 'y',

				'z', '0', '1', '2', '3', '4',

				'5', '6', '7', '8', '9'};

		for(int i=0; i < allAlphabet.length;i++) {

			if(allAlphabet[i] == car) {

				result = "";

				if(carPlus1 == ' ') {

					result += ".......";

				} else {

					result += "...";

				}

				return allMorse[i];

			}

		}

		return "";

	}

}