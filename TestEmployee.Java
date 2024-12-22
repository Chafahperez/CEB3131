public class TestEmployee {
    public static void main(String[] args) {
        CompensationModel commissionModel = new CommissionCompensationModel(10000, 0.1);
        CompensationModel basePlusCommissionModel = new BasePlusCommissionCompensationModel(5000, 0.05, 300);

        Employee employee1 = new Employee("Alice", "Smith", "123-45-6789", commissionModel);
        Employee employee2 = new Employee("Bob", "Johnson", "987-65-4321", basePlusCommissionModel);

        System.out.println(employee1);
        System.out.println(employee2);

        // Changing CompensationModel
        employee1.setCompensationModel(basePlusCommissionModel);
        System.out.println("After promotion:");
        System.out.println(employee1);
    }
}
