package com.google.android.gms.internal.ads;

import defpackage.ft;
import defpackage.q96;
import defpackage.t96;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzclc extends zzckz {
    public static final Set B = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat C = new DecimalFormat("#,###");
    public static final /* synthetic */ int zzd = 0;
    public boolean A;
    public final File z;

    public zzclc(zzciw zzciwVar) {
        super(zzciwVar);
        File cacheDir = this.w.getCacheDir();
        if (cacheDir == null) {
            zzcgn.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.z = file;
        if (!file.isDirectory() && !file.mkdirs()) {
            zzcgn.zzj("Could not create preload cache directory at ".concat(String.valueOf(file.getAbsolutePath())));
            this.z = null;
        } else {
            if (file.setReadable(true, false) && file.setExecutable(true, false)) {
                return;
            }
            zzcgn.zzj("Could not set cache file permissions at ".concat(String.valueOf(file.getAbsolutePath())));
            this.z = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzb() {
        this.A = true;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0404  */
    /* JADX WARN: Code duplicated, block: B:171:0x041b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0437  */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x0404, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:171:0x041b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzq(final String str) {
        int i;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        Object obj;
        String str6;
        int responseCode;
        String str7;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.z == null) {
            zzc(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.z;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzs)).intValue()) {
                File file3 = new File(this.z, zzcgg.zze(str));
                File file4 = new File(this.z, String.valueOf(file3.getName()).concat(".done"));
                if (file3.isFile() && file4.isFile()) {
                    long length = file3.length();
                    zzcgn.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzcgg.zza.post(new t96(this, str, file3.getAbsolutePath(), (int) length));
                    return true;
                }
                String strConcat = String.valueOf(this.z.getAbsolutePath()).concat(String.valueOf(str));
                Set set = B;
                synchronized (set) {
                    if (set.contains(strConcat)) {
                        zzcgn.zzj("Stream cache already in progress at " + str);
                        zzc(str, file3.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    String str8 = "error";
                    try {
                        HttpURLConnection httpURLConnectionZzn = zzfoq.zza().zzn(new zzfpb() { // from class: com.google.android.gms.internal.ads.zzclb
                            @Override // com.google.android.gms.internal.ads.zzfpb
                            public final URLConnection zza() throws IOException {
                                String str9 = str;
                                Set set2 = zzclc.B;
                                com.google.android.gms.ads.internal.zzt.zzx();
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzx)).intValue();
                                URL url = new URL(str9);
                                int i2 = 0;
                                while (true) {
                                    i2++;
                                    if (i2 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                    zzcgm zzcgmVar = new zzcgm(null);
                                    zzcgmVar.zzc(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    zzcgmVar.zze(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    zzcgn.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (!(httpURLConnectionZzn instanceof HttpURLConnection) || (responseCode = httpURLConnectionZzn.getResponseCode()) < 400) {
                            int contentLength = httpURLConnectionZzn.getContentLength();
                            if (contentLength < 0) {
                                zzcgn.zzj("Stream cache aborted, missing content-length header at " + str);
                                zzc(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat);
                                return false;
                            }
                            String str9 = C.format(contentLength);
                            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzt)).intValue();
                            if (contentLength > iIntValue) {
                                zzcgn.zzj("Content length " + str9 + " exceeds limit at " + str);
                                StringBuilder sb = new StringBuilder();
                                sb.append("File too big for full file cache. Size: ");
                                sb.append(str9);
                                zzc(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                set.remove(strConcat);
                                return false;
                            }
                            zzcgn.zze("Caching " + str9 + " bytes from " + str);
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                ft ftVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
                                long jB = ftVarZzB.b();
                                com.google.android.gms.ads.internal.util.zzbz zzbzVar = new com.google.android.gms.ads.internal.util.zzbz(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzw)).longValue());
                                long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzv)).longValue();
                                int i2 = 0;
                                while (true) {
                                    int i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                    if (i3 >= 0) {
                                        i2 += i3;
                                        try {
                                            try {
                                                if (i2 > iIntValue) {
                                                    String str10 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                                    throw new IOException("stream cache file size limit exceeded");
                                                }
                                                try {
                                                    byteBufferAllocate.flip();
                                                    while (channel.write(byteBufferAllocate) > 0) {
                                                    }
                                                    byteBufferAllocate.clear();
                                                    if (ftVarZzB.b() - jB > 1000 * jLongValue) {
                                                        String str11 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                        throw new IOException("stream cache time limit exceeded");
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferAllocate;
                                                    if (this.A) {
                                                        throw new IOException("abort requested");
                                                    }
                                                    if (zzbzVar.zzb()) {
                                                        str5 = str8;
                                                        try {
                                                            str6 = strConcat;
                                                            fileOutputStream = fileOutputStream3;
                                                            try {
                                                                try {
                                                                    zzcgg.zza.post(new q96(this, str, file3.getAbsolutePath(), i2, contentLength));
                                                                } catch (RuntimeException e) {
                                                                    e = e;
                                                                }
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                            }
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                            fileOutputStream = fileOutputStream3;
                                                            str6 = strConcat;
                                                            str2 = str6;
                                                            obj = str5;
                                                            fileOutputStream2 = fileOutputStream;
                                                            str4 = 0;
                                                            str3 = obj;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream2.close();
                                                            if (this.A) {
                                                                zzcgn.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                zzcgn.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file3.exists()) {
                                                                zzcgn.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                            }
                                                            zzc(str, file3.getAbsolutePath(), str3, str4);
                                                            B.remove(str2);
                                                            return false;
                                                        } catch (RuntimeException e4) {
                                                            e = e4;
                                                            fileOutputStream = fileOutputStream3;
                                                            str6 = strConcat;
                                                            str2 = str6;
                                                            obj = str5;
                                                            fileOutputStream2 = fileOutputStream;
                                                            str4 = 0;
                                                            str3 = obj;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream2.close();
                                                            if (this.A) {
                                                                zzcgn.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                zzcgn.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file3.exists()) {
                                                                zzcgn.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                            }
                                                            zzc(str, file3.getAbsolutePath(), str3, str4);
                                                            B.remove(str2);
                                                            return false;
                                                        }
                                                    } else {
                                                        fileOutputStream = fileOutputStream3;
                                                        str6 = strConcat;
                                                        str5 = str8;
                                                    }
                                                    byteBufferAllocate = byteBuffer;
                                                    readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                    str8 = str5;
                                                    zzbzVar = zzbzVar;
                                                    strConcat = str6;
                                                    channel = channel;
                                                    fileOutputStream3 = fileOutputStream;
                                                    iIntValue = iIntValue;
                                                } catch (IOException | RuntimeException e5) {
                                                    e = e5;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = strConcat;
                                                    str5 = str8;
                                                }
                                                str2 = str6;
                                                obj = str5;
                                                fileOutputStream2 = fileOutputStream;
                                                str4 = 0;
                                                str3 = obj;
                                            } catch (IOException | RuntimeException e6) {
                                                e = e6;
                                                obj = zzbzVar;
                                                str2 = str6;
                                            }
                                        } catch (IOException | RuntimeException e7) {
                                            e = e7;
                                            str3 = zzbzVar;
                                            str4 = byteBufferAllocate;
                                            str2 = str6;
                                            fileOutputStream2 = fileOutputStream;
                                        }
                                    } else {
                                        fileOutputStream = fileOutputStream3;
                                        str6 = strConcat;
                                        str5 = str8;
                                        fileOutputStream.close();
                                        if (zzcgn.zzm(3)) {
                                            zzcgn.zze("Preloaded " + C.format(i2) + " bytes from " + str);
                                        }
                                        file3.setReadable(true, false);
                                        if (file4.isFile()) {
                                            file4.setLastModified(System.currentTimeMillis());
                                        } else {
                                            try {
                                                file4.createNewFile();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        zzcgg.zza.post(new t96(this, str, file3.getAbsolutePath(), i2));
                                        str2 = str6;
                                        try {
                                            B.remove(str2);
                                            return true;
                                        } catch (IOException e8) {
                                            e = e8;
                                        } catch (RuntimeException e9) {
                                            e = e9;
                                        }
                                    }
                                }
                            } catch (IOException | RuntimeException e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream3;
                                str2 = strConcat;
                                str5 = str8;
                            }
                        } else {
                            String str12 = "badUrl";
                            try {
                                str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException e11) {
                                    e = e11;
                                    str4 = str7;
                                    str2 = strConcat;
                                    str3 = str12;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.A) {
                                        zzcgn.zzi("Preload aborted for URL \"" + str + "\"");
                                    } else {
                                        zzcgn.zzk("Preload failed for URL \"" + str + "\"", e);
                                    }
                                    if (file3.exists()) {
                                        zzcgn.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                    }
                                    zzc(str, file3.getAbsolutePath(), str3, str4);
                                    B.remove(str2);
                                    return false;
                                } catch (RuntimeException e12) {
                                    e = e12;
                                    str4 = str7;
                                    str2 = strConcat;
                                    str3 = str12;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream2.close();
                                    if (this.A) {
                                        zzcgn.zzi("Preload aborted for URL \"" + str + "\"");
                                    } else {
                                        zzcgn.zzk("Preload failed for URL \"" + str + "\"", e);
                                    }
                                    if (file3.exists()) {
                                        zzcgn.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                    }
                                    zzc(str, file3.getAbsolutePath(), str3, str4);
                                    B.remove(str2);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e13) {
                                e = e13;
                                str7 = null;
                            }
                        }
                    } catch (IOException | RuntimeException e14) {
                        e = e14;
                        str2 = strConcat;
                        str3 = "error";
                        str4 = 0;
                        fileOutputStream2 = null;
                    }
                    if (e instanceof RuntimeException) {
                        com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException | NullPointerException unused2) {
                    }
                    if (this.A) {
                        zzcgn.zzi("Preload aborted for URL \"" + str + "\"");
                    } else {
                        zzcgn.zzk("Preload failed for URL \"" + str + "\"", e);
                    }
                    if (file3.exists() && !file3.delete()) {
                        zzcgn.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                    }
                    zzc(str, file3.getAbsolutePath(), str3, str4);
                    B.remove(str2);
                    return false;
                }
            }
            File file5 = this.z;
            if (file5 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            File file6 = null;
            for (File file7 : file5.listFiles()) {
                if (!file7.getName().endsWith(".done")) {
                    long jLastModified = file7.lastModified();
                    if (jLastModified < j) {
                        file6 = file7;
                        j = jLastModified;
                    }
                }
            }
            if (file6 != null) {
                zDelete = file6.delete();
                File file8 = new File(this.z, String.valueOf(file6.getName()).concat(".done"));
                if (file8.isFile()) {
                    zDelete &= file8.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        zzcgn.zzj("Unable to expire stream cache");
        zzc(str, null, "expireFailed", null);
        return false;
    }
}
