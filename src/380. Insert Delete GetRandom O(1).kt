class RandomizedSet() {

    private val set: MutableSet<Int> = mutableSetOf()
    private val nums:MutableList<Int> = mutableListOf()

    fun insert(`val`: Int): Boolean {
        if (!set.contains(`val`))
            nums.add(`val`)
        return set.add(`val`)
    }

    fun remove(`val`: Int): Boolean {
        if (set.contains(`val`))
            nums.remove(`val`)
        return set.remove(`val`)
    }

    fun getRandom(): Int {
        return nums.random()
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */