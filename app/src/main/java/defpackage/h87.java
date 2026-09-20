package defpackage;

import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zznc;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzob;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h87 extends zzob {
    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.a.zzd;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i += i;
            }
        }
        ByteBuffer byteBufferA = a(i);
        int i3 = this.a.zzd;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferA.put((byte) 0);
                byteBufferA.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sZza = (short) (zzel.zza(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferA.put((byte) (sZza & 255));
                byteBufferA.put((byte) ((sZza >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 1));
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferA.put(byteBuffer.get(iPosition + 2));
                byteBufferA.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznc zzi(zznc zzncVar) throws zznd {
        int i = zzncVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zznc.zza;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new zznd(zzncVar);
            }
        }
        return new zznc(zzncVar.zzb, zzncVar.zzc, 2);
    }
}
