package message;

public class MSNmessager {
    public void enviarmensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void recebermensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado na internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico da mensagem");
    }
}
