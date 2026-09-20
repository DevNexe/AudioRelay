package defpackage;

import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzed;

/* JADX INFO: loaded from: classes3.dex */
public final class fv5 implements xu5, j16 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public final Object f;

    public fv5(tu5 tu5Var) {
        zzed zzedVar = tu5Var.b;
        this.f = zzedVar;
        zzedVar.zzF(12);
        this.c = zzedVar.zzn() & 255;
        this.b = zzedVar.zzn();
    }

    @Override // defpackage.xu5, defpackage.j16
    public final int zza() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return this.b;
        }
    }

    @Override // defpackage.xu5, defpackage.j16
    public final int zzb() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                Object obj = this.f;
                int i = this.c;
                if (i == 8) {
                    return ((zzbag) obj).zzg();
                }
                if (i == 16) {
                    return ((zzbag) obj).zzj();
                }
                int i2 = this.d;
                this.d = i2 + 1;
                if (i2 % 2 != 0) {
                    return this.e & 15;
                }
                int iZzg = ((zzbag) obj).zzg();
                this.e = iZzg;
                return (iZzg & 240) >> 4;
        }
    }

    @Override // defpackage.xu5
    public final int zzc() {
        Object obj = this.f;
        int i = this.c;
        if (i == 8) {
            return ((zzed) obj).zzk();
        }
        if (i == 16) {
            return ((zzed) obj).zzo();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iZzk = ((zzed) obj).zzk();
        this.e = iZzk;
        return (iZzk & 240) >> 4;
    }

    @Override // defpackage.j16
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public final boolean mo33zzc() {
        return false;
    }

    public fv5(h16 h16Var) {
        zzbag zzbagVar = h16Var.P0;
        this.f = zzbagVar;
        zzbagVar.zzv(12);
        this.c = zzbagVar.zzi() & 255;
        this.b = zzbagVar.zzi();
    }
}
