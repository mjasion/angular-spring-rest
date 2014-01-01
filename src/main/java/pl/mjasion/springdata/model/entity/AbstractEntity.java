package pl.mjasion.springdata.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

/**
 * @author Marcin Jasion <marcin.jasion@gmail.com>
 */
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "generator", initialValue = 1)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{id=" + id + '}';
    }
}
