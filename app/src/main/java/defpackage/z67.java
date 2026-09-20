package defpackage;

import com.google.android.gms.internal.ads.zznc;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzob;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class z67 extends zzob {
    public int[] h;
    public int[] i;

    @Override // com.google.android.gms.internal.ads.zzob
    public final void b() {
        this.i = this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void d() {
        this.i = null;
        this.h = null;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.i;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.a.zze) * this.b.zze);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.a.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznc zzi(zznc zzncVar) throws zznd {
        int[] iArr = this.h;
        if (iArr == null) {
            return zznc.zza;
        }
        if (zzncVar.zzd != 2) {
            throw new zznd(zzncVar);
        }
        boolean z = zzncVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zznc(zzncVar.zzb, length, 2) : zznc.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzncVar.zzc) {
                throw new zznd(zzncVar);
            }
            z |= i2 != i;
            i++;
        }
    }
}
