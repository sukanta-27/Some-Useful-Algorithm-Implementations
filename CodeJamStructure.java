import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CodeJamStructure{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = in.nextInt();
		int ij = 1;
		for(int a0=0;a0<N;a0++){

			out.write("Case #"+(ij)+": "+output+"\n");
			ij++;
		}
		out.flush();
	}
	
}