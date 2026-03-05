package com.example.GymNacionApplication.service;

import com.example.GymNacionApplication.dtos.DiaRutinaRequestDTO;
import com.example.GymNacionApplication.dtos.DiaRutinaResponseDTO;
import com.example.GymNacionApplication.mappers.DiaRutinaMapper;
import com.example.GymNacionApplication.model.DiaRutina;
import com.example.GymNacionApplication.repository.DiaRutinaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiaRutinaServiceImp implements IDiaRutinaService {

    private final DiaRutinaRepository diaRutinaRepository;
    private final DiaRutinaMapper diaRutinaMapper;


    @Override
    public DiaRutinaResponseDTO guardarDia(DiaRutinaRequestDTO dto) {
        DiaRutina diaRutina = diaRutinaMapper.toEntity(dto);
        DiaRutina guardada = diaRutinaRepository.save(diaRutina);
        return diaRutinaMapper.toDto(guardada);
    }

}