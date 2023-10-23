package com.example.myapplication_test4.homework

import com.example.myapplication_test4.homework.model.Member
import com.example.myapplication_test4.homework.service.LoginTest
import java.util.Scanner

class MainTest {

}

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    println("name 입력해주세요: ")
    val name = scanner.nextLine()

    println("password 입력해주세요: ")
    val password = scanner.nextLine()

    val member = Member(name,password)

    //println("member(더미 데이터)의 입력된 값 확인 : ${member.name}, ${member.password}")
    LoginTest.loginLogic(member)





}