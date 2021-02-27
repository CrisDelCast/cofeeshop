package princ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public final static String separate = " "; 
	public static void main(String[] args ) throws IOException {
		String out = "";
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String txin = br.readLine();
		int line = Integer.parseInt(txin);
		String [] outnumbers = null;
		double[] lineAL = null;
		
		for (int i = 0;i <line;i++) {
			outnumbers = br.readLine().split(separate);
			lineAL = new double[outnumbers.length];
			lineAL = parsInt(lineAL,line,outnumbers);
			out += bubbleSort(lineAL)+"\n";
		}
		bw.write(out);	
		bw.close();
		br.close();	
	}
	private static String bubbleSort(double[] lineAL) {
		
		}
	
		return null;
	}
	private static double[] parsInt(double[] lineAL, int line, String[] outnumbers) {
		
	}
	


}
