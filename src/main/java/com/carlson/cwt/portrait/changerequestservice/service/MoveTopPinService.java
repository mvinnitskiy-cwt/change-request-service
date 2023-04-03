package com.carlson.cwt.portrait.changerequestservice.service;

import com.carlson.cwt.portrait.changerequestservice.generated.api.MovetoppinApiDelegate;
import com.carlson.cwt.portrait.changerequestservice.generated.models.MoveTopPinRequest;
import com.carlson.cwt.portrait.changerequestservice.generated.models.MoveTopRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MoveTopPinService implements MovetoppinApiDelegate {
    @Override
    public ResponseEntity<String> movetoppin(MoveTopPinRequest body) {
        body.setNewTop("Move top pin");
        return new ResponseEntity<>(body.toString(), HttpStatus.OK);
    }
}
