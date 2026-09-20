package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class zb {
    public final Context a;

    public zb(Context context) {
        this.a = context;
    }

    public final void a() {
        synchronized (this) {
            a62 a62Var = a62.a;
            AudioManager audioManager = (AudioManager) r80.c(this.a, AudioManager.class);
            if (audioManager != null) {
                audioManager.setMode(0);
                audioManager.stopBluetoothSco();
                sd5 sd5Var = sd5.a;
            }
        }
    }
}
