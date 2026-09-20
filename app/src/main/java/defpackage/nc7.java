package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwn;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzws;
import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
public final class nc7 extends Handler implements Runnable {
    public int A;
    public Thread B;
    public boolean C;
    public volatile boolean D;
    public final /* synthetic */ zzwt E;
    public final zzwp w;
    public final long x;
    public zzwl y;
    public IOException z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc7(zzwt zzwtVar, Looper looper, zzwp zzwpVar, zzwl zzwlVar, long j) {
        super(looper);
        this.E = zzwtVar;
        this.w = zzwpVar;
        this.y = zzwlVar;
        this.x = j;
    }

    public final void a(boolean z) {
        this.D = z;
        this.z = null;
        if (hasMessages(0)) {
            this.C = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.C = true;
                this.w.zzh();
                Thread thread = this.B;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.E.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzwl zzwlVar = this.y;
            zzwlVar.getClass();
            zzwlVar.zzG(this.w, jElapsedRealtime, jElapsedRealtime - this.x, true);
            this.y = null;
        }
    }

    public final void b(long j) {
        zzwt zzwtVar = this.E;
        zzdd.zzf(zzwtVar.b == null);
        zzwtVar.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
            return;
        }
        this.z = null;
        ExecutorService executorService = zzwtVar.a;
        nc7 nc7Var = zzwtVar.b;
        nc7Var.getClass();
        executorService.execute(nc7Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.D) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.z = null;
            zzwt zzwtVar = this.E;
            ExecutorService executorService = zzwtVar.a;
            nc7 nc7Var = zzwtVar.b;
            nc7Var.getClass();
            executorService.execute(nc7Var);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.E.b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.x;
        zzwl zzwlVar = this.y;
        zzwlVar.getClass();
        if (this.C) {
            zzwlVar.zzG(this.w, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                zzwlVar.zzH(this.w, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                zzdu.zza("LoadTask", "Unexpected exception handling load completed", e);
                this.E.c = new zzws(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.z = iOException;
        int i3 = this.A + 1;
        this.A = i3;
        zzwn zzwnVarZzt = zzwlVar.zzt(this.w, jElapsedRealtime, j, iOException, i3);
        int i4 = zzwnVarZzt.a;
        if (i4 == 3) {
            this.E.c = this.z;
        } else if (i4 != 2) {
            if (i4 == 1) {
                this.A = 1;
            }
            long jMin = zzwnVarZzt.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.A - 1) * AdError.NETWORK_ERROR_CODE, 5000);
            }
            b(jMin);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.C;
                this.B = Thread.currentThread();
            }
            if (z) {
                String strConcat = "load:".concat(this.w.getClass().getSimpleName());
                int i = zzel.zza;
                Trace.beginSection(strConcat);
                try {
                    this.w.zzi();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.B = null;
                Thread.interrupted();
            }
            if (this.D) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.D) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.D) {
                return;
            }
            zzdu.zza("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(2, new zzws(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.D) {
                zzdu.zza("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.D) {
                return;
            }
            zzdu.zza("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new zzws(e4)).sendToTarget();
        }
    }
}
