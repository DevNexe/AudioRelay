package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zznz;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class w67 {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final zznz a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public p67 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public w67(q77 q77Var) {
        this.a = q77Var;
        int i = zzel.zza;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public final void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new p67(audioTrack);
        this.g = audioTrack.getSampleRate();
        if (!z || zzel.zza >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z2 = false;
                }
            }
        }
        this.h = z2;
        boolean zZzV = zzel.zzV(i);
        this.q = zZzV;
        this.i = zZzV ? (((long) (i3 / i2)) * 1000000) / ((long) this.g) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public final boolean b(long j) {
        if (j > c()) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && c() == 0;
    }

    public final long c() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000) + this.z);
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.u = this.s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.u;
        }
        if (zzel.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }
}
