package com.example.SB_form2

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class FormController(private val formRepo: FormRepo) {

    @GetMapping("/get")
    fun GetAll():List<FormRequest>{
       return formRepo.findAll()
    }

    @PostMapping("/submit")
    fun submitForm(@RequestParam("id") id:Int, @RequestParam("name") name: String, @RequestParam("email") email: String): FormRequest {
        val formReq=FormRequest(id =id, name = name, email = email)
        return  formRepo.save(formReq)


    }
}