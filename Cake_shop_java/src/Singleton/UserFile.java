
package Singleton;

import java.io.File;

public class UserFile {
    private static UserFile instance = null;
    private static File usersFile;
    private String Intro = "------------- Hello -------------\n\n         ... Welcome ...        \n\n  you are connected to Users File\n";

    private UserFile(File file){
        
    } 
    public static UserFile getInstance(){
        if(instance==null){
            usersFile = new File("Users.txt");
            instance = new UserFile(usersFile);
            System.out.println("Successfully creating New Global instance");
        }
        else
            System.out.println("Global instance is already exist");
        return instance;
    }
    public String getIntro() {
        return Intro;
    }
    public void setIntro(String Intro) {
        this.Intro = this.Intro+"\n"+Intro;
    }
    public File getUsersFile(){
        return usersFile;
    }
}
