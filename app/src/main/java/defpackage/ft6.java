package defpackage;

import com.google.android.gms.internal.ads.zzgnf;

/* JADX INFO: loaded from: classes3.dex */
public final class ft6 extends ht6 {
    public final int y;
    public final int z;

    public ft6(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgnf.r(i, i + i2, bArr.length);
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ht6, com.google.android.gms.internal.ads.zzgnf
    public final byte b(int i) {
        return this.x[this.y + i];
    }

    @Override // defpackage.ht6, com.google.android.gms.internal.ads.zzgnf
    public final void d(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.x, this.y + i, bArr, i2, i3);
    }

    @Override // defpackage.ht6
    public final int u() {
        return this.y;
    }

    @Override // defpackage.ht6, com.google.android.gms.internal.ads.zzgnf
    public final byte zza(int i) {
        zzgnf.a(i, this.z);
        return this.x[this.y + i];
    }

    @Override // defpackage.ht6, com.google.android.gms.internal.ads.zzgnf
    public final int zzd() {
        return this.z;
    }
}
