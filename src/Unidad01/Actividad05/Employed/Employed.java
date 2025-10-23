package Unidad01.Actividad05.Employed;

public class Employed {
    public String name;
    public String role;
    
    public void showResponsabilities() {
        switch (role) {
            case "manager":
                System.out.println("Manager responsibilities:");
                System.out.println("- Lead and coordinate team activities");
                System.out.println("- Make strategic decisions");
                System.out.println("- Manage project timelines");
                System.out.println("- Communicate with stakeholders");
                break;
            case "developer":
                System.out.println("Developer responsibilities:");
                System.out.println("- Write and maintain code");
                System.out.println("- Debug and test applications");
                System.out.println("- Collaborate with team members");
                System.out.println("- Follow coding standards");
                break;
            case "designer":
                System.out.println("Designer responsibilities:");
                System.out.println("- Create user interface designs");
                System.out.println("- Develop visual concepts");
                System.out.println("- Work with UX/UI principles");
                System.out.println("- Prototype and mockup creation");
                break;
            default:
                System.out.println("Unknown role: " + role);
                System.out.println("Please specify a valid role (manager, developer, designer)");
                break;
        }
    }
}
