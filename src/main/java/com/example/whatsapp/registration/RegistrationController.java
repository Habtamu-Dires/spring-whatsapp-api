package com.example.whatsapp.registration;

import com.example.whatsapp.api_response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<AuthenticationResponse>> register(
            @RequestBody RegisterRequest request
    ) {
        AuthenticationResponse res
                = authenticationService.register(request);
        return ResponseEntity.ok(new ApiResponse<>(
                         true,
                         res,
                         "user successfully registered"
                 )
         );
    }

}
