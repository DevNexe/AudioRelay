package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s97 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public j97 c;
    public final AtomicReference d;
    public final zzdg e;
    public boolean f;

    public s97(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = zzdgVar;
        this.d = new AtomicReference();
    }

    public final void a() {
        zzdg zzdgVar = this.e;
        if (this.f) {
            try {
                j97 j97Var = this.c;
                j97Var.getClass();
                j97Var.removeCallbacksAndMessages(null);
                zzdgVar.zzc();
                j97 j97Var2 = this.c;
                j97Var2.getClass();
                j97Var2.obtainMessage(2).sendToTarget();
                zzdgVar.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    public final void b(int i, zzgd zzgdVar, long j) {
        k97 k97Var;
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            k97Var = arrayDeque.isEmpty() ? new k97() : (k97) arrayDeque.removeFirst();
        }
        k97Var.a = i;
        k97Var.b = 0;
        k97Var.d = j;
        k97Var.e = 0;
        int i2 = zzgdVar.zzf;
        MediaCodec.CryptoInfo cryptoInfo = k97Var.c;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = zzgdVar.zzd;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf != null) {
                int length = iArrCopyOf.length;
                int length2 = iArr.length;
                if (length < length2) {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, length2);
                }
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = zzgdVar.zze;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 != null) {
                int length3 = iArrCopyOf2.length;
                int length4 = iArr2.length;
                if (length3 < length4) {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                } else {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length4);
                }
            } else {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = zzgdVar.zzb;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf != null) {
                int length5 = bArrCopyOf.length;
                int length6 = bArr.length;
                if (length5 < length6) {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, length6);
                }
            } else {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = zzgdVar.zza;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 != null) {
                int length7 = bArrCopyOf2.length;
                int length8 = bArr2.length;
                if (length7 < length8) {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                } else {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length8);
                }
            } else {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = zzgdVar.zzc;
        if (zzel.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(zzgdVar.zzg, zzgdVar.zzh));
        }
        this.c.obtainMessage(1, k97Var).sendToTarget();
    }
}
