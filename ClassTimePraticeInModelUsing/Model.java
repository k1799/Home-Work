
package ClassTimePraticeInModelUsing;


public class Model {
   private int id;
   private String name;
   private int age;
   private long phonenumber;

    public Model() {
    }

    public Model(int id, String name, int age,long phonenumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }
   
   
   
}
