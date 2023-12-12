
public class Fibonacci {
    public static void main(String []args){

int n=8,firstnum=0,seccondnum=1;
int nextnum;


for (int i=1;i<=n;i++){
    System.out.println(firstnum+" ");
    nextnum=firstnum+seccondnum;
    firstnum=seccondnum;
    seccondnum=nextnum;


}

    }







}