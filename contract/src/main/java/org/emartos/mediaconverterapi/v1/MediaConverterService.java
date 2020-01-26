package org.emartos.mediaconverterapi.v1;

import org.emartos.mediaconverterapi.v1.exceptions.BadRequestException;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;


//@RestController
@RequestMapping(MediaConverterServiceApi.MEDIA_CONVERTER_API_PATH + MediaConverterServiceApi.VERSION)
public interface MediaConverterService {

    @PostMapping("/image/resize")
    ResponseEntity<Resource> resizeImage(@RequestHeader("apiKey") String apiKey, @RequestParam("selectedFile") MultipartFile file,
                                                @RequestParam("width") Integer width, @RequestParam("height") Integer height)
            throws BadRequestException;

    @PostMapping("/image/autorotate")
    ResponseEntity<Resource> autorotateImage(@RequestHeader("apiKey") String apiKey,
                                                    @RequestParam("file") MultipartFile file) throws BadRequestException;

    @GetMapping("/health-check")
    HashMap<String, String> indexApi();
}
