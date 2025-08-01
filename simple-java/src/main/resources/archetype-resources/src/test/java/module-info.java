module ${moduleName}.test {
  requires transitive ${moduleName};
  requires transitive org.junit.jupiter.api;
  requires transitive org.assertj.core;

  opens ${package}.test to org.junit.platform.commons;
}
