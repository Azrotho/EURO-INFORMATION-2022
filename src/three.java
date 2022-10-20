import java.util.*;


public class three {
    public static void main(String[] argv) throws Exception {
        String line;
        String line1 = null;
        String line2 = null;
        String line3 = null;
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
         Scanner sc = new Scanner(System.in);
       while (sc.hasNextLine()) {
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

        int sum = Integer.parseInt(line3);

        String[] line2Split = line2.split("");


        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    for (int d = 1; d < 10; d++) {
                        for (int e = 1; e < 10; e++) {
                            if (a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e) {

                                // Use map to stock values
                                Map<String, Integer> map = new HashMap<String, Integer>();
                                map.put("a", a);
                                map.put("b", b);
                                map.put("c", c);
                                map.put("d", d);
                                map.put("e", e);

                                int first = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
                                int second = map.get(line2Split[0]) * 10000 + map.get(line2Split[1]) * 1000 + map.get(line2Split[2]) * 100 + map.get(line2Split[3]) * 10 + map.get(line2Split[4]);
                                if (first + second == sum) {
                                    result.add(first);
                                }

                            }
                        }
                    }
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.get(0));
    }
}


