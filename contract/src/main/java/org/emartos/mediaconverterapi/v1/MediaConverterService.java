package org.emartos.mediaconverterapi.v1;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.emartos.mediaconverterapi.v1.exceptions.BadRequestException;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;


@RequestMapping(MediaConverterServiceApi.MEDIA_CONVERTER_API_PATH + MediaConverterServiceApi.VERSION)
public interface MediaConverterService {

    @PostMapping("/image/resize")
    @ApiOperation(value = "Resizes an image", notes = "Provide an image and the desired width and height")
    ResponseEntity<Resource> resizeImage(@ApiParam(value = "Api key value")
            @RequestHeader("apiKey") String apiKey,
            @ApiParam(value = "Input image")
            @RequestParam("selectedFile") MultipartFile file,
            @ApiParam(value = "Desired width")
            @RequestParam("width") Integer width,
            @ApiParam(value = "Desired height")
            @RequestParam("height") Integer height)
            throws BadRequestException;

    @PostMapping("/image/autorotate")
    @ApiOperation(value = "Autorotates an image", notes = "Provide an image")
    ResponseEntity<Resource> autorotateImage(
            @ApiParam(value = "Api key value")
            @RequestHeader("apiKey") String apiKey,
            @ApiParam(value = "Input image")
            @RequestParam("selectedFile") MultipartFile file) throws BadRequestException;

    @GetMapping("/health-check")
    HashMap<String, String> healthCheck();
}
