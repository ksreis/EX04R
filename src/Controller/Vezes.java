package Controller;

public class Vezes {
	public Vezes() {
		super();
}
public static int cDigit(int n, int dig) {
    // Parada:número menor que 10
    if (n < 10) {
        if (n == dig) {
            return 1;
        } else {
            return 0;
        }
    } else {
        // Chamada: o N é dividido em duas partes
        // e somado a quantidade de vezes que o dígito aparece 
        int UltDigit = n % 10;
        int rest = n / 10;
        int count = cDigit(rest, dig);
        if (UltDigit == dig) {
            count++;
        }
        return count;
    }
}

}