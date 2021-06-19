import java.util.*;
import java.io.*;
class LineItUp
{
public static void main(String gg[])
{
if(gg.length!=1)
{
System.out.println("Usage : java eg1 NAME_OF_FILE");
return;
}
try
{
String fileName=gg[0];
File file=new File(fileName);
if(!file.exists())
{
System.out.println("File not Exists.");
return;
}
File tmpFile=new File("tmp.data");
RandomAccessFile randomAccessFile,tmpRandomAccessFile;
randomAccessFile=new RandomAccessFile(file,"rw");
tmpRandomAccessFile=new RandomAccessFile(tmpFile,"rw");
while(randomAccessFile.getFilePointer()<randomAccessFile.length())
{
tmpRandomAccessFile.writeBytes(randomAccessFile.readLine());
}
tmpRandomAccessFile.close();
randomAccessFile.close();
System.out.println("Done, The Converted code is saved in tmp.data file");
}catch(IOException io)
{
System.out.println(io.getMessage());
}
}
}
