/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 * Originator creates a Memento object containing a photography of its internal state.
 */
interface Originator<T> {
    fun createMemento(): Memento<T>
    fun restoreFromMemento(memento: Memento<T>): T
}