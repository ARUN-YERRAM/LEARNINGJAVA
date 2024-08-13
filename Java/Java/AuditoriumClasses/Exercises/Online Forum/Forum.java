import java.util.ArrayList;
import java.util.List;

public class Forum {
    private String name;
    private List<Thread> threads;

    public Forum(String name) {
        this.name = name;
        this.threads = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void createThread(String title, User creator) {
        Thread newThread = new Thread(title, creator);
        threads.add(newThread);
        System.out.println("New thread created: " + title);
    }

    public List<Thread> getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Forum: " + name + ", Threads: " + threads.size();
    }
}
