import area.atendimento.Atendente;
import area.atendimento.cozinha.Almoxarife;
import area.atendimento.cozinha.Cozinheiro;
import area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        ;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente o seu pacote cozinha precisa conhecer (default)

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}