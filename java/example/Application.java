package example;

import com.google.common.base.Strings;

public final class Application {

  public static void main(String[] args) {
    System.out.println("Strings.isNullOrEmpty(\"\") = " + Strings.isNullOrEmpty(""));
  }
}
