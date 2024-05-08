import java.io.FileOutputStream; 
class FileOpStreamWriteString
{  
    public static void main(String args[])
    {    
           try
	   {    
           	FileOutputStream fout=new FileOutputStream("test.txt");    
             	String s="Welcome";    
             	byte b[]=s.getBytes();//converting string into byte array    
             	fout.write(b);    
             	fout.close();    
             	System.out.println("success...");    
           }
           catch(Exception e)
	   {
		System.out.println(e);
	   }    
      }    
}  
