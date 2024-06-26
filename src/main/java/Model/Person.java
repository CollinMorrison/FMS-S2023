package Model;

import java.util.Objects;

/**
 * Template for person entities as they appear in the database
 */
public class Person {
    /**
     * Unique identifier for this person
     */
    private String personID;
    /**
     * Username of user to which this person belongs
     */
    private String associatedUsername;
    /**
     * Person's first name
     */
    private String firstName;
    /**
     * Person's last name
     */
    private String lastName;
    /**
     * Person's gender
     */
    private String gender;
    /**
     * Person ID of person's father
     */
    private String fatherID;
    /**
     * Person ID of person's mother
     */
    private String motherID;
    /**
     * Person ID of person's spouse
     */
    private String spouseID;

    /**
     * Constructor, creates a new Person entity with the provided attributes
     * @param personID
     * @param associatedUsername
     * @param firstName
     * @param lastName
     * @param gender
     * @param fatherID
     * @param motherID
     * @param spouseID
     */
    public Person(String personID, String associatedUsername, String firstName, String lastName, String fatherID, String motherID, String spouseID, String gender) {
        this.personID = personID;
        this.associatedUsername = associatedUsername;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.fatherID = fatherID;
        this.motherID = motherID;
        this.spouseID = spouseID;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getAssociatedUsername() {
        return associatedUsername;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherID() {
        return fatherID;
    }


    public String getMotherID() {
        return motherID;
    }


    public String getSpouseID() {
        return spouseID;
    }

    public void setSpouseID(String spouseID) {
        this.spouseID = spouseID;
    }

    /**
     * overrides the equals method for an object in Java
     * @param o
     * @return bool
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personID, person.personID) && Objects.equals(associatedUsername, person.associatedUsername) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(fatherID, person.fatherID) && Objects.equals(motherID, person.motherID) && Objects.equals(spouseID, person.spouseID) && Objects.equals(gender, person.gender);
    }
}
