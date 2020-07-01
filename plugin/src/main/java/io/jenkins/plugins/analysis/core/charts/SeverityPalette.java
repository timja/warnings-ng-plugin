package io.jenkins.plugins.analysis.core.charts;

import edu.hm.hafner.analysis.Severity;

import io.jenkins.plugins.echarts.JenkinsPalette;

/**
 * Provides colors for {@link Severity}.
 *
 * @author Ullrich Hafner
 */
final class SeverityPalette {
    /**
     * Returns the color of UI elements for the specified severity.
     *
     * @param severity
     *         the severity to get the color for
     *
     * @return color of the specified severity
     */
    static JenkinsPalette getColor(final Severity severity) {
        if (severity == Severity.ERROR) {
            return JenkinsPalette.DATA_RED_MEDIUM;
        }
        if (severity == Severity.WARNING_HIGH) {
            return JenkinsPalette.DATA_ORANGE_LIGHT;
        }
        if (severity == Severity.WARNING_NORMAL) {
            return JenkinsPalette.DATA_YELLOW_LIGHT;
        }
        if (severity == Severity.WARNING_LOW) {
            return JenkinsPalette.DATA_GREEN_LIGHT;
        }
        return JenkinsPalette.DATA_AQUA_LIGHT;
    }

    private SeverityPalette() {
        // prevents instantiation
    }
}
