package application;

public class Program {
    public static void main(String[] args) {

        String[] array = new String[] {"Maria","Bob","Alex"};

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("-------------------------------------------");

        for(String obj : array){
            System.out.println(obj);
        }
    }
}
