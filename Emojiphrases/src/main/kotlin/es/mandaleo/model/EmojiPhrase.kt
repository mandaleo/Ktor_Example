package es.mandaleo.model

import kotlinx.serialization.*
import org.jetbrains.exposed.dao.*
import org.jetbrains.exposed.sql.*

@Serializable
data class EmojiPhrase(
    val id: Int,
    val userId: String,
    val emoji: String,
    val phrase: String)

object EmojiPhrases: IntIdTable() {
    val user: Column<String> = varchar("user_id", 20).index()
    val emoji: Column<String> = varchar("emoji", 255)
    val phrase: Column<String> = varchar("phrase", 255)
}