import java.util.Random;

public class home_4 {

    public static void main(String[] arqs) {
        int add = 1;
        for (int i = 0; i < 55; i++) {
            System.out.println(add);
            add += 2;
        }


      System.out.println();

        int sub = 90;
        while (sub > 0) {
            System.out.println(sub);
            sub -= 5;
        }

      System.out.println();

        int even = 15;
        if ((even%2) == 0){
            System.out.println("дане число "+even+" є парне.");
        }else {
            System.out.println("дане число "+even+" є не парне.");
        }

      System.out.println();

        double one = 8.5, two = 11.45;
        double sub_one, sub_two;
        if (one<10){
            sub_one = 10 - one;
        }else{
            sub_one = one - 10;
        }
        if (two<10){
            sub_two = 10 - two;
        }else{
            sub_two = two - 10;
        }

        if (sub_one > sub_two){
            System.out.println("число " +two+" ближче до 10.");
        } else{
            System.out.println("число " +one+" ближче до 10.");
        }

      System.out.println();

        Random rnd = new Random();
        int[] array = new int [20];
        for(int i=0; i<array.length; i++){
            array[i] = rnd.nextInt(100)+1;
        }
        System.out.print("array = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"; ");
        }
      System.out.println();
        int max=array[0], min=array[0];
        for (int j=1; j<array.length;j++){
            if (array[j]>max) {
                max = array[j];
            }
        }
        System.out.println("максимальне значення "+ max);
        for (int j=1; j<array.length;j++){
            if (array[j]<min){
                min = array[j];
            }
        }
        System.out.println("мінімальне значення "+ min);


    }

}
