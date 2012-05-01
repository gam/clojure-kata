(defproject {{name}} "1.0.0-SNAPSHOT"
  :description "Clojure implementation of the '{{name}}' kata."
  :url "http://github.com/gam/clojure-katas/{{name}}"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.4.0-beta1"]]}}
  :min-lein-version "2.0.0")
