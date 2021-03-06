(ns cljfx.fx.path-element
  (:require [cljfx.composite :as composite]
            [cljfx.lifecycle :as lifecycle])
  (:import [javafx.scene.shape PathElement]))

(set! *warn-on-reflection* true)

(def props
  (composite/props PathElement
    :absolute [:setter lifecycle/scalar :default true]))
