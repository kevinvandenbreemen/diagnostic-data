package com.vandenbreemen.common.diagnostics

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.UnsupportedOperationException

class DiagnosticSectionTest {

    @Test
    fun `should provide for accessing title and sections`() {
        val section = DiagnosticSection.Builder("Test Section")
            .addContent("Line 1")
            .addContent("Line 2")
            .build()

        section.title shouldBeEqualTo "Test Section"
        section.content.let { content->
            content.size shouldBeEqualTo 2
            content[0] shouldBeEqualTo "Line 1"
            content[1] shouldBeEqualTo "Line 2"
        }
    }

    @Test
    fun `should not allow modification of content`() {
        val section = DiagnosticSection.Builder("Test Section")
            .addContent("Line 1")
            .addContent("Line 2")
            .build()

        assertThrows<UnsupportedOperationException> {
            section.content.add("Line 3")
        }

        section.content.size shouldBeEqualTo 2

    }

}