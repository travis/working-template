(ns leiningen.new.working-template
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "working-template"))

(defn working-template
  "FIXME: write documentation"
  [name]
  (prn "Using working template 0.2.0-SNAPSHOT")
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' working-template project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
