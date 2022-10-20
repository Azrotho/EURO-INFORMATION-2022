import java.util.Scanner;

public class two {
    // C représente le nombre de type de chauffage
    // M représente le nombre de Maison

    // Ligne 1 : 2 entiers C et M séparés par des espaces. C représente le nombre de types de chauffage, M le nombre de maisons. Il est garanti que C < 10 et M < 20
    // Ligne 2 : C entiers distincts séparés par des espaces, représentants les capacités des différents chauffages
    // Ligne 3 : M entiers séparés par des espaces représentants les besoins de chaque maison. Il est garanti que tous les besoins peuvent être couvert par au moins un type de chauffage.

    // Pour chaque maison, afficher le nombre de chauffage nécessaire pour couvrir le besoin de cette maison.
    // Le nombre de chauffage nécessaire est le minimum de chauffage dont la capacité est supérieure ou égale au besoin de cette maison.
    // Si aucun chauffage ne peut couvrir le besoin de cette maison, afficher -1.

    // Trouvez pour chaque maison le type de chauffage à installer, puis renvoyez la somme des puissances de chauffage installées.
    // Un entier, représentant la somme des capacités des chauffages à installer pour répondre aux besoins de toutes les maisons.




    public static void main( String[] argv ) throws Exception {
        String  line;
        String line1 = null;
        String line2 = null;
        String line3 = null;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            count++;
            line = sc.nextLine();
            switch (count) {
                case 1:
                    line1 = line;
                    break;
                case 2:
                    line2 = line;
                    break;
                case 3:
                    line3 = line;
                    break;

            }
        }

        String[] line1Split = line1.split(" ");
        String[] line2Split = line2.split(" ");
        String[] line3Split = line3.split(" ");

        int C = Integer.parseInt(line1Split[0]);
        int M = Integer.parseInt(line1Split[1]);

        int[] capacities = new int[C];
        int[] needs = new int[M];

        for (int i = 0; i < C; i++) {
            capacities[i] = Integer.parseInt(line2Split[i]);
        }

        for (int i = 0; i < M; i++) {
            needs[i] = Integer.parseInt(line3Split[i]);
        }

        int result = 0;
        for (int i = 0; i < M; i++) {
            int need = needs[i];
            int min = -1;
            for (int j = 0; j < C; j++) {
                if (capacities[j] >= need) {
                    if (min == -1 || capacities[j] < min) {
                        min = capacities[j];
                    }
                }
            }
            result += min;
        }

        System.out.println(result);



    }
}
