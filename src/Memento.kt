/**
 * @author Soumen Karmakar
 * @Date 16/05/2021
 * Memento is a pattern design with the goal of stacking an object’s state at a given time.
 */
data class Memento<T>(val state:T)