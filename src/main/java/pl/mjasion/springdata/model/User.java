package pl.mjasion.springdata.model;

import pl.mjasion.springdata.model.entity.AbstractEntity;

import javax.persistence.Entity;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
@Entity
public class User extends AbstractEntity {
    private String firstName;
    private String lastName;

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
}
