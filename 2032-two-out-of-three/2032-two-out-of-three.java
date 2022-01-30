class Solution {
   public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
	var set1 = toSet(nums1);
	var set2 = toSet(nums2);
	var set3 = toSet(nums3);

	var common = new HashSet<>(intersection(set1, set2));
	common.addAll(intersection(set2, set3));
	common.addAll(intersection(set3, set1));

	return new ArrayList<>(common);
}

private Set<Integer> toSet(int[] arr) {
	return Arrays.stream(arr)
				 .boxed()
				 .collect(Collectors.toCollection(HashSet::new));
}

private Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
	var intersection = new HashSet<>(set1);
	intersection.retainAll(set2);
	return intersection;
}
}