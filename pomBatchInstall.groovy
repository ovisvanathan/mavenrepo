package com.bomatic.maven.ivytree.sax

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.util.HashMap
import java.util.Map

import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class pomBatchInstall {

	private static Logger LOGGER = LoggerFactory.getLogger(pomBatchInstall.class)

	private static Map<String, String> dupsMap = new HashMap<String, String>()
	
	public static void main(String[] args) {

            StringBuffer sbuf = new StringBuffer()
	
    try {

        def line
        String filePath = "c:\\dl2\\jarrun\\"
        Map pomNoJars = new HashMap(); 
            File gfile = new File(filePath, "jarswithoutpom.txt")
            gfile.withReader { reader ->
                while ((line = reader.readLine())!=null) {
                    File tmpFile = new File(line)
            
                    String tmpFileName = tmpFile.getName()
                        pomNoJars.put(tmpFileName, tmpFileName)
                }
            }                
                    
   		  
            	LOGGER.debug("POMNOJARS =  ");          
            	LOGGER.debug("" + pomNoJars);          
          
          
          File file = new File(filePath, "pom2gwt-clean.csv")
		  
		  int lineNo = 1
          File jarFile = null
          String jarPath = "C:\\projects\\gwtapp-dec2017\\gwtapplication\\target\\gwtapp-1.0.0-SNAPSHOT\\WEB-INF\\lib\\"
     	  BufferedReader reader = new BufferedReader(new FileReader(file))
		  
     	  String [] gavdeps = new String[3]
     	  while ((line = reader.readLine())!=null) {
			    
     		  line = line.trim()
     		  
     		  if(line.length() <= 0)
     			  continue
     		  
     		  gavdeps = line.split(",")
	          if(gavdeps == null)
	        		continue

                String [] gdeps = new String[3]
                gdeps[0] = gavdeps[0].trim()
                gdeps[1] = gavdeps[1].trim()
                gdeps[2] = gavdeps[2].trim()
                    
	          if(gdeps.length == 3)
	        	LOGGER.debug("Got Gav " + gdeps[0] + ", " +   gdeps[1] + ", " + 
            			((gdeps[2] == null)? "NULL" : gdeps[2]))
	          else   
		          if(gdeps.length == 2) {
			        	LOGGER.debug("Got Gav without version " + gdeps[0] + ", " +   gdeps[1] )
			        	continue
		          }
		        
	          		String gavString = gdeps[0] + ";" + gdeps[1] + ";" + gdeps[2]; 
	          		
	          		if(dupsMap.containsKey(gavString)) {
	          		  	LOGGER.debug("Duplicate key found. continuing.. ")
	          		  	continue;	          			
	          		}
	          		
	          		dupsMap.put(gavString, gavString)
	          		
	          		String jarFileName = gdeps[1] + "-" + gdeps[2] + ".jar"

                    
                    if(!pomNoJars.containsKey(jarFileName)) {
                      	LOGGER.debug("Jar not found in POM no jars. continuing.. ")
	          		  	continue;	          			
	          		}
                    
                    jarFile = new File(jarPath + jarFileName)
	          		
	   	        	LOGGER.debug("jarFileName = " + jarFile.getAbsolutePath()); 

	  	        	LOGGER.debug("jarFileName exists() = " + jarFile.exists()); 
		  
	   	        	if(jarFile.exists()) {
	   	        		
		   	             String CMD = 
		   	            		 "c:/apache-maven-3.5.4/bin/mvn.cmd install:install-file -DgroupId=" + gdeps[0] + " -DartifactId=" + gdeps[1] + " -Dversion=" + gdeps[2] + " -Dfile=" + jarFile.getAbsolutePath() + " -Dpackaging=jar -DgeneratePom=true  -DlocalRepositoryPath=c:/dl2/mavenrepo  -DcreateChecksum=true"

                            System.out.println("CMD =  " + CMD)
	   	            
	                    try {
	                    		lineNo++
	                    		LOGGER.debug("Running CMD = " + CMD); 
          	
                                
                                try {
                                    Process process = CMD.execute().text
                           
                                    def out = new StringBuffer()
                                    def err = new StringBuffer()
                                    process.consumeProcessOutput( out, err )
                                    process.waitFor()
                                    if( out.size() > 0 ) println out
                                    if( err.size() > 0 ) println err

                                } catch(Exception e) {
                                
                                }
                                
	                    
	                    } catch(Exception e) {
	                    	e.printStackTrace()
	                    }
					
	   	        		
	   	        	} else {
	   	        		
	   	        	  	LOGGER.debug("Got Gav but no jar file " + gavdeps[0] + ", " +   gavdeps[1] )
	  			      	continue
	   	        	}
	   	        	
	   	        	
	       	}				            			            
	       
 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}
		  
		           
    }


}
