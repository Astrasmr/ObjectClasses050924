import java.util.Objects;

public class Author {
    private String name;
    private String lastName;


    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
    @Override
    public int hashCode () {
        return Objects.hash(name, lastName);
    }
    @Override
    public boolean equals (Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (this.getClass()!=obj.getClass()){
          return false;
        }
        Author tmp = (Author) obj;
        return this.name.equals(tmp.name) && this.lastName.equals(tmp.lastName);
    }
}

