package defpackage;

import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoz;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class ht6 extends gt6 {
    public final byte[] x;

    public ht6(byte[] bArr) {
        bArr.getClass();
        this.x = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public byte b(int i) {
        return this.x[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public void d(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.x, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnf) || zzd() != ((zzgnf) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof ht6)) {
            return obj.equals(this);
        }
        ht6 ht6Var = (ht6) obj;
        int i = this.w;
        int i2 = ht6Var.w;
        if (i == 0 || i2 == 0 || i == i2) {
            return s(ht6Var, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int g(int i, int i2, int i3) {
        int iU = u() + i2;
        Charset charset = zzgox.a;
        for (int i4 = iU; i4 < iU + i3; i4++) {
            i = (i * 31) + this.x[i4];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int h(int i, int i2, int i3) {
        int iU = u() + i2;
        return rv6.a.b(i, iU, i3 + iU, this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final String m(Charset charset) {
        return new String(this.x, u(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final void p(zzgmu zzgmuVar) {
        zzgmuVar.zza(this.x, u(), zzd());
    }

    @Override // defpackage.gt6
    public final boolean s(zzgnf zzgnfVar, int i, int i2) {
        if (i2 > zzgnfVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgnfVar.zzd()) {
            int iZzd = zzgnfVar.zzd();
            StringBuilder sbA = a42.a("Ran off end of other: ", i, ", ", i2, ", ");
            sbA.append(iZzd);
            throw new IllegalArgumentException(sbA.toString());
        }
        if (!(zzgnfVar instanceof ht6)) {
            return zzgnfVar.zzk(i, i3).equals(zzk(0, i2));
        }
        ht6 ht6Var = (ht6) zzgnfVar;
        int iU = u() + i2;
        int iU2 = u();
        int iU3 = ht6Var.u() + i;
        while (iU2 < iU) {
            if (this.x[iU2] != ht6Var.x[iU3]) {
                return false;
            }
            iU2++;
            iU3++;
        }
        return true;
    }

    public int u() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public byte zza(int i) {
        return this.x[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public int zzd() {
        return this.x.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final zzgnf zzk(int i, int i2) {
        int iR = zzgnf.r(i, i2, zzd());
        if (iR == 0) {
            return zzgnf.zzb;
        }
        return new ft6(this.x, u() + i, iR);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final zzgnn zzl() {
        int iU = u();
        int iZzd = zzd();
        it6 it6Var = new it6(this.x, iU, iZzd);
        try {
            it6Var.zze(iZzd);
            return it6Var;
        } catch (zzgoz e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.x, u(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final boolean zzp() {
        int iU = u();
        return rv6.d(this.x, iU, zzd() + iU);
    }
}
