package defpackage;

import com.google.android.gms.internal.ads.zzatg;
import com.google.android.gms.internal.ads.zzath;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public final class s06 implements zzath {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public ByteBuffer d;
    public ByteBuffer e;
    public boolean f;

    public s06() {
        ByteBuffer byteBuffer = zzath.zza;
        this.d = byteBuffer;
        this.e = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.e;
        this.e = zzath.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzd() {
        this.e = zzath.zza;
        this.f = false;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zze() {
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[ADDED_TO_REGION, LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_START, PHI: r0
  0x0046: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0044, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[LOOP:0: B:19:0x0046->B:20:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[ADDED_TO_REGION, LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_START, PHI: r0
  0x0067: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0042, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[LOOP:1: B:23:0x0067->B:24:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[ADDED_TO_REGION, LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0
  0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzf(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.c;
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 3) {
                if (i4 != 1073741824) {
                    throw new IllegalStateException();
                }
                i = i3 / 2;
            }
            if (this.d.capacity() < i) {
                this.d = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.d.clear();
            }
            i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.d.put(byteBuffer.get(iPosition + 1));
                    this.d.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i2 != 3) {
                while (iPosition < iLimit) {
                    this.d.put((byte) 0);
                    this.d.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i2 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.d.put(byteBuffer.get(iPosition + 2));
                    this.d.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.d.flip();
            this.e = this.d;
        }
        i3 /= 3;
        i = i3 + i3;
        if (this.d.capacity() < i) {
            this.d = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.d.clear();
        }
        i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.d.put(byteBuffer.get(iPosition + 1));
                this.d.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i2 != 3) {
            while (iPosition < iLimit) {
                this.d.put((byte) 0);
                this.d.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i2 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.d.put(byteBuffer.get(iPosition + 2));
                this.d.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.d.flip();
        this.e = this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzg() {
        zzd();
        this.d = zzath.zza;
        this.a = -1;
        this.b = -1;
        this.c = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzh(int i, int i2, int i3) throws zzatg {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzatg(i, i2, i3);
        }
        if (this.a == i && this.b == i2 && this.c == i3) {
            return false;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i3 != 2) {
            return true;
        }
        this.d = zzath.zza;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzi() {
        int i = this.c;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzj() {
        return this.f && this.e == zzath.zza;
    }
}
