import java.io.FileInputStream;  
class ReadSingleChar 
 {  
     public static void main(String args[])
     {    
          try
          {    
          	FileInputStream fin=new FileInputStream("test.txt");    
            	int i=fin.read();  
            	System.out.print((char)i);    
                fin.close();    
          }
	  catch(Exception e)
          {
		System.out.println(e);
	  }    
      }    
}