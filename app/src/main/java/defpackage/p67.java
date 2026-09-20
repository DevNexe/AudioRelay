package defpackage;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class p67 {
    public final n67 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public p67(AudioTrack audioTrack) {
        int i = zzel.zza;
        this.a = new n67(audioTrack);
        a(0);
    }

    public final void a(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
