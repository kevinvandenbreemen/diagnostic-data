package com.vandenbreemen.common.diagnostics

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class DiagnosticsDataTest {

    @Test
    fun `should build`() {
        val data = DiagnosticsData.Builder("Diagnostics").addSection(
            DiagnosticSection.Builder("Section 1")
                .addContent("Line 1")
                .addContent("Line 2")
                .build()
        ).build()

        data.title shouldBeEqualTo "Diagnostics"
        data.sections.let { sections->
            sections.size shouldBeEqualTo 1
            sections[0].content.size shouldBeEqualTo 2
        }
    }

}