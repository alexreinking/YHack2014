package utils;

import java.util.Optional;
import scala.language.implicitConversions;

object OptionUtils {
  implicit def optional2Option[A](optional: Optional[A]): Option[A] = {
    return optional.map[Option[A]](
      new java.util.function.Function[A, Option[A]] {
        def apply(value: A): Option[A] = Some(value);
      }
    ).orElseGet(new java.util.function.Supplier[Option[A]] {
      def get(): Option[A] = None
    });
  }
}
