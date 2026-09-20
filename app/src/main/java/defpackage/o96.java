package defpackage;

import com.google.android.gms.internal.ads.zzgud;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class o96 implements zzgud {
    public final ByteBuffer w;

    public o96(ByteBuffer byteBuffer) {
        this.w = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.w;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final long zzb() {
        return this.w.position();
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final long zzc() {
        return this.w.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final ByteBuffer zzd(long j, long j2) {
        ByteBuffer byteBuffer = this.w;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j2);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final void zze(long j) {
        this.w.position((int) j);
    }
}
