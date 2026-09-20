package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpc extends zzfoq {
    public zzfsv<Integer> w;
    public zzfsv<Integer> x;
    public zzfpb y;
    public HttpURLConnection z;

    public zzfpc() {
        this(new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfoz
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return -1;
            }
        }, new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfpa
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return -1;
            }
        }, null);
    }

    public zzfpc(zzfsv<Integer> zzfsvVar, zzfsv<Integer> zzfsvVar2, zzfpb zzfpbVar) {
        this.w = zzfsvVar;
        this.x = zzfsvVar2;
        this.y = zzfpbVar;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfor.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.z);
    }

    public HttpURLConnection zzm() {
        zzfor.zzb(((Integer) this.w.zza()).intValue(), ((Integer) this.x.zza()).intValue());
        zzfpb zzfpbVar = this.y;
        zzfpbVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfpbVar.zza();
        this.z = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfpb zzfpbVar, final int i, final int i2) {
        this.w = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfos
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.x = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfot
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.y = zzfpbVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) {
        this.w = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.x = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfov
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.y = new zzfpb() { // from class: com.google.android.gms.internal.ads.zzfow
            @Override // com.google.android.gms.internal.ads.zzfpb
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) {
        this.w = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfox
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.y = new zzfpb() { // from class: com.google.android.gms.internal.ads.zzfoy
            @Override // com.google.android.gms.internal.ads.zzfpb
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
