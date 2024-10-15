public class Main {
    public static void swapEnds() {
        int a[] = {1, 6, 2, 4, 5};
        int temp;
        temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void mirrorEnds() {
        StringBuilder text = new StringBuilder("abXYZba");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                System.out.print(text.charAt(i));
            } else {
                break;
            }
        }
    }

    public static void notReplace() {
        String text = "is test";
        text = text.replace("is", "is not");
        System.out.println(text);
    }

    public static void sumDigits() {
        String text = "aa1bc2d3";
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(text.charAt(i)));
            }
        }
        System.out.println(sum);
    }

    public static void closeFar() {
        int a = 1, b = 0, c = 8;
        boolean isgood;
        if (Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2) {
            b = 0;
            isgood = true;
        } else if (Math.abs(b - a) >= 2 && Math.abs(c - a) <= 1) {
            c = 0;
            isgood = true;
        } else {
            isgood = false;
        }
        System.out.println(isgood);
    }

    public static void squareUp() {
        int g = 5;
        int n = g;
        int a[] = new int[(n * n)];
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                a[i] = j;
                i--;
            }
            n--;
        }
        System.out.print("[");
        for (int s : a) {
            System.out.print(s + ", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        squareUp();
    }
}