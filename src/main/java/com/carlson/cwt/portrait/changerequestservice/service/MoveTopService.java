package com.carlson.cwt.portrait.changerequestservice.service;

import com.carlson.cwt.portrait.changerequestservice.generated.api.MovetopApiDelegate;
import com.carlson.cwt.portrait.changerequestservice.generated.models.MoveTopRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MoveTopService implements MovetopApiDelegate {

    @Override
    public ResponseEntity<String> movetop(MoveTopRequest body) {
        body.setNewTop("Move top");
        return new ResponseEntity<>(body.toString(), HttpStatus.OK);
    }
}
