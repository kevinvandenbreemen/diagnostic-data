package com.vandenbreemen.common.diagnostics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagnosticsData {

    private ArrayList<DiagnosticSection> sections;

    public DiagnosticsData() {
        this.sections = new ArrayList<>();
    }

    public List<DiagnosticSection> getSections() {
        return Collections.unmodifiableList(sections);
    }
}
