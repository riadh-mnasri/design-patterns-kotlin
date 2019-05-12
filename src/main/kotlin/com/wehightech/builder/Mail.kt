package com.wehightech.builder

data class Mail(private var _title: String = "", private  var _message: String = ""){
    fun title(title: String): Mail {
        _title = title
        return this
    }

    fun message(message: String): Mail {
        _message = message
        return this
    }

}
