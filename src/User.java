import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/*
 * 
 * @author  Cameron Reyes
 */
public class User{
    private UUID id;
    private String name;
    private String role;
    private String team;
    private String username;
    private String password;
    private String phone;
    private String email;
    private boolean adminPerms;
    private double points;
    private ArrayList<Project> currentProjects;
    private ArrayList<Project> invitedProjects;

    public User(UUID id, String name, String role, boolean adminPerms, String team,
    String username, String password, String phone, double points, String email, ArrayList<Project> currentProjects, ArrayList<Project> invitedProjects){
        this.id = id;
        this.name = name;
        this.role = role;
        this.adminPerms = adminPerms;
        this.team = team;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.points = points;
        this.email = email;
        this.currentProjects = currentProjects;
        this.invitedProjects = invitedProjects;
    }

    public User(String name, String username, String password, String phone, String email){
        this.id = UUID.randomUUID();
        this.name = name;
        this.role = "";
        this.adminPerms = false;
        this.team = "";
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.points = 0;
        this.email = email;
        this.currentProjects = new ArrayList<UUID>();
        this.invitedProjects = new ArrayList<UUID>();
    }
    


    public User login(String username, String passsword){
        if (this.username.equals(username) && this.password.equals(passsword)) return this;
        return null;
    }

    public ArrayList<UUID> getCurrentProjects(){
        return this.currentProjects;
    }
    
    public ArrayList<UUID> getInvitedProjects(){
        return this.invitedProjects;
    }

    public boolean changePassword(String username, String password){
        if(this.username.equals(username) ){
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean addInvite(UUID newUUID){
        try{
            currentProjects.add(newUUID);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args){
        for ( int i = 0; i  < 10;i++){
            System.out.println(UUID.randomUUID());
        }
        for ( int i = 0; i  < 10;i++){
            System.out.println(new Date());
        }
        
    }

}
