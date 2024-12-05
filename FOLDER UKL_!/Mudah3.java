class Mudah3{
    public static void main(String[] args) {
        String [] MOKLET = {"Saya Angkatan 33 ", "Saya anak wikusama", "Saya anak Moklet"};
        int nomor = 50 ;
        for (int i = 50; i > 0; i--) {
            if (nomor == 1){
                System.out.println(nomor + ". Aku senang");
            }
            else{
                System.out.println(nomor + ". " + MOKLET[i %3]);
            }
            nomor--;
        }
    }
} 