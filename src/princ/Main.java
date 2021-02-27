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
		 String out;
	        double average = 0;
	        double changesInif = 0;
	        double changesInfor = 0;
	        if(lineAL != null) {
	            for(int i = 1; i < lineAL.length;i++) {
	                changesInfor++;
	                for(int j = 0; j < lineAL.length - i;j++) {
	                    
	                    if(lineAL[j]>lineAL[j+1]) {
	                    double temp = lineAL[j];
	                    lineAL[j] = lineAL[j+1];
	                    lineAL[j+1] =temp;
	                    changesInif++ ;
	                    }
	                    
	                }
	            }
	            average = changesInif / changesInfor;
	            average = Math.round(average*100.0)/100.0;
	            
	        }
	        out = average+"-";
	        for(int i = 0; i < lineAL.length; i++) {
	            out += lineAL[i]+" ";
	        }
		
		
	
		return null;
	}
	private static double[] parsInt(double[] lineAL, int line, String[] outnumbers) {
		
	}
	


}
