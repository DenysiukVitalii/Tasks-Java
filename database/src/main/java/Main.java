/**
 * Created by Віталій on 18.04.2017.
 */
public class Main {
    DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433", "username", "password");
}
