public class Main {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Object answer = null;

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);

        System.out.println("----------");
        System.out.println("answer: " + answer);
        if(obj2 == answer) {
            System.out.println("obj2とanswerは同じ参照値です。");
        }
    }

}