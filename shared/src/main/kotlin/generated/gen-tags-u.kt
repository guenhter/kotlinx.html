package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class UL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("ul", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade {

}
fun UL.li(classes : String? = null, block : LI.() -> Unit = {}) : Unit = LI(attributesMapOf("class", classes), consumer).visit(block)


