package utf8;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ToUtf8 {

	 /**  
     * 如何将unicode编码字符串转换UTF-8编码    
     */  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入：");
		Scanner scanner=new Scanner(System.in);
		String s88591=scanner.next();
		if (s88591 == null) {  
           System.out.println("输入不能为空");
        } else {  
              
          try {
        	  byte[] b=s88591.getBytes("UTF-8");
        	  String words=new String(b, "UTF-8");
				//String words = new String(s88591.getBytes("UTF-8"), "UTF-8");
				System.out.println(words);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
           
        } 
		
		//scanner.close();
	}

}
