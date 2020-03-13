package htmldivider;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;


public class divider {
	
	public divider() {
		
	}
	
	
//	public String[] getID(String file) {
//	
//		String whereToGetID ="<DOC>";
//		String[] websiteID=new String[500];
//		int websiteIDCount=0;
//		 
//		 
//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			String line;
			
			
//		while ((line = br.readLine()) != null) {
//				if(line.equals(whereToGetID)==true) {
//					line =br.readLine();
//					websiteID[websiteIDCount]=line.substring(7);
//					websiteIDCount++;
//				}
//			}
//		}catch (IOException e) {
 //       	
  //      }
	
//	return websiteID;
	
//	}
	
	
	
	
	
	
	
	
	
	
	public void devide(String file) {
	        
	        
	      	//set devide point

	        String whereToDevide = "<html>";
	        String whereToDevide2 = "<HTML>";
	        String whereToEnd="</html>";
	        String whereToEnd2="</HTML>";
	        String websiteName = "website";
	        int IDcount=1;
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	            String line;
	            String content;
	            while ((line = br.readLine()) != null) {
	            	
	            	if(line.length()>5){
	            		if (line.substring(0, 6).equals(whereToDevide)==true || line.substring(0, 6).equals(whereToDevide2)==true) {
	            		
	            		//String fileName = IDs[IDcount];
	            			System.out.println(line);
	            			BufferedWriter writer = new BufferedWriter(new FileWriter("WT01-B20-"+IDcount+".html",true));
	            			writer.append("<html>");
	            			content= br.readLine();
	            			while (content != null && (content.contains(whereToEnd)!=true ||content.contains(whereToEnd2)!=true)) {
	            				writer.append(content);
	            				content= br.readLine();
	            				
	            			}
	            			writer.append("</html>");
	            			writer.close();
	            			IDcount++;
	            		}
	            	}
	            }
	        }catch (IOException e) {
	        	
	        }
	        
	}
}
