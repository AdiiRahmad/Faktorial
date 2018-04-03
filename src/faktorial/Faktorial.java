/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

/**
 *
 * @author AdiRahmad
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     * Faktorial menggunakan fungsi For
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Faktorial coba = new Faktorial();
        System.out.println(coba.Faktorial(6));
    }

    public int Faktorial(int bilanganA) {
        int hasil = 1;

        for (int i = 2; i <= bilanganA; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }

}
