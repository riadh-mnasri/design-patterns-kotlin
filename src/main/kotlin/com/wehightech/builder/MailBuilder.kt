package com.wehightech.builder

class MailBuilder {
    private var mail: Mail = Mail()
    fun title(title: String): MailBuilder {
        mail.title(title)
        return this
    }

    fun message(message: String): MailBuilder {
        mail.message(message)
        return this
    }
    // Repeated for other properties
    fun build(): Mail {
        return mail
    }
}
