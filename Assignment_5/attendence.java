import java.io.*;
class Attendance {
    public static void main(String[] args) {
        try {
            String path = "Text/";
            BufferedReader br = new BufferedReader(new FileReader(path + "Attendance.txt"));
            BufferedWriter shortage = new BufferedWriter(new FileWriter(path + "Shortage.txt"));
            BufferedWriter eligible = new BufferedWriter(new FileWriter(path + "Eligible.txt"));
            String line;
            String highestStudent = "";
            double highest = -1;
            while ((line = br.readLine()) != null) {
                try {
                    String[] p = line.split(",");
                    if (p.length != 4)
                        throw new Exception();
                    int roll = Integer.parseInt(p[0]);
                    String name = p[1];
                    int total = Integer.parseInt(p[2]);
                    int present = Integer.parseInt(p[3]);
                    if (total <= 0 || present < 0 || present > total)
                        throw new Exception();
                    double attendance = (present * 100.0) / total;
                    String data = roll + " " + name + " Attendance=" + attendance + "%";
                    if (attendance < 75) {
                        System.out.println(data);
                        shortage.write(data);
                        shortage.newLine();
                    }
                    else {
                        eligible.write(data);
                        eligible.newLine();
                    }
                    if (attendance > highest) {
                        highest = attendance;
                        highestStudent = name;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid record: " + line);
                }
            }
            System.out.println("Highest Attendance: " + highestStudent + " = " + highest + "%");
            br.close();
            shortage.close();
            eligible.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}