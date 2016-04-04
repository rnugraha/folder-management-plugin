package annotation

class AmTagTemplateAssociation {

    Long id
    Long tagTemplateId
    String objectUid

    static mapping = {
        table schema: 'amapp'
        version false
        cache true
        sort "value"
        id generator: 'sequence', params: [sequence: 'AMAPP.SEQ_AMAPP_DATA_ID']
//		columns { id column:'tag_value_id' }
    }

    static constraints = {
        objectUid(maxSize: 200)
    }

}
