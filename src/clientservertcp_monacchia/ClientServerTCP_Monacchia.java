/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientservertcp_monacchia;

/**
 *
 * @author studente
 */
public class ClientServerTCP_Monacchia {
    public static void main(String[] args) {
        Client client = new Client("Mario", "rosso");
        if (client.connetti("localhost", 12345) == 0) {
            client.scrivi("Ciao dal client!");
            client.leggi();
            client.chiudi();
        }
    }
}
