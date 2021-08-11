package com.github.akarazhev.jacademy.jprog.cleancode;

public class ErrorHandling {
    private final static Object USER_ALREADY_EXISTS = 1;
    private UserRepository userRepository;
    private ResultHandler resultHandler;
    private OwnerRepository ownerRepository;
    private SimulationService simulationService;
    // 1. Use Exceptions rather than returning code
    // Good
    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception){
            // detail here
        }

        resolveGroup(user);
        return userRepository.save(user);
    }
    // Bad
    public Object createAUser(User user) {
        if(loadUser(user.getId()) instanceof User){
            // user already exists
            return USER_ALREADY_EXISTS; // error flag
//            return 101; // or error code
        }

        resolveGroup(user);
        return userRepository.save(user);
    }

    // 2. Use Try-Catch-Finally Statements
    // Good
    public void handleSimulation(Simulation simulation) {
        try{
            resultHandler.handle(simulation);
        } catch (Throwable t){
            Log.error("failed to save result", t);
        } finally {
            simulationService.remove(simulation); // with finally we try to have consistent state if something goes wrong
        }
    }
    // 3. Provide context
    // Good
    public void validateOwner(String ownerId) {
        if (ownerRepository.countTestcasesForOwner(ownerId) == 0) {
            throw new ValidationException("owner: " + ownerId + " does not have any testcases. Testcases should be populated...");
        }
    }
    // Bad
    public void validateAnOwner(String ownerId) {
        if (ownerRepository.countTestcasesForOwner(ownerId) == 0) {
            throw new ValidationException("no valid owner...");
        }
    }
    // 4. Don't return null, Don't pass null
    // Bad
    // returning null
    public User createBUser(User user) {
        if(loadUser(user.getId()) instanceof User) {
            // user already exists
            return null;
        }

        resolveGroup(user);
        return userRepository.save(user);
    }
    // passing null
    public User editUser(String userId, User user) {
        if(userId == null){
            // new user
            throw new UserException("new user can't be edited...");
        }

        return userRepository.update(user);
    }
    // Dependency
    static class Log {
        private static void error(String message, Throwable t) {
        }
    }

    private static class User {
        public int getId() {
            return 0;
        }
    }

    private static class UserRepository {
        User save(User user) {
            return user;
        }

        User update(User user) {
            return user;
        }
    }

    private static class OwnerRepository {
        int countTestcasesForOwner(String ownerId) {
            return 0;
        }
    }

    private static class UserException extends RuntimeException {
        public UserException(String message) {
            super(message);
        }
    }

    private static class UserExistsException extends RuntimeException {
        public UserExistsException(int i) {
        }
    }

    private static class UserNotFoundException extends RuntimeException {
    }

    private static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
        }
    }

    private User loadUser(int id) {
        return new User();
    }

    private void resolveGroup(User user) {
    }

    private static class Simulation {
    }

    private static class ResultHandler {
        void handle(Simulation simulation) {
        }
    }

    private static class SimulationService {
        void remove(Simulation simulation) {
        }
    }
}