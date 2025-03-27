import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class EmailDomainCounter {
	 
    public static void main(String[] args) throws Exception {
    
        Map<String, Integer> domainCounts = new HashMap<>();
        BufferedReader reader = null;
        
	       
       
        	reader = new BufferedReader(new FileReader("C:/Users/neomax/Desktop/New folder (2)/emails.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                
 
              int atIndex = line.indexOf('@');
                   
                        
               String domain = line.substring(atIndex + 1);
               if(domainCounts.containsKey(domain)) {
   				int occ = domainCounts.get(domain);
   				occ++;
   				domainCounts.put(domain, occ);
   			}else {
   				domainCounts.put(domain, 1);
   			}
                        
                        
                     
                        
                        
            
                   
               
            }
            reader.close();
        
        System.out.println(domainCounts);
        
        
    }
    
   
}