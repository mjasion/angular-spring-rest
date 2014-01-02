package pl.mjasion.springdata.model;

import org.joda.time.DateTime;
import pl.mjasion.springdata.model.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
@Entity
public class Post extends AbstractEntity {

    private String title;

    @Column(columnDefinition = "text")
    private String text;

    private DateTime dateAdded = DateTime.now();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
