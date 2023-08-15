class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int arr[]=new int[2];
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int k=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],k+1);
            
        }
        int i=0;
        for(int kval:hm.keySet())
        {
            if(hm.get(kval)==1&&i<arr.length)
            {
                arr[i++]=kval;
            }
            //System.out.println(hm.get(kval));
        }
         Arrays.sort(arr);
         return arr;
    }
}
