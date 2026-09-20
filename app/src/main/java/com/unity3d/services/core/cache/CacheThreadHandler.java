package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Code duplicated, block: B:143:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.unity3d.services.core.request.WebRequest] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.unity3d.services.core.cache.CacheThreadHandler] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3, types: [long] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    private void downloadFile(String str, String str2, int i, int i2, final int i3, HashMap<String, List<String>> map, boolean z) throws Throwable {
        char c;
        char c2;
        WebRequest webRequest;
        int i4;
        ?? r3;
        WebRequest webRequest2;
        int i5;
        ?? r4;
        WebRequest webRequest3;
        int i6;
        ?? r5;
        WebRequest webRequest4;
        int i7;
        ?? r6;
        WebRequest webRequest5;
        int i8;
        ?? r7;
        WebRequest webRequest6;
        int i9;
        boolean z2;
        ?? r8;
        FileOutputStream fileOutputStream;
        ?? r2;
        ?? r1;
        Throwable th;
        FileOutputStream fileOutputStream2;
        Object obj;
        char c3;
        boolean z3;
        WebRequest webRequest7;
        int i10;
        boolean z4;
        WebRequest webRequest8;
        int i11;
        boolean z5;
        WebRequest webRequest9;
        int i12;
        boolean z6;
        WebRequest webRequest10;
        int i13;
        boolean z7;
        WebRequest webRequest11;
        int i14;
        boolean z8;
        WebRequest webRequest12;
        int i15;
        boolean z9;
        ?? r9 = z;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        if (r9 != 0) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + str2 + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
        }
        ?? r10 = 1;
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        ?? ElapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                FileOutputStream fileOutputStream4 = new FileOutputStream(file, (boolean) r9);
                try {
                    WebRequest webRequest13 = getWebRequest(str, i, i2, map);
                    this._currentRequest = webRequest13;
                    webRequest13.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j, long j2) {
                            if (i3 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i3) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j), Long.valueOf(j2));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j, int i16, Map<String, List<String>> map2) {
                            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(file.length() + j), Integer.valueOf(i16), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream4);
                    this._active = false;
                    c = 1;
                    c2 = 2;
                    fileOutputStream2 = fileOutputStream4;
                    try {
                        postProcessDownload(ElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders());
                        this._currentRequest = null;
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e) {
                            DeviceLog.exception("Error closing stream", e);
                            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        }
                    } catch (NetworkIOException e2) {
                        e = e2;
                        webRequest12 = null;
                        i15 = 3;
                        z9 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest6 = webRequest12;
                        i9 = i15;
                        z2 = z9;
                        DeviceLog.exception("Network error", e);
                        this._active = z2;
                        WebViewApp currentApp = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr = new Object[i9];
                        objArr[z2 ? 1 : 0] = CacheError.NETWORK_ERROR;
                        objArr[c] = str;
                        objArr[c2] = e.getMessage();
                        currentApp.sendEvent(webViewEventCategory, cacheEvent, objArr);
                        this._currentRequest = webRequest6;
                        r9 = webRequest6;
                        ElapsedRealtime = i9;
                        r10 = z2;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest6;
                                ElapsedRealtime = i9;
                                r10 = z2;
                            } catch (Exception e3) {
                                DeviceLog.exception("Error closing stream", e3);
                                WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr2 = new Object[i9];
                                objArr2[z2 ? 1 : 0] = CacheError.FILE_IO_ERROR;
                                objArr2[c] = str;
                                String message = e3.getMessage();
                                objArr2[c2] = message;
                                currentApp2.sendEvent(webViewEventCategory2, cacheEvent2, objArr2);
                                r9 = message;
                                ElapsedRealtime = objArr2;
                                r10 = z2;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        webRequest11 = null;
                        i14 = 3;
                        z8 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest5 = webRequest11;
                        i8 = i14;
                        r7 = z8;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = r7;
                        WebViewApp currentApp3 = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory3 = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr3 = new Object[i8];
                        objArr3[r7] = CacheError.FILE_IO_ERROR;
                        objArr3[c] = str;
                        objArr3[c2] = e.getMessage();
                        currentApp3.sendEvent(webViewEventCategory3, cacheEvent3, objArr3);
                        this._currentRequest = webRequest5;
                        r9 = webRequest5;
                        ElapsedRealtime = i8;
                        r10 = r7;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest5;
                                ElapsedRealtime = i8;
                                r10 = r7;
                            } catch (Exception e5) {
                                DeviceLog.exception("Error closing stream", e5);
                                WebViewApp currentApp4 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory4 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr4 = new Object[i8];
                                objArr4[r7] = CacheError.FILE_IO_ERROR;
                                objArr4[c] = str;
                                String message2 = e5.getMessage();
                                objArr4[c2] = message2;
                                currentApp4.sendEvent(webViewEventCategory4, cacheEvent4, objArr4);
                                r9 = message2;
                                ElapsedRealtime = objArr4;
                                r10 = r7;
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        webRequest10 = null;
                        i13 = 3;
                        z7 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest2 = webRequest10;
                        i5 = i13;
                        r4 = z7;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = r4;
                        WebViewApp currentApp5 = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory5 = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr5 = new Object[i5];
                        objArr5[r4] = CacheError.FILE_IO_ERROR;
                        objArr5[c] = str;
                        objArr5[c2] = e.getMessage();
                        currentApp5.sendEvent(webViewEventCategory5, cacheEvent5, objArr5);
                        this._currentRequest = webRequest2;
                        r9 = webRequest2;
                        ElapsedRealtime = i5;
                        r10 = r4;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest2;
                                ElapsedRealtime = i5;
                                r10 = r4;
                            } catch (Exception e7) {
                                DeviceLog.exception("Error closing stream", e7);
                                WebViewApp currentApp6 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory6 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr6 = new Object[i5];
                                objArr6[r4] = CacheError.FILE_IO_ERROR;
                                objArr6[c] = str;
                                String message3 = e7.getMessage();
                                objArr6[c2] = message3;
                                currentApp6.sendEvent(webViewEventCategory6, cacheEvent6, objArr6);
                                r9 = message3;
                                ElapsedRealtime = objArr6;
                                r10 = r4;
                            }
                        }
                    } catch (IllegalStateException e8) {
                        e = e8;
                        webRequest9 = null;
                        i12 = 3;
                        z6 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest4 = webRequest9;
                        i7 = i12;
                        r6 = z6;
                        DeviceLog.exception("Illegal state", e);
                        this._active = r6;
                        WebViewApp currentApp7 = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory7 = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent7 = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr7 = new Object[i7];
                        objArr7[r6] = CacheError.ILLEGAL_STATE;
                        objArr7[c] = str;
                        objArr7[c2] = e.getMessage();
                        currentApp7.sendEvent(webViewEventCategory7, cacheEvent7, objArr7);
                        this._currentRequest = webRequest4;
                        r9 = webRequest4;
                        ElapsedRealtime = i7;
                        r10 = r6;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest4;
                                ElapsedRealtime = i7;
                                r10 = r6;
                            } catch (Exception e9) {
                                DeviceLog.exception("Error closing stream", e9);
                                WebViewApp currentApp8 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory8 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent8 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr8 = new Object[i7];
                                objArr8[r6] = CacheError.FILE_IO_ERROR;
                                objArr8[c] = str;
                                String message4 = e9.getMessage();
                                objArr8[c2] = message4;
                                currentApp8.sendEvent(webViewEventCategory8, cacheEvent8, objArr8);
                                r9 = message4;
                                ElapsedRealtime = objArr8;
                                r10 = r6;
                            }
                        }
                    } catch (MalformedURLException e10) {
                        e = e10;
                        webRequest8 = null;
                        i11 = 3;
                        z5 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest3 = webRequest8;
                        i6 = i11;
                        r5 = z5;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = r5;
                        WebViewApp currentApp9 = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory9 = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent9 = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr9 = new Object[i6];
                        objArr9[r5] = CacheError.MALFORMED_URL;
                        objArr9[c] = str;
                        objArr9[c2] = e.getMessage();
                        currentApp9.sendEvent(webViewEventCategory9, cacheEvent9, objArr9);
                        this._currentRequest = webRequest3;
                        r9 = webRequest3;
                        ElapsedRealtime = i6;
                        r10 = r5;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest3;
                                ElapsedRealtime = i6;
                                r10 = r5;
                            } catch (Exception e11) {
                                DeviceLog.exception("Error closing stream", e11);
                                WebViewApp currentApp10 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory10 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent10 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr10 = new Object[i6];
                                objArr10[r5] = CacheError.FILE_IO_ERROR;
                                objArr10[c] = str;
                                String message5 = e11.getMessage();
                                objArr10[c2] = message5;
                                currentApp10.sendEvent(webViewEventCategory10, cacheEvent10, objArr10);
                                r9 = message5;
                                ElapsedRealtime = objArr10;
                                r10 = r5;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        webRequest7 = null;
                        i10 = 3;
                        z4 = false;
                        fileOutputStream3 = fileOutputStream2;
                        webRequest = webRequest7;
                        i4 = i10;
                        r3 = z4;
                        DeviceLog.exception("Unknown error", e);
                        this._active = r3;
                        WebViewApp currentApp11 = WebViewApp.getCurrentApp();
                        WebViewEventCategory webViewEventCategory11 = WebViewEventCategory.CACHE;
                        CacheEvent cacheEvent11 = CacheEvent.DOWNLOAD_ERROR;
                        Object[] objArr11 = new Object[i4];
                        objArr11[r3] = CacheError.UNKNOWN_ERROR;
                        objArr11[c] = str;
                        objArr11[c2] = e.getMessage();
                        currentApp11.sendEvent(webViewEventCategory11, cacheEvent11, objArr11);
                        this._currentRequest = webRequest;
                        r9 = webRequest;
                        ElapsedRealtime = i4;
                        r10 = r3;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                r9 = webRequest;
                                ElapsedRealtime = i4;
                                r10 = r3;
                            } catch (Exception e13) {
                                DeviceLog.exception("Error closing stream", e13);
                                WebViewApp currentApp12 = WebViewApp.getCurrentApp();
                                WebViewEventCategory webViewEventCategory12 = WebViewEventCategory.CACHE;
                                CacheEvent cacheEvent12 = CacheEvent.DOWNLOAD_ERROR;
                                Object[] objArr12 = new Object[i4];
                                objArr12[r3] = CacheError.FILE_IO_ERROR;
                                objArr12[c] = str;
                                String message6 = e13.getMessage();
                                objArr12[c2] = message6;
                                currentApp12.sendEvent(webViewEventCategory12, cacheEvent12, objArr12);
                                r9 = message6;
                                ElapsedRealtime = objArr12;
                                r10 = r3;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        c3 = 3;
                        z3 = false;
                        r8 = z3;
                        fileOutputStream = fileOutputStream2;
                        r1 = obj;
                        r2 = c3;
                        int i16 = r2;
                        th = th;
                        this._currentRequest = r1;
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception e14) {
                            DeviceLog.exception("Error closing stream", e14);
                            WebViewApp currentApp13 = WebViewApp.getCurrentApp();
                            WebViewEventCategory webViewEventCategory13 = WebViewEventCategory.CACHE;
                            CacheEvent cacheEvent13 = CacheEvent.DOWNLOAD_ERROR;
                            Object[] objArr13 = new Object[i16];
                            objArr13[r8] = CacheError.FILE_IO_ERROR;
                            objArr13[c] = str;
                            objArr13[c2] = e14.getMessage();
                            currentApp13.sendEvent(webViewEventCategory13, cacheEvent13, objArr13);
                            throw th;
                        }
                    }
                } catch (NetworkIOException e15) {
                    e = e15;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest12 = null;
                    i15 = 3;
                    z9 = false;
                    c = 1;
                    c2 = 2;
                } catch (FileNotFoundException e16) {
                    e = e16;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest11 = null;
                    i14 = 3;
                    z8 = false;
                    c = 1;
                    c2 = 2;
                } catch (IOException e17) {
                    e = e17;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest10 = null;
                    i13 = 3;
                    z7 = false;
                    c = 1;
                    c2 = 2;
                } catch (IllegalStateException e18) {
                    e = e18;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest9 = null;
                    i12 = 3;
                    z6 = false;
                    c = 1;
                    c2 = 2;
                } catch (MalformedURLException e19) {
                    e = e19;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest8 = null;
                    i11 = 3;
                    z5 = false;
                    c = 1;
                    c2 = 2;
                } catch (Exception e20) {
                    e = e20;
                    fileOutputStream2 = fileOutputStream4;
                    webRequest7 = null;
                    i10 = 3;
                    z4 = false;
                    c = 1;
                    c2 = 2;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream4;
                    obj = null;
                    c3 = 3;
                    z3 = false;
                    c = 1;
                    c2 = 2;
                }
            } catch (NetworkIOException e21) {
                e = e21;
                webRequest6 = null;
                i9 = 3;
                z2 = false;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (FileNotFoundException e22) {
                e = e22;
                webRequest5 = null;
                i8 = 3;
                r7 = 0;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (IllegalStateException e23) {
                e = e23;
                webRequest4 = null;
                i7 = 3;
                r6 = 0;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (MalformedURLException e24) {
                e = e24;
                webRequest3 = null;
                i6 = 3;
                r5 = 0;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (IOException e25) {
                e = e25;
                webRequest2 = null;
                i5 = 3;
                r4 = 0;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (Exception e26) {
                e = e26;
                webRequest = null;
                i4 = 3;
                r3 = 0;
                c = 1;
                c2 = 2;
                fileOutputStream3 = null;
            } catch (Throwable th4) {
                th = th4;
                r9 = 0;
                ElapsedRealtime = 3;
                r10 = 0;
                fileOutputStream3 = null;
                c = 1;
                c2 = 2;
                r8 = r10;
                fileOutputStream = fileOutputStream3;
                r1 = r9;
                r2 = ElapsedRealtime;
                int i17 = r2;
                th = th;
                this._currentRequest = r1;
                if (fileOutputStream == null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            r8 = r10;
            fileOutputStream = fileOutputStream3;
            r1 = r9;
            r2 = ElapsedRealtime;
            int i18 = r2;
            th = th;
            this._currentRequest = r1;
            if (fileOutputStream == null) {
                throw th;
            }
            fileOutputStream.close();
            throw th;
        }
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + jElapsedRealtime + "ms");
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap<String, List<String>> map2 = new HashMap<>();
            for (String str : data.keySet()) {
                map2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            map = map2;
        } else {
            map = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, map, z);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
