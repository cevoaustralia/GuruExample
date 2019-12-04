/* An example of code that should get flagged by CodeGuru */
import java.util.HashMap;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

class Whatsit {
    public int doit(int val) {
        return 12345;
    }
}

class GuruExample {
    public static void main(String args[]) throws IOException {
        int len = Integer.parseInt(args[0]);
        char[] thing = new char[len];

        for (int i=0; i<thing.length; i++) {
            thing[i] = 'x';
        }

        System.out.println("Did a thing");

        HashMap<String, Whatsit> thang = new HashMap<String, Whatsit>();
        foo(thang);

        spang();
    }

    public static synchronized void foo(HashMap<String, Whatsit> thing) {
        Whatsit whatsit = thing.get("banana");
        if (whatsit != null) {
            int result = whatsit.doit(123);
            thing.put("banana", whatsit);
        }
    }

    public static void spang() throws IOException {
        Process p = Runtime.getRuntime().exec("date");
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

        System.out.println("Got some spang: ");
        System.out.println(in.readLine());
        in.close();
    }
}

// vi:ts=4 sw=4 et ai
