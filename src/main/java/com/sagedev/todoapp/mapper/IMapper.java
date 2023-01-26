package com.sagedev.todoapp.mapper;

public interface IMapper <I,O>{
    public O map(I in);
}
