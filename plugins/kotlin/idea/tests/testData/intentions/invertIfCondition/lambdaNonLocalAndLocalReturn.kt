inline fun call(f: () -> Unit) = f()

fun bar() {}

fun foo(arg: Boolean) {
    call {
        <caret>if (!arg) return@call
        bar()
        return
    }
    bar()
}