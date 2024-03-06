package Socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4000); //Cria uma instância da classe Socket
        // que representa uma conexão de socket. O código está tentando se conectar
        // a um servidor na máquina local (localhost) na porta 4000.
        Scanner scanner = new Scanner(System.in);

        ClienteThread clienteThread = new ClienteThread(socket);
        //Cria uma instância da classe ClienteThread, que provavelmente estende a classe Thread ou implementa a interface Runnable.
        // Isso sugere que há um componente de multithreading no programa, e a thread será usada para lidar com a comunicação do cliente.
        clienteThread.start();
        //Inicia a execução da thread criada no passo anterior. Isso chama implicitamente o método run() da thread.
        PrintStream saida = new PrintStream(socket.getOutputStream());
        //Cria um objeto PrintStream para enviar dados para o servidor através do OutputStream do socket.
        String teclado = scanner.nextLine();
        //Lê uma linha de entrada do teclado e a armazena na variável teclado.
        saida.println(teclado);
        //Envia a linha lida do teclado para o servidor através do PrintStream
    }
}

