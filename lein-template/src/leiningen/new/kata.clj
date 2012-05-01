(ns leiningen.new.kata
    (:require [leiningen.new.templates :as t]))

(defn kata
  "Generate the project skeleton for a new Clojure kata."
  [name]
  (let [render (t/renderer "kata")
        data {:name name
              :dir (t/sanitize name)}]
    (t/->files data
               [".gitignore" (render "gitignore" data)]
               ["README.md" (render "README.md" data)]
               ["src/{{dir}}/kata.clj" (render "kata.clj" data)]
               ["test/{{dir}}/kata_test.clj" (render "test.clj" data)]
               ["project.clj" (render "project.clj" data)]))
  (println "Generated new project skeleton for" name "kata."))
