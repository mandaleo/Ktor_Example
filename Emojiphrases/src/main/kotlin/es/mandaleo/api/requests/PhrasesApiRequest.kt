package es.mandaleo.api.requests

import kotlinx.serialization.Serializable

@Serializable
data class PhrasesApiRequest(val emoji: String, val phrase: String)
