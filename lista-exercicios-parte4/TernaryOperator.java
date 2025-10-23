public class Example7 {
    public static void main(String[] args){
        int numero = 2;

        String dia = switch (numero) {
            case 1 -> "Domingo";
                case 2 -> {
                    System.out.println();
                    yield "Segunda";
                }
                default -> "Outro dia";
        };
        System.out.println(dia);
    }
}
