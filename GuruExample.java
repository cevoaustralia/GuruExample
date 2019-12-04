/* An example of code that should get flagged by CodeGuru */
import java.util.HashMap;

class GuruExample {
    public static void main(String args[]) {
        HashMap<String, String> foo;

        foo.put("thing", "thing");

        int len = Integer.parseInt(args[1]);
        char[] thing = new char[len];

        for (int i=0; i<thing.length; i++) {
            thing[i] = 'x';
        }

        System.out.println("Did a thing");
    }
}

// vi:ts=4 sw=4 et ai
