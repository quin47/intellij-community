// "Add annotation target" "true"

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class Foo

@Foo
class Test {
    @Foo
    // TODO: [VD] temporary broken due to https://youtrack.jetbrains.com/issue/KT-45417
    fun foo(): @Foo Int = 1
}