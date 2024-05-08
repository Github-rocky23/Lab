import java.io.IOException;  
import java.io.RandomAccessFile;  
class RandomAccessFileExample 
{
    static final String FILEPATH = "test.txt";

    public static void main(String args[]) 
    {
        try 
        {
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
            writeToFile(FILEPATH, "Sri Vasavi Engineering College", 31);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    static byte[] readFromFile(String filePath, int position, int size) throws IOException 
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    static void writeToFile(String filePath, String data, int position) throws IOException 
    {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
