public class bookAllocation {
  
  public int findPages(int[] nums, int m) {
        if(nums.length<m) return -1;
        int ans = -1;
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int assignedStudents = studentAssignedBooks(nums, mid);
            if(assignedStudents<=m){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }

    public int studentAssignedBooks(int[] nums, int mid){
        int students = 1;
        int pages = 0;
        for(int i = 0;i<nums.length;i++){
            pages += nums[i];
            if(pages>mid){
                students++;
                pages = nums[i];
            }
        }
        return students;
    }
}
