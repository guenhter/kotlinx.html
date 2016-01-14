package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class VAR_(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("var", consumer, initialAttributes, null, true, false), HtmlInlineTag {

}

open class VIDEO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("video", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var autoBuffer : Boolean
        get()  = attributeBooleanTicker.get(this, "autobuffer")
        set(newValue) {attributeBooleanTicker.set(this, "autobuffer", newValue)}

    var autoPlay : Boolean
        get()  = attributeBooleanTicker.get(this, "autoplay")
        set(newValue) {attributeBooleanTicker.set(this, "autoplay", newValue)}

    var loop : Boolean
        get()  = attributeBooleanTicker.get(this, "loop")
        set(newValue) {attributeBooleanTicker.set(this, "loop", newValue)}

    var controls : Boolean
        get()  = attributeBooleanTicker.get(this, "controls")
        set(newValue) {attributeBooleanTicker.set(this, "controls", newValue)}

    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}

    var poster : String
        get()  = attributeStringString.get(this, "poster")
        set(newValue) {attributeStringString.set(this, "poster", newValue)}


}
fun VIDEO.source(classes : String? = null, block : SOURCE.() -> Unit = {}) : Unit = SOURCE(attributesMapOf("class", classes), consumer).visit(block)


