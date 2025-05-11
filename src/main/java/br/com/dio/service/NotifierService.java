package br.com.dio.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifierService {


    private final Map<EventEnum, List<EventListener>> listener = new HashMap<>(){{
        put(EventEnum.CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, final EventListener eventListener) {
        var selectedListener = listener.get(eventType);
        selectedListener.add(eventListener);
    }

    public void notify(final EventEnum eventType) {
        listener.get(eventType).forEach(l -> l.update(eventType));
    }
}
