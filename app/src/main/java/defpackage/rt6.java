package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzgn;

/* JADX INFO: loaded from: classes3.dex */
public final class rt6 {
    public final AudioManager a;
    public final ws6 b;
    public zzgn c;
    public int d;
    public float e = 1.0f;

    public rt6(Context context, Handler handler, uy6 uy6Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = uy6Var;
        this.b = new ws6(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (zzel.zza < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        c(0);
    }

    public final void b(int i) {
        zzgn zzgnVar = this.c;
        if (zzgnVar != null) {
            cz6 cz6Var = ((uy6) zzgnVar).w;
            boolean zZzq = cz6Var.zzq();
            int i2 = 1;
            if (zZzq && i != 1) {
                i2 = 2;
            }
            cz6Var.l(i, i2, zZzq);
        }
    }

    public final void c(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        zzgn zzgnVar = this.c;
        if (zzgnVar != null) {
            cz6 cz6Var = ((uy6) zzgnVar).w;
            cz6Var.i(1, 2, Float.valueOf(cz6Var.H * cz6Var.s.e));
        }
    }
}
