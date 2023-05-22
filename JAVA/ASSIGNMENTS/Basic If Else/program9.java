class marvel {

        public static void main(String[] args){

        // ============================= Question 9 =========================

        // WAP to check three number are Pythagoras triplets or not?
        
            int a=3,b=4,c=5;
            if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(b*b)+(a*a))
                System.out.println("It is a Pythagoras triplets");
            else
                System.out.println("It is not a Pythagoras triplets");
        }
}


