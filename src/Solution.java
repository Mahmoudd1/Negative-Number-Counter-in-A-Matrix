class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int sum=0;
        int limit=grid[0].length-1;
        for (int i=0;i<n;i++)
        {
            int newLimit=binarysearch(i,0,limit,grid);
            if (newLimit==-1)
                continue;
            sum+=summation(i,newLimit,limit,n);
            if (newLimit==0)
                return sum;
            limit=newLimit-1;
        }
        return sum;
    }
    int binarysearch(int row,int low,int high,int[][]grid)
    {
        int mid=0;
        boolean flag=false;
        while (low<=high)
        {
            mid=high-(high-low)/2;
            if (grid[row][mid]<0)
            {
                high=mid-1;
                flag=true;
            }
            else
                low=mid+1;
        }
        if (flag)
            return low;
        else return -1;
    }
    int summation(int row,int newLimit,int limits,int n) {
        //System.out.println(n+" " + row+ " "+limits+ " "+newLimit);
        return (n- row) * ((limits + 1) - newLimit);
    }
}