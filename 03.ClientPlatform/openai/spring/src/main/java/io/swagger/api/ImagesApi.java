/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CreateImageRequest;
import io.swagger.model.ImagesResponse;
import org.springframework.core.io.Resource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-31T08:43:25.403038835+09:00[Asia/Tokyo]")
@Validated
public interface ImagesApi {

    @Operation(summary = "Creates an image given a prompt.", description = "", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))) })
    @RequestMapping(value = "/images/generations",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ImagesResponse> createImage(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateImageRequest body);


    @Operation(summary = "Creates an edited or extended image given an original image and a prompt.", description = "", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))) })
    @RequestMapping(value = "/images/edits",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<ImagesResponse> createImageEdit(@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile image, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="prompt", required=true)  String prompt, @Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile mask, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="model", required=true)  Object model, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "10", "1" }, minimum="1", maximum="10"
)) @RequestParam(value="n", required=true)  Integer n, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "256x256", "512x512", "1024x1024" }
)) @RequestParam(value="size", required=true)  String size, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "url", "b64_json" }
)) @RequestParam(value="response_format", required=true)  String responseFormat, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="user", required=true)  String user);


    @Operation(summary = "Creates a variation of a given image.", description = "", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ImagesResponse.class))) })
    @RequestMapping(value = "/images/variations",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<ImagesResponse> createImageVariation(@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile image, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="model", required=true)  Object model, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "10", "1" }, minimum="1", maximum="10"
)) @RequestParam(value="n", required=true)  Integer n, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "url", "b64_json" }
)) @RequestParam(value="response_format", required=true)  String responseFormat, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema(allowableValues={ "256x256", "512x512", "1024x1024" }
)) @RequestParam(value="size", required=true)  String size, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true,schema=@Schema()) @RequestParam(value="user", required=true)  String user);

}

