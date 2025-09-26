class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) return true
    return isMirror(root.left, root.right)
}

fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
    if (t1 == null && t2 == null) return true

    if (t1 == null || t2 == null || t1.`val` != t2.`val`) return false

    return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)
}

fun main() {
    val node = TreeNode(1)
    node.left = TreeNode(2)
    node.right = TreeNode(3)
    println(isSymmetric(node))
}