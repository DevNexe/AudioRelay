package defpackage;

import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zznc;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzob;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class b87 extends zzob {
    public static final int h = Float.floatToIntBits(Float.NaN);

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.a.zzd;
        int i3 = h;
        if (i2 == 536870912) {
            byteBufferA = a((i / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i3) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i2 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i3) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznc zzi(zznc zzncVar) throws zznd {
        int i = zzncVar.zzd;
        if (zzel.zzU(i)) {
            return i != 4 ? new zznc(zzncVar.zzb, zzncVar.zzc, 4) : zznc.zza;
        }
        throw new zznd(zzncVar);
    }
}
