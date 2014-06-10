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
public class MotorPequeno implements Motor {

    int cavalosForca;

    public MotorPequeno() {
        cavalosForca = 100;
    }

    @Override
    public int liga() {
        System.out.println("O motor pequeno está em funcionamento!");
        return cavalosForca;
    }

}
