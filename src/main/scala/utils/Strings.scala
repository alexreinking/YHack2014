package utils;

object Strings {
  def addArticle(name: String): String = if (name.charAt(0).isUpper) {
    return "the " + name;
  } else if (List('a', 'e', 'i', 'o', 'u').contains(name.charAt(0))) {
    return "an " + name;
  } else {
    return "a " + name;
  }
}
