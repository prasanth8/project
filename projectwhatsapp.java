import java.io.*;
public class project {
public static void main(String[] args)throws Exception {
	File f1=new File("D:/Source");
	String[] n=f1.list();
	for(int i=0;i<n.length;i++){
		File f2=new File("D:/Source/"+n[i]);
		System.out.println(n[i]);
		FileInputStream nf=new FileInputStream(f2);
		byte[] b=new byte[(int)n[i].length()];
		nf.read(b);
		File f3=new File("D:/Destination/"+n[i]);
		FileOutputStream nf2=new FileOutputStream(f3);
		nf2.write(b);
		nf2.flush();
		nf2.close();
	}
}
}
