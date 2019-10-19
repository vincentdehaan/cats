package cats
package tests

class InvariantSuite extends CatsSuite {
  /*val zMod2 = new Invariant[Semigroup[Int]] {
    override def imap[B](fa: Semigroup[Int])(f: Int => B)(g: B => Int): Semigroup[B] =
      new Semigroup[Int] {
        def combine(a: Int, b: B) = fa.combine(a, b)
      }
  }*/
}
