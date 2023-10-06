
package entities;

import java.time.LocalDate;


public class ObjRegistro {
    private int id;
    private int costCenter;
    private int value;
    private int typeCost;
    private LocalDate date;
    private String description;

    public ObjRegistro(int id, int costCenter, int value, int typeCost, LocalDate date, String description) {
        this.id = id;
        this.costCenter = costCenter;
        this.value = value;
        this.typeCost = typeCost;
        this.date = date;
        this.description = description;
    }

    public ObjRegistro() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(int costCenter) {
        this.costCenter = costCenter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTypeCost() {
        return typeCost;
    }

    public void setTypeCost(int typeCost) {
        this.typeCost = typeCost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     
}
