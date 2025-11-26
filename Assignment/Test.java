//2. Print only prices greater than 100
class TestTwo{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int i=0 ; i<prices.length; i++){
            if(prices[i]>100){
                System.out.println(prices[i]);
            }
        }
    }
}

//3. Count how many prices are below 100
class TestThree{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int count = 0;
        for(int price : prices){
            if(price < 100){
                count ++;
            }
        }
        System.out.println(count);
    }
}

//4. Find the first price greater than 500 using break
class TestFour{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int price : prices){
            if(price > 500){
                break;
            }else{
                System.out.println(price);
            }
        }
    }
}

//5. Skip prices that are less than 50
class TestFive{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        for(int price : prices){
            if (price < 50) {
                continue;
            }else{
                System.out.println(price);
            }
        }
    }
}

//6. Find the maximum price in the array
class TestSix{
    public static void main(String[] args) {
        int [] prices = {199,129,98,78,11,171,1055};
        int largest = 0;
        for(int price : prices){
            if(largest < price){
                largest = price;
            }
        }
        System.out.println(largest);
    }
}