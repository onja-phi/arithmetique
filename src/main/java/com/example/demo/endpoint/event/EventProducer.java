package com.example.demo.endpoint.event;

import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
public interface EventProducer<T> extends Consumer<List<T>> {}
