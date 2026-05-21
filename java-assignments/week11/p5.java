class p5 {
	public int[] p5(String[] cpr) {
		int[] answer = {0, 0, 0, 0, 0};
		String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

		for(int i = 0; i < answer.length; i++){
			for(int j = 0; j < basic_order.length; j++){
				if(cpr[i].equals(basic_order[j])){
					answer[i] = j + 1;
					break;
				}
			}
		}
		return answer;
	}

    public static void main(String[] args) {
        p5 test = new p5();

        String[] cpr = {"call", "respiration", "repeat", "check", "pressure"};

        int[] result = test.p5(cpr);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}