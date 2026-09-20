package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzamh;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfnn;
import com.google.android.gms.internal.ads.zzfnr;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class nl6 implements QnHx.InterfaceC0075QnHx, QnHx.CQf {
    public final zzfnm a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public nl6(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        zzfnm zzfnmVar = new zzfnm(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = zzfnmVar;
        this.d = new LinkedBlockingQueue();
        zzfnmVar.checkAvailabilityAndConnect();
    }

    public static zzamx a() {
        zzamh zzamhVarZza = zzamx.zza();
        zzamhVarZza.zzC(32768L);
        return (zzamx) zzamhVarZza.zzal();
    }

    public final void b() {
        zzfnm zzfnmVar = this.a;
        if (zzfnmVar != null) {
            if (zzfnmVar.isConnected() || zzfnmVar.isConnecting()) {
                zzfnmVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        zzfnr zzfnrVarZzp;
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        HandlerThread handlerThread = this.e;
        try {
            zzfnrVarZzp = this.a.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfnrVarZzp = null;
        }
        if (zzfnrVarZzp != null) {
            try {
                try {
                    linkedBlockingQueue.put(zzfnrVarZzp.zze(new zzfnn(this.b, this.c)).zza());
                } catch (InterruptedException unused2) {
                } finally {
                    b();
                    handlerThread.quit();
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(a());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
