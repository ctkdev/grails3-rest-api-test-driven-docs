package com.example


import grails.rest.*

@Resource(uri='/tags', readOnly = false, formats = ['json', 'xml'])
class Tag {
    Long id
    String name

    static hasMany = [notes: Note]
    static belongsTo = [Note]
    static mapping = {
        notes joinTable: [name: 'mm_notes_tags', key: 'mm_tag_id']
    }
}