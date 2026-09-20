package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzeah;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.gh1;
import defpackage.x06;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    public final Object a = new Object();

    @GuardedBy("lock")
    public String b = "";

    @GuardedBy("lock")
    public String c = "";

    @GuardedBy("lock")
    public boolean d = false;

    @GuardedBy("lock")
    public boolean e = false;
    public String f = "";
    public zzeai g;

    public static void a(String str, Context context, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new x06(context, str, z, z2));
        } else {
            zzcgn.zzi("Can not create dialog without Activity Context");
        }
    }

    public static final String b(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzq().zzc(context, str2));
        zzfyx zzfyxVarZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) zzfyxVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdQ)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzcgn.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            zzfyxVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            zzcgn.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            zzfyxVarZzb.cancel(true);
            return null;
        } catch (Exception e3) {
            zzcgn.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006c A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0038, B:12:0x0040, B:14:0x0055, B:17:0x0067, B:9:0x0031, B:18:0x006c, B:19:0x006e), top: B:25:0x000b, inners: #1, #2 }] */
    public final Uri c(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                com.google.android.gms.ads.internal.zzt.zzq();
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gh1.b(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    zzcgn.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzq();
                    this.b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzq();
                    String str6 = this.b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        zzcgn.zzh("Error writing to file in internal storage.", e);
                    }
                    str4 = this.b;
                } else {
                    str4 = this.b;
                }
            } else {
                str4 = this.b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final zzeai zza() {
        return this.g;
    }

    public final String zzb() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzeai zzeaiVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue() || (zzeaiVar = this.g) == null) {
            return;
        }
        zzeaiVar.zzg(new zzat(this, context), zzeah.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzq();
        zzs.zzQ(context, c(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdM), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = c(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdP), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzq();
        zzs.zzH(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.a) {
            this.e = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzp().zzh().zzB(z);
                zzeai zzeaiVar = this.g;
                if (zzeaiVar != null) {
                    zzeaiVar.zzi(z);
                }
            }
        }
    }

    public final void zzg(zzeai zzeaiVar) {
        this.g = zzeaiVar;
    }

    public final void zzh(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strB = b(context, c(context, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdO), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strB)) {
            zzcgn.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strB.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
                zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzp().zzh();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzh.zzA(str);
            }
            return zEquals;
        } catch (JSONException e) {
            zzcgn.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zzcgn.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
