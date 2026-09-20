package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbal;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
public final class p26 extends Handler implements Runnable {
    public IOException A;
    public int B;
    public volatile Thread C;
    public volatile boolean D;
    public final /* synthetic */ zzazw E;
    public final zzazu w;
    public final zzazs x;
    public final int y;
    public final long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p26(zzazw zzazwVar, Looper looper, zzazu zzazuVar, zzazs zzazsVar, int i, long j) {
        super(looper);
        this.E = zzazwVar;
        this.w = zzazuVar;
        this.x = zzazsVar;
        this.y = i;
        this.z = j;
    }

    public final void a(boolean z) {
        this.D = z;
        this.A = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.w.zzb();
            if (this.C != null) {
                this.C.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.E.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.x.zzt(this.w, jElapsedRealtime, jElapsedRealtime - this.z, true);
    }

    public final void b(long j) {
        zzazw zzazwVar = this.E;
        zzazy.zze(zzazwVar.b == null);
        zzazwVar.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            this.A = null;
            zzazwVar.a.execute(zzazwVar.b);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.D) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.A = null;
            zzazw zzazwVar = this.E;
            zzazwVar.a.execute(zzazwVar.b);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.E.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.z;
        if (this.w.zze()) {
            this.x.zzt(this.w, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.x.zzt(this.w, jElapsedRealtime, j, false);
            return;
        }
        if (i2 == 2) {
            this.x.zzu(this.w, jElapsedRealtime, j);
            return;
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.A = iOException;
        int iZzd = this.x.zzd(this.w, jElapsedRealtime, j, iOException);
        if (iZzd == 3) {
            this.E.c = this.A;
        } else if (iZzd != 2) {
            int i3 = iZzd != 1 ? 1 + this.B : 1;
            this.B = i3;
            b(Math.min((i3 - 1) * AdError.NETWORK_ERROR_CODE, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.C = Thread.currentThread();
            if (!this.w.zze()) {
                zzbal.zza("load:".concat(this.w.getClass().getSimpleName()));
                try {
                    this.w.zzc();
                    zzbal.zzb();
                } catch (Throwable th) {
                    zzbal.zzb();
                    throw th;
                }
            }
            if (this.D) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.D) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.D) {
                return;
            }
            obtainMessage(3, new zzazv(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.D) {
                return;
            }
            obtainMessage(3, new zzazv(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.D) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzazy.zze(this.w.zze());
            if (this.D) {
                return;
            }
            sendEmptyMessage(2);
        }
    }
}
