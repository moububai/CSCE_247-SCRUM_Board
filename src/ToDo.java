
public class ToDo {
    private boolean done;
    private String description;
    
    public ToDo(boolean done, String description){
        this.done = done;
        this.description = description;

    }

    public boolean getDone(){
        return this.done;
    }

    public String getDescription(){
        return this.description;
    }
}