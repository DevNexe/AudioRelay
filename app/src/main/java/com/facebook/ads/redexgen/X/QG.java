package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QG implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C04337v A00;

    public QG(C04337v c04337v) {
        this.A00 = c04337v;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new KW(this, i));
    }
}
