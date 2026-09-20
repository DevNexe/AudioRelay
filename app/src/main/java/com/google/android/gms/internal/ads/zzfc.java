package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc implements zzev {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final zzev c;
    public zzfl d;
    public zzeo e;
    public zzes f;
    public zzev g;
    public zzfz h;
    public zzet i;
    public zzfv j;
    public zzev k;

    public zzfc(Context context, zzev zzevVar) {
        this.a = context.getApplicationContext();
        this.c = zzevVar;
    }

    public static final void b(zzev zzevVar, zzfx zzfxVar) {
        if (zzevVar != null) {
            zzevVar.zzf(zzfxVar);
        }
    }

    public final void a(zzev zzevVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            zzevVar.zzf((zzfx) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        zzev zzevVar = this.k;
        zzevVar.getClass();
        return zzevVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) {
        zzdd.zzf(this.k == null);
        String scheme = zzfaVar.zza.getScheme();
        boolean zZzW = zzel.zzW(zzfaVar.zza);
        Context context = this.a;
        if (zZzW) {
            String path = zzfaVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    zzfl zzflVar = new zzfl();
                    this.d = zzflVar;
                    a(zzflVar);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    zzeo zzeoVar = new zzeo(context);
                    this.e = zzeoVar;
                    a(zzeoVar);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                zzeo zzeoVar2 = new zzeo(context);
                this.e = zzeoVar2;
                a(zzeoVar2);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                zzes zzesVar = new zzes(context);
                this.f = zzesVar;
                a(zzesVar);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            zzev zzevVar = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        zzev zzevVar2 = (zzev) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = zzevVar2;
                        a(zzevVar2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = zzevVar;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    zzfz zzfzVar = new zzfz(AdError.SERVER_ERROR_CODE);
                    this.h = zzfzVar;
                    a(zzfzVar);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    zzet zzetVar = new zzet();
                    this.i = zzetVar;
                    a(zzetVar);
                }
                this.k = this.i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    zzfv zzfvVar = new zzfv(context);
                    this.j = zzfvVar;
                    a(zzfvVar);
                }
                this.k = this.j;
            } else {
                this.k = zzevVar;
            }
        }
        return this.k.zzb(zzfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        zzev zzevVar = this.k;
        if (zzevVar == null) {
            return null;
        }
        return zzevVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        zzev zzevVar = this.k;
        if (zzevVar != null) {
            try {
                zzevVar.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        zzev zzevVar = this.k;
        return zzevVar == null ? Collections.emptyMap() : zzevVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(zzfx zzfxVar) {
        zzfxVar.getClass();
        this.c.zzf(zzfxVar);
        this.b.add(zzfxVar);
        b(this.d, zzfxVar);
        b(this.e, zzfxVar);
        b(this.f, zzfxVar);
        b(this.g, zzfxVar);
        b(this.h, zzfxVar);
        b(this.i, zzfxVar);
        b(this.j, zzfxVar);
    }
}
