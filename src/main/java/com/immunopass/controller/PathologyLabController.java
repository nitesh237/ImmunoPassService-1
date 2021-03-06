package com.immunopass.controller;

import javax.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.immunopass.model.PathologyLab;


@RestController
@RequestMapping("/v1/pathology_labs")
public interface PathologyLabController {

    @PostMapping("")
    PathologyLab createPathologyLab(@NotNull @RequestBody final PathologyLab pathologyLab);

}
