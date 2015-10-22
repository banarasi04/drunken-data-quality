package de.frosner.ddq.core

sealed trait ConstraintResult {

  val message: String

}

case class ConstraintSuccess(message: String) extends ConstraintResult

case class ConstraintFailure(message: String) extends ConstraintResult
