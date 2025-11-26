class Solution:
	def andInRange(self, l, r):
		shift_count = 0
		
		# Right-shift both l and r until they are equal (finding the common prefix)
		while l != r:
			l >>= 1
			r >>= 1
			shift_count += 1
			
		# Left-shift the common prefix back by the number of shifts
		# to append the required number of trailing zeros.
		return l << shift_count