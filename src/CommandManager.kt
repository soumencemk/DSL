/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 */
data class CommandManager<T : Originator<T>>(
    private val undos: List<Command<T>> = emptyList(),
    private val redos: List<Command<T>> = emptyList()
) {

    fun `do`(command: Command<T>): Pair<CommandManager<T>, T> =
        Pair(CommandManager(undos + command, emptyList()), undos.last().undo())

    fun undo(): Pair<CommandManager<T>, T> =
        Pair(CommandManager(undos.dropLast(1), redos + undos.last()), undos.last().undo())

    fun redo(): Pair<CommandManager<T>, T> =
        Pair(CommandManager(undos + redos.last(), redos.dropLast(1)), redos.last().`do`())

}