package com.devsuperior.dspesquisa.resources;

import com.devsuperior.dspesquisa.dto.RecordDto;
import com.devsuperior.dspesquisa.dto.RecordInsertDto;
import com.devsuperior.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/records")
public class RecordResources {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public ResponseEntity<RecordDto> insert(@RequestBody RecordInsertDto dto) {
        RecordDto newDto = recordService.insert(dto);
        return ResponseEntity.ok().body(newDto);
    }
}
