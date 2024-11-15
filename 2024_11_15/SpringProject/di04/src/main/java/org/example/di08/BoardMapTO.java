package org.example.di08;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
public class BoardMapTO {
    private HashMap<String, String> userMaps;
    private HashMap<String, BoardTO> boardMaps;


}
