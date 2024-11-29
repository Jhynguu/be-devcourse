package com.example.album.mapper;

import com.example.album.dto.AlbumTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface AlbumMapper {
    ArrayList<AlbumTO> list();
    AlbumTO view(AlbumTO to);
    void view_hit(AlbumTO to);
    //void write();
    int write_ok(AlbumTO to);
    String imagename(AlbumTO to);
    AlbumTO modify(AlbumTO to);
    int modify_ok1(AlbumTO to);
    int modify_ok2(AlbumTO to);
    int modify_ok(AlbumTO to);
    AlbumTO delete(AlbumTO to);
    int delete_ok(AlbumTO to);
}
