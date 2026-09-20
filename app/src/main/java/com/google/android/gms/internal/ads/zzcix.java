package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfph;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcix {
    public final Context a;
    public final String b;
    public final zzcgt c;
    public final zzbjk d;
    public final zzbjn e;
    public final com.google.android.gms.ads.internal.util.zzbf f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public zzcic n;
    public boolean o;
    public boolean p;
    public long q;

    public zzcix(Context context, zzcgt zzcgtVar, String str, zzbjn zzbjnVar, zzbjk zzbjkVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f = zzbdVar.zzb();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = zzcgtVar;
        this.b = str;
        this.e = zzbjnVar;
        this.d = zzbjkVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzy);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.g[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                zzcgn.zzk("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void zza(zzcic zzcicVar) {
        zzbjn zzbjnVar = this.e;
        zzbjf.zza(zzbjnVar, this.d, "vpc2");
        this.i = true;
        zzbjnVar.zzd("vpn", zzcicVar.zzj());
        this.n = zzcicVar;
    }

    public final void zzb() {
        if (!this.i || this.j) {
            return;
        }
        zzbjf.zza(this.e, this.d, "vfr2");
        this.j = true;
    }

    public final void zzc() {
        this.m = true;
        if (!this.j || this.k) {
            return;
        }
        zzbjf.zza(this.e, this.d, "vfp2");
        this.k = true;
    }

    public final void zzd() {
        if (!((Boolean) zzblc.zza.zze()).booleanValue() || this.o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.b);
        bundle.putString("player", this.n.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.f.zza()) {
            bundle.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
            bundle.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzq();
                final Context context = this.a;
                final String str = this.c.zza;
                com.google.android.gms.ads.internal.zzt.zzq();
                bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzq());
                bundle.putString("eids", TextUtils.join(",", zzbiy.zza()));
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                zzcgg.zzv(context, str, "gmob-apps", bundle, true, new zzcgf() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzcgf
                    public final boolean zza(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        zzfph zzfphVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzq();
                        zzs.zzH(context2, str3, str2);
                        return true;
                    }
                });
                this.o = true;
                return;
            }
            String str2 = this.h[i];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
            }
            i++;
        }
    }

    public final void zze() {
        this.m = false;
    }

    public final void zzf(zzcic zzcicVar) {
        if (this.k && !this.l) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.l) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbjf.zza(this.e, this.d, "vff2");
            this.l = true;
        }
        long jA = com.google.android.gms.ads.internal.zzt.zzB().a();
        if (this.m && this.p && this.q != -1) {
            this.f.zzb(TimeUnit.SECONDS.toNanos(1L) / (jA - this.q));
        }
        this.p = this.m;
        this.q = jA;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzz)).longValue();
        long jZza = zzcicVar.zza();
        int i = 0;
        while (true) {
            String[] strArr = this.h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && jLongValue > Math.abs(jZza - this.g[i])) {
                int i2 = 8;
                Bitmap bitmap = zzcicVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }
}
