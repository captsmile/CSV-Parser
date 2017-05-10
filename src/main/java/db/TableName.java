package db;


import javax.persistence.*;

/**
 * Created by Vitalii on 10.05.2017.
 */

@Entity
@Table
public class TableName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
