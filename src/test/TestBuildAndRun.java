package test;

import java.io.*;

public class TestBuildAndRun {

    public static void main(String[] args) {
        String modulePath = "E:\\tuyensinhdaucap\\demo_test";

        String buildCommand = "mvn.cmd clean package";

        String runCommand = "java -jar E:\\tuyensinhdaucap\\demo_test\\target\\demo_test\\demo_test-0.0.1-SNAPSHOT.jar";

        if (executeCommand(modulePath, buildCommand)) {
            executeCommand(modulePath, runCommand);
        }
    }

    private static boolean executeCommand(String workingDirectory, String command) {
        try {
            // Xác minh rằng thư mục làm việc tồn tại
            File dir = new File(workingDirectory);
            if (!dir.exists()) {
                System.err.println("Working directory does not exist: " + workingDirectory);
                return false;
            }

            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command(command.split(" ")); // Tách lệnh thành các phần tử
            processBuilder.directory(dir); // Thiết lập thư mục làm việc
            Process process = processBuilder.start();
            String filePath = "log_module.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            // Đọc đầu ra từ lệnh
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            writer.close();

            // Đọc lỗi từ lệnh
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                System.err.println(errorLine);
            }

            reader.close();
            errorReader.close();

            // Chờ cho lệnh thực thi xong và kiểm tra trạng thái
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Command executed successfully: " + command);
                return true;
            } else {
                System.out.println("Command failed with exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
