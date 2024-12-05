import java.util.Scanner;
    public class Mudah1 {
            public static void main(String[] args) {
        
                Scanner input = new Scanner (System.in);
                
                int kg,km,kmp1, kmp2, p,l,t, volP, vol, tkgkm, RESULT = 0;
                kmp1 = 6000;
                kmp2 = 4250;

                volP = 0;
        
                System.out.println("selamat datang di kirm inc.");
        
                System.out.println("Berapa banyak Km yang akan di tempuh?");
                System.out.println(" < 15 KM : 4,000 per KG"); //y
                System.out.println(" > 15 KM : 7,000 per KG");
                km = input.nextInt();
        
                if(km <= 10){
                    System.out.println("Beratnya berapa?");
                    kg = input.nextInt();
                    tkgkm = kg *kmp2;
                }
                else{
                    System.out.println("Beratnya berapa?");
                    kg = input.nextInt();
                    tkgkm = kg *kmp1;
                }
        
                System.out.println("Berapa panjangnya?");//hitung volume
                p = input.nextInt();
                System.out.println("Berapa lebarnya?");
                l = input.nextInt();
                System.out.println("Berapa tingginya");
                t = input.nextInt();
                vol = p*l*t;
                System.out.println("Volume : " + vol + " cm^3");
        
                if (vol >= 100){
                    volP = 50000;
                    System.out.println("Volume anda : " + vol + " cm^2");
                    System.out.println("Volume anda melebihi 150 cm^3 dan dikenai tambahan 60.000 Rp.");
                }
                else{
                    System.out.println("Volume anda : " + vol + " cm^2");
        
                }
                RESULT = + volP + tkgkm;
        
                System.out.println("total yang haru dibayar adalah");
        
                System.out.println(RESULT);
            }
        }

