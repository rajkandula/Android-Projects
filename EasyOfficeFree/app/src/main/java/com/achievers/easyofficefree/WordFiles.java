package com.achievers.easyofficefree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

import com.nbsp.materialfilepicker.MaterialFilePicker;
import com.nbsp.materialfilepicker.ui.FilePickerActivity;


import org.zwobble.mammoth.DocumentConverter;
import org.zwobble.mammoth.Result;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

//jfile


import static org.zwobble.mammoth.internal.util.Base64Encoding.streamToBase64;

public class WordFiles extends AppCompatActivity {
    private static String html;
    //EditText editText;
//    File file = new File(System.getProperty("user.dir"), "sample.docx");

    WebView webView;
     int FILE_PICKER_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        // WebView webView = (WebView) findViewById(R.id.webview);
        //  webView.loadData("", "text/html", "UTF-8");
        //webView.loadUrl("file:///android_asset/sample_doc.html");
        //JFileChooser chooser=new JFileChooser();

        //MaterialFilePicker materialFilePicker = new MaterialFilePicker();

            new MaterialFilePicker().withActivity(this)
                    .withRequestCode(FILE_PICKER_REQUEST_CODE)
                    .withHiddenFiles(true)
                    .start();
    }


        @Override
        protected void onActivityResult ( int requestCode, int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == FILE_PICKER_REQUEST_CODE && resultCode == RESULT_OK) {


                // Do anything with file
                // String text = null;
                try {
                    String filePath = data.getStringExtra(FilePickerActivity.RESULT_FILE_PATH);

                    // assert filePath != null;
                    // File file = new File(file.getAbsolutePath());

                    html = extractWordText(new File(filePath));

                    WebView webView = (WebView) findViewById(R.id.webview);
                    webView.loadData(html, "text/html", "UTF-8");
                    Toast.makeText(WordFiles.this, "Html is not null", Toast.LENGTH_SHORT).show();

                    // webView.loadUrl("file:///android_asset/sample_doc.html");
                    // editText=(EditText)findViewById(R.id.editText);
                    // editText.setText(text);


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    private static String extractWordText(File file) throws IOException {
        //String path = file.getPath();
        String path = file.getAbsolutePath();
        FileInputStream stream = new FileInputStream(file);

        //convert .docx to HTML string
        //  InputStream in= new FileInputStream(new File(path));
        if (path.endsWith(".doc")) {

            // WordExtractor extractor = new WordExtractor(stream);
            //String text = extractor.getText();
            //extractor.close();
            //return text;
            DocumentConverter converter = new DocumentConverter()
                    .imageConverter(image -> {
                        String base64 = streamToBase64(image::getInputStream);
                        html = "data:" + image.getContentType() + ";base64," + base64;
                        Map<String, String> attributes = new HashMap<>();
                        //   attributes.put("src", src);
                        attributes.put("html",html);
                        return attributes;
                    });
            return html;
        } else if (path.endsWith("docx")) {
            // XWPFDocument document = new XWPFDocument(stream);
            // XWPFWordExtractor extractor = new XWPFWordExtractor(document);
            // String text = extractor.getText();
            //extractor.close();
            //return text;
            DocumentConverter converter = new DocumentConverter();
            Result<String> result = converter.convertToHtml(new File(String.valueOf(file)));
            html = result.getValue(); // The generated HTML
            Set<String> warnings = result.getWarnings(); // Any warnings during conversion
            return html;
        } else {
            stream.close();
            throw new IOException("This file is not a Word file");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch(requestCode){
            case 1000:{
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Permission Granted!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }

}
