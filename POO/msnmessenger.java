package POO;

//praticando herança

public class msnmessenger extends mensageminstantanea { // <- extends mensageminstantanea vai ser herança do
                                                        // mensageminstantanea
    public static void main(String[] args) {

    }

}

class ComputadorPedrinho extends mensageminstantanea {
    public static void main(String[] args) {
        msnmessenger MsnMessenger = new msnmessenger();

        // MsnMessenger.conectarInternet();
        MsnMessenger.enviarMensagem();
        MsnMessenger.receberMensagem();
        // MsnMessenger.salvarMensagem();
        // MsnMessenger.salvarHistorico();
    }
}

class mensageminstantanea { // vai fazer todos os metodos de validação

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
