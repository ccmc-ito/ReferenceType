public class Main {

    public static void main(String[] args) {
        String obj1 = "Apple";
        String obj2 = "Orange";
        String obj3 = "Grape";

        String answer = "Orange";

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);

        System.out.println("----------");
        System.out.println("answer: " + answer);
        if(obj2 == answer) {
            System.out.println("obj2とanswerは同じ参照情報です。");
        }
    }

}