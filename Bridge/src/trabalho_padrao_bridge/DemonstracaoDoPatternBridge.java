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
public class DemonstracaoDoPatternBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo veiculo = new Onibus(new MotorPequeno());
        veiculo.dirigir();
        veiculo.colocaMotor(new MotorGrande());
        veiculo.dirigir();

        veiculo = new Carro(new MotorGrande());
        veiculo.dirigir();
        veiculo.colocaMotor(new MotorGrande());
        veiculo.dirigir();
    }

}
