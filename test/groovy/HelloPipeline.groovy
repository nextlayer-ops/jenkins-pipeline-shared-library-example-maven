#!/usr/bin/env groovy

import com.lesfurets.jenkins.unit.global.lib.Library

@Library('nextlayerci-example@master') _

import io.nextlayer.ci.UtilExample

def execute() {
    node() {
        stage("First") {
            echo "Something"
            sayHello "Traveller"
        }
        stage("Middle") {
            UtilExample util = new UtilExample()
            echo util.doSomething()
        }
        stage("Last") {
            echo "We're done"
        }
    }
}

return this