package Socket;

import jdk.jshell.ImportSnippet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteThread extends Thread{
//Declaração da classe ClienteThread que estende a classe Thread.
// Isso significa que a classe ClienteThread é uma thread e pode ser executada concorrentemente.

    private Socket socket;

    public ClienteThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        //mplementação do método run() da interface Runnable (herdada da classe Thread).
        // Este método é chamado quando a thread é iniciada.
        // Ele contém a lógica principal da execução da thread.
        InputStreamReader inputStreamReader = null;
        //Declaração de uma variável inputStreamReader do tipo InputStreamReader e a inicializa como null.
        // Este objeto é usado para ler caracteres do InputStream do socket.
        try {
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            //Cria um objeto InputStreamReader associado ao InputStream do socket.
            // Isso permite a leitura de caracteres recebidos do servidor.
            BufferedReader reader = new BufferedReader(inputStreamReader);
            //Cria um objeto BufferedReader para facilitar a leitura de linhas inteiras a partir do InputStreamReader
            String x;
            while ((x = reader.readLine()) != null)    {
                System.out.println("Cliente: " +  x);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //Imprime o rastreamento da pilha da exceção no console.
            // Isso pode ajudar na depuração, identificando a origem e a natureza da exceção.
        }

    }
}
