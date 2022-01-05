public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatureData = new float[patientsCount];
        for (int i = 0; i < temperatureData.length; i++) {
            temperatureData[i] = 32.0f + 8.0f * (float) Math.random();
        }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {
        int healthyPatients = 0;
        float averageTemperature = 0;
        StringBuilder report = new StringBuilder("Температуры пациентов:");

        for (int i = 0; i < temperatureData.length; i++) {
            if(temperatureData[i] >= 36.2f && temperatureData[i] <= 36.9f) {
                ++healthyPatients;
            }
            report.append(" ").append(String.format("%2.1f", temperatureData[i]));
            averageTemperature += temperatureData[i];
        }
        averageTemperature = averageTemperature / temperatureData.length;

        report.append(System.lineSeparator())
                .append("Средняя температура: ")
                .append(String.format("%2.2f", averageTemperature))
                .append(System.lineSeparator())
                .append("Количество здоровых: ")
                .append(healthyPatients);

        return report.toString();
    }

}
