package pl.mjasion.springdata.model;

import org.joda.time.DateTime;
import pl.mjasion.springdata.model.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
@Entity
public class Post extends AbstractEntity {

    private String title;

    @Column(columnDefinition = "text")
    private String text;

    private DateTime dateAdded = DateTime.now();

    @ManyToOne
    private User author;

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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
