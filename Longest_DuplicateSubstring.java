package Bitmasking;

import java.util.ArrayList;
import java.util.HashMap;

public class Longest_DuplicateSubstring {

    // iss que m we are using reverse rolling hashmethod..means last se expression create krenge
    public static void main(String[] args) {
        String str ="banana";
        System.out.println(Longest(str));
    }

    public static String Longest(String str){
        int lo=1;
        int hi=str.length();
        String ans="";
        while(lo<=hi){
            int mid = (lo+hi)/2;
            // string ki length 6 h toh mid m 3 aayega
            String s = result(str,mid);
            if(s.length()>0){
                ans=s;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static String result(String s,int mid){
        // sliding window apply kr rhe hai
        // mid length ki string pr and last se equation banate hai
        // reverse rolling hashmethod apply krenge
        long hv = 0;  //hashvalue 
        long mod = 1000_000_007;
        long pr =31;
        long pow = 1;
        for(int i=mid-1;i>=0;i--){
            hv = (hv+((s.charAt(i)-'a'+1) *pow)%mod);
            if(i>0){
                pow = (pow*pr)%mod;
            }
        }
        HashMap<Long,ArrayList<Integer>> map = new HashMap<>();
        map.put(hv,new ArrayList<>());
        map.get(hv).add(0); // zero index ..means pehli window pr aaply kr rhe hai
        // length 5 hai toh highest power 31^4 hogi(highest power 4 hogi)

        for(int ei=mid,si=0;ei<s.length();si++,ei++){
            // jab aise loop chalate hai toh dono index sath m increase hote hai
            hv = (hv - ((s.charAt(si)-'a'+1)*pow) % mod + mod)% mod;// rollback the window
            hv = (hv*pr)%mod;
            hv = (hv+s.charAt(ei)) % mod;
            if(map.containsKey(hv)){
                String curr = s.substring( si+1,ei+1);
                for(int st: map.get(hv)){
                    if(curr.equals(s.substring(st, st+mid))){
                        return curr;
                    }
                }
                map.get(hv).add(si+1);
            }
            else{
                map.put(hv,new ArrayList<>());
                map.get(hv).add(si+1);
            }
        }
        return "";



    }
}
