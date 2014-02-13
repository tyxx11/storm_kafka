(defproject storm/storm-kafka "0.7.1-SNAPSHOT"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :dependencies [[storm/kafka "0.7.0-incubating"
                   :exclusions [org.apache.zookeeper/zookeeper
                                log4j/log4j]]]
  :dev-dependencies [[storm "0.7.1"]
                     [org.clojure/clojure "1.2.0"]]
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"]
)
