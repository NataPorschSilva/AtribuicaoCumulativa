
package com.mycompany.atribuicaocumulativa;

import java.util.Locale;

public class AtribuicaoCumulativa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        int num = 35;
        System.out.println((num += 5) * 2);
        
        /*
        modo separado de fazer o mesmo:

        int num = 35;
        System.out.println(num += 5);
        (irá somar mais 5)

        int num = 35;
        System.out.println(num *= 2);
        (irá multiplicar por 2)
        */
        
        }
}
