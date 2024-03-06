package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4000);
        //Cria um objeto ServerSocket que fica escutando na porta 4000.
        // O ServerSocket é usado para aguardar conexões de clientes.
        Socket socket = serverSocket.accept();
        //Aguarda até que um cliente se conecte ao ServerSocket.
        // Quando um cliente se conecta, o método accept() retorna um objeto Socket representando a conexão com esse cliente.
        System.out.println("Cliente conectado!");

        InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
        //Cria um objeto InputStreamReader associado ao InputStream do socket.
        // Isso permite a leitura de caracteres enviados pelo cliente.
        PrintStream saida = new PrintStream(socket.getOutputStream());
        //Cria um objeto PrintStream associado ao OutputStream do socket. Isso permite enviar dados de volta ao cliente.
        BufferedReader reader = new BufferedReader(inputReader);
        //Cria um objeto BufferedReader para facilitar a leitura de linhas inteiras a partir do InputStreamReader.
        String x;
        while ((x = reader.readLine()) != null){
            //Um loop que continua enquanto houver linhas para ler do cliente. A cada iteração,
            // uma linha é lida do BufferedReader e atribuída à variável x.
            //O loop termina quando o final do stream é alcançado (quando readLine() retorna null),
            // indicando que o cliente encerrou a conexão.
            saida.println("Servidor: " + x);
        }
    }
}
