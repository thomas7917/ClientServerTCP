package clientservertcp_monacchia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author studente
 */

/**
 *
 * @author Monacchia
 */
import java.io.*;
import java.net.*;

public class Client {
    private String name;
    private String color;
    private Socket socket;

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public int connetti(String nomeServer, int portaServer) {
        try {
            socket = new Socket(nomeServer, portaServer);
            return 0; // successo
        } catch (IOException e) {
            e.printStackTrace();
            return -1; // errore
        }
    }

    public void scrivi(String message) {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leggi() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String risposta = in.readLine();
            System.out.println("Ricevuto dal server: " + risposta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chiudi() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

