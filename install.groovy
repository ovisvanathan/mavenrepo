

import org.apache.commons.vfs2.FileSystemManager
import org.apache.commons.vfs2.VFS
import org.apache.commons.vfs2.FileObject
import org.apache.commons.vfs2.FilesCache

class installer {

    static String vgroupId
    static String vartifactId
    static String vversion

    static boolean pomfound = false
    
    static FileObject file
    
   static void main(String[] args) {

        println(" List of jars without maven POM inside :");

        File gwtjars = new File("C:/projects/gwtapp-dec2017/gwtapplication/target/gwtapp-1.0.0-SNAPSHOT/WEB-INF/lib")
        gwtjars.eachFile() { file ->

                installer.pomfound = false
          //      println file.absolutePath       
            
                installer.getPOM file          

        
      }
      
      
   }
   
   
   static void getPOM(File fobj) {
         
         FileSystemManager fsManager = VFS.getManager();

         
         FileObject jarFileObj = fsManager.toFileObject(fobj)
                  
    //     FileObject jfobj = fileSystemManager.resolveFile(fobj.toURI().toURL())
         FileObject rootObj  = fsManager.createVirtualFileSystem(jarFileObj)
         FileObject jarFileObj2 = rootObj.getFileSystem().resolveFile(fobj.absolutePath)
         
         if(fobj.name.endsWith(".jar")) {
                  
            jarFileObj.each() { jfile ->
                 
        //         println " jfile " + jfile.name.baseName
                 
                  if(jfile.name.baseName.endsWith("pom.properties")) {
         
                       Properties props = new Properties()
                       props.load(jfile.getURL().openStream());
         
                       installer.vgroupId = props.getProperty("groupId"); 
                       installer.vartifactId = props.getProperty("artifactId"); 
                       installer.vversion = props.getProperty("version"); 
                        
        //               println "groupid = " + vgroupId + " , artifactId = " + vartifactId + " , version = " + vversion;
         
                        String CMD = "c:/apache-maven-3.5.4/bin/mvn.cmd install:install-file -DgroupId=" + installer.vgroupId + " -DartifactId=" + installer.vartifactId + " -Dversion=" + installer.vversion + " -Dfile=" + fobj.name + " -Dpackaging=jar -DgeneratePom=true  -DlocalRepositoryPath=c:/dl2/mavenrepo  -DcreateChecksum=true"
         
                    /*
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
                    */
                    
                        installer.pomfound = true            
                        
            //            println CMD
         
                       return
                        
                  }
            }
            
        }
        
        if(!installer.pomfound){
        
            println fobj.absolutePath
        
        }
        
        final FilesCache cache = fsManager.getFilesCache();
        cache.clear(jarFileObj.getFileSystem());

   }
   
}