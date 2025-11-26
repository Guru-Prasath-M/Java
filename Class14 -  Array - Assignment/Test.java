//Iterate array prices & print all prices

//USING FOR LOOP
class Test{
    public static void main(String[]args){
        int [] prices = {199,129,98,78,11,171,1055};
        for(int i=0; i< prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}

//USING WHILE LOOP
class TestOne{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int i = 0;
        while (i<prices.length) {
            System.out.println(prices[i]);
            i++;
        }
    }
}

//USING DO-WHILE LOOP
class TestTwo{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int i = 0;
        do {
            System.out.println(prices[i]);
            i++;
        } while (i<prices.length);
    }
}

//USING FOREACH
class TestThree{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for (int price : prices) {
            System.out.println(price);
        }
    }
}

//ITERATE PRICES PRINT ALL PRODUCT BELOW 400
class TestFour{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int i=0 ; i<prices.length; i++){
            if(prices[i] < 400){
                System.out.println(prices[i]);
            }
        }
    }
}

//CREATE NEW ARRAY BASED EXISTING ARRAY
class TestFive{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int[] prod_price = new int[prices.length];
        for(int i=0 ; i<prices.length; i++){
            prod_price[i] = prices[i];
            System.out.println(prod_price[i]);
        }
    }
}