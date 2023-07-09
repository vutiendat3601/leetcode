var TreeNode = /** @class */ (function () {
    function TreeNode(val, left, right) {
        this.val = val === undefined ? 0 : val;
        this.left = left === undefined ? null : left;
        this.right = right === undefined ? null : right;
    }
    return TreeNode;
}());
function sortedArrayToBST(nums) {
    return createNode(nums, 0, nums.length - 1);
}
function createNode(nums, left, right) {
    if (left <= right) {
        var mid = Math.floor((left + right) / 2);
        var root = new TreeNode(nums[mid], createNode(nums, left, mid - 1), createNode(nums, mid + 1, right));
        return root;
    }
    return null;
}
sortedArrayToBST([-10, -3, 0, 5, 9]);
