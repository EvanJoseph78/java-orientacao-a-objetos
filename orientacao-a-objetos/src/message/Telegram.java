package message;

public class Telegram {

    public void enviarmensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegram");
        salvarHistoricoMensagem();
    }

    public void recebermensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado na internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico da mensagem pelo telegram");
    }

}
