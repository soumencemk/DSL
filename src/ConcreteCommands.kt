/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 */

data class CharacterLeftCommand(private val character: Character) : Command<Character>(character) {
    override fun `do`(): Character = character.left()
}

data class CharacterRightCommand(private val character: Character) : Command<Character>(character) {
    override fun `do`(): Character = character.right()
}

data class CharacterUpCommand(private val character: Character) : Command<Character>(character) {
    override fun `do`(): Character = character.up()
}

data class CharacterDownCommand(private val character: Character) : Command<Character>(character) {
    override fun `do`(): Character = character.down()
}





