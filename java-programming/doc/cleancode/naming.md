# Naming

- Use intention revealing names: Name of a class, function or variable should tell you what it is all about.
- Avoid misinformation: Naming should not lead to false information. A variable should not be called <i>incomeList</i>, 
  unless it is a List in terms of Computer Science.
- No need for prefixes: e.g., You don’t need to name input parameters with prefix <i>p*</i>.
- Avoid mental mapping: Don’t rely on that, users will associate the naming same as you. e.g., variable <i>r</i> is not always <i>url</i> for everybody.
- Class’ names should be noun, function names should be verb.
- Pick one word for concept: If you used the word <i>create</i> for one action, don’t use the word <i>generate</i> in other places for the same context.
- Use Solution Domain Names: Try to use Computer Science Terms. Use class name <i>AccountFacade</i> if it corresponds to <i>Facade Pattern</i>.
- Use Problem Domain Names: If there is no relevant Computer Science term for the specific case, refer to domain/use case.
- Don’t use too long namings.
- Use constants, enums instead of magic numbers, abbreviations.

```java
public class Naming {
  // 1. Use intention revealing names
  // Good
  public Date modifiedDate;
  public List<Testcase> findAllTestcasesByUser(User user){ return Collections.emptyList(); };
  // Bad
  public Date d; // modified date
  public List<Testcase> find(User user){ return Collections.emptyList(); }; //find all Testcases by User

  // 2. Avoid misinformation
  // Good
  {
    List<Account> AccountList;
  }
  // Bad
  {
    Account[] AccountList; // use Suffix List, if it is really a List
  }

  // 3. No need for prefixes
  // Good
  void deleteUser(User user){};
  // Bad
  void deletePUser(User pUser){}; // no need for prefix p for parameters

  // 4. Avoid mental mapping
  // Good
  public URL url;
  // Bad
  public URL r; // not everybody would think r will be url

  // 5. Class names should be noun, function names should be verb
  // Good
  public class TableRepresenter {};
  public void saveCar(){};
  // Bad
  public class TableRepresent{};
  public void car(){}; // unless it is constrcutor

  // 6. Pick one word for concept
  // Good
  public void saveUser(){};
  public void saveAccount(){};
  public void saveContract(){};
  // Bad
  public void savePerson(){};
  public void createAccount(){};
  public void generateContract(){};

  // 7. Use Solution Domain Names
  // Good
  public class AccountFactory{} // Factory Pattern
  public class AccountObserver{} // Observer Pattern

  // 8. Use Problem Domain Names
  // Good
  public class User {}; // taking "User" as a Use Case for same context
  public String userName;
  public void editUser(User user){};

  // 9. Don't use too long namings
  // Good
  public void saveUnderage(){};
  public class UserFiller {};
  // Bad
  public void saveIfUserUnder18(){};
  public class UserFormRealTimeFiller {};

  // 10. Use constants, enums instead of magic numbers, abbreviations
  // Good
  public enum Calendar {
    DAYS_IN_YEAR(360),
    HOURS_IN_WEEK(168);

    private int value;

    Calendar(int value) {
      this.value = value;
    }
  }
  // Bad
  public int daysInYear = 360;
  public int hoursInWeek = 168;

  public class Testcase {}
  public class Account{}
}
```