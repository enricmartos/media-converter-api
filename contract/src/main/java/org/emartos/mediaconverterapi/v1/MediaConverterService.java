package org.emartos.mediaconverterapi.v1;

import org.emartos.mediaconverterapi.v1.exceptions.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;


//@RestController
@RequestMapping(MediaConverterServiceApi.MEDIA_CONVERTER_API_PATH + MediaConverterServiceApi.VERSION)
public interface MediaConverterService {

    /**
     * Returns the image resized
     *
     * @param apiKey
     * @param form image uploaded as a form
     * @return image resized
     * @throws BadRequestException
     */
//    @Consumes(MediaType.MULTIPART_FORM_DATA)
//    @Produces("image/jpeg")
//    @PostMapping("/image/resize")
//    Response resizeImage(@RequestHeader("apiKey") String apiKey, @MultipartForm ResizeFileUploadForm form)
//            throws BadRequestException;

    @GetMapping("/health-check")
    HashMap<String, String> indexApi();
}
