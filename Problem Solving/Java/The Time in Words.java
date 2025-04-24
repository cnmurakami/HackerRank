class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        String message = "";
        
        HashMap<Integer,String> intMessage = new HashMap<>();
        intMessage.put(1, "one");
        intMessage.put(2, "two");
        intMessage.put(3, "three");
        intMessage.put(4, "four");
        intMessage.put(5, "five");
        intMessage.put(6, "six");
        intMessage.put(7, "seven");
        intMessage.put(8, "eight");
        intMessage.put(9, "nine");
        intMessage.put(10, "ten");
        intMessage.put(11, "eleven");
        intMessage.put(12, "twelve");
        intMessage.put(13, "thirteen");
        intMessage.put(14, "fourteen");
        intMessage.put(15, "quarter");
        intMessage.put(16, "sixteen");
        intMessage.put(17, "seventeen");
        intMessage.put(18, "eighteen");
        intMessage.put(19, "nineteen");
        intMessage.put(20, "twenty");
        intMessage.put(30, "thirty");
        
        if (m==00){
            return intMessage.get(h)+" o' clock";
        }
        if (m<=30){
            if (m<20){
                message = intMessage.get(m);
            }
            else if (m<30){
                if (m%10 == 0){
                    message = intMessage.get(m);
                }
                else{
                    message = intMessage.get(Math.floorDiv(m, 10)*10)+" " + intMessage.get(m%10);
                }
            }
            else if (m==30){
                message = "half";
            }
            message+=" minutes past "+intMessage.get(h);
        }
        else{
            m = 60-m;
            if (m<20){
                message = intMessage.get(m);
            }
            else{
                if (m%10 == 0){
                    message = intMessage.get(m);
                }
                else{
                    message = intMessage.get(Math.floorDiv(m, 10)*10)+" " + intMessage.get(m%10);
                }
            }
            message+= " minutes to "+intMessage.get(h+1);
        }
        if (m==1){
            message = message.replace("minutes", "minute");
        }
        if (m==15 || m==30){
           message = message.replace(" minutes", "");
        }
        return message;

    }

}