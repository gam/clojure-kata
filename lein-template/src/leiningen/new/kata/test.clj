(ns {{name}}.kata-test
  (:use {{name}}.kata
        [clojure.test :only (deftest testing is are with-test)]))

(deftest initial-test
  (testing "initial test context"
    (is false "Tests should be written")))
