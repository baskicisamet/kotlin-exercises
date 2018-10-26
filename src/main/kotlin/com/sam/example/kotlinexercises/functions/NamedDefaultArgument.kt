package com.sam.example.kotlinexercises.functions

class NamedDefaultArgument {

    fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

}