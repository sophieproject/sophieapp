package com.google.appinventor.components.runtime.util;

import android.os.Environment;
import android.util.Log;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.RuntimeError;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;

public class FileUtil {
    private static final String DIRECTORY_DOWNLOADS = "Downloads";
    private static final String DIRECTORY_PICTURES = "Pictures";
    private static final String DIRECTORY_RECORDINGS = "Recordings";
    private static final String DOCUMENT_DIRECTORY = "My Documents/";
    private static final String FILENAME_PREFIX = "app_inventor_";
    private static final String LOG_TAG = FileUtil.class.getSimpleName();

    private FileUtil() {
    }

    public static String getFileUrl(String localFileName) {
        return new File(localFileName).toURI().toString();
    }

    @Deprecated
    public static byte[] readFile(String inputFileName) throws IOException {
        Log.w(LOG_TAG, "Calling deprecated function readFile", new IllegalAccessException());
        return readFile(Form.getActiveForm(), inputFileName);
    }

    public static byte[] readFile(Form form, String inputFileName) throws IOException {
        int bytesRead;
        File inputFile = new File(inputFileName);
        if (!inputFile.isFile()) {
            throw new FileNotFoundException("Cannot find file: " + inputFileName);
        }
        FileInputStream inputStream = null;
        try {
            inputStream = openFile(form, inputFileName);
            int fileLength = (int) inputFile.length();
            byte[] content = new byte[fileLength];
            int offset = 0;
            do {
                bytesRead = inputStream.read(content, offset, fileLength - offset);
                if (bytesRead > 0) {
                    offset += bytesRead;
                }
                if (offset != fileLength) {
                    break;
                    break;
                }
                break;
            } while (bytesRead >= 0);
            return content;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Deprecated
    public static FileInputStream openFile(String fileName) throws IOException, PermissionException {
        Log.w(LOG_TAG, "Calling deprecated function openFile", new IllegalAccessException());
        return openFile(Form.getActiveForm(), fileName);
    }

    public static FileInputStream openFile(Form form, String fileName) throws IOException, PermissionException {
        if (MediaUtil.isExternalFile(form, fileName)) {
            form.assertPermission("android.permission.READ_EXTERNAL_STORAGE");
        }
        return new FileInputStream(fileName);
    }

    @Deprecated
    public static FileInputStream openFile(File file) throws IOException, PermissionException {
        Log.w(LOG_TAG, "Calling deprecated function openFile", new IllegalAccessException());
        return openFile(Form.getActiveForm(), file.getAbsolutePath());
    }

    public static FileInputStream openFile(Form form, File file) throws IOException, PermissionException {
        return openFile(form, file.getAbsolutePath());
    }

    @Deprecated
    public static FileInputStream openFile(URI fileUri) throws IOException, PermissionException {
        Log.w(LOG_TAG, "Calling deprecated function openFile", new IllegalAccessException());
        return openFile(Form.getActiveForm(), fileUri);
    }

    public static FileInputStream openFile(Form form, URI fileUri) throws IOException, PermissionException {
        if (MediaUtil.isExternalFileUrl(form, fileUri.toString())) {
            form.assertPermission("android.permission.READ_EXTERNAL_STORAGE");
        }
        return new FileInputStream(new File(fileUri));
    }

    public static String downloadUrlToFile(String url, String outputFileName) throws IOException {
        InputStream in = new URL(url).openStream();
        try {
            return writeStreamToFile(in, outputFileName);
        } finally {
            in.close();
        }
    }

    public static String writeFile(byte[] array, String outputFileName) throws IOException {
        InputStream in = new ByteArrayInputStream(array);
        try {
            return writeStreamToFile(in, outputFileName);
        } finally {
            in.close();
        }
    }

    public static String copyFile(String inputFileName, String outputFileName) throws IOException {
        InputStream in = new FileInputStream(inputFileName);
        try {
            return writeStreamToFile(in, outputFileName);
        } finally {
            in.close();
        }
    }

    public static String writeStreamToFile(InputStream in, String outputFileName) throws IOException {
        File file = new File(outputFileName);
        file.getParentFile().mkdirs();
        OutputStream out = new FileOutputStream(file);
        try {
            copy(in, out);
            return file.toURI().toString();
        } finally {
            out.flush();
            out.close();
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        OutputStream out2 = new BufferedOutputStream(out, 4096);
        InputStream in2 = new BufferedInputStream(in, 4096);
        while (true) {
            int b = in2.read();
            if (b == -1) {
                out2.flush();
                return;
            }
            out2.write(b);
        }
    }

    @Deprecated
    public static File getPictureFile(String extension) throws IOException, FileException {
        Log.w(LOG_TAG, "Calling deprecated function getPictureFile", new IllegalAccessException());
        return getPictureFile(Form.getActiveForm(), extension);
    }

    public static File getPictureFile(Form form, String extension) throws IOException, FileException {
        return getFile(form, DIRECTORY_PICTURES, extension);
    }

    @Deprecated
    public static File getRecordingFile(String extension) throws IOException, FileException {
        return getRecordingFile(Form.getActiveForm(), extension);
    }

    public static File getRecordingFile(Form form, String extension) throws IOException, FileException {
        return getFile(form, DIRECTORY_RECORDINGS, extension);
    }

    @Deprecated
    public static File getDownloadFile(String extension) throws IOException, FileException {
        Log.w(LOG_TAG, "Calling deprecated function getDownloadFile", new IllegalAccessException());
        return getDownloadFile(Form.getActiveForm(), extension);
    }

    public static File getDownloadFile(Form form, String extension) throws IOException, FileException {
        return getFile(form, DIRECTORY_DOWNLOADS, extension);
    }

    private static File getFile(Form form, String category, String extension) throws IOException, FileException {
        return getExternalFile(form, DOCUMENT_DIRECTORY + category + "/" + FILENAME_PREFIX + System.currentTimeMillis() + "." + extension);
    }

    @Deprecated
    public static File getExternalFile(String fileName) throws IOException, FileException, SecurityException {
        return getExternalFile(Form.getActiveForm(), fileName);
    }

    public static File getExternalFile(Form form, String fileName) throws IOException, FileException, SecurityException {
        checkExternalStorageWriteable();
        File file = new File(QUtil.getExternalStoragePath(form), fileName);
        File directory = file.getParentFile();
        if (form != null) {
            form.assertPermission("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!directory.exists() && !directory.mkdirs()) {
            throw new IOException("Unable to create directory " + directory.getAbsolutePath());
        } else if (!file.exists() || file.delete()) {
            return file;
        } else {
            throw new IOException("Cannot overwrite existing file " + file.getAbsolutePath());
        }
    }

    public static void checkExternalStorageWriteable() throws FileException {
        String state = Environment.getExternalStorageState();
        if (!"mounted".equals(state)) {
            if ("mounted_ro".equals(state)) {
                throw new FileException(ErrorMessages.ERROR_MEDIA_EXTERNAL_STORAGE_READONLY);
            }
            throw new FileException(ErrorMessages.ERROR_MEDIA_EXTERNAL_STORAGE_NOT_AVAILABLE);
        }
    }

    public static class FileException extends RuntimeError {
        private final int msgNumber;

        public FileException(int errorMsgNumber) {
            this.msgNumber = errorMsgNumber;
        }

        public int getErrorMessageNumber() {
            return this.msgNumber;
        }
    }
}
