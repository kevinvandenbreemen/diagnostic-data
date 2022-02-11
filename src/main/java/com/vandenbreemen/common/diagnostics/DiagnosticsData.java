package com.vandenbreemen.common.diagnostics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagnosticsData {

    static class Builder {

        private DiagnosticsData data;

        public Builder(String title) {
            data = new DiagnosticsData();
            data.title = title;
        }

        public Builder addSection(DiagnosticSection section) {
            data.sections.add(section);
            return this;
        }

        public DiagnosticsData build() {
            return data;
        }
    }

    private ArrayList<DiagnosticSection> sections;
    private String title;

    public DiagnosticsData() {
        this.sections = new ArrayList<>();
    }

    public List<DiagnosticSection> getSections() {
        return Collections.unmodifiableList(sections);
    }

    public String getTitle() {
        return title;
    }
}
