/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
 class Solution {
public:
    int helper(TreeNode* root, int current) {
        if (!root) return 0;

        current = current * 10 + root->val; // Build number

        if (!root->left && !root->right) {
            return current; // Leaf → return the formed number
        }

        return helper(root->left, current) + helper(root->right, current);
    }

    int sumNumbers(TreeNode* root) {
        return helper(root, 0);
    }
};
