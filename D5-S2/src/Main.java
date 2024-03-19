import java.util.Scanner;
class CollegeUserManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaff;
        System.out.println("Number of Student Users: " + studentUsers);
        System.out.println("Number of Staff Users: " + staffUsers);
        System.out.println("Number of Non-Teaching Staff Users: " + nonTeachingStaff);

        scanner.close();
    }
}
