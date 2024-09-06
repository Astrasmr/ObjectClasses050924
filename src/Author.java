public class Author {
    private String name ;
    private String lastName;



    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
