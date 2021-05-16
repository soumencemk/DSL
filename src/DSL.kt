/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 */

typealias DSL = Pair<CommandManager<Character>, Character>

fun DSL.left() = first.`do`(CharacterLeftCommand(second))
fun DSL.right() = first.`do`(CharacterRightCommand(second))
fun DSL.up() = first.`do`(CharacterUpCommand(second))
fun DSL.down() = first.`do`(CharacterDownCommand(second))
fun DSL.undo() = first.undo()
fun DSL.redo() = first.redo()
fun DSL.print() = println(second)

val dsl = DSL(CommandManager(), Character(0, 0))

fun main(args: Array<String>) {
    dsl.up()
        .down()
        .undo()
        .redo()
        .down()
        .left()
        .right()
        .print();

}
