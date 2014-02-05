(defproject log-retriever "0.1.0-SNAPSHOT"
  :description "webapp log retriever."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[clj-http            "0.7.8"]
                 [org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [ring/ring-devel "1.2.1"]
                 [ring-basic-authentication "1.0.3"]
                 [environ "0.4.0"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}})
