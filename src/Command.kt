/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 *
 * Command is the base class of all the commands. Each command shall implement said interface and its ‘do’ method,
 * which will execute different actions through polymorphism.
 */
abstract class Command<T : Originator<T>>(private val originator: T) {
    private val memento = originator.createMemento()
    abstract fun `do`(): T
    fun undo(): T = originator.restoreFromMemento(memento)
}