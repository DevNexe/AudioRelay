package defpackage;

import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzzj;

/* JADX INFO: loaded from: classes3.dex */
public final class vu5 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public vu5(zzbag zzbagVar, zzbag zzbagVar2, boolean z) {
        this.j = zzbagVar;
        this.i = zzbagVar2;
        this.f = z;
        zzbagVar2.zzv(12);
        this.b = zzbagVar2.zzi();
        zzbagVar.zzv(12);
        this.h = zzbagVar.zzi();
        zzazy.zzf(zzbagVar.zze() == 1, "first_chunk must be 1");
        this.c = -1;
    }

    public final boolean a() {
        int i = this.a;
        Object obj = this.j;
        Object obj2 = this.i;
        boolean z = this.f;
        int i2 = this.b;
        switch (i) {
            case 0:
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 == i2) {
                    return false;
                }
                this.e = z ? ((zzed) obj2).zzt() : ((zzed) obj2).zzs();
                if (this.c == this.g) {
                    zzed zzedVar = (zzed) obj;
                    this.d = zzedVar.zzn();
                    zzedVar.zzG(4);
                    int i4 = this.h - 1;
                    this.h = i4;
                    this.g = i4 > 0 ? (-1) + zzedVar.zzn() : -1;
                }
                return true;
            default:
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 == i2) {
                    return false;
                }
                this.e = z ? ((zzbag) obj2).zzn() : ((zzbag) obj2).zzm();
                if (this.c == this.g) {
                    zzbag zzbagVar = (zzbag) obj;
                    this.d = zzbagVar.zzi();
                    zzbagVar.zzw(4);
                    int i6 = this.h - 1;
                    this.h = i6;
                    this.g = i6 > 0 ? (-1) + zzbagVar.zzi() : -1;
                }
                return true;
        }
    }

    public vu5(zzed zzedVar, zzed zzedVar2, boolean z) throws zzbu {
        this.j = zzedVar;
        this.i = zzedVar2;
        this.f = z;
        zzedVar2.zzF(12);
        this.b = zzedVar2.zzn();
        zzedVar.zzF(12);
        this.h = zzedVar.zzn();
        zzzj.zzb(zzedVar.zze() == 1, "first_chunk must be 1");
        this.c = -1;
    }
}
