package ch04

//reminder open means extendable (closed by default)
open class BaseUser(val nickname: String) { //user got ide warning of redeclaration of user (same pachage I bet has a User

}

//subclass extends super class BaseUser
class TwitterUser(nickname: String) : BaseUser(nickname) { //note no val on nickname. passing it to super
}

open class Button()