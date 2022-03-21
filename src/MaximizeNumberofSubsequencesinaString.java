public class MaximizeNumberofSubsequencesinaString {
    public long maximumSubsequenceCount(String text, String pattern) {
        long counter = 0;
        long counterX = 0;
        long counterY =0;
        long sumY=0,sumX=0;
        for (int i = text.length()-1; i >-1; i--) {
            if(text.charAt(i)==pattern.charAt(1)){
                counterY--;
            }
             if(text.charAt(i)==pattern.charAt(0)){
                sumY+=counterY;
            }

        }

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==pattern.charAt(0)){
                counterX++;
            }
             if(text.charAt(i)==pattern.charAt(1)){
                sumX+= counterX;
            }

        }
        counter =  (Math.max(Math.abs(sumY),sumX)+Math.max(Math.abs(counterY),counterX));
        if(pattern.charAt(0)==pattern.charAt(1)){
            return counterX*(counterX+1)/2;
        }else{
            return counter;
        }


    }
}
