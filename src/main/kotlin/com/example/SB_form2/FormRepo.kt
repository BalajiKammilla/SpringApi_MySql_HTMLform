package com.example.SB_form2

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestParam

@Repository
interface FormRepo:JpaRepository<FormRequest,Int>