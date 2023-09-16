package message;

public class FacebookMessager {

    public void enviarmensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook messager");
        salvarHistoricoMensagem();
    }

    public void recebermensagem() {
        System.out.println("Recebendo mensagem pelo facebook messager");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado na internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico da mensagem pelo facebook messager");
    }
}
