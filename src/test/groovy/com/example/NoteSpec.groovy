package com.example


import grails.test.mixin.TestFor
import spock.lang.Specification
import static org.junit.Assert.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Note)
class NoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "save() will create a new Note"() {
        given: "a Note"
        def note = new Note()
        note.title = "title"
        note.body = "body"

        when: "note.save() is called"
        note.save()

        then: "the note is saved"
        assertNotNull note
        assert note.id >= 0
    }
}
