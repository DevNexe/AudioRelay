package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzalf extends zzaka {
    public final Object I;
    public final zzakf J;

    public zzalf(int i, String str, zzakf zzakfVar, zzake zzakeVar) {
        super(i, str, zzakeVar);
        this.I = new Object();
        this.J = zzakfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final zzakg a(zzajw zzajwVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzajwVar.zzb;
            Map map = zzajwVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzajwVar.zzb);
        }
        return zzakg.zzb(str, zzakx.zzb(zzajwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    /* JADX INFO: renamed from: l */
    public void c(String str) {
        zzakf zzakfVar;
        synchronized (this.I) {
            zzakfVar = this.J;
        }
        zzakfVar.zza(str);
    }
}
