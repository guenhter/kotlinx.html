package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes, null, false, false), HtmlInlineTag {

}

open class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes, null, true, true) {
    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}


}

open class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes, null, false, false), HtmlInlineTag {

}

open class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes, null, true, false), HtmlInlineTag {
    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}

    var max : String
        get()  = attributeStringString.get(this, "max")
        set(newValue) {attributeStringString.set(this, "max", newValue)}


}

