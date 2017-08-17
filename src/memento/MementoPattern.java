package memento;

public class MementoPattern {
    private long id;
    private String name;
    private String theURL;

    private String description;
    private int category;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Memento undo;

    private class Memento {
        String siteDescription;
        int siteCategory;

        Memento() {
            this.siteDescription = description;
            this.siteCategory = category;
        }

        public String getSiteDescription() {
            return siteDescription;
        }

        public int getSiteCategory() {
            return siteCategory;
        }
    }

    public void preview() {
        this.undo = new Memento();
    }

    public void undoChanges() {
        this.description = this.undo.getSiteDescription();
        this.category = this.undo.getSiteCategory();
    }


    public static void main (String [] args){
        MementoPattern mem = new MementoPattern();
        mem.setDescription("First step");
        mem.setCategory(1);
        mem.preview();
        mem.setCategory(2);
        mem.setDescription("Second step");
        System.out.println(mem.getDescription());
        System.out.println(mem.getCategory());

        mem.undoChanges();
        System.out.println(mem.getDescription());
        System.out.println(mem.getCategory());
    }
}