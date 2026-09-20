package defpackage;

import com.google.android.gms.internal.ads.zzbag;

/* JADX INFO: loaded from: classes3.dex */
public final class k16 implements j16 {
    public final int a;
    public final int b;
    public final zzbag c;

    public k16(h16 h16Var) {
        zzbag zzbagVar = h16Var.P0;
        this.c = zzbagVar;
        zzbagVar.zzv(12);
        this.a = zzbagVar.zzi();
        this.b = zzbagVar.zzi();
    }

    @Override // defpackage.j16
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.j16
    public final int zzb() {
        int i = this.a;
        return i == 0 ? this.c.zzi() : i;
    }

    @Override // defpackage.j16
    /* JADX INFO: renamed from: zzc */
    public final boolean mo33zzc() {
        return this.a != 0;
    }
}
