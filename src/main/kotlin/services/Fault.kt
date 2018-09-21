package services

data class Fault(val errorCode: Int, val errorMessage: String) : RuntimeException()