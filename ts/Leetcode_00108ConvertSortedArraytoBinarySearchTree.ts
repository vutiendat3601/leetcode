class TreeNode {
  val: number;
  left: TreeNode | null;
  right: TreeNode | null;
  constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

function sortedArrayToBST(nums: number[]): TreeNode | null {
  return createNode(nums, 0, nums.length);
}

function createNode(
  nums: number[],
  left: number,
  right: number
): TreeNode | null {
  if (left <= right) {
    const mid = Math.floor((left + right) / 2);
    const root = new TreeNode(
      nums[mid],
      createNode(nums, left, mid - 1),
      createNode(nums, mid + 1, right)
    );
    return root;
  }
  return null;
}

sortedArrayToBST([-10,-3,0,5,9]);