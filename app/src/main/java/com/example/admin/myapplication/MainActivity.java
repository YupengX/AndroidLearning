package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webview; //定义一个WebView的变量
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview =(WebView)findViewById(R.id.webview);
        //通过findViewById关联activity_main.xml 定义的组件，
        // 所以之后需要在activity_main.xml 定义一个webview的组件
        //设置WebView 属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.baidu.com");
        //WebViewClient类 作用：处理各种通知 和请求事件
        webview.setWebViewClient(new HelloWebViewClient());
    }

}
//Web视图
class HelloWebViewClient extends WebViewClient {
    @Override
    //这个方法，在web页面打开链接时，自动调用android自带的浏览器打开链接
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}