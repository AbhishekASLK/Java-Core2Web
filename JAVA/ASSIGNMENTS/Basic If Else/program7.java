class marvel {

        public static void main(String[] args){

        // ============================= Question 7 =========================

        // WAP to calculate the profit and loss
        
            double sellingPrize = 1200;
            double costPrize = 1000;
            double profit = sellingPrize - costPrize;
            if(profit>0)
                System.out.println("Profit of "+profit);
            else if(profit<0)
                System.out.println("Loss of "+(-profit));
            else
                System.out.println("There is no profit and loss");
            
        }
}


