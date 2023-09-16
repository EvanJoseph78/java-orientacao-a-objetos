package message;

public class Computador {
    public static void main(String[] args) {
        // abrindo MSN Mensseger
        MSNmessager msn = new MSNmessager();
        msn.enviarmensagem();
        msn.recebermensagem();
        FacebookMessager fcb = new FacebookMessager();
        fcb.enviarmensagem();
        fcb.recebermensagem();
        Telegram t = new Telegram();
        t.enviarmensagem();
        t.recebermensagem();
    }
}
