package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzdj;
import com.google.android.gms.internal.ads.zzdk;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzxg;

/* JADX INFO: loaded from: classes3.dex */
public final class xc7 extends HandlerThread implements Handler.Callback {
    public zzxg A;
    public zzdj w;
    public Handler x;
    public Error y;
    public RuntimeException z;

    public xc7() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzdj zzdjVar = this.w;
                    zzdjVar.getClass();
                    zzdjVar.zzc();
                } catch (Throwable th) {
                    try {
                        zzdu.zza("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    int i2 = message.arg1;
                    zzdj zzdjVar2 = this.w;
                    zzdjVar2.getClass();
                    zzdjVar2.zzb(i2);
                    this.A = new zzxg(this, this.w.zza(), i2 != 0);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    zzdu.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.y = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    zzdu.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.z = e2;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (zzdk e3) {
                zzdu.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.z = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
