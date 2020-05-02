package org.emartos.mediaconverterapi.v1;

import org.emartos.mediaconverterapi.v1.exceptions.BadRequestException;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;


@RequestMapping(MediaConverterServiceApi.MEDIA_CONVERTER_API_PATH + MediaConverterServiceApi.VERSION)
public interface VideoService {

    @PostMapping("/video/trim")
    ResponseEntity<Resource> trimVideo(@RequestHeader("apiKey") String apiKey, @RequestParam("selectedFile") MultipartFile file,
                                         @RequestParam("startMinute") Integer startMinute, @RequestParam("startSecond") Integer startSecond,
                                         @RequestParam("endMinute") Integer endMinute, @RequestParam("endSecond") Integer endSecond)

            throws BadRequestException;

}
