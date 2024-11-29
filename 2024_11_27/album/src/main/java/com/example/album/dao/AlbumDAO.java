package com.example.album.dao;


import com.example.album.dto.AlbumTO;
import com.example.album.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;

@Repository
public class AlbumDAO {

    @Autowired
    private AlbumMapper albumMapper;

    public ArrayList<AlbumTO> boardList() {
        return albumMapper.list();
    }

    public AlbumTO boardView(AlbumTO to) {
        albumMapper.view_hit(to);
        return albumMapper.view(to);
    }

    public int boardWriteOk(AlbumTO to) {
        int flag = 1;

        int result = albumMapper.write_ok(to);

        if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public AlbumTO boardModify(AlbumTO to) {
        return albumMapper.modify(to);
    }

    public int boardModifyOK(AlbumTO to) {
        int flag = 2;

        String newFilename = to.getImagename();
        String oldFilename = albumMapper.imagename(to);

        int result = 0;
        if (newFilename != null) {
            // 새로운 파일 업로드 (O)
            result = albumMapper.modify_ok1(to);
        } else {
            // 새로운 파일 업로드 (X)
            result = albumMapper.modify_ok2(to);
        }

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
            if (newFilename != null && oldFilename != null) {
                new File("C:\\java\\2024_11_27\\album\\src\\main\\resources\\static\\upload", oldFilename).delete();
            }
        }

        return flag;
    }

    public  AlbumTO boardDelete(AlbumTO to) {
        return albumMapper.delete(to);
    }

    public int boardDeleteOK(AlbumTO to) {
        int flag = 2;

        String imagename = albumMapper.imagename(to);
        int result = albumMapper.delete_ok(to);

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
            // 실제 파일 삭제
            if (imagename != null) {
                new File("C:\\java\\2024_11_27\\board02\\src\\main\\resources\\static\\upload", imagename).delete();
            }
        }

        return flag;
    }

}
