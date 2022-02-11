import jdk.jshell.Diag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagnosticSection {

    static class Builder {

        private DiagnosticSection section;

        public Builder(String title) {
            this.section = new DiagnosticSection(title);
        }

        public Builder addContent(String content) {
            this.section.addContent(content);
            return this;
        }

        public DiagnosticSection build() {
            return section;
        }

    }

    private String title;
    private ArrayList<String> content;

    public DiagnosticSection(String title) {
        this.title = title;
        this.content = new ArrayList<>();
    }

    private void addContent(String content) {
        this.content.add(content);
    }

    public List<String> getContent() {
        return Collections.unmodifiableList(content);
    }

    public String getTitle() {
        return title;
    }
}
