data class Person(val name: String, val age: Int? = null)//可空类型，实参默认值
//data 数据类型类

//顶层函数
fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),Person("Bob",age = 29))
    //查找年龄最大的人，?:0 age属性为null会返回0
    val oldest = persons.maxBy { it.age ?:0 } //lambda表达式 elvis运算符
    println("The oldest is :$oldest")

}

