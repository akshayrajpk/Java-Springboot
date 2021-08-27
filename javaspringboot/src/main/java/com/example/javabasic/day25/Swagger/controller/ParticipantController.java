package com.example.javabasic.day25.Swagger.controller;

import com.example.javabasic.day25.Swagger.model.Participants;
import com.example.javabasic.day25.Swagger.repository.ParticipantRepo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annualday")

public class ParticipantController {

    @Autowired
    private ParticipantRepo participantsRepository;

    @Operation(summary = "This is to fetch All the Participantss stored in Db")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Details of All the Participants",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = "Page not found",
            content = @Content)
    })
    @GetMapping("/Participants/")
    public List<Participants> allParticipantss() {
        return participantsRepository.findAll();
    }

    @Operation(summary = "This is to add  the Participants in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = " Participant details saved in database",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = " Page Not Found",
            content = @Content)
    })
    @PostMapping("/Participants/")
    @ResponseStatus(HttpStatus.CREATED)
    public Participants create(@RequestBody Participants Participants)
    {
        return participantsRepository.save(Participants);
    }

    @Operation(summary = "This is to delete  the Participants in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = " Participant deleted from the database",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = " Page Not Found",
            content = @Content)
    })
    @DeleteMapping("/Participants/{id}")
    public void delete(@PathVariable long id)
    {
        participantsRepository.findById(id);
       
        participantsRepository.deleteById(id);
    }
    @Operation(summary = "This is to update  the Participants in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = " Participant details updated in database",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = " Page Not Found",
            content = @Content)
    })
    @PutMapping("/Participants/{id}")
    public Participants updateParticipants(@RequestBody Participants Participants, @PathVariable Long id) {

        participantsRepository.findById(id);
              
        return participantsRepository.save(Participants);
    }

    @Operation(summary = "This is to get  the details of particular  Participants in the database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = " Participant details fetched from database",
            content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "404",
            description = " Page Not Found",
            content = @Content)
    })
    @GetMapping("/Participants/{id}")
    public Participants find(@PathVariable Long id) {
        return participantsRepository.findById(id).get();
              
    }


}
