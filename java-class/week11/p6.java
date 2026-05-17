class p6 {
    public int p6(int storage, int usage, int[] change) {
        int total_usage = 0;

        for(int i = 0; i < change.length; i++) {
            usage = usage + usage * change[i] / 100;
            total_usage = total_usage + usage;

            if(total_usage > storage) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        p6 test = new p6();

        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};

        int result = test.p6(storage, usage, change);

        System.out.println(result);
    }
}