import java.util.Scanner;

public class two {

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
