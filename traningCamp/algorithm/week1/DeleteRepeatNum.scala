object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var k = 0
        for(i <- nums.indices){
            if(i == 0 || nums(i) != nums(i - 1)){
                nums(k) = nums(i)
                k = k + 1
            }
        }
        k
    }
}
