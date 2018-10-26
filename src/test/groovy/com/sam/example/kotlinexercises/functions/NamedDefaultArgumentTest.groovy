package com.sam.example.kotlinexercises.functions

import spock.lang.Shared
import spock.lang.Specification

class NamedDefaultArgumentTest extends Specification {

    @Shared namedDefaultArgument = new NamedDefaultArgument()

    def "JoinOptions"() {

        given:
        def param = Arrays.asList("Samet","Baskıcı")

        when:
        def result = namedDefaultArgument.joinOptions(param)

        then:
        result == "[Samet, Baskıcı]"
    }


}
