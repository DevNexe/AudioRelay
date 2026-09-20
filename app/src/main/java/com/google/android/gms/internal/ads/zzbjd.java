package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjd {
    public String d;
    public Context e;
    public String f;
    public AtomicBoolean h;
    public File i;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(100);
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbjd zzbjdVar) throws Throwable {
        while (true) {
            try {
                zzbjn zzbjnVar = (zzbjn) zzbjdVar.a.take();
                zzbjm zzbjmVarZza = zzbjnVar.zza();
                if (!TextUtils.isEmpty(zzbjmVarZza.zzb())) {
                    zzbjdVar.b(zzbjdVar.a(zzbjdVar.b, zzbjnVar.zzb()), zzbjmVarZza);
                }
            } catch (InterruptedException e) {
                zzcgn.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    public final LinkedHashMap a(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap2.put(str, zza(str).zza((String) linkedHashMap2.get(str), str2));
        }
        return linkedHashMap2;
    }

    public final void b(LinkedHashMap linkedHashMap, zzbjm zzbjmVar) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbjmVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbjmVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbjmVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbjmVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbjmVar.zza());
            }
            string = sb.toString();
        }
        if (!this.h.get()) {
            com.google.android.gms.ads.internal.zzt.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzH(this.e, this.f, string);
            return;
        }
        File file = this.i;
        if (file == null) {
            zzcgn.zzj("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(string.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        zzcgn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    zzcgn.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            zzcgn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            zzcgn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public final zzbjj zza(String str) {
        zzbjj zzbjjVar = (zzbjj) this.c.get(str);
        return zzbjjVar != null ? zzbjjVar : zzbjj.zza;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbkj.zzc.zze()).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjc
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzbjd.zzc(this.zza);
            }
        });
        HashMap map2 = this.c;
        zzbjj zzbjjVar = zzbjj.zzb;
        map2.put("action", zzbjjVar);
        map2.put("ad_format", zzbjjVar);
        map2.put("e", zzbjj.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f);
        linkedHashMap.put("ue", str);
        b(a(this.b, linkedHashMap), null);
    }

    public final boolean zzf(zzbjn zzbjnVar) {
        return this.a.offer(zzbjnVar);
    }
}
