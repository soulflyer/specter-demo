(defproject specter-demo "0.1.0-SNAPSHOT"
  :description "Specter demo"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.rpl/specter "1.1.2"]
                 [clj-time "0.14.2"]]
  :repl-options {:init-ns specter-demo.core})
