public class arraysumexample {
    public static void main(String[] args){
        int [] valores = {10,20,30,40};
        int soma = 0;

        for(int v: valores){
            soma +=v;
        }
        System.out.println(soma);
    }
}
