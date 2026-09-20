package defpackage;

import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q06 implements zzath {
    public int a;
    public int b;
    public int[] c;
    public boolean d;
    public int[] e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public q06() {
        ByteBuffer byteBuffer = zzath.zza;
        this.f = byteBuffer;
        this.g = byteBuffer;
        this.a = -1;
        this.b = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zza() {
        int[] iArr = this.e;
        return iArr == null ? this.a : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.g;
        this.g = zzath.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzd() {
        this.g = zzath.zza;
        this.h = false;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zze() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzf(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = this.a;
        int length = ((iLimit - iPosition) / (i + i)) * this.e.length;
        int i2 = length + length;
        if (this.f.capacity() < i2) {
            this.f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        while (iPosition < iLimit) {
            for (int i3 : this.e) {
                this.f.putShort(byteBuffer.getShort(i3 + i3 + iPosition));
            }
            int i4 = this.a;
            iPosition += i4 + i4;
        }
        byteBuffer.position(iLimit);
        this.f.flip();
        this.g = this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzg() {
        zzd();
        this.f = zzath.zza;
        this.a = -1;
        this.b = -1;
        this.e = null;
        this.d = false;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzh(int i, int i2, int i3) throws zzatg {
        boolean z = !Arrays.equals(this.c, this.e);
        int[] iArr = this.c;
        this.e = iArr;
        if (iArr == null) {
            this.d = false;
            return z;
        }
        if (i3 != 2) {
            throw new zzatg(i, i2, i3);
        }
        if (!z && this.b == i && this.a == i2) {
            return false;
        }
        this.b = i;
        this.a = i2;
        this.d = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new zzatg(i, i2, 2);
            }
            this.d = (i5 != i4) | this.d;
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzi() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzj() {
        return this.h && this.g == zzath.zza;
    }
}
