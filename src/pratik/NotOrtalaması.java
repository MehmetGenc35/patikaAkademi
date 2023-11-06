package pratik;

import java.util.*;

public class NotOrtalaması {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double matOrt, turkOrt, fizOrt, kimOrt, tarOrt, muzOrt;

        List<String> dersler = new ArrayList<>(Arrays.asList("Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"));
        List<Double> sınavNotu1 = new ArrayList<>();
        List<Double> sınavNotu2 = new ArrayList<>();

        LinkedHashMap<String, Double> dersVeOrtalama = new LinkedHashMap<>();

        for (int i = 0; i < 6; i++) {

            System.out.println("Lütfen " + dersler.get(i) + " dersi 1. sınav notunuzu giriniz: ");
            sınavNotu1.add(i, inp.nextDouble());
            System.out.println("Lütfen " + dersler.get(i) + " dersi 2. sınav notunuzu giriniz: ");
            sınavNotu2.add(i, inp.nextDouble());

            dersVeOrtalama.put(dersler.get(i), ((sınavNotu1.get(i) + sınavNotu2.get(i)) / 2));

        }

        System.out.println(dersVeOrtalama.values());

        String dersDurum;
        int sayac = 0;
        for (Double w : dersVeOrtalama.values()) {
            dersDurum = w >= 60 ? "Geçtiniz" : "Geçemediniz";
            System.out.println(dersler.get(sayac) + " ortalamanız " + dersVeOrtalama.get(dersler.get(sayac)) + " ders durumunuz " + dersDurum);
            sayac++;
        }
    }
}

