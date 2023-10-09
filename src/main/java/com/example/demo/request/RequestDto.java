package com.example.demo.request;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.module.ModuleFinder;

public class RequestDto {

  @Autowired
  private ModelMapper modelMapper;



  private String name="name of Request";
  private int price=10;
}
