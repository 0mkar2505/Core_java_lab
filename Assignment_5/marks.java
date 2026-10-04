import java.io.*; 
class Marks {
    public static void main(String[] args) {
        try {
            String path = "Text/";
            BufferedReader br = new BufferedReader(new FileReader(path + "Marks.txt"));
            BufferedWriter result = new BufferedWriter(new FileWriter(path + "Result.txt"));
            BufferedWriter failed = new BufferedWriter(new FileWriter(path + "FailedStudents.txt"));
            String line;
            String failedStudents = "";
            String topper = "";
            double highest = -1;
            while ((line = br.readLine()) != null) {
                try {
                    String[] p = line.split(",");
                    if (p.length != 5)
                        throw new Exception();
                    int roll = Integer.parseInt(p[0]);
                    String name = p[1];
                    int s1 = Integer.parseInt(p[2]);
                    int s2 = Integer.parseInt(p[3]);
                    int s3 = Integer.parseInt(p[4]);
                    if (s1 < 0 || s1 > 100 || s2 < 0 || s2 > 100 ||
                        s3 < 0 || s3 > 100)
                        throw new Exception();
                    int total = s1 + s2 + s3;
                    double percentage = total / 3.0;
                    String grade;
                    if (percentage >= 75)
                        grade = "A";
                    else if (percentage >= 60)
                        grade = "B";
                    else if (percentage >= 50)
                        grade = "C";
                    else if (percentage >= 40)
                        grade = "D";
                    else
                        grade = "F";
                    String data = roll + " " + name + " Total=" + total +
                                  " Percentage=" + percentage + " Grade=" + grade;
                    result.write(data);
                    result.newLine();
                    if (percentage > highest) {
                        highest = percentage;
                        topper = name;
                    }
                    if (s1 < 40 || s2 < 40 || s3 < 40) {
                        failed.write(data);
                        failed.newLine();
                        failedStudents += name + " ";
                    }
                } catch (Exception e) {
                    System.out.println("Invalid record: " + line);
                }
            }
            result.close();
            failed.close();
            br.close();
            System.out.println("Topper: " + topper);
            System.out.println("Failed Students: " + failedStudents);
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}