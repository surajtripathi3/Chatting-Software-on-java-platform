
import java.io.*;
import java.net.*;
import javax.swing.*;

class My implements Runnable
{

DataInputStream din;
JTextArea ja;
My(DataInputStream din,JTextArea ja)
{

this.din=din;
this.ja=ja;

}

public void run()
{

String s2="";
while(true)
{
try
{
s2=din.readUTF();
if(!s2.equals(""))
{

ja.append(s2+"\n");
s2="";


}



}catch(Exception e)
{System.out.println(e);}




}



}



}
