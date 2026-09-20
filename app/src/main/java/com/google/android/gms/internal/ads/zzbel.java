package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbel {
    public final zzber a;

    @GuardedBy("this")
    public final zzbga b;
    public final boolean c;

    public zzbel() {
        this.b = zzbgb.zzd();
        this.c = false;
        this.a = new zzber();
    }

    public static zzbel zza() {
        return new zzbel();
    }

    public final synchronized String a(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.b.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().c()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbgb) this.b.zzal()).zzaw(), 3));
    }

    public final synchronized void b(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(a(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized void c(int i) {
        zzbga zzbgaVar = this.b;
        zzbgaVar.zzd();
        List listZzb = zzbiy.zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbgaVar.zzc(arrayList);
        zzbeq zzbeqVar = new zzbeq(this.a, ((zzbgb) this.b.zzal()).zzaw());
        int i2 = i - 1;
        zzbeqVar.zza(i2);
        zzbeqVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbek zzbekVar) {
        if (this.c) {
            try {
                zzbekVar.zza(this.b);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.c) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdY)).booleanValue()) {
                b(i);
            } else {
                c(i);
            }
        }
    }

    public zzbel(zzber zzberVar) {
        this.b = zzbgb.zzd();
        this.a = zzberVar;
        this.c = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdX)).booleanValue();
    }
}
