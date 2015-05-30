class Marathon {
    public static void main (String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        
        System.out.println("The best runner is " + names[bestIndex(times)] + " with time " + times[bestIndex(times)]);
        System.out.println("The second best runner is " + names[secondBestIndex(times)] + " with time " + times[secondBestIndex(times)]);
    }
    
    public static int bestIndex(int[] times){
    	int lowest = times[0];
    	int lowIndex = 0;
    	for(int j = 1; j < times.length; j++){
    		if(times[j] < lowest){
    			lowest = times[j];
    			lowIndex = j;
    		}
    	}
		return lowIndex;
    
    }
    
    public static int secondBestIndex(int[] times){
    	
    	int temp = times[bestIndex(times)];
    	times[bestIndex(times)] = times[0];
    	times[0] = temp;
    	int lowest = times[1];
    	int secondlowIndex = 0;
    	for(int j = 2; j < times.length; j++){
    		if(times[j] < lowest){
    			lowest = times[j];
    			secondlowIndex = j;
    		}
    	}
    	return secondlowIndex;
    }
} 