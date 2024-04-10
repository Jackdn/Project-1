import java.util.Iterator;

public class Task implements Comparable<Task>, Iterable<Task>{
    private String name;
    private String description;
    private String priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        if(this.priority.equals(other.priority)){
            return this.name.compareTo(other.name);
        }else{
            return this.priority.compareTo(other.priority);
        }
    }

    @Override
    public Iterator<Task> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
