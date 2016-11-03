package fr.ippon.devfest.kpi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by stephane.lagraulet on 02/11/2016.
 */
@SpringBootApplication
open class KpiApp

fun main(args: Array<String>) {
    SpringApplication.run(KpiApp::class.java, *args)
}