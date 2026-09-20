package defpackage;

import com.google.android.gms.internal.ads.zzgcv;
import com.google.android.gms.internal.ads.zzgcy;
import com.google.android.gms.internal.ads.zzgle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vr6 {
    public final ur6 a;
    public final ur6 b;

    public vr6(byte[] bArr) throws GeneralSecurityException {
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = a(1, bArr);
        this.b = a(0, bArr);
    }

    public static byte[] b(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i = length & 15;
        int i2 = i == 0 ? length : (length + 16) - i;
        int iRemaining = byteBuffer.remaining();
        int i3 = iRemaining % 16;
        int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(i2);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i4);
        byteBufferOrder.putLong(length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract ur6 a(int i, byte[] bArr);

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.a.zzd(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.b.a(0, bArr).get(bArr4);
        byte[] bArrZza = zzgcv.zza(bArr4, b(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrZza);
    }

    public final byte[] zzc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.b.a(0, bArr).get(bArr4);
            if (!zzgle.zzb(zzgcv.zza(bArr4, b(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.a.zze(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
        zzb(byteBufferAllocate, bArr, bArr2, bArr3);
        return byteBufferAllocate.array();
    }
}
