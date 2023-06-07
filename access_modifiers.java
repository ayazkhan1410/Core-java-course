package ninth_Chpter;

public class access_modifiers {

    void show() {
        System.out.println("Hi i am show method form class access modifier");
    }

    public static void main(String[] args) {
        access_modifiers am = new access_modifiers();
        am.show();

    }

}
