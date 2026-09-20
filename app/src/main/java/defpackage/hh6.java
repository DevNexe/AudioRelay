package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.zzdm;
import com.google.android.gms.internal.ads.zzdn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hh6 implements zzdn {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public hh6(Handler handler) {
        this.a = handler;
    }

    public static ch6 a() {
        ch6 ch6Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            ch6Var = arrayList.isEmpty() ? new ch6(0) : (ch6) arrayList.remove(arrayList.size() - 1);
        }
        return ch6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zza(int i) {
        ch6 ch6VarA = a();
        ch6VarA.a = this.a.obtainMessage(i);
        return ch6VarA;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zzb(int i, Object obj) {
        ch6 ch6VarA = a();
        ch6VarA.a = this.a.obtainMessage(i, obj);
        return ch6VarA;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final zzdm zzc(int i, int i2, int i3) {
        ch6 ch6VarA = a();
        ch6VarA.a = this.a.obtainMessage(1, i2, i3);
        return ch6VarA;
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final void zzd(Object obj) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final void zze(int i) {
        this.a.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzf(int i) {
        return this.a.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzg(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzh(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzi(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdn
    public final boolean zzj(zzdm zzdmVar) {
        ch6 ch6Var = (ch6) zzdmVar;
        Message message = ch6Var.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        ch6Var.a = null;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(ch6Var);
            }
        }
        return zSendMessageAtFrontOfQueue;
    }
}
