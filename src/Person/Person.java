package Person;

import java.util.Date;
import java.text.SimpleDateFormat;
public abstract class Person implements IPerson {

    private String id;
    private String name;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id :" + getId()
                + "Name :" + getName()
                + "Date of Birth :" + sdf.format(dateOfBirth));

    }
}