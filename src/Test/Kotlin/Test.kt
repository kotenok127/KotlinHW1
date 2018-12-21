package Test.Kotlin;
import Main.Kotlin.*

/**
 * Created by hp123 on 05.12.2017.
 */


fun main(args: Array<String>) {
    val Arr = intArrayOf(10, 3, 2, 6, 2);
    mergeSort(Arr, 0, 5);
    for (item in Arr) {
        println(item);
    }
}
