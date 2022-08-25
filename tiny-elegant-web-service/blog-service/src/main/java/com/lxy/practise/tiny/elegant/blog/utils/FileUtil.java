package com.lxy.practise.tiny.elegant.blog.utils;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * file工具类
 * @author luo
 * @date 2022/05/23 00:32
 **/
public class FileUtil {
    private static void addFileToZip(ZipOutputStream zos, File base, File file)
            throws IOException {
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file)) {
            String name = base.toURI().relativize(file.toURI()).getPath();
            zos.putNextEntry(new ZipEntry(name));
            int length;
            while ((length = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, length);
            }
            zos.flush();
        } finally {
            zos.closeEntry();
        }
    }

    /**
     * 通过流打包下载文件
     *
     * @param out
     * @param fileName
     * @param
     */
    public static void zipFilesByInputStream(ZipOutputStream out, String fileName, InputStream is) throws Exception {
        byte[] buf = new byte[1024];
        try {
            out.putNextEntry(new ZipEntry(fileName));
            int len;
            while ((len = is.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            is.close();
        } catch (Exception e) {
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public void zip(File zipFile, List<File> files) throws IOException {
        final int BUFFER_SIZE = 2048;

        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile)));

        for (File file : files) {
            byte[] data = new byte[BUFFER_SIZE];

            try(FileInputStream fileInputStream = new FileInputStream( file )) {

                try(BufferedInputStream origin = new BufferedInputStream(fileInputStream, BUFFER_SIZE)) {
                    ZipEntry entry = new ZipEntry(file.getName());

                    out.putNextEntry(entry);
                    int count;
                    while ((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
                        out.write(data, 0, count);
                    }

                }
            }
        }

        out.close();
    }
}
