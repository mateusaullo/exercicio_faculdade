package POO;

//praticando herança

// praticando abstract

// msnmessenger é classe filha do mensageminstantanea
public class msnmessenger extends mensageminstantanea { // <- extends mensageminstantanea vai ser herança do
                                                        // mensageminstantanea
   
         public void enviarMensagem(){   //aqui se implementa o metodo da classe abstrata com a mensagem
            System.out.println("Mensagem enviada do msn");
         }
         
         public void receberMensagem() {
            System.out.println("Mensagem recebida do msn");
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

 abstract class  mensageminstantanea { // vai fazer todos os metodos de validação

     public abstract void enviarMensagem(); //"A classe abstrata define QUAIS métodos devem existir para mandar mensagem, mas não implementa nada. Ela só obriga as classes filhas a terem esses métodos. Cada classe filha decide COMO funciona."
        

   

    public abstract void receberMensagem();
        

    

    // private void salvarMensagem() {

    //     System.out.println("Salvando Mensagem");
    // }

    // private void salvarHistorico() {

    //     System.out.println("Salvando Historico");
    // }

    // private boolean conectarInternet() {

    //     return false;
    // }

    // private void validarconexao() {
    //     if (conectarInternet()) {
    //         System.out.println("Conectado");
    //     } else {
    //         System.out.println("Sem internet");
    //     }

    // }
}
