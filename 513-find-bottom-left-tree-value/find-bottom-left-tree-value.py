# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def findBottomLeftValue(self, root):
        queue = deque([root])
        leftmost_value = None

        while queue:
            node = queue.popleft()

            leftmost_value = node.val

            if node.right:
                queue.append(node.right)
            if node.left:
                queue.append(node.left)

        return leftmost_value