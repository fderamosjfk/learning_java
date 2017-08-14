class StudentsGroup {
    private String name;
    private int number;    
    
    public StudentsGroup() {
        this("TBA", 0);
    }
    
    public StudentsGroup(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    public String getStudentsGroupName() {
        return name;
    }

    public void setStudentsGroupName(String name) {
        this.name = name;
    }
    
    public int getStudentsGroupNumber() {
        return number;
    }

    public void setStudentsGroupNumber(int number) {
        this.number = number;
    }    
}

public class StudentsGroupConstructorDemo {
    public static void main(String[] args) {
        StudentsGroup sg1 = new StudentsGroup();
        System.out.println("sg1: name = " + sg1.getStudentsGroupName() +
                           ", number = " + sg1.getStudentsGroupNumber());
                           
        StudentsGroup sg2 = new StudentsGroup("The Athletes", 30);
        System.out.println("sg2: name = " + sg2.getStudentsGroupName() +
                           ", number = " + sg2.getStudentsGroupNumber()); 
                           
        sg1.setStudentsGroupName("The Musicians");
        sg1.setStudentsGroupNumber(23);
        System.out.println("\nUpdated sg1: name = " + sg1.getStudentsGroupName() +
                           ", number = " + sg1.getStudentsGroupNumber());        
        
    }
}
