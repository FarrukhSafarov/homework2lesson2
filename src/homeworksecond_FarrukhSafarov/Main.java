package homeworksecond_FarrukhSafarov;

public class Main {

    public static void main(String[] args) {
        //TASK1
        System.out.println("Task1");
        int []arr1 = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i <arr1.length ; i++){
            if (arr1[i]==1)
                arr1[i]=0;
            else
                arr1[i]=1;
            System.out.println(arr1[i]+ " ");
        }

        //TASK2
        System.out.println("Task2");
        int [] arr2 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr2[i] = i*3;
            System.out.println(arr2[i] + " ");}


        //TASK3
        System.out.println("Task3");
        int []arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i <arr3.length ; i++) {
            if (arr3[i]<6)
                arr3[i] *= 2;
            System.out.println(arr3[i]+ " ");
        }

        //TASK4
        System.out.println("Task4");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
