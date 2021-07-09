package com.dio.live.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class CustomErrorController implements ErrorController {
}
