public class Main
{

    public static void main(String[] args) {
	   
        // Somar valores de Array
        float[] a = {5.1f, 2, 3.5f, 7.2f};
        System.out.println(soma(a, a.length - 1));
	    
	    // Exponencial
	    int b = exponencial(5, 2);
	    System.out.println(b);
        
        // MDC - Maior Divisor Comum
        int c = mdc(20, 50);
        System.out.println(c);
	    
	    // Soma de valores positivos
	    int[] v = {2, -4, 7, 0, -1, 4};
	    System.out.println(f(v,6));
	    
	    // Imprimir somente os múltiplos de 3
	    int[] arrayTres = {3, 6, 9, 10, 11, 12};
	    divisores(arrayTres, arrayTres.length - 1);

	    // Fazer a somatória de 1 até "N"
        	System.out.println(somador(7));
        
       	 // Somar somente os pares de 1 até "N"
	    System.out.println(somaPares(7));
	    
	    // Somar somente os impares de 1 até "N"
	    System.out.println(somaImpares(7));
	}
    
    // Soma de valores em um Array
    public static float soma(float[] a, int t){
        if (t == 0) return a[0];
         
        return a[t] + soma(a,t-1); 
    }

    // Exponencial de um número
    public static int exponencial(int x, int n){
        if (n == 0) return 1;
        
        return x * exponencial(x, n-1);
    }
    
    // Calcular o MDC de um número
    public static int mdc(int N1, int N2){
        if (N2 == 0) return N1;
        
        return mdc(N2, N1 % N2);
    }
    
    // Soma dos positivos em um Vetor
    public static int f (int[] v, int n){
        if (n==0) return 0;
        
        else {
            int s = f(v, n-1);
            if (v[n-1] > 0) {
                s = s + v[n-1];
            }
            return s;
        }
    }
    
    // Imprimir somente os múltiplos de 3
    public static void divisores (int[] multiplos, int indice){
        if (indice >= 0) {
            divisores(multiplos, indice-1);
            if (multiplos[indice] % 3 == 0)
                System.out.print("["+multiplos[indice]+"]");
        }
    }

	// Fazer a somatória de 1 até "N"
    public static int somador(int contaSoma){
        if (contaSoma == 1) return 1;
        return contaSoma + somador(contaSoma - 1);
    }
        
    // Somar somente os pares de 1 até "N"
	public static int somaPares(int contaPar){
	    if (contaPar == 1) return 0;
	    if (contaPar % 2 == 0) return contaPar + somaPares(contaPar - 1);
	    else return somaPares(contaPar - 1);
	}
	    
	// Somar somente os impares de 1 até "N"
	public static int somaImpares(int contaImpar){
	    if (contaImpar == 1) return 1;
	    if (contaImpar % 2 == 1) return contaImpar + somaImpares(contaImpar - 1);
	    else return somaImpares(contaImpar - 1);
	}
}
