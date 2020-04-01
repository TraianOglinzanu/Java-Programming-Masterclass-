public class FlourPacker {

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 5));
	}

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0)||(smallCount < 0)||(goal < 0)){
            return false;
        }

        int remainder = 0;

        for(int i = 0; i * 5<= goal && i <= bigCount; i++){
        	remainder = goal - i*5;
        }

        if(smallCount >= remainder)
        	if(remainder >= 0)
        		return true;
        	else
        		return false;

        else
        	return false;
    }
}
