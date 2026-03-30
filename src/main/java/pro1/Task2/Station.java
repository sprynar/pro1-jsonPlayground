package pro1.Task2;

public class Station {
    private int id;
    private String geo;
    private String name;
    private String ref;

    public Station() {}

    public Station(int id, String geo, String name, String ref) {
        this.id = id;
        this.geo = geo;
        this.name = name;
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}