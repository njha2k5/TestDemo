package Example_TestNG;

import org.testng.annotations.Test;

public class Exam_Grop01 {
  @Test(priority = 0, groups = {"car"})
  public void f() {
  }
  @Test(priority = 3, groups = {"jeep"}, enabled = false)
  public void a() {
  }
  @Test(priority = 2, groups = {"scooter"})
  public void c() {
  }
  @Test(priority = 1, groups = {"cycle"})
  public void q() {
  }
}
