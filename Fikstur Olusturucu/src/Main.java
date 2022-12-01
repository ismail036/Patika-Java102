import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> takımlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Takım giriniz : (Çıkmak için q'ya basınız)");
            String takım = scan.next();
            if (takım.equals("q")){
                break;
            }else {
                takımlar.add(takım);
            }
        }

        if (takımlar.size() % 2 == 1){
            takımlar.add("Bay");
        }


        String[][] maclar = new String[ToplamMacSayisi(takımlar.size())][2];


        int k = 0;
        for (int i = 0 ;i<takımlar.size(); i++){
            for (int j = 0 ;j< takımlar.size(); j++){
                if (i!=j){
                    maclar[k][0] = takımlar.get(i);
                    maclar[k][1] = takımlar.get(j);
                    k++;
                }
            }
        }

        Collections.shuffle(Arrays.asList(maclar));

        int round = 1;
        for (int i = 0 ; i<maclar.length;i++){
            if (i%4==0){
                System.out.println("Round " + round);
                round += 1;            }
            System.out.println(maclar[i][0] + "  vs  " + maclar[i][1]);
        }

    }


    public static int ToplamMacSayisi(int i){
        return i * (i-1);
    }
}