package ninth_Chpter;

class test {

    // sequence of arguments
    public void display(String name, int marks) {
        System.out.println("My name is : " + name);
        System.out.println("I got : " + marks + " in java");
    }

    public void display(int marks, String name) {
        System.out.println("I got : " + marks + " in java");
        System.out.println("My name is : " + name);
    }

}

public class methodoverloading {
    public static void main(String[] args) {
        // test tt = new test();
        // tt.display("AYAZ", 86);
        access_modifiers am = new access_modifiers();
        am.show();
    }
}