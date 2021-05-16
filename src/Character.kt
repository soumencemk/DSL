/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 */
data class Character(val x: Int, val y: Int) : Originator<Character> {

    fun left(): Character = copy(x = x - 1)
    fun right(): Character = copy(x = x + 1)
    fun up(): Character = copy(y = y + 1)
    fun down(): Character = copy(y = y - 1)
    override fun createMemento(): Memento<Character> = Memento(this)

    override fun restoreFromMemento(memento: Memento<Character>): Character = memento.state
}