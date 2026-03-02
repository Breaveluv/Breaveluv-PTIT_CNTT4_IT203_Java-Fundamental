package SS15.bai4;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    private String id;
    private String name;
    private int priority; 

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(EmergencyPatient other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        String type = (priority == 1) ? "Cấp cứu" : "Thông thường";
        return "[" + id + "] " + name + " (" + type + ")";
    }
}