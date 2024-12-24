public class SetGetMethod {

    private String name;

    // Accessor method 
    public String getName() {
        return name;
    }

    // Mutator method 
    public void setName(String newName) {
        name = newName;
    }


    public static void main(String[] args) {
        
        SetGetMethod ob = new SetGetMethod();

       
        ob.setName("Raz Subedi");

        System.out.println("Student's name: " + ob.getName());
    }
}