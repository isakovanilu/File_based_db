package Entities;

public class Academy {
    private int id;
    private String description;

    public Academy(int id, String description){
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return description;
    }
    public void setDescription(String description) {
        this.description=description;
    }
}
