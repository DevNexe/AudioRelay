package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzpx;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class j97 extends Handler {
    public final /* synthetic */ s97 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j97(s97 s97Var, Looper looper) {
        super(looper);
        this.a = s97Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        k97 k97Var;
        ArrayDeque arrayDeque;
        s97 s97Var = this.a;
        int i = message.what;
        k97 k97Var2 = null;
        if (i != 0) {
            if (i == 1) {
                k97Var = (k97) message.obj;
                int i2 = k97Var.a;
                MediaCodec.CryptoInfo cryptoInfo = k97Var.c;
                long j = k97Var.d;
                int i3 = k97Var.e;
                try {
                    synchronized (s97.h) {
                        s97Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e) {
                    zzpx.zza(s97Var.d, null, e);
                }
            } else if (i != 2) {
                zzpx.zza(s97Var.d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                s97Var.e.zze();
            }
            if (k97Var2 != null) {
                arrayDeque = s97.g;
                synchronized (arrayDeque) {
                    arrayDeque.add(k97Var2);
                }
            }
        }
        k97Var = (k97) message.obj;
        try {
            s97Var.a.queueInputBuffer(k97Var.a, 0, k97Var.b, k97Var.d, k97Var.e);
        } catch (RuntimeException e2) {
            zzpx.zza(s97Var.d, null, e2);
        }
        k97Var2 = k97Var;
        if (k97Var2 != null) {
            arrayDeque = s97.g;
            synchronized (arrayDeque) {
                arrayDeque.add(k97Var2);
            }
        }
    }
}
