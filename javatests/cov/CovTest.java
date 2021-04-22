package cov;
import junit.framework.TestCase;
import java.io.*;
import java.nio.channels.*;
import java.net.InetAddress;
public class CovTest extends TestCase {
  private static Process startSubprocess(String arg) throws Exception {
   String path = System.getenv("TEST_SRCDIR") + "/main/java/cov/Cov_deploy.jar";
    String[] command = {
      // Run the deploy jar by invoking JVM because the integration tests
      // cannot use the java launcher (b/29388516).
      System.getProperty("java.home") + "/bin/java", "-jar", path, arg
    };
    ProcessBuilder pb = new ProcessBuilder(command);
    pb.environment().clear();
    return pb.start();
  }
  public void testTrivial() throws Exception {
    Process subprocessTrue = startSubprocess("true");
    Process subprocessFalse = startSubprocess("false");
    subprocessTrue.waitFor();
    subprocessFalse.waitFor();
    String line;
    BufferedReader input = new BufferedReader(new InputStreamReader(subprocessTrue.getInputStream()));
    while ((line = input.readLine()) != null) {
      System.out.println(line);
     }
    input.close();
    BufferedReader err = new BufferedReader(new InputStreamReader(subprocessTrue.getErrorStream()));
    while ((line = err.readLine()) != null) {
      System.out.println(line);
     }
    err.close();

    input = new BufferedReader(new InputStreamReader(subprocessFalse.getInputStream()));
    while ((line = input.readLine()) != null) {
      System.out.println(line);
     }
    input.close();
    err = new BufferedReader(new InputStreamReader(subprocessFalse.getErrorStream()));
    while ((line = err.readLine()) != null) {
      System.out.println(line);
     }
    err.close();
  }
}
