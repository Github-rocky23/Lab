import java.io.FileOutputStream;  
class FileOpStreamWriteByte 
{  
    public static void main(String args[])
    {    
           try
           {
				FileOutputStream fout=new FileOutputStream("test.txt");    
             	fout.write(65);    
             	fout.close();    
             	System.out.println("success...");    
           }
	   catch(Exception e)
	   {
		System.out.println(e);
	   }    
     }    
}  
