package com.amnon.crazypic;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.amnon.crazypic.entiry.MyBitmap;
import com.amnon.ddplist.xml.plist.PListXMLParser;
import com.amnon.ddplist.xml.plist.PListXMLHandler;
import com.amnon.ddplist.xml.plist.domain.Dict;
import com.amnon.ddplist.xml.plist.domain.PList;
import com.amnon.ddplist.xml.plist.domain.PListObject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                PListXMLParser parser = new PListXMLParser(); // 基于SAX的实现
                PListXMLHandler handler = new PListXMLHandler();
                parser.setHandler(handler);
                try {
                    InputStream is = getAssets().open("ui/ui_shop.plist");
                    parser.parse(is);
                } catch (IllegalStateException iae) {
                    iae.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                PList actualPlist = ((PListXMLHandler) parser.getHandler()).getPlist();
                Dict root = (Dict) actualPlist.getRootElement();
                Map<String, PListObject> rootMap = root.getConfigMap();

                System.out.println("_____________________\n\n\n__________________\n\n\n");
                // System.out.println(rootMap.toString());

                Set<String> mainKey = rootMap.keySet();
                for(int i = 0; i< mainKey.size(); i++){
                    System.out.println("=======================");
                    System.out.println(mainKey.iterator().next());
                }
//                while (mainKey.iterator().hasNext()) {
//                    // String key = mainKey.iterator().next();
//                    // if (key.equals("frames")) {
//                    // Dict bitmapDicts = (Dict) rootMap.get("frames");
//                    //
//                    // Map<String, PListObject> bitMaps = bitmapDicts.getConfigMap();
//                    //
//                    // Set<String> bitMapsKeySets = bitMaps.keySet();
//                    //
//                    // Map<String, MyBitmap> myBitmaps = new HashMap<String, MyBitmap>();
//                    // String bitmapKey;
//                    // Dict bitmapDict;
//                    // Map<String, PListObject> bitmaps;
//                    // MyBitmap myBitmap;
//                    // if (bitMapsKeySets.iterator().hasNext()){
//                    // bitmapKey = bitMapsKeySets.iterator().next();
//                    // bitmapDict = (Dict) bitMaps.get(bitmapKey);
//                    // bitmaps = bitmapDict.getConfigMap();
//                    //
//                    // myBitmap = new MyBitmap();
//                    //
//                    // Set<String> bitmapSets = bitmaps.keySet();
//                    // // 遍历每个对象
//                    // if (bitmapSets.iterator().hasNext()){
//                    // String itemKey = bitmapSets.iterator().next();
//                    //
//                    // if (itemKey.equals("frame")) {
//                    // com.amnon.ddplist.xml.plist.domain.String itmeStr =
//                    // (com.amnon.ddplist.xml.plist.domain.String) bitmaps.get(itemKey);
//                    // myBitmap.setFrame(itmeStr.getValue());
//                    // }
//                    //
//                    // if (itemKey.equals("offset")){
//                    // com.amnon.ddplist.xml.plist.domain.String itmeStr =
//                    // (com.amnon.ddplist.xml.plist.domain.String) bitmaps.get(itemKey);
//                    //
//                    // myBitmap.setOffset(itmeStr.getValue());
//                    // }
//                    // if (itemKey.equals("rotated")) {
//                    // com.amnon.ddplist.xml.plist.domain.False itmeboolean =
//                    // (com.amnon.ddplist.xml.plist.domain.False) bitmaps.get(itemKey);
//                    // myBitmap.setRotated(itmeboolean.getValue());
//                    // }
//                    // if (itemKey.equals("sourceColorRect")){
//                    // com.amnon.ddplist.xml.plist.domain.String itmeStr =
//                    // (com.amnon.ddplist.xml.plist.domain.String) bitmaps.get(itemKey);
//                    //
//                    // myBitmap.setSourceColorRect(itmeStr.getValue());
//                    // }
//                    // if (itemKey.equals("sourceSize")){
//                    // com.amnon.ddplist.xml.plist.domain.String itmeStr =
//                    // (com.amnon.ddplist.xml.plist.domain.String) bitmaps.get(itemKey);
//                    //
//                    // myBitmap.setSourceSize(itmeStr.getValue());
//                    // }
//                    //
//                    // }
//                    // System.out.println("___________________________________________\n\n\n");
//                    // System.out.println(myBitmap.toString());
//                    // myBitmaps.put(bitmapKey, myBitmap);
//                    //
//                    // }
//                    //
//                    // }else{
//                    //
//                    // // if (key.equals("metadata")){
//                    // Dict metadata = (Dict) rootMap.get("metadata");
//                    // Map<String, PListObject> metadataMap = metadata.getConfigMap();
//                    // while (metadataMap.keySet().iterator().hasNext()) {
//                    // String metadataKey = metadataMap.keySet().iterator().next();
//                    // System.out.println("___________________________________________\n\n\n");
//                    // System.out.println("each key for metadataKey is " + metadataKey);
//                    // PListObject plo = metadataMap.get(metadataKey);
//                    // System.out.println(plo.toString());
//                    //
//                    // }
//                    //
//                    // }
//                    //
//                }
            }
        }).start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
