fun main (args: Array<String>) {
    var mutableList: MutableList<Int> = mutableListOf(1,2,3)
    mutableList.add(4)
    mutableList.add(5)
    mutableList.add(6)
    for (i in mutableList) {
        println(i)
    }
}
