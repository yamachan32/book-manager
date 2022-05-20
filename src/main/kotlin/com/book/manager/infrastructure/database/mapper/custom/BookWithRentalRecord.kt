package com.book.manager.infrastructure.database.mapper.custom

import java.time.LocalDate
import java.time.LocalDateTime

data class BookWithRentalRecord (
    var id: Long? = null,
    var title: String? = null,
    var author: String? = null,
    var releaseDate: LocalDate? = null,
    var userID: Long? = null,
    var rentalDatetime: LocalDateTime? = null,
    var returnDateline: LocalDateTime? = null
)