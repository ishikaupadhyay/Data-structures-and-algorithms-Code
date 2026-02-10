public class mergeTwoSortedArr {

    public void MergeTwoArr(int nums1[], int nums2[], int m, int n) {
        // size of nums1=m+n
        // non zero ele in nums1 =i, in nums2=j

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;// as the total size =m+n..so uska index

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j > 0) {
            nums1[k--] = nums2[j--];
        }

    }

    public static void main(String[] args) {
        int nums1[] = { -5, -2, 4, 5, 0, 0, 0 };
        int nums2[] = { -3, 1, 8 };
        int m = 4;
        int n = 3;

        mergeTwoSortedArr result = new mergeTwoSortedArr();
        result.MergeTwoArr(nums1, nums2, m, n);
        for (int nums : nums1) {
            System.out.print(nums+" ");
        }

    }
}