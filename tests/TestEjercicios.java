public class TestEjercicios {
    public static void main(String[] args) {
        //e23();
        //e25();
        //e27(80,75,60);
    }

    public static void e23(/*int numero*/){
        Integer numero = (int) Math.round(Math.random() * 100);

        String resultado = "";

        //for1
        /*long a = 0;
        long b = 1;
        for(int i=0;i<numero;i++){
            resultado += a;

            a=a+b;
            b=a-b;

            if (i < numero - 1) {
                resultado += ", ";
            }
        }*/

        //for2
        long a = 0;
        long b = 0;
        long c;
        for (int i = 0; i < numero; i++) {
            if (i== 1) {
                a=1;
                b=0;
            }

            c = a + b;
            a = b;
            b = c;
            resultado += c;

            if (i < numero - 1) {
                resultado += ", ";
            }
        }

        System.out.println(resultado);
    }

    public static void e25(/*int n1, int n2*/){
        int n1 = (int) Math.round(Math.random() * 10000),
            n2 = (int) Math.round(Math.random() * 10000);
        int nMax = Math.max(n1,n2);

        int mcm = 1;

        if(n1!=0 && n2 != 0) {
            for (int i = 1; n1 != 1 || n2 != 1; i++) {
                if (n1 % i == 0 || n2 % i == 0) {
                    System.out.println(n1 + " " + n2 + " | " + i);

                    if(n1 % i == 0){
                        n1 /= i;
                    }

                    if (n2 % i ==0 ){
                        n2 /= i;
                    }

                    mcm *= i;
                } else if (i > nMax) {
                    i = 1;
                }else{
                    continue;
                }

                System.out.println(i);
            }
        }else{
            mcm=0;
        }
        System.out.println(n1 + " " + n2 +" | ");
        System.out.println("FINAL: " + mcm);

        return mcm;
    }

    public static void e27(int n1,int n2,int n3){
        int /*n1 = (int) Math.round(Math.random() * 100),
            n2 = (int) Math.round(Math.random() * 100),
            n3 = (int) Math.round(Math.random() * 100),*/
            nMin = Math.min(n1, Math.min(n2, n3));

        int mcd = 1;

        for (int i = 1; i<nMin; i++) {
            if(n1 % i == 0 && n2 % i == 0 && n3 % i == 0) {
                System.out.println(n1 + " " + n2 + " " + n3 + " | " + i);
                n1 = n1 / i;
                n2 = n2 / i;
                n3 = n3 / i;
                mcd *= i;
            }else{
                continue;
            }
            System.out.println(i);
        }
        System.out.println(n1 + " " + n2 + " " + n3 + " | ");
        System.out.println("FINAL: " + mcd);
    }
}