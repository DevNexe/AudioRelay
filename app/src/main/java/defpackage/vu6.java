package defpackage;

import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzgmz;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vu6 extends zzgnf {
    public static final int[] C = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;
    public final int B;
    public final int x;
    public final zzgnf y;
    public final zzgnf z;

    public /* synthetic */ vu6() {
        throw null;
    }

    public vu6(zzgnf zzgnfVar, zzgnf zzgnfVar2) {
        this.y = zzgnfVar;
        this.z = zzgnfVar2;
        int iZzd = zzgnfVar.zzd();
        this.A = iZzd;
        this.x = zzgnfVar2.zzd() + iZzd;
        this.B = Math.max(zzgnfVar.e(), zzgnfVar2.e()) + 1;
    }

    public static int s(int i) {
        int[] iArr = C;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final byte b(int i) {
        int i2 = this.A;
        return i < i2 ? this.y.b(i) : this.z.b(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final void d(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        zzgnf zzgnfVar = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            zzgnfVar.d(i, i2, i3, bArr);
            return;
        }
        zzgnf zzgnfVar2 = this.z;
        if (i >= i5) {
            zzgnfVar2.d(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        zzgnfVar.d(i, i2, i6, bArr);
        zzgnfVar2.d(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int e() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final boolean equals(Object obj) {
        gt6 gt6VarA;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnf)) {
            return false;
        }
        zzgnf zzgnfVar = (zzgnf) obj;
        int iZzd = zzgnfVar.zzd();
        int i = this.x;
        if (i != iZzd) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.w;
        int i3 = zzgnfVar.w;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        uu6 uu6Var = new uu6(this);
        gt6 gt6VarA2 = uu6Var.a();
        uu6 uu6Var2 = new uu6(zzgnfVar);
        gt6 gt6VarA3 = uu6Var2.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iZzd2 = gt6VarA2.zzd() - i4;
            int iZzd3 = gt6VarA3.zzd() - i5;
            int iMin = Math.min(iZzd2, iZzd3);
            if (!(i4 == 0 ? gt6VarA2.s(gt6VarA3, i5, iMin) : gt6VarA3.s(gt6VarA2, i4, iMin))) {
                return false;
            }
            i6 += iMin;
            if (i6 >= i) {
                if (i6 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd2) {
                gt6VarA = uu6Var.a();
                i4 = 0;
            } else {
                i4 += iMin;
            }
            if (iMin == iZzd3) {
                gt6VarA2 = gt6VarA2;
                gt6VarA2 = gt6VarA;
                gt6VarA3 = uu6Var2.a();
                i5 = 0;
            } else {
                gt6VarA2 = gt6VarA2;
                gt6VarA2 = gt6VarA;
                i5 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final boolean f() {
        return this.x >= s(this.B);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int g(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zzgnf zzgnfVar = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return zzgnfVar.g(i, i2, i3);
        }
        zzgnf zzgnfVar2 = this.z;
        if (i2 >= i5) {
            return zzgnfVar2.g(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zzgnfVar2.g(zzgnfVar.g(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int h(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zzgnf zzgnfVar = this.y;
        int i5 = this.A;
        if (i4 <= i5) {
            return zzgnfVar.h(i, i2, i3);
        }
        zzgnf zzgnfVar2 = this.z;
        if (i2 >= i5) {
            return zzgnfVar2.h(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zzgnfVar2.h(zzgnfVar.h(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new su6(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final String m(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final void p(zzgmu zzgmuVar) {
        this.y.p(zzgmuVar);
        this.z.p(zzgmuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final byte zza(int i) {
        zzgnf.a(i, this.x);
        return b(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final int zzd() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final zzgnf zzk(int i, int i2) {
        int i3 = this.x;
        int iR = zzgnf.r(i, i2, i3);
        if (iR == 0) {
            return zzgnf.zzb;
        }
        if (iR == i3) {
            return this;
        }
        zzgnf zzgnfVar = this.y;
        int i4 = this.A;
        if (i2 <= i4) {
            return zzgnfVar.zzk(i, i2);
        }
        zzgnf zzgnfVar2 = this.z;
        return i >= i4 ? zzgnfVar2.zzk(i - i4, i2 - i4) : new vu6(zzgnfVar.zzk(i, zzgnfVar.zzd()), zzgnfVar2.zzk(0, i2 - i4));
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final zzgnn zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        uu6 uu6Var = new uu6(this);
        while (uu6Var.hasNext()) {
            arrayList.add(uu6Var.a().zzn());
        }
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new jt6(arrayList, iRemaining) : zzgnn.zzH(new au6(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    public final boolean zzp() {
        int iH = this.y.h(0, 0, this.A);
        zzgnf zzgnfVar = this.z;
        return zzgnfVar.h(iH, 0, zzgnfVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf
    /* JADX INFO: renamed from: zzs */
    public final zzgmz iterator() {
        return new su6(this);
    }
}
