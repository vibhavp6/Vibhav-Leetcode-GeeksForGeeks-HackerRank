# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isEvenOddTree(self, root):
        if not root:
            # An empty tree is considered an Even-Odd tree.
            return True

        # Use a deque for efficient queue operations.
        queue = deque([root])
        level = 0

        while queue:
            prev_val = None  # Previous value at the current level.

            # Process all nodes at the current level.
            for _ in range(len(queue)):
                node = queue.popleft()

                # Check if the values follow the Even-Odd conditions.
                if (level % 2 == 0 and (node.val % 2 == 0 or (prev_val is not None and node.val <= prev_val))) or \
                   (level % 2 == 1 and (node.val % 2 == 1 or (prev_val is not None and node.val >= prev_val))):
                    return False

                prev_val = node.val

                # Add children to the deque.
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            level += 1

        # All levels satisfy the conditions.
        return True