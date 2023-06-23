/**
 * A class representing a person with basic information.
 */
public abstract class Person {
    private String name;
    private String address;
    private String email;

    /**
     * Constructs a person with the specified name, address, and email.
     *
     * @param name    the name of the person
     * @param address the address of the person
     * @param email   the email of the person
     */
    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    
    /**
     * Returns the name of the person.
     *
     * @return the name
     */
    public String getName() {
        return name;
    } 


    /**
     * Returns the address of the person.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Returns the email of the person.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }
}