import java.util.*;

/*
 * @author  Cameron Reyes
 */

public class Update {
    private Date timeStamp;
    private UUID userUUID;
    private UUID changedID;
    private String changeLog;

    public Update(UUID userUUID, UUID changedID, String changeLog){
        this.timeStamp = new Date();
        this.userUUID = userUUID;
        this.changedID = changedID;
        this.changeLog = changeLog;
    }

    public Date getDate(){
        return timeStamp;
    }

    public UUID getUserUUID(){
        return userUUID;
    }

    public UUID getChangedID(){
        return changedID;
    }

    public String getChangedLog(){
        return changeLog;
    }

    public String toString(){
        return "TIME: [" + timeStamp.toString() + "]  USER: [" + userUUID.toString() + "] Change: " + changeLog + 
        "|    CHANGEDID: [" + changedID.toString() + "]";
    }
}
