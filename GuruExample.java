/* An example of code that should get flagged by CodeGuru */
import java.util.HashMap;

class Whatsit {
    public int doit(int val) {
        return 12345;
    }
}

class GuruExample {
    public static void main(String args[]) {
        int len = Integer.parseInt(args[1]);
        char[] thing = new char[len];

        for (int i=0; i<thing.length; i++) {
            thing[i] = 'x';
        }

        System.out.println("Did a thing");

        HashMap<String, Whatsit> thang = new HashMap<String, Whatsit>();
        foo(thang);
    }

    public static synchronized void foo(HashMap<String, Whatsit> thing) {
        Whatsit whatsit = thing.get("banana");
        if (whatsit != null) {
            int result = whatsit.doit(123);
            thing.put("banana", whatsit);
        }
    }
}

// vi:ts=4 sw=4 et ai
