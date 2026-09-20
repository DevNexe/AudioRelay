package defpackage;

import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zznc;
import com.google.android.gms.internal.ads.zznd;
import com.google.android.gms.internal.ads.zzob;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class v87 extends zzob {
    public int h;
    public int i;
    public boolean j;
    public int k;
    public byte[] l = zzel.zzf;
    public int m;
    public long n;

    @Override // com.google.android.gms.internal.ads.zzob
    public final void b() {
        if (this.j) {
            this.j = false;
            int i = this.i;
            int i2 = this.a.zze;
            this.l = new byte[i * i2];
            this.k = this.h * i2;
        }
        this.m = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void c() {
        if (this.j) {
            int i = this.m;
            if (i > 0) {
                this.n += (long) (i / this.a.zze);
            }
            this.m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void d() {
        this.l = zzel.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzob, com.google.android.gms.internal.ads.zzne
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.m) > 0) {
            a(i).put(this.l, 0, this.m).flip();
            this.m = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.k);
        this.n += (long) (iMin / this.a.zze);
        this.k -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.k > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.m + i2) - this.l.length;
        ByteBuffer byteBufferA = a(length);
        int iZzf = zzel.zzf(length, 0, this.m);
        byteBufferA.put(this.l, 0, iZzf);
        int iZzf2 = zzel.zzf(length - iZzf, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iZzf2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iZzf2;
        int i4 = this.m - iZzf;
        this.m = i4;
        byte[] bArr = this.l;
        System.arraycopy(bArr, iZzf, bArr, 0, i4);
        byteBuffer.get(this.l, this.m, i3);
        this.m += i3;
        byteBufferA.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzob, com.google.android.gms.internal.ads.zzne
    public final boolean zzh() {
        return super.zzh() && this.m == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznc zzi(zznc zzncVar) throws zznd {
        if (zzncVar.zzd != 2) {
            throw new zznd(zzncVar);
        }
        this.j = true;
        return (this.h == 0 && this.i == 0) ? zznc.zza : zzncVar;
    }
}
