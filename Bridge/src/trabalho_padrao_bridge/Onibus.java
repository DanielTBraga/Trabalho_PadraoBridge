/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_padrao_bridge;

/**
 *
 * @author Rafael
 */
public class Onibus extends Veiculo {

    public Onibus(final Motor motor) {
        this.pesoEmKilos = 3000;
        this.motor = motor;
    }

    @Override
    public void dirigir() {
        System.out.println("\nO onibus será pilotado!");
        final int cavalosForca = motor.liga();
        avisarDeAcordoComVelocidade(cavalosForca);
    }

}
