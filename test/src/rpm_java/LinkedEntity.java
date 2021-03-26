package rpm_java;

public class LinkedEntity {
    private static int id_counter =0;
    private final int id =++id_counter;
    private LinkedEntity child;

    public LinkedEntity(LinkedEntity child) {
        this.child = child;
    }
    public void add(LinkedEntity entity){
        if(child.getChild()==null) child.setChild(entity);
        else child.add(entity);
    }
    public boolean delete(int id){
        if(child.getId()==id){
            if (child.getChild()!=null) {
                child = child.getChild();
            }
            else child=null;
            return true;
        }
        else if (child==null) return false;
        else {
                child.delete(id);
        }
        return false;
    }
    public boolean contains(int id){
        if (child==null) return false;
        else if (child.getId()==id) return true;
        else return child.contains(id);
    }
    public int size(){
        int count = 1;
        if (child==null) return count;
        else {
            count=child.size();
            count++;
            return count;
        }

    }
    @Override
    public String toString() {
        return "LinkedEntity{" +
                "id=" + id +
                ", child=" + child +
                '}';
    }

    public static int getId_counter() {
        return id_counter;
    }

    public static void setId_counter(int id_counter) {
        LinkedEntity.id_counter = id_counter;
    }

    public int getId() {
        return id;
    }

    public LinkedEntity getChild() {
        return child;
    }

    public void setChild(LinkedEntity child) {
        this.child = child;
    }
}
