package fr.ippon.devfest.kpi.web

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController

/**
 * Created by stephane.lagraulet on 02/11/2016.
 */
@RestController
class KpiController(@Value("\${spring.application.name}")
                    private val appName: String, @Value("\${server.port:-1}")
                    private val serverPort: Int) {

    @RequestMapping("/whoami")
    fun whoami(): String {
        return "I am the " + appName.replace("-", " ").toUpperCase() + ", running on port " + serverPort;
    }
}