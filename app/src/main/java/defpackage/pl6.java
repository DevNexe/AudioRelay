package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfnr;
import com.google.android.gms.internal.ads.zzfnw;
import com.google.android.gms.internal.ads.zzfny;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class pl6 implements QnHx.InterfaceC0075QnHx, QnHx.CQf {
    public final zzfnm a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;
    public final zzfmf f;
    public final long g;
    public final int h;

    public pl6(Context context, int i, String str, String str2, zzfmf zzfmfVar) {
        this.b = str;
        this.h = i;
        this.c = str2;
        this.f = zzfmfVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        zzfnm zzfnmVar = new zzfnm(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = zzfnmVar;
        this.d = new LinkedBlockingQueue();
        zzfnmVar.checkAvailabilityAndConnect();
    }

    public final void a() {
        zzfnm zzfnmVar = this.a;
        if (zzfnmVar != null) {
            if (zzfnmVar.isConnected() || zzfnmVar.isConnecting()) {
                zzfnmVar.disconnect();
            }
        }
    }

    public final void b(int i, long j, Exception exc) {
        this.f.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        zzfnr zzfnrVarZzp;
        long j = this.g;
        HandlerThread handlerThread = this.e;
        try {
            zzfnrVarZzp = this.a.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfnrVarZzp = null;
        }
        if (zzfnrVarZzp != null) {
            try {
                zzfny zzfnyVarZzf = zzfnrVarZzp.zzf(new zzfnw(1, this.h, this.b, this.c));
                b(5011, j, null);
                this.d.put(zzfnyVarZzf);
            } catch (Throwable th) {
                try {
                    b(2010, j, new Exception(th));
                } finally {
                    a();
                    handlerThread.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        try {
            b(4012, this.g, null);
            this.d.put(new zzfny(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.g, null);
            this.d.put(new zzfny(null, 1));
        } catch (InterruptedException unused) {
        }
    }
}
