package com.example


import grails.test.mixin.TestFor
import spock.lang.Specification
import static org.junit.Assert.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Tag)
class TagSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "save() will create a new Tag"() {
        given: "a Tag"
        def tag = new Tag()
        tag.name = "name"

        when: "tag.save() is called"
        tag.save()

        then: "the tag is saved"
        assertNotNull tag
        assert tag.id >= 0
    }
}
