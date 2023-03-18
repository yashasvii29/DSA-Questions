public class coin_Combination {
    public static void main(String[] args) {
        
            int coin[]={2,3,5};// Recursion question
            int amount=10;
            Combination(coin, amount," ",0);
    
        }
        public static void Combination(int coin[],int amount,String ans,int idx){
            if(amount==0){
                System.out.println(ans);
                return;
    
            }
            for(int i=idx;i<coin.length;i++){
                if(amount>=coin[i]){
                    Combination(coin, amount-coin[i], ans+coin[i],i);// idx m i pass kiya hai because infinite coins hai 
                }
            }
        }
            
        // infinite coins nhi hote to argument m i+1 pass ktre hai                                                                                                   
}

