// FeatureFileGenerator.java

package org.example.cucumber.utils;

import java.io.FileWriter;
import java.util.List;

public class FeatureFileGenerator {

    public static void generateFeatureFile() {

        try {

            List<String> links = ExcelUtils.getAllLinks();

            StringBuilder content = new StringBuilder();

            content.append("Feature: OpenWeather Testing\n\n");

            for (String link : links) {

                content.append("Scenario: UI Testing - Click ")
                        .append(link)
                        .append(" Page\n");

                content.append("Given user opens weather website\n");
                content.append("When user clicks \"")
                        .append(link)
                        .append("\" link\n");
                content.append("Then user should navigate successfully\n\n");
            }

            content.append("Scenario: API Testing - Validate Weather API\n");
            content.append("Then validate weather API\n");

            FileWriter writer = new FileWriter(
                    "src/test/resources/features/weather.feature"
            );

            writer.write(content.toString());
            writer.close();

            System.out.println("Feature file generated successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}