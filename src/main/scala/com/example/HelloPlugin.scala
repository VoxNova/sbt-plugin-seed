package com.example

import sbt._
import sbt.Keys.{ streams, target }
import java.nio.charset.Charset

/**
 * This plugin helps you which operating systems are awesome
 */
object HelloPlugin extends AutoPlugin {

  /**
   * Defines all settings/tasks that get automatically imported,
   * when the plugin is enabled
   */
  object autoImport {
    val hello = inputKey[Unit]("Prints Hello")
  }

  import autoImport._

  /**
   * Provide default settings
   */
  override def projectSettings: Seq[Setting[_]] = Seq(
    helloSetting
  )

  def helloSetting: Setting[_] = hello := {
    // Sbt provided logger.
    val log = streams.value.log
    log.info("Hello task")
  }

}