public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome());
        }

        EstadoBrasileiro e1 = EstadoBrasileiro.PARA;
        System.out.println(e1.getNome());
    }
}
