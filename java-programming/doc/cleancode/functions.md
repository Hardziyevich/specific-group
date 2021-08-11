# Functions

- Do one thing: Function should have only one task, and it should do it well.
- One level of abstraction per function: Content of a function should be in the same abstraction level.
- Reading codes from top to bottom: Function should be readable as a text. Local variables should be instantiated close to their place of usage.
- Function arguments: Having zero argument is perfect, one to two arguments should be tolerable, more than three arguments should be avoided.
- No side effects: Function should not have any side effects, it should do only its task.
- Avoid duplicates.
- Avoid transitive navigation.

```java
public class Functions {
    private IncomeRepository incomeRepository;
    private ExpenseRepository expenseRepository;
    private UserRepository userRepository;
    private UserService userService;
    private VersionService versionService;
    private ReleaseService releaseService;
    private EnvironmentService environmentService;
    // 1. Do one thing
    // Bad
    public void saveCashFlow(Income income, Expense expense) {
        incomeRepository.save(income);
        expenseRepository.save(expense);
    }
    // Good
    public void saveIncome(Income income) {
        incomeRepository.save(income);
    }
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    // 2. One level of abstraction per function
    // avoid this:
    // following method is exposing a rest endpoint in higher level of abstraction
    // on the other hand it also saves user in much lower level of absatraction
    // This function should only expose rest endpoint and delegate another lower level service to save data in database
    // Bad
    @PostMapping("/user")
    public User saveSomeUser(User user) {
        return userRepository.save(user);
    }
    //Good
    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }
    // method in UsersService
    public User save(User user) {
        return userRepository.save(user);
    }

    // 3. Reading code from top to bottom
    public void bulkUpdateUser(List<User> users) {
        // get Users from repository
        // update all Users one by one
        // save Users List in repository
    }

    // 4. Function arguments
    public void save() { // good
    }

    public void saveAUser(User user) { // tolerable
    }

    public void saveAUser(String userName, User user) { // tolerable
    }

    public void saveAUser(String userName, User user, Date date) { // should be avoided, Date can be property of User Object
    }

    public void saveAUser(String userName, User user, Date date, boolean isAdmin) { // should be avoided, isAdmin can be property of User Object
    }

    // 5. No side effects
    public User saveOneUser(User user) {
        // if statement should be avoided, why saveOneUser action is changing role of a user?
        if(user.isAdmin()){
            user.setRole(user);
        }

        return userRepository.save(user);
    }

    // 6. Avoid Duplicates
    // Bad
    public Environment getAnEnvironment() {
        String version = versionService.getVersion();
        return environmentService.getEnvironment(version);
    }

    public Release getARelease() {
        String version = versionService.getVersion();
        return releaseService.getRelease(version);
    }

    // Good
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() { // so changes in versionService will be done one time instead of changing two methods
        return versionService.getVersion();
    }

    // 7. Avoid transitive navigations
    // Avoid this kind transitive dependency, instead of this create one get privileges() method in Group class
    List<Privilege> privileges = getGroup().getUser().getRole().getPrivileges();

    Group getGroup() {
        return new Group();
    }
    // Dependencies
    private static class Income {
    }

    private static class Expense {
    }

    private static class Privilege {
    }

    private static class Group {
        private User user;

        public User getUser() {
            return user;
        }
    }

    private static class User {
        private User role;
        private List<Privilege> privileges;

        boolean isAdmin() {
            return false;
        }

        public User getRole() {
            return role;
        }

        public void setRole(User role) {
            this.role = role;
        }

        public List<Privilege> getPrivileges() {
            return privileges;
        }
    }

    private static class Environment {
    }

    private static class Release {
    }

    private static class IncomeRepository {
        void save(Income income) {
        }
    }

    private static class ExpenseRepository {
        void save(Expense expense) {
        }
    }

    private static class UserRepository {
        User save(User user) {
            return user;
        }
    }

    private static class UserService {
        User save(User user) {
            return user;
        }
    }

    private static class VersionService {
        String getVersion() {
            return "";
        }
    }

    private static class ReleaseService {
        Release getRelease(String version) {
            return new Release();
        }
    }

    private static class EnvironmentService {
        Environment getEnvironment(String version) {
            return new Environment();
        }
    }

    private @interface PostMapping {
        String value() default "";
    }
}
```