package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import defpackage.bj0;
import defpackage.rt6;
import defpackage.ws6;

/* JADX INFO: loaded from: classes3.dex */
public final class ws6 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ rt6 b;

    public ws6(rt6 rt6Var, Handler handler) {
        this.b = rt6Var;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgl
            @Override // java.lang.Runnable
            public final void run() {
                ws6 ws6Var = this.zza;
                int i2 = i;
                rt6 rt6Var = ws6Var.b;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        rt6Var.c(3);
                        return;
                    } else {
                        rt6Var.b(0);
                        rt6Var.c(2);
                        return;
                    }
                }
                if (i2 == -1) {
                    rt6Var.b(-1);
                    rt6Var.a();
                } else if (i2 != 1) {
                    bj0.b("Unknown focus change type: ", i2, "AudioFocusManager");
                } else {
                    rt6Var.c(1);
                    rt6Var.b(1);
                }
            }
        });
    }
}
