import java.io.*;
public class ReadLineByLineEX {
        public static void main(String[] args)
        {
         try
         {
             File file=new File("Demo.txt");
             FileReader fr=new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             StringBuffer sb = new StringBuffer();
             String line;
             while((line = br.readLine())!= null)
             {
                 sb.append(line);
                 sb.append("\n");
             }
             fr.close();
             System.out.println("Contents of file:");
             System.out.println(sb.toString());
         }
         catch(IOException e)
         {
             e.printStackTrace();

         }

        }
}
