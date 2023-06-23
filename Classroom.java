import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a classroom.
 */
public class Classroom {
    private String roomNumber;
    private int capacity;
    private List<String> availableEquipment;

    /**
     * Constructs a classroom with the specified room number and capacity.
     *
     * @param roomNumber the room number of the classroom
     * @param capacity   the capacity of the classroom
     */
    public Classroom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        availableEquipment = new ArrayList<>(); 
    }

    /**
     * Returns the room number of the classroom.
     *
     * @return the room number
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Returns the room number of the classroom.
     *
     * @return the room number
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns the list of available equipment in the classroom.
     *
     * @return the list of available equipment
     */
    public List<String> getAvailableEquipment() {
        return availableEquipment;
    }

    /**
     * Checks if the classroom can accommodate the given course based on the number of students enrolled.
     *
     * @param course the course to check
     * @return true if the classroom can accommodate the course, false otherwise
     */
    public boolean isCheckClassroom(Course course) {
       return course.getStudents().size() <= capacity;
    }
}