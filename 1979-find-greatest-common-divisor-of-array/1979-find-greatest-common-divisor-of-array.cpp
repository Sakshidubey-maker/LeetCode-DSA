class Solution {
public:
    int findGCD(vector<int>& nums) {
        int mx=INT_MIN;
        int mn=INT_MAX;
        for(int i=0;i<nums.size();i++)
        {
            // maximum no.
            if(mx<nums[i]){
                mx=nums[i];
            }
            // minimum no.
           if(mn>=nums[i]){
            mn=nums[i];
           }
        }
        // greatest common
        int gcd=1;
        for(int i=mn;i>1;i--){
            if(mn%i==0 && mx%i==0){
                gcd=i;
                break;
            }
        }
return gcd;
    }
};