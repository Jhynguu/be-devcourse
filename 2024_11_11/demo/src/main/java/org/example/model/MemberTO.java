package org.example.model;

import lombok.*;

//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@ToString
@Data
public class MemberTO {
    @NonNull private String deptno;
    @NonNull private String dname;
    private String loc;
}
