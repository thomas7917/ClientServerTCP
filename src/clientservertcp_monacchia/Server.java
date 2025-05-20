package clientservertcp_monacchia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author studente
 */
public class MainClient {
    public static void main(String[] args) {
        Client client = new Client("Mario", "rosso");
        if (client.connetti("localhost", 12345) == 0) {
            client.scrivi("Ciao dal client!");
            client.leggi();
            client.chiudi();
        }
    }
}
