public class Main {

    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        }

        catch(ArrayIndexOutOfBoundsException e){

                System.out.println("dont try buffer overflow alttacks in java");
            }
        }

    }
