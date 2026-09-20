package defpackage;

import com.google.android.gms.internal.ads.zzgle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ur6 {
    public final int[] a;
    public final int b;

    public ur6(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = tr6.c(bArr);
        this.b = i;
    }

    public final ByteBuffer a(int i, byte[] bArr) {
        int[] iArrZzb = zzb(tr6.c(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        tr6.b(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrZzb[i2] = iArrZzb[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final void b(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = (iRemaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferA = a(this.b + i2, bArr);
            if (i2 == i - 1) {
                zzgle.zza(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                zzgle.zza(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i);

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        b(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        b(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
