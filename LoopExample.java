/* An example of code that should get flagged by CodeGuru */

class LoopExample {
    public static void main(String args[]) {
        int len = Integer.parseInt(args[1]);
        char[] thing = new char[len];

        for (int i=0; i<thing.length; i++) {
            thing[i] = 'x';
        }

        System.out.println("Did a thing");
    }
}

// vi:ts=4 sw=4 et ai
