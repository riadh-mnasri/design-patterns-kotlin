package com.wehightech.builder

fun main() {
    val mail = Mail().title("test").message("test")
    val mail2 = MailBuilder().title("test2").message("test2").build()
    println("mail :: $mail")
    println("mail2 :: $mail2")
}
