package POO;

public class msnmessenger {
    public static void main(String[] args) {

    }

    public void enviarMensagem() {
        validarconexao();
        System.out.println("ola");

    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida");

    }

    private void salvarMensagem() {

        System.out.println("Salvando Mensagem");
    }

    private void salvarHistorico() {

        System.out.println("Salvando Historico");
    }

    private boolean conectarInternet() {

        return false;
    }

    private void validarconexao() {
        if (conectarInternet()) {
            System.out.println("Conectado");
        } else {
            System.out.println("Sem internet");
        }

    }
}

     class ComputadorPedrinho {
        public static void main(String[] args) {
            msnmessenger MsnMessenger = new msnmessenger();

            // MsnMessenger.conectarInternet();
            MsnMessenger.enviarMensagem();
            MsnMessenger.receberMensagem();
            // MsnMessenger.salvarMensagem();
            // MsnMessenger.salvarHistorico();
        }
    }

