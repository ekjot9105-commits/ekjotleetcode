class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        String direc = "North";
        for(char ch : instructions.toCharArray()){
            if(ch == 'G'){
                if(direc.equals("North")){
                    y +=1;
                }else if(direc.equals("South")){
                    y -=1;
                }else if(direc.equals("East")){
                    x +=1;
                }else x -= 1;
            }else  if(ch == 'L'){
                if(direc.equals("North")){
                    direc = "West";
                }else if(direc.equals("South")){
                    direc = "East";
                }else if(direc.equals("East")){
                    direc = "North";
                }else direc = "South";
            }else  if(ch == 'R'){
                if(direc.equals("North")){
                    direc = "East";
                }else if(direc.equals("South")){
                    direc = "West";
                }else if(direc.equals("East")){
                    direc = "South";
                }else direc = "North";
            }
        }
        if(x == 0 && y == 0) return true;
        if(direc.equals("North")) return false;
        return true;
    }
}