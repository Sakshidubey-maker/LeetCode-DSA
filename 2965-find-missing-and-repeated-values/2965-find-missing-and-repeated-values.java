class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=grid.length;
        int repeated =-1;
        int missing =-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num=grid[i][j];
                h.put(num,h.getOrDefault(num,0)+1);
            }
        }

        // check everywhere 0 to n*n
        for(int num=1;num<=n*n;num++){
            int count=h.getOrDefault(num,0);

            if(count==2)
                repeated = num;
            if(count==0){
                missing = num;
            }
        }

    return new int[] {repeated,missing};  
    }
}