package db;

import javax.persistence.*;

/**
 * Created by Vitalii on 10.05.2017.
 */

@Entity
@Table
public class ColumnName {

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private Integer tableId;

    @Column
    private String column;

    @Column
    private String value;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
